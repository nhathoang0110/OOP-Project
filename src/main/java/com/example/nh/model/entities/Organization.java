package com.example.nh.model.entities;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString(callSuper=true, includeFieldNames=true)
@Table(name="organization")
public class Organization extends entity  {
	
	private String headquarter;
	
	@ManyToOne 
    @JoinColumn(name = "locationid",nullable=false) // thông qua khóa ngoại
    private Location location;
	
	
}
