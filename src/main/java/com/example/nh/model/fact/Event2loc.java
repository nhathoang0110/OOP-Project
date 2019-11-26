package com.example.nh.model.fact;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.nh.model.entities.Event;
import com.example.nh.model.entities.Location;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("Event2loc")

public class Event2loc extends Fact{
	
	@ManyToOne
	@JoinColumn(name = "subject")
	private Event subject;
	@ManyToOne
	@JoinColumn(name = "object")
	private Location object;
	public Event2loc(Event subject, Location object,String verb) {
		this.setVerb(verb);
		this.subject = subject;
		this.object = object;
	}

	
}
