package com.example.winz_fast.controller;

import com.example.winz_fast.model.product.Vehicle;
import com.example.winz_fast.service.IBrandService;
import com.example.winz_fast.service.IVariantService;
import com.example.winz_fast.service.IVehicleService;
import com.example.winz_fast.service.impl.BrandService;
import com.example.winz_fast.service.impl.VariantService;
import com.example.winz_fast.service.impl.VehicleService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "VehicleServlet", value = "/vehicle")
public class VehicleServlet extends HttpServlet {
    IVehicleService vehicleService = new VehicleService();
    IBrandService brandService = new BrandService();
    IVariantService variantService = new VariantService();

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
                removeVehicle(req, resp);
                break;
            case "edit":
                showEditForm(req, resp);
                break;
            default:
                listVehicle(req, resp);
                break;
        }
    }

    private void listVehicle(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("vehicles", vehicleService.getAllVehicle());
        req.setAttribute("brands", brandService.getAllBrand());
        req.setAttribute("variants", variantService.getAllVariant());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/vehicle/list.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void showEditForm(HttpServletRequest req, HttpServletResponse resp) {
        int vehicle_id = Integer.parseInt(req.getParameter("vehicle_id"));
        req.setAttribute("vehicle", vehicleService.getVehicleById(vehicle_id));
        req.setAttribute("brands", brandService.getAllBrand());
        req.setAttribute("variants", variantService.getAllVariant());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/vehicle/edit.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void removeVehicle(HttpServletRequest req, HttpServletResponse resp) {
        int vehicle_id = Integer.parseInt(req.getParameter("vehicle_id"));
        vehicleService.remove(vehicle_id);
        req.setAttribute("vehicle", vehicleService.getAllVehicle());
        try {
            resp.sendRedirect("/vehicle");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showAddForm(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("brands", brandService.getAllBrand());
        req.setAttribute("variants", variantService.getAllVariant());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/vehicle/create.jsp");
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
                addVehicle(req, resp);
                break;
            case "edit":
                editVehicle(req, resp);
        }
    }

    private void editVehicle(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int vehicle_id = Integer.parseInt(req.getParameter("vehicle_id"));
        String vehicle_name = req.getParameter("vehicle_name");
        int brand_id = Integer.parseInt(req.getParameter("brand_id"));
        int variant_id = Integer.parseInt(req.getParameter("variant_id"));
        double price = Double.parseDouble(req.getParameter("price"));
        String status = req.getParameter("status");
        Vehicle vehicle = new Vehicle(vehicle_id, vehicle_name, brand_id, variant_id, price, status);
        vehicleService.edit(vehicle);
        resp.sendRedirect("/vehicle");


    }

    private void addVehicle(HttpServletRequest req, HttpServletResponse resp) {
        String vehicle_name = req.getParameter("vehicle_name");
        int brand_id = Integer.parseInt(req.getParameter("brand_id"));
        int variant_id = Integer.parseInt(req.getParameter("variant_id"));
        double price = Double.parseDouble(req.getParameter("price"));
        String status = req.getParameter("status");
        Vehicle vehicle = new Vehicle(vehicle_name, brand_id, variant_id, price, status);
        boolean check = vehicleService.add(vehicle);
        String mess = "Thêm mới thành công";
        if (!check) {
            mess = "Thêm mới không thành công";
        }
        req.setAttribute("mess", mess);
        try {
            resp.sendRedirect(req.getContextPath() + "/vehicle?action=list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
