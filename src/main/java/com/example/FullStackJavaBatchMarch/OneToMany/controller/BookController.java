package com.example.FullStackJavaBatchMarch.OneToMany.controller;


import com.example.FullStackJavaBatchMarch.OneToMany.domain.Book;
import com.example.FullStackJavaBatchMarch.OneToMany.domain.Page;
import com.example.FullStackJavaBatchMarch.OneToMany.repository.BookRepo;
import com.example.FullStackJavaBatchMarch.OneToMany.repository.PageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private PageRepo pageRepo;

    @PostMapping(value = "saveBook")
    public String saveBook(){

        Book book = new Book();
        book.setBookName("Raja Shiv Chatrapati");
        book.setTopics(30);

        List<Page> pageList = new ArrayList<>();

        Page obj1 =new Page();
        obj1.setPageNo(23);
        obj1.setPageColour("White");
        obj1.setBook(book);
        pageRepo.save(obj1);

        Page obj2 = new Page();
        obj2.setPageNo(56);
        obj2.setPageColour("White");
        obj2.setBook(book);
        pageRepo.save(obj2);


        Page obj3 = new Page();
        obj3.setPageNo(56);
        obj3.setPageColour("White");
        obj3.setBook(book);
        pageRepo.save(obj3);


        Page obj4 = new Page();
        obj4.setPageNo(56);
        obj4.setPageColour("White");
        obj4.setBook(book);
        pageRepo.save(obj4);

        pageList.add(obj1);
        pageList.add(obj2);
        pageList.add(obj3);
        pageList.add(obj4);

        book.setPage(pageList);
        bookRepo.save(book);

        return "Book saved...!";
    }
}
