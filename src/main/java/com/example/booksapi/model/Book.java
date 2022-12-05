package com.example.booksapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "book_id")
    private Long id;
    @Column(name = "book_name")
    private String bookName;



}
