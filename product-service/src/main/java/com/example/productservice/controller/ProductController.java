package com.example.productservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.productservice.Dto.ProductRequest;
import com.example.productservice.Dto.ProductResponse;
import com.example.productservice.service.ProductService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor

public class ProductController {


    private final ProductService _productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        _productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return _productService.getAllProducts();
    }
    
}
