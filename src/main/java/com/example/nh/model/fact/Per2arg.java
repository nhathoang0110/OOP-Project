package com.example.nh.model.fact;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.nh.model.entities.Aggrement;
import com.example.nh.model.entities.Person;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("Per2arg")
public class Per2arg extends Fact{
	
	@ManyToOne
	@JoinColumn(name = "subject")
	private Person subject;
	@ManyToOne
	@JoinColumn(name = "object")
	private Aggrement object;
	public Per2arg(Person subject, Aggrement object,String verb) {
		this.setVerb(verb);
		this.subject = subject;
		this.object = object;
	}
	
	
}
