package com.example.FullStackJavaBatchMarch.registrationform.repository;

import com.example.FullStackJavaBatchMarch.registrationform.domain.RegistrationForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RegistrationRepo extends JpaRepository<RegistrationForm,Integer> {
}
