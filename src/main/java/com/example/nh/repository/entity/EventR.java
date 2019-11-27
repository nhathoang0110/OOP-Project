package com.example.nh.repository.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.nh.model.entities.Event;

public interface EventR extends JpaRepository<Event, Long> {
	@Query(value = "Select e from Event e where e.Label = ?1") // , nativeQuery = true
	public List<Event> findByLabel(String Label);
}
