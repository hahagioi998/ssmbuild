package com.lishan.dao;

import com.lishan.pojo.Books;

import java.util.List;

/**
 * @ClassName BookMapper
 * @Description TODO
 * @Author lishan
 * @DATE 2021-10-03 15:17
 * @Version 1.0
 */
public interface BookMapper {

    /**
     * //增加一本书
     * @param books
     * @return
     */
    int addBook(Books books);
    /**
     * //删除一本书
     * @param bookID
     * @return
     */
    int deleteByID( int bookID);
    /**
     * //更新一本书
     * @param books
     * @return
     */
    int updateBooks(Books books);
    /**
     * //查询一本书
     * @param id
     * @return
     */
    Books queryBooksById(int id);
    /**
     * //查询全部的书
     * @param
     * @return
     */
    List<Books> queryAllBooks();

    /**
     * //根据书名查询书
     * @param bookName
     * @return
     */
    List<Books> queryBooksByName(String bookName);
}
