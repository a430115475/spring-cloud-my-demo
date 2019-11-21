package com.demo.service;

import com.demo.entity.Book;
import com.demo.entity.Student;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsumerBookServiceFallbackFactory implements FallbackFactory<ConsumerBookService> {
    @Override
    public ConsumerBookService create(Throwable throwable) {
        return new ConsumerBookService() {

            @Override
            public int returnBook(int bookId, int studentId) {
                return 0;
            }

            @Override
            public int borrowBook(int bookId, int studentId) {
                return 0;
            }

            @Override
            public int add(Book book) {
                return 0;
            }

            @Override
            public int delete(int id) {
                return 0;
            }

            @Override
            public int update(Book book) {
                return 0;
            }

            @Override
            public Book find(int id) {
                return null;
            }

            @Override
            public List<Book> findAll() {
                return null;
            }
        };
    }
}
