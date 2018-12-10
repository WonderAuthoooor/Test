package com.example.demo.service;

import com.example.demo.dao.Customer;
import com.example.demo.dao.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public List<Customer> getAllCustomers(int id) {
        customerMapper.getAllCustomers(id);
        return null;
    }
}
