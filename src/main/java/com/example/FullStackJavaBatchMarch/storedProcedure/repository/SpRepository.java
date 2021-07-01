package com.example.FullStackJavaBatchMarch.storedProcedure.repository;

import com.example.FullStackJavaBatchMarch.OneToOne.domain.Laptop;
import com.example.FullStackJavaBatchMarch.jsonmanagerbackref.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface SpRepository extends JpaRepository<Doctor,Integer> {

    @Query(value = "{call test()}",nativeQuery = true)
    List<Doctor> spCall();


    @Query(value = "{call spEmp()}",nativeQuery = true)
    List<Map<String,String>> spEmp();


    @Query(value = "{call spLaptop()}",nativeQuery = true)
     Laptop  spLaptop();

}
