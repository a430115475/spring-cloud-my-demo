package com.demo.dao;

import com.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {
    int addStudent(Student student);
    int deleteStudentById(int id);
    int updateStudent(Student student);
    Student findStudentById(int id);
    List<Student> findAll();
}
