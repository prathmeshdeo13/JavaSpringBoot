package com.example.FullStackJavaBatchMarch.OneToOne.controller;


import com.example.FullStackJavaBatchMarch.OneToOne.domain.Battery;
import com.example.FullStackJavaBatchMarch.OneToOne.domain.Laptop;
import com.example.FullStackJavaBatchMarch.OneToOne.repository.BattRepo;
import com.example.FullStackJavaBatchMarch.OneToOne.repository.LapoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    private LapoRepo lapoRepo;

    @Autowired
    private BattRepo battRepo;

    @PostMapping(value = "saveLapo")
    public String saveLapo() {

        Laptop laptop = new Laptop();
        laptop.setKeyboard("AsusKeyBoard");
        laptop.setMouse("AsusMouse");

        Battery battery = new Battery();
        battery.setBatteryName("AsusBattery");
        battery.setWeight(200);

        laptop.setBattery(battery);
        battery.setLaptop(laptop);

        lapoRepo.save(laptop);
        battRepo.save(battery);
        return "LaptopBattery";
    }

    @GetMapping(value = "getLap")
    public List<Laptop> getLaptop() {
        List<Laptop> l = lapoRepo.findAll();
        return l;

    }
}
