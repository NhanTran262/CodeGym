package com.winzfast.service;

import com.winzfast.dto.ProductDTO;
import com.winzfast.dto.payload.request.product.ProductRequest;
import com.winzfast.dto.payload.request.product.SearchRequest;
import com.winzfast.dto.payload.response.product.CommonResponse;
import com.winzfast.dto.payload.response.product.ProductResponse;
import com.winzfast.dto.payload.response.Response;
import com.winzfast.dto.payload.response.product.ProductSearchResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface ProductService {
    ProductResponse updateProduct(Long id, ProductRequest productRequest);
    Iterable<ProductDTO> getAll();
    Response increaseViews(Long id);
    ProductSearchResponse search(SearchRequest searchRequestDTO, Pageable pageable);
}
