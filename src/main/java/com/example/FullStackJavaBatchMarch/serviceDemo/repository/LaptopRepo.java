package com.example.FullStackJavaBatchMarch.serviceDemo.repository;

import com.example.FullStackJavaBatchMarch.serviceDemo.domain.Lap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Lap,Integer> {
}
