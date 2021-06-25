package com.example.FullStackJavaBatchMarch.OneToOne.repository;

import com.example.FullStackJavaBatchMarch.OneToOne.domain.Battery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BattRepo extends JpaRepository<Battery,Integer> {
}
