package com.example.product_manager.service.impl;

import com.example.product_manager.dao.IProductDAO;
import com.example.product_manager.dao.impl.ProductDAO;
import com.example.product_manager.model.Product;
import com.example.product_manager.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    IProductDAO productDAO = new ProductDAO();
    @Override
    public List<Product> getAllProduct() {
        return productDAO.getAllProduct();
    }
}
