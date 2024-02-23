package com.example.winz_fast.controller;

import com.example.winz_fast.model.person.Employee;
import com.example.winz_fast.service.IDepartmentService;
import com.example.winz_fast.service.IEmployeeService;
import com.example.winz_fast.service.ILevelService;
import com.example.winz_fast.service.IPositionService;
import com.example.winz_fast.service.impl.DepartmentService;
import com.example.winz_fast.service.impl.EmployeeService;
import com.example.winz_fast.service.impl.LevelService;
import com.example.winz_fast.service.impl.PositionService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
    IEmployeeService employeeService = new EmployeeService();
    ILevelService levelService = new LevelService();
    IPositionService positionService = new PositionService();
    IDepartmentService departmentService = new DepartmentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showAddForm(req, resp);
                break;
            case "remove":
                removeEmployee(req, resp);
                break;
            case "edit":
                showEditForm(req, resp);
                break;
            default:
                listEmployee(req, resp);
                break;
        }
    }

    private void showAddForm(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("levels", levelService.getAllLevel());
        req.setAttribute("positions", positionService.getAllPosition());
        req.setAttribute("departments", departmentService.getAllDepartment());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/employee/create.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void removeEmployee(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        employeeService.remove(id);
        req.setAttribute("employee", employeeService.getAllEmployee());
        try {
            resp.sendRedirect("/employee");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showEditForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        req.setAttribute("employee", employeeService.getEmployeeById(id));
        req.setAttribute("levels", levelService.getAllLevel());
        req.setAttribute("positions", positionService.getAllPosition());
        req.setAttribute("departments", departmentService.getAllDepartment());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/employee/edit.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void listEmployee(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("employees", employeeService.getAllEmployee());
        req.setAttribute("levels", levelService.getAllLevel());
        req.setAttribute("positions", positionService.getAllPosition());
        req.setAttribute("departments", departmentService.getAllDepartment());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/employee/list.jsp");
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
                addEmployee(req, resp);
                break;
            case "edit":
                editEmployee(req, resp);
                break;
        }
    }

    private void editEmployee(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String dateOfBirth = req.getParameter("dateOfBirth");
        String idCard = req.getParameter("idCard");
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");
        String employeeAddress = req.getParameter("employeeAddress");
        int levelId = Integer.parseInt(req.getParameter("levelId"));
        int positionId = Integer.parseInt(req.getParameter("positionId"));
        int departmentId = Integer.parseInt(req.getParameter("departmentId"));
        double salary = Double.parseDouble(req.getParameter("salary"));
        Employee employee = new Employee(id, name, dateOfBirth, idCard, phoneNumber, email, employeeAddress,
                levelId, positionId, departmentId, salary);
        boolean check = employeeService.edit(employee);
        String mess = "Cập nhật thành công";
        if (!check) {
            mess = "Cập nhật không thành công";
        }
        req.setAttribute("mess", mess);
        req.setAttribute("check", check);
        try {
            resp.sendRedirect(req.getContextPath() + "/employee?action=list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void addEmployee(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        String dateOfBirth = req.getParameter("dateOfBirth");
        String idCard = req.getParameter("idCard");
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");
        String address = req.getParameter("employeeAddress");
        int levelId = Integer.parseInt(req.getParameter("levelId"));
        int positionId = Integer.parseInt(req.getParameter("positionId"));
        int departmentId = Integer.parseInt(req.getParameter("departmentId"));
        double salary = Double.parseDouble(req.getParameter("salary"));
        String username = req.getParameter("username");
        Employee employee = new Employee(name, dateOfBirth, idCard, phoneNumber, email, address,
                levelId, positionId, departmentId, salary, username);
        boolean check = employeeService.add(employee);
        String mess = "Thêm mới thành công";
        if (!check) {
            mess = "Thêm mới không thành công";
        }
        req.setAttribute("mess", mess);
        req.setAttribute("check", check);
        try {
            resp.sendRedirect(req.getContextPath() + "/employee?action=list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
