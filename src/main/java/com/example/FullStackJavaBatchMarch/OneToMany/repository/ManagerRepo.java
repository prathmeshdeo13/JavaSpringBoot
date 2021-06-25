package com.example.FullStackJavaBatchMarch.OneToMany.repository;

import com.example.FullStackJavaBatchMarch.OneToMany.domain.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepo extends JpaRepository<Manager,Integer> {

}
