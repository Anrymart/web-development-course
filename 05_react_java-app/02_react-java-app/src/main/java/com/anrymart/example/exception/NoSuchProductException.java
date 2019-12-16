package com.anrymart.example.exception;

public class NoSuchProductException extends Exception {
    public NoSuchProductException() {
        super("Requested product does not exist");
    }

    public NoSuchProductException(String message) {
        super(message);
    }
}
