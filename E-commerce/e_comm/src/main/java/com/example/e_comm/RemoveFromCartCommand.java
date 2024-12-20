package com.example.e_comm;

public class RemoveFromCartCommand implements Command {
    private CartManager cartManager;
    private Product product;

    public RemoveFromCartCommand(CartManager cartManager, Product product) {
        this.cartManager = cartManager;
        this.product = product;
    }

    @Override
    public void execute() {
        cartManager.removeProduct(product);
        System.out.println(product.getName() + " removed from cart.");
    }
}
