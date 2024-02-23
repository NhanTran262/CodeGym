package com.example.product_manager.dao.impl;

import com.example.product_manager.dao.IShoppingCartDAO;
import com.example.product_manager.model.ShoppingCart;
import com.example.product_manager.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartDAO implements IShoppingCartDAO {
    private static final String SELECT_ALL = "SELECT * FROM shoppingcarts WHERE is_delete = 0";
    private static final Connection connection;

    static {
        connection = JDBCConnection.getConnection();
    }

    @Override
    public List<ShoppingCart> getAllShoppingCart() {
        List<ShoppingCart> shoppingCarts =new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("cart_id");
                int productId=resultSet.getInt("product_id");
                int quantity =resultSet.getInt("quantity");
                shoppingCarts.add(new ShoppingCart(id,productId,quantity));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return shoppingCarts;
    }

    @Override
    public boolean edit(ShoppingCart shoppingCart) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public ShoppingCart getShoppingCartById(int id) {
        return null;
    }
}
