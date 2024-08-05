package com.librarry;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApplication {
    public static void main(String[] args) {
        // Load the Spring context from the XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the BookService bean with constructor injection
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.addBook("The Great Gatsby");

        // Optionally, get the BookService bean with setter injection if defined
        // BookService bookServiceSetter = (BookService) context.getBean("bookServiceSetter");
        // bookServiceSetter.addBook("1984");
    }
}
