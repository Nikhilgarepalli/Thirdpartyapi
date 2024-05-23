package com.example.demo4.service;

import com.example.demo4.model.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
    Product createProduct(Product product);

}
