package com.example.nh.repository.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.nh.model.entities.Location;



public interface LocationR extends JpaRepository<Location, Long> {
	
	
	@Query(value = "Select l from Location l where l.Label = 'aaaa'") //, nativeQuery = true
	public List<Location> findByLabel();

	@Query(value = "Select * from location l where l.countryid = 5",  nativeQuery = true) //, nativeQuery = true
	public List<Location> findByCountryId();
	
	@Query(value = "Select l from Location l inner join l.country c where c.Label = 'VietNam'")
	public List<Location> findByCountryLabel();
}
