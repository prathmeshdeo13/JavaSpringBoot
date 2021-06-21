package com.example.FullStackJavaBatchMarch.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {


    Employee findByName(String name);

    List<Employee> findByAddress(String address);

    Employee findByNameAndAddress(String name, String address);

    List<Employee> findByNameStartingWith(String name);

   List <Employee> findByNameLike(String name);
}
