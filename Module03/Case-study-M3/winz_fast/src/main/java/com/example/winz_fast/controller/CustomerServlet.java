package com.example.winz_fast.controller;

import com.example.winz_fast.model.person.Customer;
import com.example.winz_fast.service.ICustomerService;
import com.example.winz_fast.service.ICustomerTypeService;
import com.example.winz_fast.service.impl.CustomerService;
import com.example.winz_fast.service.impl.CustomerTypeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    ICustomerService customerService = new CustomerService();
    ICustomerTypeService customerTypeService = new CustomerTypeService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormAdd(req, resp);
                break;
            case "edit":
                showFormEdit(req, resp);
                break;
            case "remove":
                removeCustomer(req, resp);
                break;
            default:
                listCustomer(req, resp);
                break;
        }
    }

    private void removeCustomer(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        customerService.remove(id);
        req.setAttribute("customer", customerService.getAllCustomer());
        try {
            resp.sendRedirect("/customer");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void showFormEdit(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        req.setAttribute("customer", customerService.getCustomerById(id));
        req.setAttribute("customerTypes", customerTypeService.getALLCustomerType());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/customer/edit.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showFormAdd(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("customerTypes", customerTypeService.getALLCustomerType());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/customer/create.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void listCustomer(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("customers", customerService.getAllCustomer());
        req.setAttribute("customerTypes", customerTypeService.getALLCustomerType());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/customer/list.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                addCustomer(req, resp);
                break;
            case "edit":
                editCustomer(req, resp);
                break;
        }
    }

    private void editCustomer(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        int customerTypeId = Integer.parseInt(req.getParameter("customerTypeId"));
        String name = req.getParameter("name");
        String dateOfBirth = req.getParameter("dateOfBirth");
        boolean gender = Boolean.parseBoolean(req.getParameter("gender"));
        String idCard = req.getParameter("idCard");
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");
        String customerAddress = req.getParameter("customerAddress");
        Customer customer = new Customer(id, customerTypeId, name, dateOfBirth, gender, idCard,
                phoneNumber, email, customerAddress);
        boolean check = customerService.edit(customer);
        String mess = "Cập nhật thành công";
        if (!check) {
            mess = "Cập nhật không thành công";
        }
        req.setAttribute("mes", mess);
        req.setAttribute("check", check);
        try {
            resp.sendRedirect(req.getContextPath() + "/customer?action=list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void addCustomer(HttpServletRequest req, HttpServletResponse resp) {
        int customerTypeId = Integer.parseInt(req.getParameter("customerTypeId"));
        String name = req.getParameter("name");
        String dateOfBirth = req.getParameter("dateOfBirth");
        boolean gender = Boolean.parseBoolean(req.getParameter("gender"));
        String idCard = req.getParameter("idCard");
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");
        String customerAddress = req.getParameter("customerAddress");
        Customer customer = new Customer(customerTypeId, name, dateOfBirth, gender,
                idCard, phoneNumber, email, customerAddress);
        boolean check = customerService.add(customer);
        String mess = "Thêm mới thành công";
        if (!check) {
            mess = "Thêm mới không thành công";
        }
        req.setAttribute("mess", mess);
        req.setAttribute("check", check);
        try {
            resp.sendRedirect(req.getContextPath() + "/customer?action=list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
