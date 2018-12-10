package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {
    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> getAllCustomers(@Param("id") int id);
}