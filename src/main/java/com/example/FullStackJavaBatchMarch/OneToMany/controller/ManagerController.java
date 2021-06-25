package com.example.FullStackJavaBatchMarch.OneToMany.controller;


import com.example.FullStackJavaBatchMarch.OneToMany.repository.EmployeeRepo;
import com.example.FullStackJavaBatchMarch.OneToMany.repository.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {


    @Autowired
    public ManagerRepo managerRepo;

    @Autowired
    public EmployeeRepo employeeRepo;




    
}
