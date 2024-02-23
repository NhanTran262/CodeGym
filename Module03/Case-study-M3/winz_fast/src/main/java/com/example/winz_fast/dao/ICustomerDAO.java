package com.example.winz_fast.dao;

import com.example.winz_fast.model.person.Customer;

import java.util.List;

public interface ICustomerDAO {
    List<Customer> getAllCustomer();

    boolean add(Customer customer);

    boolean edit(Customer customer);

    boolean remove(int id);

    Customer getCustomerById(int id);
}
