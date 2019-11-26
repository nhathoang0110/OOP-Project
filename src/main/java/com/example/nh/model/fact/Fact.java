package com.example.nh.model.fact;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.DiscriminatorType;

@Entity(name="Fact")
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "fact_type",
		discriminatorType = DiscriminatorType.STRING)
public class Fact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	
	@Column(name="verb")
	private String verb;
}
