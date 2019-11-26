package com.example.nh.model.fact;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.nh.model.entities.Country;
import com.example.nh.model.entities.Person;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("Per2cou")

public class Per2cou extends Fact{
	
	@ManyToOne
	@JoinColumn(name = "subject")
	private Person subject;
	@ManyToOne
	@JoinColumn(name = "object")
	private Country object;
	public Per2cou(Person subject, Country object,String verb) {
		this.setVerb(verb);
		this.subject = subject;
		this.object = object;
	}
		

}
