package com.example.e_comm;

// Decorator Pattern

abstract class ProductDecorator extends Product {
    protected Product product;

    public ProductDecorator(Product product) {
        super(product.getName(), product.getPrice());
        this.product = product;
    }

    public abstract String getDescription();
}
