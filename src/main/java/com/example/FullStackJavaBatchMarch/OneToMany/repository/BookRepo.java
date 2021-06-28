package com.example.FullStackJavaBatchMarch.OneToMany.repository;

import com.example.FullStackJavaBatchMarch.OneToMany.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
