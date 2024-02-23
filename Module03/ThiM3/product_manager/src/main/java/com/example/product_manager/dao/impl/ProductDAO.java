package com.example.product_manager.dao.impl;

import com.example.product_manager.dao.IProductDAO;
import com.example.product_manager.model.Product;
import com.example.product_manager.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements IProductDAO {
    private static final Connection connection;
    private static final String SELECT_ALL = "SELECT * FROM products WHERE is_delete = 0";
    private static final String INSERT_CART = "INSERT INTO shoppingcarts (product_id, quantity) VALUES (?, ?)";
    static {
       connection = JDBCConnection.getConnection();

    }
    @Override
    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("product_id");
                String name = resultSet.getString("name");
                float price = resultSet.getFloat("price");
                String description= resultSet.getString("description");
                String imageUrl=resultSet.getString("image_url");
                products.add(new Product(id,name,price,description,imageUrl));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    @Override
    public boolean add(Product product) {
        try {
            PreparedStatement statement=connection.prepareStatement(INSERT_CART);
            statement.setInt(1,product.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
