package com.example.FullStackJavaBatchMarch.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeRepository employeeRepository;

    @PostMapping(value ="saveEmp")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "Employee Saved...!";
    }

    @GetMapping(value = "getEmp")
    public List<Employee> getEmployee(){
    return employeeRepository.findAll();
    }

    @PutMapping(value ="update")
    public String update(@RequestBody Employee employee){
    Employee employee1 = employeeRepository.getById(employee.getId());
            employee1.setName(employee.getName());
            employee1.setAddress(employee.getAddress());
            employee1.setContact(employee.getContact());
            employeeRepository.save(employee1);
            return "Updated....!";

    }

    @DeleteMapping(value = "deleteEmployee/{id}")
    public String deleteEmp(@PathVariable(value = "id")Integer id){
        employeeRepository.deleteById(id);
        return "deleted employee id=>"+id;
    }

    @DeleteMapping(value = "deleteEmp1/{id}")
    public String deleteEmp1(@PathVariable(value = "id")Integer id){
        Employee employee =employeeRepository.getById(id);
        employeeRepository.delete(employee);
        return "delete employee=>"+id;
    }

    @DeleteMapping(value = "deleteAll")
    public String deleteAll(){
        employeeRepository.deleteAll();
        return "deleted Employee id=>";
    }
//
//    @DeleteMapping(value = "deleteById/{id}")
//    public String deleteById(@PathVariable (value = "id")Integer id){
//        employeeRepository.deleteAllById(Collections.singleton(id));
//        return "deletedAll employee=>"+id;
//
//    }

    @GetMapping(value = "getEmpId/{id}")
    public Optional<Employee> getEmpId(@PathVariable (value="id")Integer id){
       Optional <Employee> e=employeeRepository.findById(id);
        return e;
    }


    @GetMapping(value = "getEmpName/{name}")
    public Employee getEmpName(@PathVariable (value = "name")String name){
    Employee e1= employeeRepository.findByName(name);
    return e1;
    }


    @GetMapping(value = "getEmpAddress/{address}")
    public List<Employee> getEmpAddress(@PathVariable (value = "address")String address){
        List<Employee>  e2=employeeRepository.findByAddress(address);
        return e2;
    }


    @GetMapping(value = "getNameAndAddress")
    public Employee getNameAndAddress(@RequestParam String name, @RequestParam String address){
       Employee employee = employeeRepository.findByNameAndAddress(name,address);
       return employee;
    }


    @GetMapping(value = "getEmpStart")
    public List<Employee> getEmpStart(@RequestParam String name){
        List <Employee> e = (List<Employee>) employeeRepository.findByNameStartingWith(name);
            return e;
    }

    @GetMapping(value = "getEmpLike")
    public List<Map<String,String>> getEmpLike(@RequestParam String name){
      List<Map<String,String>> e = employeeRepository.findByNameLike(name);
      return  e;
    }
}

