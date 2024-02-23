package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.ICustomerDAO;
import com.example.winz_fast.model.person.Customer;
import com.example.winz_fast.utils.JDBCConnection;
import jdk.nashorn.internal.scripts.JD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {
    private static final String SELECT_ALL = "SELECT * FROM customers WHERE is_delete = 0";
    private static final String SELECT_BY_ID = "SELECT * FROM customers WHERE customer_id = ? AND is_delete = 0";
    private static final String INSERT_CUSTOMER =
            "INSERT INTO customers (customer_type_id, customer_name, date_of_birth, gender," +
                    "id_card, phone_number, email, address)" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_CUSTOMER =
            "UPDATE customers SET customer_type_id = ?, customer_name = ?, date_of_birth = ?, gender = ?," +
                    "id_card = ?, phone_number = ?, email = ?, address = ?" +
                    "WHERE customer_id = ?";
    private static final String REMOVE_CUSTOMER = "UPDATE customers SET is_delete = 1 WHERE customer_id = ?";

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                int customerTypeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String dateOfBirth = resultSet.getString("date_of_birth");
                boolean gender = resultSet.getBoolean("gender");
                String idCard = resultSet.getString("id_card");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String customerAddress = resultSet.getString("address");
                customers.add(new Customer(id, customerTypeId, name, dateOfBirth, gender, idCard,
                        phoneNumber, email, customerAddress));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customers;
    }

    @Override
    public boolean add(Customer customer) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT_CUSTOMER);
            statement.setInt(1, customer.getCustomerTypeId());
            statement.setString(2, customer.getName());
            statement.setString(3, customer.getDateOfBirth());
            statement.setBoolean(4, customer.isGender());
            statement.setString(5, customer.getIdCard());
            statement.setString(6, customer.getPhoneNumber());
            statement.setString(7, customer.getEmail());
            statement.setString(8, customer.getCustomerAddress());
            boolean rowInserted = statement.executeUpdate() > 0;
            return rowInserted;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean edit(Customer customer) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER);
            statement.setInt(1, customer.getCustomerTypeId());
            statement.setString(2, customer.getName());
            statement.setString(3, customer.getDateOfBirth());
            statement.setBoolean(4, customer.isGender());
            statement.setString(5, customer.getIdCard());
            statement.setString(6, customer.getPhoneNumber());
            statement.setString(7, customer.getEmail());
            statement.setString(8, customer.getCustomerAddress());
            statement.setInt(9, customer.getId());
            boolean rowUpdated = statement.executeUpdate() > 0;
            return rowUpdated;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(int id) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(REMOVE_CUSTOMER);
            statement.setInt(1, id);
            boolean rowRemoved = statement.executeUpdate() > 0;
            return rowRemoved;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Customer getCustomerById(int id) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int customerTypeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String dateOfBirth = resultSet.getString("date_of_birth");
                boolean gender = resultSet.getBoolean("gender");
                String idCard = resultSet.getString("id_card");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String customerAddress = resultSet.getString("address");
                return new Customer(id, customerTypeId, name, dateOfBirth, gender, idCard,
                        phoneNumber, email, customerAddress);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
