package com.demo.service;

import com.demo.entity.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    int deleteStudentById(int id);
    int updateStudent(Student student);
    Student findStudentById(int id);
    List<Student> findAll();
}
