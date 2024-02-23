package com.example.customermanager.service.impl;

import com.example.customermanager.dao.impl.CustomerDAO;
import com.example.customermanager.dao.ICustomerDAO;
import com.example.customermanager.model.Customer;
import com.example.customermanager.service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerDAO customerDAO = new CustomerDAO();

    @Override
    public List<Customer> getAllCustomer() {
        return customerDAO.getAllCustomer();
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerDAO.getCustomerById(id);
    }
}
