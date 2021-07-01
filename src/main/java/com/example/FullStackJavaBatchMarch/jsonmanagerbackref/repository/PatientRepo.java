package com.example.FullStackJavaBatchMarch.jsonmanagerbackref.repository;

import com.example.FullStackJavaBatchMarch.jsonmanagerbackref.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Integer> {
}
