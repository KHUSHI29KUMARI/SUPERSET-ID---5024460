package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void saveBook(String book) {
        System.out.println("Saving book: " + book);
    }
}
