package com.example.FullStackJavaBatchMarch.registrationform.controller;
//
import com.example.FullStackJavaBatchMarch.registrationform.domain.RegistrationForm;
import com.example.FullStackJavaBatchMarch.registrationform.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/registration")
public class RegistrationController {

    @Autowired
    private RegistrationRepo registrationRepo;


    @PostMapping(value = "saveRegistration")
    public ResponseEntity<?> saveRegistration(@RequestBody RegistrationForm registrationForm){
        try{
            return new ResponseEntity<>(registrationRepo.save(registrationForm), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Not saved successfully",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
