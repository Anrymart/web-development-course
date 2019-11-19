package com.anrymart.example;

import com.anrymart.example.controller.ProductController;
import com.anrymart.example.exception.NoSuchProductException;
import io.javalin.Javalin;
import org.eclipse.jetty.http.HttpStatus;

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
                get(productController::getAll);
                get(":id", productController::getById);
                post(productController::create);
                patch(":id", productController::update);
            });
        });

        app.exception(NoSuchProductException.class, (e, ctx) -> {
            ctx.status(HttpStatus.NOT_FOUND_404);
            ctx.result(e.getMessage());
        });
    }
}
