package com.example.demo;

import com.example.demo.config.AuthorSettings;
import com.example.demo.dao.Book;
import com.example.demo.dao.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testInsert(){
        System.out.println("hello");
        Book book = new Book();
        book.setReader("weng");
        book.setTitle("are you fool");
        bookRepository.save(book);

    }


    @Autowired
    private AuthorSettings authorSettings;

    @Test
    public void testConfigurationProperties(){
        System.out.println(authorSettings.getName());
        System.out.println(authorSettings.getAge());
    }

}
