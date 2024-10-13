package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @GetMapping("/customers/view/{id}")
    public ModelAndView getCustomerInfo(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/customer-info");
        RestTemplate restTemplate = new RestTemplate();
        Customer customer = restTemplate.getForObject("http://localhost:8081/api/customers/" + id, Customer.class);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
}
