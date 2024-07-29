package com.inventory.management;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("1", "Product 1", 10, 100.0);
        Product product2 = new Product("2", "Product 2", 20, 200.0);
        Product product3 = new Product("3", "Product 3", 30, 300.0);

        // Add products
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Print inventory
        System.out.println("Initial Inventory:");
        inventory.printInventory();

        // Update product
        Product updatedProduct2 = new Product("2", "Updated Product 2", 25, 250.0);
        inventory.updateProduct("2", updatedProduct2);

        // Print inventory after update
        System.out.println("\nInventory after updating Product 2:");
        inventory.printInventory();

        // Delete product
        inventory.deleteProduct("3");

        // Print inventory after deletion
        System.out.println("\nInventory after deleting Product 3:");
        inventory.printInventory();
    }
}
