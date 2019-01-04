package com.example.demo.dao.mapper;

import com.example.demo.dao.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
    int insert(Customer record);

    int insertSelective(Customer record);
}
