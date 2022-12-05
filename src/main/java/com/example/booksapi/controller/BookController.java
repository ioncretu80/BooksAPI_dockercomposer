package com.example.booksapi.controller;

import com.example.booksapi.model.Book;
import com.example.booksapi.service.BookService;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@Log4j2
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/")
    public List<Book> getAllBooks(){

        log.info("test test test");
        return bookService.getAllBooks();
    }
    @PostMapping("/")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);

    }

    @GetMapping ("/{bookId}")
    public Book getBookById(@PathVariable Long bookId){
        return bookService.getBookById(bookId);

    }

}
