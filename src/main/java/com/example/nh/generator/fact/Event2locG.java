package com.example.nh.generator.fact;

import com.example.nh.model.entities.Country;
import com.example.nh.model.entities.Event;
import com.example.nh.model.entities.Location;
import com.example.nh.model.fact.Cou2cou;
import com.example.nh.model.fact.Event2loc;

public class Event2locG {
	public static Event2loc generateE2L(Event c1, Location c2, String verb) {
		return new Event2loc(c1,c2,verb);
	}
}
