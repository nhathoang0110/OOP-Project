package com.example.nh.repository.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.nh.model.entities.Aggrement;
import com.example.nh.model.entities.Country;


public interface CountryR extends JpaRepository<Country, Long> {
	
}
