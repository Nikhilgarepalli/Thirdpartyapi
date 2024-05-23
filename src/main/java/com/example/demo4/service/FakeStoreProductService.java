package com.example.demo4.service;

import com.example.demo4.dto.FakeStoreProductDto;
import com.example.demo4.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {

    private  RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(Long productId){
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + productId, FakeStoreProductDto.class);

        return fakeStoreProductDto.toProduct();
    }


    @Override
    public List<Product> getAllProducts() {
        System.out.println("We are Here");
        return List.of();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }
}
