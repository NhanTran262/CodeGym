package com.example.customermanager.dao.impl;

import com.example.customermanager.dao.ICustomerDAO;
import com.example.customermanager.model.Customer;
import com.example.customermanager.utils.JDBCConnection;
import jdk.nashorn.internal.scripts.JD;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CustomerDAO implements ICustomerDAO {
    Connection connection = JDBCConnection.getConnection();
    private static final String SELECT_ALL = "SELECT * FROM customers";
    private static final String SELECT_BY_ID = "SELECT * FROM customers WHERE id = ?";

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                customers.add(new Customer(id, name, email, address));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customers;
    }

    @Override
    public Customer getCustomerById(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String email=resultSet.getString("email");
                String address=resultSet.getString("address");
                return new Customer(id,name,email,address);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
