package com.example.customermanager.controller;

import com.example.customermanager.model.Customer;
import com.example.customermanager.service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/customers")
    public ModelAndView showList() {
        ModelAndView modelAndView=new ModelAndView("customers/list.jsp");
        List<Customer> customers = customerService.getAllCustomer();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
