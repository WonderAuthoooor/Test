package com.example.demo.controller;

import com.example.demo.config.AuthorSettings;
import com.example.demo.dao.temp.RetResult;
import com.example.demo.dao.vo.PersonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Index {

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/")
    public String index(Model model){
        PersonVO personVO = new PersonVO();
        personVO.setName("hello");
        model.addAttribute("singlePerson", personVO);
        return "index";
    }

    @RequestMapping("/configurationProperties")
    @ResponseBody
    public String configurationProperties(){
        return authorSettings.getName();
    }


    @PostMapping("/getRetResult")
    @ResponseBody
    public RetResult getRetResult(){
        RetResult retResult = new RetResult();
        retResult.setData("hello");
        return retResult;
    }



}
