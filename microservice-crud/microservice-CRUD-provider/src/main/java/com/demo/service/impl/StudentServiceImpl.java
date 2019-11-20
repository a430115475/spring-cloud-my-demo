package com.demo.service.impl;

import com.demo.dao.StudentDao;
import com.demo.entity.Student;
import com.demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    public int deleteStudentById(int id) {
        return studentDao.deleteStudentById(id);
    }

    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    public Student findStudentById(int id) {
        return studentDao.findStudentById(id);
    }

    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
