package com.bookstore.integration;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Optional;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class BookControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testGetBookById() throws Exception {
        Book book = new Book();
        book.setTitle("Test Book");
        book.setAuthor("Test Author");
        bookRepository.save(book);

        mockMvc.perform(MockMvcRequestBuilders.get("/books/" + book.getId()))
                .andExpect(status().isOk());
    }
}
