package com.example.student_manager.dao;

import com.example.student_manager.model.Product;

import java.util.List;

public interface IProductDAO {
    List<Product> getAllProduct();

    boolean add(Product product);

    boolean edit(Product product);

    boolean remove(int id);

    Product getProductById(int id);
}
