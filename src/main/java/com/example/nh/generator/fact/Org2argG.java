package com.example.nh.generator.fact;

import com.example.nh.model.entities.Aggrement;
import com.example.nh.model.entities.Country;
import com.example.nh.model.entities.Organization;
import com.example.nh.model.fact.Cou2cou;
import com.example.nh.model.fact.Org2arg;

public class Org2argG {
	public static Org2arg generateO2A(Organization c1, Aggrement c2, String verb) {
		return new Org2arg(c1,c2,verb);
	}
}
