package com.demo.service;

import com.demo.entity.Book;

import java.util.List;

public interface BookService {
    int borrowBook(int bookId, int studentID);
    int returnBook(int bookId,int studentID);
    String findBookStatue(int bookId);
    int addBook(Book book);
    int deleteBookById(int id);
    int updateBook(Book book);
    Book findBookById(int id);
    List<Book> findAll();
}
