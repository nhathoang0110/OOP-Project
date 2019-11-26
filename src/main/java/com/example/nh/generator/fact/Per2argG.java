package com.example.nh.generator.fact;

import com.example.nh.model.entities.Aggrement;
import com.example.nh.model.entities.Country;
import com.example.nh.model.entities.Person;
import com.example.nh.model.fact.Cou2cou;
import com.example.nh.model.fact.Per2arg;

public class Per2argG {
	public static Per2arg generateP2A(Person c1, Aggrement c2, String verb) {
		return new Per2arg(c1,c2,verb);
	}
}
