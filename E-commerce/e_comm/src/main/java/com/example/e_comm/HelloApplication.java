package com.example.e_comm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        CartManager cartManager = CartManager.getInstance();

        ListView<Product> productListView = new ListView<>();

        productListView.getItems().addAll(
                new Electronics("Laptop", 1200.00),
                new Electronics("Smartphone", 800.00),
                new Clothing("T-Shirt", 20.00),
                new Clothing("Jeans", 50.00),
                new CartManager.HomeAppliance("Microwave", 150.00),
                new CartManager.HomeAppliance("Refrigerator", 600.00)
        );

        productListView.setCellFactory(param -> new ListCell<>() {
            @Override
            protected void updateItem(Product product, boolean empty) {
                super.updateItem(product, empty);
                if (empty || product == null) {
                    setText(null);
                } else {
                    setText(product.getName() + " - $" + product.getPrice());
                }
            }
        });


        Label cartLabel = new Label("Cart Contents:");
        TextArea cartArea = new TextArea();
        cartArea.setEditable(false);


        Button addToCartButton = new Button("Add to Cart");

        addToCartButton.setOnAction(e -> {
            Product selectedProduct = productListView.getSelectionModel().getSelectedItem();
            if (selectedProduct != null) {
                cartManager.addProduct(selectedProduct);
                updateCart(cartManager, cartArea);
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("No Product Selected");
                alert.setHeaderText(null);
                alert.setContentText("Please select a product to add to the cart.");
                alert.showAndWait();
            }
        });

        VBox layout = new VBox(10);
        layout.setPadding(new javafx.geometry.Insets(10));
        layout.getChildren().addAll(new Label("Available Products:"), productListView, addToCartButton, cartLabel, cartArea);

        Scene scene = new Scene(layout, 400, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("E-Commerce App");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }


    private void updateCart(CartManager cartManager, TextArea cartArea) {
        StringBuilder cartContents = new StringBuilder();
        for (Product product : cartManager.getCart()) {
            cartContents.append(product.getName()).append(" - ").append(product.getPrice()).append("\n");
        }
        cartArea.setText(cartContents.toString());
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }



}