package com.library.management;

import java.util.List;

public class LinearSearch {
    // Method to search for a book by title using linear search
    public static Book searchByTitle(List<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    public static void main(String[] args) {
        // Example usage
        List<Book> books = List.of(
            new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("B002", "1984", "George Orwell"),
            new Book("B003", "To Kill a Mockingbird", "Harper Lee")
        );

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
