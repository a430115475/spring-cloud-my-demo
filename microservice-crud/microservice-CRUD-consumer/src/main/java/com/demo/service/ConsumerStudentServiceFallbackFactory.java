package com.demo.service;

import com.demo.entity.Student;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsumerStudentServiceFallbackFactory implements FallbackFactory<ConsumerStudentService> {
    @Override
    public ConsumerStudentService create(Throwable throwable) {
        return new ConsumerStudentService() {
            @Override
            public int add(Student student) {
                return 0;
            }

            @Override
            public int delete(int id) {
                return 0;
            }

            @Override
            public int update(Student student) {
                return 0;
            }

            @Override
            public Student find(int id) {
                Student student = new Student("该ID" + id + "没有对应的信息，Consumer客户端提供的降级信息，此刻服务暂停。");
                return student;
            }

            @Override
            public List<Student> findAll() {
                return null;
            }
        };
    }
}
