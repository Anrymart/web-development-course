package com.anrymart.example.dao;

import com.anrymart.example.exception.NoSuchProductException;
import com.anrymart.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> products;

    public ProductDao() {
        products = new ArrayList<>();
        products.add(new Product("iphone 12", "New apple iphone 12", "http://localhost:3000/iphone.png", 123));
        products.add(new Product("iphone 13", "New apple iphone 13", "http://localhost:3000/iphone.png", 123));
    }

    public List<Product> findAll() {
        return products;
    }

    public Product findById(int id) throws NoSuchProductException {
        if (products.size() <= id) {
            throw new NoSuchProductException();
        }
        return products.get(id);
    }

    public void save(Product product) {
        products.add(product);
    }

    public void update(int id, Product product) {
        products.set(id, product);
    }
}
