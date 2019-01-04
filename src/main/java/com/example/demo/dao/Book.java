package com.example.demo.dao;

import lombok.Data;

import javax.persistence.*;

/**
 * @author admin
 * Book实体类
 */
@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reader;

    private String isbn;
    private String title;
    private String author;
    private String description;
}
