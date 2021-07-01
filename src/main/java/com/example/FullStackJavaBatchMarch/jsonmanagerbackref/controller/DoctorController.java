package com.example.FullStackJavaBatchMarch.jsonmanagerbackref.controller;

import com.example.FullStackJavaBatchMarch.jsonmanagerbackref.domain.Doctor;
import com.example.FullStackJavaBatchMarch.jsonmanagerbackref.repository.DoctorRepo;
import com.example.FullStackJavaBatchMarch.jsonmanagerbackref.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/doctor/")
public class DoctorController {

    @Autowired
    private DoctorRepo doctorRepo;

    @Autowired
    private PatientRepo patientRepo;

    @PostMapping(value = "saveDoctor")
    public String saveDoctor(@RequestBody Doctor doctor){
        doctorRepo.save(doctor);
        return "Doctor Saved...!!";
    }
}
