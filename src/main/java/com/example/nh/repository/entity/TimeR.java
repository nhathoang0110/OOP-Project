package com.example.nh.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nh.model.entities.Time;



public interface TimeR extends JpaRepository<Time, Long> {

}
