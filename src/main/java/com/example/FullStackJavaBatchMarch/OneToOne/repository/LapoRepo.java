package com.example.FullStackJavaBatchMarch.OneToOne.repository;

import com.example.FullStackJavaBatchMarch.OneToOne.domain.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LapoRepo extends JpaRepository<Laptop,Integer> {
}
