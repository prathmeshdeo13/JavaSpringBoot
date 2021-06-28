package com.example.FullStackJavaBatchMarch.manytomany.repository;

import com.example.FullStackJavaBatchMarch.manytomany.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
