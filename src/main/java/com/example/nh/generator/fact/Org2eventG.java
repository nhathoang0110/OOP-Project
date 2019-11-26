package com.example.nh.generator.fact;

import com.example.nh.model.entities.Aggrement;
import com.example.nh.model.entities.Event;
import com.example.nh.model.entities.Organization;
import com.example.nh.model.fact.Org2arg;
import com.example.nh.model.fact.Org2event;

public class Org2eventG {
	public static Org2event generateO2E(Organization c1, Event c2, String verb) {
		return new Org2event(c1,c2,verb);
	}
}
