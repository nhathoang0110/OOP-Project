package com.example.nh.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.nh.model.entities.Organization;

public interface OrganizationR extends JpaRepository<Organization, Long> {

}
