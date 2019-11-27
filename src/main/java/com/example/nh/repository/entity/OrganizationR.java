package com.example.nh.repository.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.nh.model.entities.Organization;


public interface OrganizationR extends JpaRepository<Organization, Long> {
	
	@Query(value="Select o from Organization o where o.Label = 'Dixon'")
	public List<Organization> findByLabel();
	
	
	@Query(value = "Select o from Organization o inner join o.location l where l.Label = ?1")
	public List<Organization> findByLocation(String location);
	
	
	
}
