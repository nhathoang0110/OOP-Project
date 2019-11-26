package com.example.nh.repository.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nh.model.entities.Country;


public interface CountryR extends JpaRepository<Country, Long> {
	
}
