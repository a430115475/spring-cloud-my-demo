package com.demo.controller;

import com.demo.entity.Student;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public int add(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/delete/{id}")
    public int delete(@PathVariable int id){
        return studentService.deleteStudentById(id);
    }

    @PostMapping("/update")
    public int update(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @GetMapping("/find/{id}")
    public Student find(@PathVariable int id){
        return studentService.findStudentById(id);
    }

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentService.findAll();
    }
}
