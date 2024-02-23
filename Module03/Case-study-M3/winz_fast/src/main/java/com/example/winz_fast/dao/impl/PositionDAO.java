package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.IPositionDAO;
import com.example.winz_fast.model.person.Position;
import com.example.winz_fast.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PositionDAO implements IPositionDAO {
    private static final String SELECT_ALL = "SELECT * FROM positions WHERE is_delete = 0";

    @Override
    public List<Position> getAllPosition() {
        List<Position> positions = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("position_id");
                String name = resultSet.getString("position_name");
                positions.add(new Position(id, name));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return positions;
    }
}
