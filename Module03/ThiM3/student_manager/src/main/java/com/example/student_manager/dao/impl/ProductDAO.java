package com.example.student_manager.dao.impl;

import com.example.student_manager.dao.IProductDAO;
import com.example.student_manager.model.Product;
import com.mysql.cj.jdbc.JdbcConnection;

import java.sql.Connection;
import java.util.List;

public class ProductDAO implements IProductDAO {
    Connection connection = JDBCConnection.get
    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public boolean edit(Product product) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public Product getProductById(int id) {
        return null;
    }
}
