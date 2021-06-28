package com.example.FullStackJavaBatchMarch.OneToMany.repository;

import com.example.FullStackJavaBatchMarch.OneToMany.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PageRepo extends JpaRepository<Page,Integer> {
}
