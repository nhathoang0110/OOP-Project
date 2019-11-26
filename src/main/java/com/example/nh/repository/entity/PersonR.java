package com.example.nh.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nh.model.entities.Person;

public interface PersonR extends JpaRepository<Person, Long> {
	
}
