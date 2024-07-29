package com.library.management;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    // Method to search for a book by title using binary search
    public static Book searchByTitle(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Book not found
    }

    public static void main(String[] args) {
        // Example usage
        Book[] books = {
            new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("B002", "1984", "George Orwell"),
            new Book("B003", "To Kill a Mockingbird", "Harper Lee")
        };

        // Sort books by title for binary search
        Arrays.sort(books, Comparator.comparing(Book::getTitle));

        // Search for a book
        String titleToSearch = "1984";
        Book result = searchByTitle(books, titleToSearch);
        if (result != null) {
            System.out.println("Found book: " + result);
        } else {
            System.out.println("Book not found.");
        }
    }
}
