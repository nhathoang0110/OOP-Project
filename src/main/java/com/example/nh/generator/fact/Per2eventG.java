package com.example.nh.generator.fact;

import com.example.nh.model.entities.Aggrement;
import com.example.nh.model.entities.Event;
import com.example.nh.model.entities.Person;
import com.example.nh.model.fact.Per2arg;
import com.example.nh.model.fact.Per2event;

public class Per2eventG {
	public static Per2event generateP2E(Person c1, Event c2, String verb) {
		return new Per2event(c1,c2,verb);
	}
}
