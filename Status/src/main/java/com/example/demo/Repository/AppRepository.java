package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.toDoApp.details;

@Repository
public interface AppRepository extends JpaRepository<details,Integer> {
      
}
