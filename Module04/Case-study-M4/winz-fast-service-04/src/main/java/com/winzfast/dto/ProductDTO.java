package com.winzfast.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.winzfast.entity.Specification;
import com.winzfast.entity.User;

import java.time.LocalDateTime;
import java.util.List;

public class ProductDTO {
    private Long id;
    private String title;
    private LocalDateTime productDate;
    private String price;
    private int view;
    private User user;
    @JsonIgnore
    private List<Specification> specifications;

    public ProductDTO(Long id, String title, LocalDateTime productDate, String price, int view, User user, List<Specification> specifications) {
        this.id = id;
        this.title = title;
        this.productDate = productDate;
        this.price = price;
        this.view = view;
        this.user = user;
        this.specifications = specifications;
    }

    public ProductDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getProductDate() {
        return productDate;
    }

    public void setProductDate(LocalDateTime productDate) {
        this.productDate = productDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Specification> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<Specification> specifications) {
        this.specifications = specifications;
    }

}
