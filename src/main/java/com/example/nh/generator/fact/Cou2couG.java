package com.example.nh.generator.fact;

import java.util.Date;

import com.example.nh.model.entities.Country;
import com.example.nh.model.fact.Cou2cou;



public class Cou2couG {
	public static Cou2cou generateC2C(Country c1, Country c2, String verb) {
		return new Cou2cou(c1,c1,verb);
	}

}
