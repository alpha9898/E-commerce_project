package com.example.e_comm;

public class DiscountDecorator  extends ProductDecorator {
    public DiscountDecorator(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() * 0.9;
    }

    @Override
    public String getDescription() {
        return product.getName() + " with Discount";
    }
}
