package com.demo.service;

import com.demo.entity.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "microservice-CRUD",fallbackFactory = ConsumerStudentServiceFallbackFactory.class)
public interface ConsumerStudentService {
    @RequestMapping(value="/Student/add",method = RequestMethod.POST)
    public int add(@RequestBody Student student);

    @RequestMapping(value="/Student/delete/{id}",method = RequestMethod.GET)
    public int delete(@PathVariable("id") int id);

    @RequestMapping(value="/Student/update",method = RequestMethod.POST)
    public int update(@RequestBody Student student);

    @RequestMapping(value="/Student/find/{id}",method = RequestMethod.GET)
    public Student find(@PathVariable("id") int id);

    @RequestMapping(value="/Student/findAll",method = RequestMethod.GET)
    public List<Student> findAll();
}
