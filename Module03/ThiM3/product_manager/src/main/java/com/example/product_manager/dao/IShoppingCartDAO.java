package com.example.product_manager.dao;

import com.example.product_manager.model.ShoppingCart;

import java.util.List;

public interface IShoppingCartDAO {
    List<ShoppingCart> getAllShoppingCart();

    boolean edit(ShoppingCart shoppingCart);

    boolean remove(int id);

    ShoppingCart getShoppingCartById(int id);
}
