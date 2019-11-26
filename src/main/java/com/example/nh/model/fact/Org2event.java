package com.example.nh.model.fact;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.nh.model.entities.Organization;

import lombok.Data;

import com.example.nh.model.entities.Event;

@Entity
@Data
@DiscriminatorValue("Org2event")

public class Org2event extends Fact{
	
	@ManyToOne
	@JoinColumn(name = "subject")
	private Organization subject;
	@ManyToOne
	@JoinColumn(name = "object")
	private Event object;
	public Org2event(Organization subject, Event object,String verb) {
		this.setVerb(verb);
		this.subject = subject;
		this.object = object;
	}
	
	

}
