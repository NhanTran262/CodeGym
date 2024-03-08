package com.winzfast.dto.payload.response.product;

import lombok.Data;

import java.util.List;

public class PageResponse<ProductResponse> {
    private List<ProductResponse> content;
    private int page;
    private int size;
    private long totalElements;
    private long totalPage;

    public PageResponse(List<ProductResponse> content, int page, int size, long totalElements, long totalPage) {
        this.content = content;
        this.page = page;
        this.size = size;
        this.totalElements = totalElements;
        this.totalPage = totalPage;
    }

    public PageResponse() {
    }

    public List<ProductResponse> getContent() {
        return content;
    }

    public void setContent(List<ProductResponse> content) {
        this.content = content;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }
}
