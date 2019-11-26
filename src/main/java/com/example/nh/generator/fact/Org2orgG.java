package com.example.nh.generator.fact;

import com.example.nh.model.entities.Aggrement;
import com.example.nh.model.entities.Organization;
import com.example.nh.model.fact.Org2org;


public class Org2orgG {
	public static Org2org generateO2O(Organization c1, Organization c2, String verb) {
		return new Org2org(c1,c2,verb);
	}
}
