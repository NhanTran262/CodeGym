package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.IUserDAO;
import com.example.winz_fast.model.person.User;
import com.example.winz_fast.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {
    private static final String SELECT_ALL = "SELECT * FROM users WHERE is_delete = 0";
    private static final String SELECT_BY_USERNAME = "SELECT * FROM users WHERE user_name = ? AND is_delete = 0";

    @Override
    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("user_id");
                String username = resultSet.getString("user_name");
                String password = resultSet.getString("password");
                users.add(new User(id, username, password));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public boolean add(User user) {
        return false;
    }

    @Override
    public boolean edit(User user) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public User getUserByUsername(String username) {
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_USERNAME);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("user_id");
                String password = resultSet.getString("password");
                return new User(id, username, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
