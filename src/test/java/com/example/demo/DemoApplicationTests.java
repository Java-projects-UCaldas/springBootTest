package com.example.demo;


import static org.mockito.Mockito.when;


import java.util.List;


import com.example.demo.services.BookService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.models.Book;


@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    public void BookList() {
        List<Book> books = bookService.list();

        Assertions.assertEquals(books.size(), 3);
    }
}