package com.example.nh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.nh.repository.entity.AggrementR;
import com.example.nh.repository.entity.CountryR;
import com.example.nh.repository.entity.EventR;
import com.example.nh.repository.entity.LocationR;
import com.example.nh.repository.entity.OrganizationR;
import com.example.nh.repository.entity.PersonR;
import com.example.nh.repository.entity.TimeR;
import com.example.nh.repository.fact.cou2couRepo;
import com.example.nh.repository.fact.cou2eventRepo;
import com.example.nh.repository.fact.event2locRepo;
import com.example.nh.repository.fact.org2argRepo;
import com.example.nh.repository.fact.org2eventRepo;
import com.example.nh.repository.fact.org2orgRepo;
import com.example.nh.repository.fact.per2argRepo;
import com.example.nh.repository.fact.per2couRepo;
import com.example.nh.repository.fact.per2eventRepo;
import com.example.nh.repository.fact.per2orgRepo;
import com.example.nh.repository.fact.per2perRepo;



@Component
public class Wrap {
	
	@Autowired
	public PersonR pr;
	@Autowired
	public OrganizationR or;
	@Autowired
	public LocationR lr;
	@Autowired
	public CountryR cr;
	@Autowired
	public EventR er;
    @Autowired
	public TimeR tr;
    @Autowired
   	public AggrementR ar;
    
    @Autowired
    public cou2couRepo c2cR;
    @Autowired
    public cou2eventRepo c2eR;
    @Autowired
    public event2locRepo e2lR;
    @Autowired
    public org2argRepo o2aR;
    @Autowired
    public org2eventRepo o2eR;
    @Autowired
    public org2orgRepo o2oR;
    @Autowired
    public per2perRepo p2pR;
    @Autowired
    public per2argRepo p2aR;
    @Autowired
    public per2couRepo p2cR;
    @Autowired
    public per2eventRepo p2eR;
    @Autowired
    public per2orgRepo p2oR;
    
    
}
