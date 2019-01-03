package com.example.demo.dao.vo;

import lombok.Data;

/**
 * @author admin
 */
@Data
public class PersonVO {
    private String name;
    private Integer age;

    public PersonVO(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public PersonVO() {
    }
}
