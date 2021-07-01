package com.example.FullStackJavaBatchMarch.jsonmanagerbackref.repository;

import com.example.FullStackJavaBatchMarch.jsonmanagerbackref.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor,Integer> {
}
