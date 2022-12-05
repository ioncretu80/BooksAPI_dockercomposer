package com.example.booksapi.service;


import com.example.booksapi.dao.BookRepository;
import com.example.booksapi.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){

        return bookRepository.findAll();
    }

    public Book addBook(Book book) {
      return  bookRepository.save(book);
    }

    public Book getBookById(Long bookId) {
        return bookRepository.findById(bookId).get();
    }
}