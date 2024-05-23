package com.example.demo4.dto;

import com.example.demo4.model.Category;
import com.example.demo4.model.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private long id;
    private String title;
    private String description;
    private String image;
    private double price;
    private String category;

    public Product toProduct(){
        Product p = new Product();
        p.setId(id);
        p.setTitle(title);
        p.setDescription(description);
        p.setPrice(price);
        p.setImageUrl(image);

        Category cat = new Category();
        cat.setName(category);
        p.setCategory(cat);
        return p;
    }
}
