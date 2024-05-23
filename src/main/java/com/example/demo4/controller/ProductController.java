package com.example.demo4.controller;


import com.example.demo4.model.Product;
import com.example.demo4.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    //POST /product
    //    Request body
    //    {
    //        {
    //            "title": "Apple airpods",
    //            "price": 25000,
    //            "description": "Best air pods",
    //            "image":"http://",
    //            "category":"Electronic"
    //        }
    //    }

    private ProductService productService ;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public void createProduct(){
        //when ever someone is doing post or to update product
        //pls execute this method
        // productService.createProduct();

    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id") Long productId ){
        //using to get request on /products/id
        //pls execute this
        Product currentProduct = productService.getSingleProduct(productId);
        return currentProduct;
    }

    @GetMapping("/products")
    public void getAllProduct(){
        //to get all products execute this method
        productService.getAllProducts();
    }

}
