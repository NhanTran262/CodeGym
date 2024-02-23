package com.example.winz_fast.dao.impl;

import com.example.winz_fast.dao.IBrandDAO;
import com.example.winz_fast.model.product.Brand;
import com.example.winz_fast.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BrandDAO implements IBrandDAO {
    private static final String SELECT_ALL = "SELECT * FROM brands";

    @Override
    public List<Brand> getAllBrand() {
        List<Brand> brands = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int brand_id = resultSet.getInt("brand_id");
                String brand_name = resultSet.getString("brand_name");
                brands.add(new Brand(brand_id, brand_name));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return brands;
    }
}
