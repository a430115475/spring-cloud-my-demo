package com.demo.controller;

import com.demo.entity.Book;
import com.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/returnBook/{bookId}/{studentId}")
    public int returnBook(@PathVariable int bookId,@PathVariable int studentId){
        return bookService.returnBook(bookId,studentId);
    }

    @GetMapping("/borrowBook/{bookId}/{studentId}")
    public int borrowBook(@PathVariable int bookId,@PathVariable int studentId){
        return bookService.borrowBook(bookId,studentId);
    }

    @PostMapping("/add")
    public int add(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/delete/{id}")
    public int delete(@PathVariable int id){
        return bookService.deleteBookById(id);
    }

    @PostMapping("/update")
    public int update(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @GetMapping("/find/{id}")
    public Book find(@PathVariable int id){
        return bookService.findBookById(id);
    }

    @GetMapping("/findAll")
    public List<Book> findAll(){
        return bookService.findAll();
    }

}
