package com.demo.service.impl;

import com.demo.dao.BookDao;
import com.demo.entity.Book;
import com.demo.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;

    @Override
    public int borrowBook(int bookId, int studentID) {
        if(findBookStatue(bookId)=="in")
            return bookDao.borrowBook(bookId,studentID);
        else return 0;
    }

    @Override
    public int returnBook(int bookId, int studentID) {
        return bookDao.returnBook(bookId,studentID);
    }

    @Override
    public String findBookStatue(int bookId) {
        return bookDao.findBookStatue(bookId);
    }

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookDao.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public Book findBookById(int id) {
        return bookDao.findBookById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
