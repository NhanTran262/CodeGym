package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.IVariantDAO;
import com.example.winz_fast.model.product.Variant;
import com.example.winz_fast.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VariantDAO implements IVariantDAO {
    private static final String SELECT_ALL = "SELECT * FROM variants";

    @Override
    public List<Variant> getAllVariant() {
        List<Variant> variants = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int variant_id = resultSet.getInt("variant_id");
                String model = resultSet.getString("model");
                String color = resultSet.getString("color");
                variants.add(new Variant(variant_id, model, color));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return variants;
    }
}
