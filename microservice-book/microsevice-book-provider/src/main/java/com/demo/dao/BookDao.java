package com.demo.dao;

import com.demo.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {
    int borrowBook(int bookId, int studentID);
    int returnBook(int bookId,int studentID);
    String findBookStatue(int bookId);
    int addBook(Book book);
    int deleteBookById(int id);
    int updateBook(Book book);
    Book findBookById(int id);
    List<Book> findAll();
}
