package com.example.nh.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.nh.model.entities.Event;

public interface EventR extends JpaRepository<Event, Long> {

}
