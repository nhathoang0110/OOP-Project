package com.example.nh.model.fact;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.nh.model.entities.Event;
import com.example.nh.model.entities.Person;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("Per2eventG")

public class Per2event extends Fact{
	
	@ManyToOne
	@JoinColumn(name = "subject")
	private Person subject;
	@ManyToOne
	@JoinColumn(name = "object")
	private Event object;
	public Per2event(Person subject, Event object,String verb) {
		this.setVerb(verb);
		this.subject = subject;
		this.object = object;
	}
		
	

}
