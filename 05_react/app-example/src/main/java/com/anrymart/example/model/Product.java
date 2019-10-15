package com.anrymart.example.model;

import lombok.Data;

@Data
public class Product {
    String name;
    String description;
    String imageUrl;
    double price;

    public Product(String name, String description, String imageUrl, double price) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
    }
}
