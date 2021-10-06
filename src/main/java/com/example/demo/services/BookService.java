package com.example.demo.services;

import java.util.List;

import com.example.demo.Repositories.BookRepository;
import com.example.demo.models.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        return bookRepository.findAll();
    }
    
}
