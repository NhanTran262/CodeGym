package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.IDepartmentDAO;
import com.example.winz_fast.model.person.Department;
import com.example.winz_fast.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO implements IDepartmentDAO {
    private static final String SELECT_ALL = "SELECT * FROM departments WHERE is_delete = 0";

    @Override
    public List<Department> getAllDepartment() {
        List<Department> departments = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("department_id");
                String name = resultSet.getString("department_name");
                departments.add(new Department(id, name));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return departments;
    }
}
