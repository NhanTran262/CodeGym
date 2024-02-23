package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.IUserRoleDAO;
import com.example.winz_fast.model.person.UserRole;
import com.example.winz_fast.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRoleDao implements IUserRoleDAO {
    private static final String SELECT_ALL = "SELECT * FROM user_roles WHERE is_delete = 0";

    @Override
    public List<UserRole> getAllUserRole() {
        List<UserRole> userRoles = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int roleId = resultSet.getInt("role_id");
                String userName = resultSet.getString("user_name");
                userRoles.add(new UserRole(roleId, userName));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userRoles;
    }
}
