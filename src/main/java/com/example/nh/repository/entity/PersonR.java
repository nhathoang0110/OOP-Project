package com.example.nh.repository.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.nh.model.entities.Person;

public interface PersonR extends JpaRepository<Person, Long> {
	@Query(value = "Select p from Person p where p.Position = ?1") // , nativeQuery = true
	public List<Person> findByPosition(String position);
}
