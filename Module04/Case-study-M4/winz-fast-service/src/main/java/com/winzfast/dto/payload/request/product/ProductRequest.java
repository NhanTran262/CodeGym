package com.winzfast.dto.payload.request.product;

import com.winzfast.entity.Specification;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author ADMIN
 */

public class ProductRequest {

    private Long id;
    private String title;
    private String thumbnail;
    private LocalDateTime productDate;
    private String price;
    private int view;
    private Long user;
    private Specification specification;
    private boolean isDelete;

    public ProductRequest(Long id, String title, String thumbnail, LocalDateTime productDate, String price, int view, Long user, Specification specification, boolean isDelete) {
        this.id = id;
        this.title = title;
        this.thumbnail = thumbnail;
        this.productDate = productDate;
        this.price = price;
        this.view = view;
        this.user = user;
        this.specification = specification;
        this.isDelete = isDelete;
    }

    public ProductRequest() {
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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
