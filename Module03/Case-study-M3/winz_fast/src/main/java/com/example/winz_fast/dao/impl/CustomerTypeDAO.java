package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.ICustomerTypeDAO;
import com.example.winz_fast.model.person.CustomerType;
import com.example.winz_fast.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeDAO implements ICustomerTypeDAO {
    private static final String SELECT_ALL = "SELECT * FROM customer_types WHERE is_delete = 0";

    @Override
    public List<CustomerType> getAllCustomerType() {
        List<CustomerType> customerTypes = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_type_name");
                customerTypes.add(new CustomerType(id, name));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customerTypes;
    }
}
