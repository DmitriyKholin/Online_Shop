package com.kousenit.shopping.entities;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Integer id) {
        super("Продукт не найден с ID " + id);
    }
}
