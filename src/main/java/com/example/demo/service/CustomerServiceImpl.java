package com.example.demo.service;

import com.example.demo.dao.Customer;
import com.example.demo.dao.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author admin
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public int insert(Customer customer) {
        return customerMapper.insert(customer);
    }
}
