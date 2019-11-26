package com.example.nh.model.fact;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.nh.model.entities.Country;
import com.example.nh.model.entities.Event;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("Cou2event")

public class Cou2event extends Fact{
	
	@ManyToOne
	@JoinColumn(name = "subject")
	private Country subject;
	@ManyToOne
	@JoinColumn(name = "object")
	private Event object;
	public Cou2event(Country subject, Event object,String verb) {
		this.setVerb(verb);
		this.subject = subject;
		this.object = object;
	}
	
	

}
