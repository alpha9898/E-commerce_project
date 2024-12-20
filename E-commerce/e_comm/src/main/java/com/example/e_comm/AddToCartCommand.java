package com.example.e_comm;

public class AddToCartCommand implements Command {
    private CartManager cartManager;
    private Product product;

    public AddToCartCommand(CartManager cartManager, Product product) {
        this.cartManager = cartManager;
        this.product = product;
    }

    @Override
    public void execute() {
        cartManager.addProduct(product);
        System.out.println(product.getName() + " added to cart.");
    }
}
