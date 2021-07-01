package com.example.FullStackJavaBatchMarch.manytomany.controller;

import com.example.FullStackJavaBatchMarch.manytomany.domain.Bank;
import com.example.FullStackJavaBatchMarch.manytomany.domain.Customer;
import com.example.FullStackJavaBatchMarch.manytomany.repository.BankRepo;
import com.example.FullStackJavaBatchMarch.manytomany.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BankController {

    @Autowired
    private BankRepo bankRepo;

    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping(value = "saveBank")
    public String saveBank(){

        Bank bank = new Bank();
        bank.setBankName("Kotak Bank");
        bank.setAddress("LaxmiRoad  Branch");

        bankRepo.save(bank);

        List<Customer> customerList = new ArrayList<>();

        Customer obj1 = new Customer();
        obj1.setCustomerName("Bhakti");
        obj1.setCustomerAddress("1561,Katraj,pune");


        Customer obj2 = new Customer();
        obj2.setCustomerName("Prathmesh");
        obj2.setCustomerAddress("7851,Narayan Peth,pune");


        Customer obj3 = new Customer();
        obj3.setCustomerName("Omkar");
        obj3.setCustomerAddress("1369,Chandan Nagar,pune");

        customerList.add(obj1);
        customerList.add(obj2);
        customerList.add(obj3);

        customerRepo.saveAll(customerList);

        bank.setCustomer(customerList);

        bankRepo.save(bank);

        return "Customer saved.....!";

    }

    @GetMapping(value = "getCustomer")
    public List<Customer> getCustomer(){
        List<Customer> cust=customerRepo.findAll();
        return cust ;
    }
}
