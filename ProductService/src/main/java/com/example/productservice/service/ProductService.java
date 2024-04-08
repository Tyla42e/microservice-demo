package com.example.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.productservice.Dto.ProductRequest;
import com.example.productservice.Dto.ProductResponse;
import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {


    private final ProductRepository _productReposity;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
            .name(productRequest.getName())
            .description(productRequest.getDescription())
            .price(productRequest.getPrice())
            .build();

        _productReposity.save(product);

        log.info("Product {} is Saved", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
       List<Product> products = _productReposity.findAll();

       return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
            .id(product.getId())
            .name(product.getName())
            .description(product.getDescription())
            .price(product.getPrice())
            .build();
    }
}