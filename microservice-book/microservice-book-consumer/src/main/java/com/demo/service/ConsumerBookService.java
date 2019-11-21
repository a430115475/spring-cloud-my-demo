package com.demo.service;

import com.demo.entity.Book;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "microservice-book",fallbackFactory = ConsumerBookServiceFallbackFactory.class)
public interface ConsumerBookService {
    @RequestMapping(value="/book/returnBook/{bookId}/{studentId}",method = RequestMethod.GET)
    public int returnBook(@PathVariable int bookId,@PathVariable int studentId);

    @RequestMapping(value="/book/borrowBook/{bookId}/{studentId}",method = RequestMethod.GET)
    public int borrowBook(@PathVariable int bookId,@PathVariable int studentId);

    @RequestMapping(value="/book/add",method = RequestMethod.POST)
    public int add(@RequestBody Book book);

    @RequestMapping(value="/book/delete/{id}",method = RequestMethod.GET)
    public int delete(@PathVariable("id") int id);

    @RequestMapping(value="/book/update",method = RequestMethod.POST)
    public int update(@RequestBody Book book);

    @RequestMapping(value="/book/find/{id}",method = RequestMethod.GET)
    public Book find(@PathVariable("id") int id);

    @RequestMapping(value="/book/findAll",method = RequestMethod.GET)
    public List<Book> findAll();
}
