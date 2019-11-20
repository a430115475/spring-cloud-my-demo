package com.demo.controller;

import com.demo.entity.Student;
import com.demo.service.ConsumerStudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class StudentControllerConsumer {
    @Value("${server.port}")
    private int port;

    @GetMapping("/hello")
    public int getPort(){
        return port;
    }

    @Resource
    private ConsumerStudentService consumerStudentService;

    @PostMapping("/Student/add")
    public int add(@RequestBody Student student){
        return consumerStudentService.add(student);
    }

    @GetMapping("/Student/delete/{id}")
    public int delete(@PathVariable int id){
        return consumerStudentService.delete(id);
    }

    @PostMapping("/Student/update")
    public int update(@RequestBody Student student){
        return consumerStudentService.update(student);
    }

    @GetMapping("/Student/find/{id}")
    public Student find(@PathVariable int id){
        return consumerStudentService.find(id);
    }

    @GetMapping("/Student/findAll")
    public List<Student> findAll(){
        return consumerStudentService.findAll();
    }
}
