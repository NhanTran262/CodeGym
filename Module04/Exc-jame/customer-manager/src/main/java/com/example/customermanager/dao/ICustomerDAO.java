package com.example.customermanager.dao;

import com.example.customermanager.model.Customer;

import java.util.List;

public interface ICustomerDAO {
    List<Customer> getAllCustomer();
    Customer getCustomerById(int id);
}
