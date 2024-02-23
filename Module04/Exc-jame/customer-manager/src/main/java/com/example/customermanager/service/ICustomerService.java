package com.example.customermanager.service;

import com.example.customermanager.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomer();

    Customer getCustomerById(int id);
}
