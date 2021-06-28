package com.example.FullStackJavaBatchMarch.manytomany.repository;

import com.example.FullStackJavaBatchMarch.manytomany.domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepo extends JpaRepository<Bank,Integer> {
}
