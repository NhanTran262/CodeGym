package com.example.winz_fast.controller;

import com.example.winz_fast.dao.IDetailContractDAO;
import com.example.winz_fast.service.IContractService;
import com.example.winz_fast.service.IDetailContractService;
import com.example.winz_fast.service.impl.ContractService;
import com.example.winz_fast.service.impl.DetailContractService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class ContractServlet extends HttpServlet {
    IContractService contractService = new ContractService();
    IDetailContractService detailContractService = new DetailContractService();

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
                listContract(req, resp);

        }
    }

    private void listContract(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("contracts", contractService.getAllContract());
        req.setAttribute("detailContracts", detailContractService.getAllDetailContract());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/contract/list.jsp");
        try {
            dispatcher.forward(req,resp);
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
