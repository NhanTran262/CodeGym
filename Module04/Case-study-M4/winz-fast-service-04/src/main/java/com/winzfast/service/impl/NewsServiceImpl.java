package com.winzfast.service.impl;

import com.winzfast.converter.product.NewsConverter;
import com.winzfast.dto.payload.request.product.NewsRequest;
import com.winzfast.dto.payload.response.product.NewsResponse;
import com.winzfast.dto.payload.response.Response;
import com.winzfast.entity.Product;
import com.winzfast.entity.Specification;
import com.winzfast.entity.User;
import com.winzfast.repository.ProductRepository;
import com.winzfast.repository.SpecificationRepository;
import com.winzfast.repository.UserRepository;
import com.winzfast.service.NewsService;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.net.Authenticator;
import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {
    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final SpecificationRepository specificationRepository;
    private final NewsConverter newsConverter;

    public NewsServiceImpl(ProductRepository productRepository,
                           UserRepository userRepository, SpecificationRepository specificationRepository,
                           NewsConverter newsConverter) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
        this.specificationRepository = specificationRepository;
        this.newsConverter = newsConverter;
    }


    @Override
    public List<Product> getAllNews() {
        return productRepository.findAllWithSpecifications();
    }

    @Override
    public NewsResponse createNews(NewsRequest newsRequest) {
////        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
////        UserDetails userDetails = (UserDetails) auth.getPrincipal();
////        String username = userDetails.getUsername();
//        User user = userRepository.findByUsername(username);

//        Long userId = newsRequest.getUser();
//        User user = userRepository.findById(userId).orElse(null);
//        product.setUser(user);
//        product.setView(newsRequest.getView());
        Product product = new Product();
        product.setTitle(newsRequest.getTitle());
        product.setThumbnail(newsRequest.getThumbnail());
        product.setProductDate(newsRequest.getProductDate());
        product.setPrice(newsRequest.getPrice());


        productRepository.save(product);
        if (product.getId() == null) {
            throw new RuntimeException("Product to create failed!");
        }
        Long productId = product.getId();
        Specification specification = new Specification();
        specification.setBrand(newsRequest.getBrand());
        specification.setCarModel(newsRequest.getCarModel());
        specification.setEngine(newsRequest.getEngine());
        specification.setYear(newsRequest.getYear());
        specification.setFuel(newsRequest.getFuel());
        specification.setOrigin(newsRequest.getOrigin());
        specification.setGear(newsRequest.getGear());
        specification.setNumberOfSeat(newsRequest.getNumberOfSeat());
        product = productRepository.findById(productId).orElse(null);
        specification.setProduct(product);
        specificationRepository.save(specification);
        if (product != null) {
            return newsConverter.getNewsResponseDTO(product, specification);
        }
        return new NewsResponse();
    }

    @Override
    @Transactional
    public Response delete(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            Product foundProduct = product.get();
            foundProduct.setDelete(true);
            productRepository.save(foundProduct);
            List<Specification> specifications = specificationRepository.findByProductId(id);
            for (Specification specification : specifications) {
                specification.setDelete(true);
                specificationRepository.save(specification);
            }
            return new Response("Product delete successfully!", null, HttpStatus.OK.value(), true);
        } else {
            return new Response("Product delete false", null, HttpStatus.NOT_FOUND.value(), false);
        }
    }
}
