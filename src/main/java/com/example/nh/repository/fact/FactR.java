package com.example.nh.repository.fact;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nh.model.fact.Fact;


public interface FactR extends JpaRepository<Fact, Integer>{

}
