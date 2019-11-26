package com.example.nh.model.fact;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.nh.model.entities.Organization;

import lombok.Data;;

@Entity
@Data
@DiscriminatorValue("Org2org")

public class Org2org extends Fact{
	
	@ManyToOne
	@JoinColumn(name = "subject")
	private Organization subject;
	@ManyToOne
	@JoinColumn(name = "object")
	private Organization object;
	public Org2org(Organization subject, Organization object,String verb) {
		this.setVerb(verb);
		this.subject = subject;
		this.object = object;
	}

	
}
