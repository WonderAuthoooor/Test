package com.example.demo.controller;

import com.example.demo.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Index {

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return bookName;
    }

    @RequestMapping("/configurationProperties")
    @ResponseBody
    public String configurationProperties(){
        return authorSettings.getName();
    }
}
