package com.inventory.management;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, Product product) {
        if (products.containsKey(productId)) {
            products.put(productId, product);
        } else {
            System.out.println("Product not found");
        }
    }

    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }

    public void printInventory() {
        for (Product product : products.values()) {
            System.out.println("Product ID: " + product.getProductId() + 
                               ", Name: " + product.getProductName() + 
                               ", Quantity: " + product.getQuantity() + 
                               ", Price: " + product.getPrice());
        }
    }
}
