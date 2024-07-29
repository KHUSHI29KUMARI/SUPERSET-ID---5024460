package com.ecommerce.sorting;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Alice", 250.0),
            new Order("2", "Bob", 150.0),
            new Order("3", "Charlie", 300.0),
            new Order("4", "David", 100.0),
            new Order("5", "Eve", 200.0)
        };

        System.out.println("Original Order Array:");
        printOrders(orders);

        // Bubble Sort
        SortingAlgorithms.bubbleSort(orders);
        System.out.println("\nOrder Array After Bubble Sort:");
        printOrders(orders);

        // Reset the array
        orders = new Order[]{
            new Order("1", "Alice", 250.0),
            new Order("2", "Bob", 150.0),
            new Order("3", "Charlie", 300.0),
            new Order("4", "David", 100.0),
            new Order("5", "Eve", 200.0)
        };

        // Quick Sort
        SortingAlgorithms.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrder Array After Quick Sort:");
        printOrders(orders);
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println("OrderID: " + order.getOrderId() + ", Customer: " + order.getCustomerName() + ", Total Price: " + order.getTotalPrice());
        }
    }
}
