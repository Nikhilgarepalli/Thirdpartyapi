package com.example.demo4.model;


import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id;
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private Category category;
}
