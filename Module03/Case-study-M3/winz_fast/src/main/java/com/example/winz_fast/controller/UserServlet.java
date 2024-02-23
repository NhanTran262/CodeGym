package com.example.winz_fast.controller;

import com.example.winz_fast.service.IRoleService;
import com.example.winz_fast.service.IUserService;
import com.example.winz_fast.service.impl.RoleService;
import com.example.winz_fast.service.impl.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {
    IUserService userService = new UserService();
    IRoleService roleService = new RoleService();

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
            default:
                listUser(req, resp);
                break;
        }
    }

    private void listUser(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("users", userService.getAllUser());
        req.setAttribute("roles", roleService.getAllRole());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/user/list.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void showFormAdd(HttpServletRequest req, HttpServletResponse resp) {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
