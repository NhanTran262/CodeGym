package com.example.student_manager.dao.impl;

import com.example.student_manager.dao.IShoppingCartDAO;
import com.example.student_manager.model.ShoppingCart;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartDAO implements IShoppingCartDAO {
    private static final String SELECT_ALL;
    static {
        SELECT_ALL = "SELECT * FROM products WHERE is_delete = 0";
    }

    @Override
    public List<ShoppingCart> getAllShoppingCart() {
        List<ShoppingCart> shoppingCarts = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        return null;
    }
}
