package com.example.e_comm;

public class WarrantyDecorator extends ProductDecorator {
    public WarrantyDecorator(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 50.0;
    }

    @Override
    public String getDescription() {
        return product.getName() + " with Extended Warranty";
    }
}

