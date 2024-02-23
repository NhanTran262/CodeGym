package com.example.product_manager.dao;

import com.example.product_manager.model.Product;

import java.util.List;

public interface IProductDAO {
    List<Product> getAllProduct();
    boolean add (Product product);

}
