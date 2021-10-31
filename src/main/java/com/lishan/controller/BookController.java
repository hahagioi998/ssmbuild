package com.lishan.controller;

import com.lishan.pojo.Books;
import com.lishan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName BookController
 * @Description TODO
 * @Author lishan
 * @DATE 2021-10-03 17:33
 * @Version 1.0
 */
@Controller
@RequestMapping("/book")
public class BookController {
    /**
     * controller调service层
     */
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    /**
     *
     * @param model
     * @return 查询全部书籍，并且返回到一个书籍展示页面
     */
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list",list);
        return "allBook";
    }

    /**
     * 跳转到增加书籍页面
     * @return
     */
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }
    /**
     *添加书籍的请求
     */
    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        //重定向到书籍展示页面
        return "redirect:/book/allBook";
    }

    /**
     * 跳转到修改书籍页面
     * @return
     */
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id,Model model){
        Books books = bookService.queryBooksById(id);
        model.addAttribute("QBook",books);
        return "updateBook";
    }

    /**
     *修改书籍的请求
     */
    @RequestMapping("/updateBook")
    public String updateBook(Books books){

        bookService.updateBooks(books);
        //重定向到书籍展示页面
        return "redirect:/book/allBook";
    }

    /**
     *删除书籍的请求
     */
    @RequestMapping("/deleteBook")
    public String deleteBook(int id){
        bookService.deleteByID(id);
        //重定向到书籍展示页面
        return "redirect:/book/allBook";
    }

    /**
     *查询书籍的请求
     */
    @RequestMapping("/queryBook")
    public String queryBook(String queryBook,Model model){
        if(queryBook == null){
            list(model);
        }else{
            List<Books> list = bookService.queryBooksByName("%"+queryBook+"%");
            model.addAttribute("list",list);
        }
        //重定向到书籍展示页面
        return "allBook";
    }
}
