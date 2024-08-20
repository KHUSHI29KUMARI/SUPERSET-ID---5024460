package com.bookstore.controller;

import com.bookstore.entity.Book;
import com.bookstore.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void testGetAllBooks() throws Exception {
        Mockito.when(bookService.getAllBooks()).thenReturn(Collections.emptyList());

        mockMvc.perform(MockMvcRequestBuilders.get("/books"))
                .andExpect(status().isOk());
    }
}
