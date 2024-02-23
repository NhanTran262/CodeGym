package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.ILevelDAO;
import com.example.winz_fast.model.person.Level;
import com.example.winz_fast.utils.JDBCConnection;
import com.mysql.cj.jdbc.JdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LevelDAO implements ILevelDAO {
    private static final String SELECT_ALL = "SELECT * FROM levels WHERE is_delete = 0";

    @Override
    public List<Level> getAllLevel() {
        List<Level> levels = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("level_id");
                String name = resultSet.getString("level_name");
                levels.add(new Level(id, name));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return levels;
    }
}
