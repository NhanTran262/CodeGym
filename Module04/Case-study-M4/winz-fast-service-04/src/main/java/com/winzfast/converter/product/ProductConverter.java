package com.winzfast.converter.product;


import com.winzfast.dto.payload.response.product.ProductResponse;
import com.winzfast.dto.payload.response.product.SpecificationResponse;
import com.winzfast.entity.Product;
import com.winzfast.entity.Specification;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductConverter {

    public ProductResponse getProductResponseDTO(Product product) {
        ProductResponse productResponse = new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setTitle(product.getTitle());
        productResponse.setPrice(product.getPrice());
        productResponse.setView(product.getView());
        productResponse.setProductDate(product.getProductDate());
        return productResponse;
    }

    public List<ProductResponse> getProductListDTO(List<Product> products) {
        List<ProductResponse> productResponses = new ArrayList<>();
        for (Product product : products) {
            productResponses.add(getProductResponseDTO(product));
        }
        return productResponses;
    }
}
