package com.winzfast.service.impl;


import com.winzfast.converter.product.ProductConverter;
import com.winzfast.dto.ProductDTO;
import com.winzfast.dto.payload.request.product.ProductRequest;
import com.winzfast.dto.payload.request.product.SearchRequest;
import com.winzfast.dto.payload.response.product.ProductResponse;
import com.winzfast.dto.payload.response.Response;
import com.winzfast.dto.payload.response.product.ProductSearchResponse;
import com.winzfast.entity.Product;
import com.winzfast.entity.User;
import com.winzfast.repository.ProductRepository;
import com.winzfast.repository.UserRepository;
import com.winzfast.service.ProductService;
import javax.persistence.EntityExistsException;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author ADMIN
 */
@Service

public class ProductServiceImpl implements ProductService {


    private final ProductRepository productRepository;
    private final ProductConverter productConverter;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductConverter productConverter, UserRepository userRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.productConverter = productConverter;
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Iterable<ProductDTO> getAll() {
        Iterable<Product> products = productRepository.findAll();
        List<ProductDTO> productDTOS = new ArrayList<>();
        for (Product product : products) {
            productDTOS.add(modelMapper.map(product, ProductDTO.class));
        }
        return productDTOS;
    }

    @Override
    public ProductResponse updateProduct(Long id, ProductRequest productRequest) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isEmpty()) {
            throw new RuntimeException("Product not found with id" + id);
        }
        Product product = optionalProduct.get();
        product.setTitle(productRequest.getTitle());
        product.setProductDate(productRequest.getProductDate());
        product.setPrice(productRequest.getPrice());
        productRepository.save(product);
        return productConverter.getProductResponseDTO(product);
    }
    @Override
    public ProductSearchResponse search(SearchRequest searchRequestDTO, Pageable pageable) {
        String keyword = searchRequestDTO.getTitle();
        String temp = "%" + keyword + "%";

        Page<Product> foundProducts = productRepository.findAllByTitleLike(temp, pageable);

        String message;
        int status;
        List<Product> productList;

        if (foundProducts.isEmpty()) {
            message = "No products found for the given keyword";
            status = 404;
            productList = new ArrayList<>();
        } else {
            message = "Search completed";
            status = 200;
            productList = foundProducts.getContent();
        }

        return new ProductSearchResponse(message, productList, status);
    }
    @Override
    public Response increaseViews(Long id) {
        Response responseDTO = new Response();
        Product product = productRepository.findById(id).orElseThrow(EntityExistsException::new);
        int currentView = product.getView();
        currentView += 1;
        product.setView(currentView);
        productRepository.save(product);
        responseDTO.setMessage("OK");
        responseDTO.setStatus(HttpStatus.OK.value());
        return responseDTO;
    }

}