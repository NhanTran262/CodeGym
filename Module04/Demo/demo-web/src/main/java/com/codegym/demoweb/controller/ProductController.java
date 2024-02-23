package com.codegym.demoweb.controller;

import com.codegym.demoweb.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    private final List<Product> products;


    public ProductController() {
        products = new ArrayList<>();
        products.add(new Product(1, "Cái quần", 300, 2));
        products.add(new Product(2, "Cái áo", 250, 2));
    }

    @GetMapping
    public String getProduct(Model model) {
        model.addAttribute("products", products);
        return "product/list";
    }

    @GetMapping("/{id}")
    public String getDetail(Model model, @PathVariable int id) {
        int productIdx = id - 1;
        Product product = products.get(productIdx);
        model.addAttribute("product", product);
        return "product/detail";
    }
}
