package com.example.FullStackJavaBatchMarch.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
    
    @GetMapping(value = "helloWorld")
    public String helloWorld(){
        return "Hii Spring";
    }

    @PostMapping("postData")
    public String postData(@RequestBody Student student){
        System.out.println(student.id+ " "+student.name);
        return "Hii";
    }
}
