package com.example.nh.generator.fact;

import com.example.nh.model.entities.Aggrement;
import com.example.nh.model.entities.Organization;
import com.example.nh.model.entities.Person;
import com.example.nh.model.fact.Per2arg;
import com.example.nh.model.fact.Per2org;

public class Per2orgG {
	public static Per2org generateP2O(Person c1, Organization c2, String verb) {
		return new Per2org(c1,c2,verb);
	}
}
