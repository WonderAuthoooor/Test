package com.example.demo.service;

import com.example.demo.dao.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomers(int id);
}
