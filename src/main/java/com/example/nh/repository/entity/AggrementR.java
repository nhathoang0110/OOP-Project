package com.example.nh.repository.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.nh.model.entities.Aggrement;

public interface AggrementR extends JpaRepository<Aggrement, Long> {
	@Query(value = "Select a from Aggrement a where a.field = ?1") // , nativeQuery = true
	public List<Aggrement> findByField(String field);
}
