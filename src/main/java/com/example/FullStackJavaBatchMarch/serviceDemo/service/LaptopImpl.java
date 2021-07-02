package com.example.FullStackJavaBatchMarch.serviceDemo.service;

import com.example.FullStackJavaBatchMarch.serviceDemo.domain.Lap;
import com.example.FullStackJavaBatchMarch.serviceDemo.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class LaptopImpl implements LaptopService{

    @Autowired
    private LaptopRepo laptopRepo;


    @Override
    public String save(Lap lap) {
        laptopRepo.save(lap);
        return "Lap saved....!";
    }
}
