package com.example.nh.generator.fact;

import com.example.nh.model.entities.Aggrement;
import com.example.nh.model.entities.Person;
import com.example.nh.model.fact.Per2arg;
import com.example.nh.model.fact.Per2per;

public class Per2perG {
	public static Per2per generateP2P(Person c1, Person c2, String verb) {
		return new Per2per(c1,c2,verb);
	}
}
