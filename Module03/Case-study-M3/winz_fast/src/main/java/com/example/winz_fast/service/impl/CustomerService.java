package com.example.winz_fast.service.impl;

import com.example.winz_fast.dao.ICustomerDAO;
import com.example.winz_fast.dao.impl.CustomerDAO;
import com.example.winz_fast.model.person.Customer;
import com.example.winz_fast.service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerDAO customerDAO = new CustomerDAO();

    @Override
    public List<Customer> getAllCustomer() {
        return customerDAO.getAllCustomer();
    }

    @Override
    public boolean add(Customer customer) {
        return customerDAO.add(customer);
    }

    @Override
    public boolean edit(Customer customer) {
        return customerDAO.edit(customer);
    }

    @Override
    public boolean remove(int id) {

        return customerDAO.remove(id);
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerDAO.getCustomerById(id);
    }
}
