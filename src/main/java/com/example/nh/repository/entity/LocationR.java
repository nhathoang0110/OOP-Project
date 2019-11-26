package com.example.nh.repository.entity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nh.model.entities.Location;



public interface LocationR extends JpaRepository<Location, Long> {
	
	
	@Override
	default Optional<Location> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
