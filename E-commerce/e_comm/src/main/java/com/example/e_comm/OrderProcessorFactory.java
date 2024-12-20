package com.example.e_comm;

public class OrderProcessorFactory {
    public static OrderProcessor createOrderProcessor(String type) {
        return switch (type.toLowerCase()) {
            case "standard" -> new StandardOrderProcessor();
            case "express" -> new ExpressOrderProcessor();
            default -> throw new IllegalArgumentException("Unknown order type");
        };
    }

}
