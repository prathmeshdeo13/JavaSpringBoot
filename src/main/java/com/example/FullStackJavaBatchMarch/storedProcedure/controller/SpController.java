package com.example.FullStackJavaBatchMarch.storedProcedure.controller;

import com.example.FullStackJavaBatchMarch.OneToOne.domain.Laptop;
import com.example.FullStackJavaBatchMarch.jsonmanagerbackref.domain.Doctor;
import com.example.FullStackJavaBatchMarch.storedProcedure.repository.SpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "api/sp/")
public class SpController {

    @Autowired
    private SpRepository spRepository;


    @RequestMapping(value = "/spCall",method = RequestMethod.GET)
    public ResponseEntity<?> spCall(){
        List<Doctor> list = spRepository.spCall();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @RequestMapping(value = "/spEmp",method = RequestMethod.GET)
    public ResponseEntity<?> spEmp(){
        List<Map<String,String>> list = spRepository.spEmp();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @RequestMapping(value = "/spLaptop",method = RequestMethod.GET)
    public ResponseEntity<?> spLaptop(){
        Laptop l= spRepository.spLaptop();
        return new ResponseEntity<>(l,HttpStatus.OK);
    }
}
