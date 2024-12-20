package com.example.e_comm;

public class ExpressOrderProcessor implements OrderProcessor {
    public void processOrder(Product product) {
        System.out.println("Processing express order for: " + product.getName());
    }
}
