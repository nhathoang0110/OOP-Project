package com.example.nh.generator.fact;

import com.example.nh.model.entities.Aggrement;
import com.example.nh.model.entities.Country;
import com.example.nh.model.entities.Person;
import com.example.nh.model.fact.Per2arg;
import com.example.nh.model.fact.Per2cou;

public class Per2couG {
	public static Per2cou generateP2C(Person c1, Country c2, String verb) {
		return new Per2cou(c1,c2,verb);
	}
}
