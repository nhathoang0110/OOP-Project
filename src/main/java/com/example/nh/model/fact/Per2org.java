package com.example.nh.model.fact;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.nh.model.entities.Organization;
import com.example.nh.model.entities.Person;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("Per2org")

public class Per2org extends Fact{
	
	@ManyToOne
	@JoinColumn(name = "subject")
	private Person subject;
	@ManyToOne
	@JoinColumn(name = "object")
	private Organization object;
	public Per2org(Person subject, Organization object,String verb) {
		this.setVerb(verb);
		this.subject = subject;
		this.object = object;
	}
	

}
