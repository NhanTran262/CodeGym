package com.codegym.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Long> products= new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Product, Long> products) {
        this.products = products;
    }
    public Map<Product, Long> getProducts(){
        return products;
    }
    private boolean checkItemInCart(Product product){
        for (Map.Entry<Product, Long> entry:products.entrySet()){
            if (entry.getKey().getId().equals(product.getId())){
                return true;
            }
        }
        return false;
    }
}
