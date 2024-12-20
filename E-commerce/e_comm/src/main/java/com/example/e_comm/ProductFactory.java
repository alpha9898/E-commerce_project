package com.example.e_comm;

public class ProductFactory {

    public static Product createProduct(String category, String name, double price) {
        return switch (category.toLowerCase()) {
            case "electronics" -> new Electronics(name, price);
            case "clothing" -> new Clothing(name, price);
            case "home appliance" -> new CartManager.HomeAppliance(name, price);
            default -> throw new IllegalArgumentException("Unknown product category");
        };
    }

}
