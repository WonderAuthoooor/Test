package com.example.demo.dao.repository;

import com.example.demo.dao.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author admin
 */
public interface BookRepository extends JpaRepository<Book,Long> {
    /**
     * 根据读者返回Book列表
     * @param reader
     * @return
     */
    List<Book> findByReader(String reader);
}
