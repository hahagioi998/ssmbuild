package com.lishan.service;

import com.lishan.dao.BookMapper;
import com.lishan.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BookServiceImpl
 * @Description TODO
 * @Author lishan
 * @DATE 2021-10-03 16:00
 * @Version 1.0
 */
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteByID(int bookID) {
        return bookMapper.deleteByID(bookID);
    }

    public int updateBooks(Books books) {
        return bookMapper.updateBooks(books);
    }

    public Books queryBooksById(int id) {
        return bookMapper.queryBooksById(id);
    }

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    public List<Books> queryBooksByName(String bookName) {
        return bookMapper.queryBooksByName(bookName);
    }
}
