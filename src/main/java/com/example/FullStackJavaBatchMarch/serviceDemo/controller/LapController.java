package com.example.FullStackJavaBatchMarch.serviceDemo.controller;

import com.example.FullStackJavaBatchMarch.serviceDemo.domain.Lap;
import com.example.FullStackJavaBatchMarch.serviceDemo.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/laptop")
public class LapController {

    @Autowired
    private LaptopService laptopService;

    @PostMapping(value = "/save")
    public String saveLaptop(@RequestBody Lap lap){
        laptopService.save(lap);
        return "Saved.....!";
    }

}
