package com.crud.Crud_artifact.controllers;

import com.crud.Crud_artifact.model.Book;
import com.crud.Crud_artifact.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService ;

    public BookController ( BookService bookService) {
        this.bookService = bookService ;
    }

    @GetMapping("/book")
    public List<Book> getList() {
        return bookService.getAllBooks() ;
    }

}
