package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Student implements Serializable {
    private int id;
    private String name;
    private String phone;

    public Student(String name)
    {
        this.name=name;
    }
}
