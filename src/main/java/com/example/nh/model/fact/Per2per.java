package com.example.nh.model.fact;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.example.nh.model.entities.Person;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("Per2per")
public class Per2per extends Fact{
	@ManyToOne
	@JoinColumn(name = "subject")
	private Person subject;
	@ManyToOne
	@JoinColumn(name = "object")
	
	private Person object;
	public Per2per(Person subject, Person object,String verb) {
	this.setVerb(verb);
		this.subject = subject;
		this.object = object;
	}
	
	
}
