package com.example.FullStackJavaBatchMarch.OneToMany.repository;

import com.example.FullStackJavaBatchMarch.OneToMany.domain.EmployeeM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeM,Integer> {
}
