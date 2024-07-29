package com.ecommerce.search;

import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgorithms {

    // Linear search
    public static int linearSearch(Product[] products, String target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(target)) {
                return i; // Return the index of the found product
            }
        }
        return -1; // Return -1 if the product is not found
    }

    // Binary search
    public static int binarySearch(Product[] products, String target) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName)); // Ensure the array is sorted

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareTo(target);

            if (comparison == 0) {
                return mid; // Return the index of the found product
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if the product is not found
    }
}
