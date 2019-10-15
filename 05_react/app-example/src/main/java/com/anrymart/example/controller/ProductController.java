package com.anrymart.example.controller;

import com.anrymart.example.model.Product;
import io.javalin.http.Context;

import java.util.ArrayList;
import java.util.List;

public class ProductController {

    private final List<Product> products;

    public ProductController() {
        products = new ArrayList<>();
        products.add(new Product("iphone 12", "New apple iphone 12", "https://localhost:3000/iphone.png", 123));
    }

    public void getProducts(Context ctx) {
        ctx.json(products);
    }

}
