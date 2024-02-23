package com.winzfast.dto.payload.request.product;

import lombok.*;

/**
 * @author ADMIN
 */


public class SearchRequest {
    public String getTitle() {
        return title;
    }

    public SearchRequest() {
    }

    public SearchRequest(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

}
