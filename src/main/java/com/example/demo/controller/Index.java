package com.example.demo.controller;

import com.example.demo.config.AuthorSettings;
import com.example.demo.dao.Customer;
import com.example.demo.dao.temp.RetResult;
import com.example.demo.dao.vo.PersonVO;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 */
@RestController
@RequestMapping("/Index")
public class Index {

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private AuthorSettings authorSettings;

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public String index(Model model){
        PersonVO personVO = new PersonVO();
        personVO.setName("hello");
        model.addAttribute("singlePerson", personVO);
        List<PersonVO> personVOS = new ArrayList<>();
        personVOS.add(new PersonVO("a",10));
        personVOS.add(new PersonVO("b", 20));
        model.addAttribute("people", personVOS);
        return "index";
    }

    @RequestMapping("/configurationProperties")
    public String configurationProperties(){
        return authorSettings.getName();
    }


    @PostMapping("/getRetResult")
    public RetResult getRetResult(){
        RetResult retResult= new RetResult<>();
        Customer customer = new Customer();
        customer.setCusId(2);
        customer.setUsername("zhansan");
        customer.setAcno("als");
        customer.setGender("male");
        customer.setPhone("1321321");
        customerService.insert(customer);
        return retResult;
    }

}
