package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.IRoleDao;
import com.example.winz_fast.model.person.Role;
import com.example.winz_fast.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoleDAO implements IRoleDao {
    private static final String SELECT_ALL = "SELECT * FROM roles WHERE is_delete = 0";
    private static final String SELECT_ROLE_FROM_USER = "SELECT * FROM users u" +
            "JOIN user_roles ur ON ur.user_name = u.user_name" +
            "JOIN roles r ON r.role_id = ur.role_id" +
            "WHERE u.user_name = ? AND u.password = ? AND u.is_delete = 0";

    @Override
    public List<Role> getAllRole() {
        List<Role> roles = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("role_id");
                String name = resultSet.getString("role_name");
                roles.add(new Role(id, name));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return roles;
    }

    @Override
    public Role getRoleFromUser(String username) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ROLE_FROM_USER);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("role_id");
                String name = resultSet.getString("user_name");
                return new Role(id, name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
