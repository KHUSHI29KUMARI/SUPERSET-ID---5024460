package com.ecommerce.search;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("1", "Laptop", "Electronics"),
            new Product("2", "Smartphone", "Electronics"),
            new Product("3", "Tablet", "Electronics"),
            new Product("4", "Headphones", "Accessories"),
            new Product("5", "Charger", "Accessories")
        };

        String target = "Tablet";

        // Linear Search
        int linearSearchResult = SearchAlgorithms.linearSearch(products, target);
        if (linearSearchResult != -1) {
            System.out.println("Product found at index (Linear Search): " + linearSearchResult);
        } else {
            System.out.println("Product not found (Linear Search).");
        }

        // Binary Search
        int binarySearchResult = SearchAlgorithms.binarySearch(products, target);
        if (binarySearchResult != -1) {
            System.out.println("Product found at index (Binary Search): " + binarySearchResult);
        } else {
            System.out.println("Product not found (Binary Search).");
        }
    }
}
