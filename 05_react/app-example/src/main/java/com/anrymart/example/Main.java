package com.anrymart.example;

import com.anrymart.example.controller.ProductController;
import io.javalin.Javalin;

import static io.javalin.apibuilder.ApiBuilder.*;

public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/public");
            config.enableCorsForAllOrigins();
        }).start(8080);

        ProductController productController = new ProductController();

        app.routes(() -> {
            path("/api/products", () -> {
                get(productController::getProducts);
            });
        });
    }
}
