package com.example.nh.generator.fact;

import com.example.nh.model.entities.Country;
import com.example.nh.model.entities.Event;
import com.example.nh.model.fact.Cou2cou;
import com.example.nh.model.fact.Cou2event;

public class Cou2eventG {
	public static Cou2event generateC2E(Country c1, Event v1, String verb) {
		return new Cou2event(c1,v1,verb);
	}
}
