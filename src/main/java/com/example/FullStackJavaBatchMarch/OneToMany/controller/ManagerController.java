package com.example.FullStackJavaBatchMarch.OneToMany.controller;


import com.example.FullStackJavaBatchMarch.OneToMany.domain.EmployeeM;
import com.example.FullStackJavaBatchMarch.OneToMany.domain.Manager;
import com.example.FullStackJavaBatchMarch.OneToMany.repository.EmployeeRepo;
import com.example.FullStackJavaBatchMarch.OneToMany.repository.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ManagerController {


    @Autowired
    private ManagerRepo managerRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value = "saveManager")
    public String saveManager() {

        Manager manager = new Manager();
        manager.setName("Amit");
        manager.setAddress("Pune");
        manager.setContact(1254986);

        List<EmployeeM> employeeList = new ArrayList<>();

        EmployeeM obj1 = new EmployeeM();
        obj1.setName("Neha");
        obj1.setAddress("Kolhapur");
        obj1.setContact(53669456);
        obj1.setManager(manager);
        employeeRepo.save(obj1);

        EmployeeM obj2 = new EmployeeM();
        obj2.setName("Urvashi");
        obj2.setAddress("Mumbai");
        obj2.setContact(56354556);
        obj2.setManager(manager);
        employeeRepo.save(obj2);

        EmployeeM obj3 = new EmployeeM();
        obj3.setName("Mukta");
        obj3.setAddress("Nashik");
        obj3.setContact(89567786);
        obj3.setManager(manager);
        employeeRepo.save(obj3);

        employeeList.add(obj1);
        employeeList.add(obj2);
        employeeList.add(obj3);

        manager.setEmployee(employeeList);
        managerRepo.save(manager);

        return "Manager saved..!";
    }
}
