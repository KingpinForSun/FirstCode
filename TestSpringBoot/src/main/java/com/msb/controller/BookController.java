package com.msb.controller;

import com.msb.pojo.Book;
import com.msb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @ResponseBody
    @RequestMapping("/findBooks")
    public String findBooks() {
        List list = bookService.findAllBooks();
        String s = "";
        for (int i = 0; i < list.size(); i++) {
            Book b = (Book) list.get(i);
            s += b.getName();
            s += b.getAuthor();
        }
        return s;
    }
}
