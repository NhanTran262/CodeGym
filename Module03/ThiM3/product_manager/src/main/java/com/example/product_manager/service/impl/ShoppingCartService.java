package com.example.product_manager.service.impl;

import com.example.product_manager.dao.IShoppingCartDAO;
import com.example.product_manager.dao.impl.ShoppingCartDAO;
import com.example.product_manager.model.ShoppingCart;
import com.example.product_manager.service.IShoppingCartService;

import java.util.List;

public class ShoppingCartService implements IShoppingCartService {
    IShoppingCartDAO shoppingCartDAO = new ShoppingCartDAO();
    @Override
    public List<ShoppingCart> getAllShoppingCart() {
        return shoppingCartDAO.getAllShoppingCart();
    }
}
