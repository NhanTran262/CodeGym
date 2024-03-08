package com.winzfast.dto.payload.response.product;

import lombok.Data;


public class CommonResponse<ProductResponse> {
    private String message;
    private PageResponse<ProductResponse> data;
    private boolean status;

    public CommonResponse() {
    }

    public CommonResponse(String message, PageResponse<ProductResponse> data, boolean status) {
        this.message = message;
        this.data = data;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PageResponse<ProductResponse> getData() {
        return data;
    }

    public void setData(PageResponse<ProductResponse> data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
