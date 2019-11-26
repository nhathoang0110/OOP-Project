package com.example.nh.model.fact;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.nh.model.entities.Country;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("Cou2cou")

public class Cou2cou extends Fact{
	
	@ManyToOne
	@JoinColumn(name = "subject")
	private Country subject;
	@ManyToOne
	@JoinColumn(name = "object")
	private Country object;
	public Cou2cou(Country subject, Country object,String verb) {
		this.setVerb(verb);
		this.subject = subject;
		this.object = object;
	}
	
	

}
