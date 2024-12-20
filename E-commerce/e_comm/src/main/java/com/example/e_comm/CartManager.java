package com.example.e_comm;

import java.util.ArrayList;
import java.util.List;

public class CartManager {


    private static CartManager instance;
    private List<Product> cart;
    // Singleton: com.example.e_comm.CartManager
    private CartManager() {
        cart = new ArrayList<>();
    }

    public static CartManager getInstance() {
        if (instance == null) {
            instance = new CartManager();
        }
        return instance;
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public void removeProduct(Product product) {
        cart.remove(product);
    }

    public List<Product> getCart() {
        return cart;
    }

    public static class HomeAppliance extends Product {
        public HomeAppliance(String name, double price) {
            super(name, price);
        }
    }
}
