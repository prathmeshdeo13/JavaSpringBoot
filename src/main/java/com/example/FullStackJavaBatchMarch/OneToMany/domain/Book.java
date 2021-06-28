package com.example.FullStackJavaBatchMarch.OneToMany.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String bookName;

    private int Topics;

    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Page> page;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getTopics() {
        return Topics;
    }

    public void setTopics(int topics) {
        Topics = topics;
    }

    public List<Page> getPage() {
        return page;
    }

    public void setPage(List<Page> page) {
        this.page = page;
    }
}

