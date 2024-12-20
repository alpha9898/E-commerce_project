package com.example.e_comm;

public class StandardOrderProcessor implements OrderProcessor {
    public void processOrder(Product product) {
        System.out.println("Processing standard order for: " + product.getName());
    }
}
