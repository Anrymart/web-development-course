package com.anrymart.example.controller;

import com.anrymart.example.dao.ProductDao;
import com.anrymart.example.exception.NoSuchProductException;
import com.anrymart.example.model.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.http.Context;
import org.eclipse.jetty.http.HttpStatus;

public class ProductController {

    private final ProductDao productDao;
    private final ObjectMapper mapper;

    public ProductController() {
        productDao = new ProductDao();
        mapper = new ObjectMapper();
    }

    public void getAll(Context ctx) {
        ctx.json(productDao.findAll());
    }

    public void getById(Context ctx) throws NoSuchProductException {
        int id = Integer.parseInt(ctx.pathParam("id"));
        ctx.json(productDao.findById(id));
    }

    public void create(Context ctx) {
        Product product = ctx.bodyAsClass(Product.class);
        productDao.save(product);
        ctx.status(HttpStatus.CREATED_201);
    }

    public void update(Context ctx) {
        int id = Integer.parseInt(ctx.pathParam("id"));
        Product product = ctx.bodyAsClass(Product.class);
        productDao.update(id, product);
        ctx.status(HttpStatus.CREATED_201);
    }
}
