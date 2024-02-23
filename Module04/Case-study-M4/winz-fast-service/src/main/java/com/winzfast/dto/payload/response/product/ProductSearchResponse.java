package com.winzfast.dto.payload.response.product;

import com.winzfast.entity.Product;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class ProductSearchResponse {
    private String message;
    private List<Product> products;
    private int status;

    public ProductSearchResponse(String message, List<Product> products, int status) {
        this.message = message;
        this.products = products != null ? products : new ArrayList<>();
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
