package com.winzfast.controller.product;

import com.winzfast.dto.ProductDTO;
import com.winzfast.dto.payload.request.product.SearchRequest;
import com.winzfast.dto.payload.response.product.ProductSearchResponse;
import com.winzfast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/users/products")
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/show")
    public ResponseEntity<Iterable<ProductDTO>> getProducts() {
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/search")
    public ResponseEntity<ProductSearchResponse> searchProducts(@RequestParam(value = "keyword") String keyword,
                                                                @RequestParam(value = "page", defaultValue = "0") int page,
                                                                @RequestParam(value = "size", defaultValue = "10") int size) {
        SearchRequest searchRequest = new SearchRequest(keyword);

        Pageable pageable = PageRequest.of(page, size);
        ProductSearchResponse response = productService.search(searchRequest, pageable);

        if (response.getProducts().isEmpty()) {
            String message = "No products found for the given keyword";
            int status = 404; // Not Found status code
            return ResponseEntity.status(status).body(new ProductSearchResponse(message, new ArrayList<>(), status));
        }

        return ResponseEntity.ok(response);
    }
}



