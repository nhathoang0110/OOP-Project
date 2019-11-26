package com.example.nh.model.fact;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.*;
import com.example.nh.model.entities.Organization;
import com.example.nh.model.entities.Aggrement;
import com.example.nh.model.entities.Country;

@Entity
@Data
@DiscriminatorValue("Org2arg")

public class Org2arg extends Fact{
	
	@ManyToOne
	@JoinColumn(name = "subject")
	private Organization subject;
	@ManyToOne
	@JoinColumn(name = "object")
	private Aggrement object;
	public Org2arg(Organization subject, Aggrement object,String verb) {
		this.setVerb(verb);
		this.subject = subject;
		this.object = object;
	}
	
	

}
