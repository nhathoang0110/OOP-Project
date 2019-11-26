package com.example.nh.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nh.generator.entities.AggrementGenerator;
import com.example.nh.generator.entities.CountryGenerator;
import com.example.nh.generator.entities.EventGenerator;
import com.example.nh.generator.entities.LocationGenerator;
import com.example.nh.generator.entities.OrganizationGenerator;
import com.example.nh.generator.entities.PersonGenerator;
import com.example.nh.generator.entities.TimeGenerator;
import com.example.nh.generator.fact.Cou2couG;
import com.example.nh.generator.fact.Cou2eventG;
import com.example.nh.generator.fact.Event2locG;
import com.example.nh.generator.fact.Org2argG;
import com.example.nh.generator.fact.Org2eventG;
import com.example.nh.generator.fact.Org2orgG;
import com.example.nh.generator.fact.Per2argG;
import com.example.nh.generator.fact.Per2couG;
import com.example.nh.generator.fact.Per2eventG;
import com.example.nh.generator.fact.Per2orgG;
import com.example.nh.generator.fact.Per2perG;
import com.example.nh.model.entities.Aggrement;
import com.example.nh.model.entities.Country;
import com.example.nh.model.entities.Event;
import com.example.nh.model.entities.Location;
import com.example.nh.model.entities.Organization;
import com.example.nh.model.entities.Person;
import com.example.nh.model.entities.Time;
import com.example.nh.model.fact.Cou2cou;
import com.example.nh.model.fact.Cou2event;
import com.example.nh.model.fact.Event2loc;
import com.example.nh.model.fact.Org2arg;
import com.example.nh.model.fact.Org2event;
import com.example.nh.model.fact.Org2org;
import com.example.nh.model.fact.Per2arg;
import com.example.nh.model.fact.Per2cou;
import com.example.nh.model.fact.Per2event;
import com.example.nh.model.fact.Per2org;
import com.example.nh.model.fact.Per2per;



@Service
public class InitDB {
	
	@Autowired
	private Wrap w;
	
	@Autowired
	private ScannerService scn;
	
	private DataService data = new DataService();
	
	public void addData() {
		System.out.println("--------Sinh du lieu gia lap-------");
		System.out.print("->Số lượng thực thể: ");
		int e = scn.getInputNum(100000000);
		
		System.out.print("->Số lượng quan hệ: ");
		int r = scn.getInputNum(100000000);
		
		System.out.println("    Sinh " + e + " thực thể và " + r + " quan hệ");
		
		int outterLoop1 = e / 6000;
		int outterLoop2 = r / 6000;
		
		long start = System.currentTimeMillis();
		
		/////////////////////////////////////////
		List<Person> pL1 = new ArrayList<>();
		List<Person> pL = new ArrayList<>();
		long s = System.currentTimeMillis();
		for (int i = 0; i < outterLoop1; i++) {
			for (int j = 0; j < 10; j++) {
				Person p = PersonGenerator.generatePerson();
				pL.add(p);
				pL1.add(p);
			}
			w.pr.saveAll(pL);
			System.out.println("save Person " + i + "x1000 !");
			pL.clear();
		}
		long f = System.currentTimeMillis();
		System.out.println("time generate Person:" + (f - s));
		
		////////////////////////////////////////////////
		s = System.currentTimeMillis();
		List<Country> cL1 = new ArrayList<>();
		List<Country> cL = new ArrayList<>();
		for (int i = 0; i < outterLoop1; i++) {
			for (int j = 0; j < 1000; j++) {
				Country c = CountryGenerator.generateCountry();
				cL1.add(c);
				cL.add(c);
			}
			w.cr.saveAll(cL);
			System.out.println("save Country " + i + "x1000 !");
			cL.clear();
		}
		f = System.currentTimeMillis();
		System.out.println("time generate Country:" + (f - s));
		
		////////////////////////////////////////////////
		
		s = System.currentTimeMillis();
		List<Location> lL1 = new ArrayList<>();
		List<Location> lL = new ArrayList<>();
		for (int i = 0; i < outterLoop1; i++) {
			for (int j = 0; j < 1000; j++) {
				Location l = LocationGenerator.generateLocation(cL1);
				lL.add(l);
				lL1.add(l);
			}
			w.lr.saveAll(lL);
			System.out.println("save Location " + i + "x1000 !");
			lL.clear();
		}
		f = System.currentTimeMillis();
		System.out.println("time generate Location:" + (f - s));
		
		//////////////////////////////////////////////////
		List<Organization> oL1 = new ArrayList<>();
		List<Organization> oL = new ArrayList<>();
		s = System.currentTimeMillis();
		for (int i = 0; i < outterLoop1; i++) {
			for (int j = 0; j < 1000; j++) {
				Organization o = OrganizationGenerator.generateOrganization(lL1);
				oL.add(o);
				oL1.add(o);
			}
			w.or.saveAll(oL);
			System.out.println("save Organization " + i + "x1000 !");
			oL.clear();
		}
		f = System.currentTimeMillis();
		System.out.println("time generate Org:" + (f - s));
		
		////////////////////////////////////////////////////////
		s = System.currentTimeMillis();
		List<Event> eL1 = new ArrayList<>();
		List<Event> eL = new ArrayList<>();
		for (int i = 0; i < outterLoop1; i++) {
			for (int j = 0; j < 1000; j++) {
				Event e1 = EventGenerator.generateEvent();
				eL.add(e1);
				eL1.add(e1);
			}
			w.er.saveAll(eL);
			System.out.println("save Event" + i + "x1000 !");
			eL.clear();
		}
		f = System.currentTimeMillis();
		System.out.println("time generate Event:" + (f - s));
		///////////////////////////////////////////////////////
		
		s = System.currentTimeMillis();
		List<Time> tL1 = new ArrayList<>();
		List<Time> tL = new ArrayList<>();
		for (int i = 0; i < outterLoop1; i++) {
			for (int j = 0; j < 1000; j++) {
				Time t = TimeGenerator.generateTime();
				tL.add(t);
				tL1.add(t);
			}
			w.tr.saveAll(tL);
			System.out.println("save Time" + i + "x1000 !");
			tL.clear();
		}
		f = System.currentTimeMillis();
		System.out.println("time generate Time:" + (f - s));
		
		///////////////////////////////////////////////
		s = System.currentTimeMillis();
		List<Aggrement> aL1 = new ArrayList<>();
		List<Aggrement> aL = new ArrayList<>();
		for (int i = 0; i < outterLoop1; i++) {
			for (int j = 0; j < 1000; j++) {
				Aggrement a1 = AggrementGenerator.generateAggrement();
				aL.add(a1);
				aL1.add(a1);
			}
			w.ar.saveAll(aL);
			System.out.println("save Event" + i + "x1000 !");
			aL.clear();
		}
		f = System.currentTimeMillis();
		System.out.println("time generate Aggrement:" + (f - s));
		
		////////////////////////////////////////////////////////
		
		List<Per2per> ppL=new ArrayList<>();
		for (int i = 0; i < outterLoop2; i++) {
			for (int j = 0; j < 1000; j++) {
				Per2per p2p = Per2perG.generateP2P(pL1.get((int) (Math.random() * pL1.size())),
						pL1.get((int) (Math.random() * pL1.size())),
						data.p2p.get((int) Math.random() * data.p2p.size()));
				ppL.add(p2p);
			}
			w.p2pR.saveAll(ppL);
			System.out.println("save P2P" + i + "x1000 !");
			ppL.clear();
		}
		
		/////////////////////////////////////////////////////////
		List<Per2cou> pcL = new ArrayList<>();
		for (int i = 0; i < outterLoop2; i++) {
			for (int j = 0; j < 1000; j++) {
				Per2cou p2c = Per2couG.generateP2C(pL1.get((int) (Math.random() * pL1.size())),
						cL1.get((int) (Math.random() * cL1.size())),
						data.p2c.get((int) Math.random() * data.p2c.size()));
				pcL.add(p2c);
			}
			w.p2cR.saveAll(pcL);
			System.out.println("save P2C" + i + "x1000 !");
			pcL.clear();
		}
		////////////////////////////////////////////////////////////
		List<Per2org> poL = new ArrayList<>();
		for (int i = 0; i < outterLoop2; i++) {
			for (int j = 0; j < 1000; j++) {
				Per2org p2o = Per2orgG.generateP2O(pL1.get((int) (Math.random() * pL1.size())),
						oL1.get((int) (Math.random() * oL1.size())),
						data.p2o.get((int) Math.random() * data.p2o.size()));
				poL.add(p2o);
			}
			w.p2oR.saveAll(poL);
			System.out.println("save P2O" + i + "x1000 !");
			poL.clear();
		}
		
		//////////////////////////////////////////////////////////////
		List<Per2event> peL = new ArrayList<>();
		for (int i = 0; i < outterLoop2; i++) {
			for (int j = 0; j < 1000; j++) {
				Per2event p2e = Per2eventG.generateP2E(pL1.get((int) (Math.random() * pL1.size())),
						eL1.get((int) (Math.random() * eL1.size())),
						data.p2e.get((int) Math.random() * data.p2e.size()));
				peL.add(p2e);
			}
			w.p2eR.saveAll(peL);
			System.out.println("save P2E" + i + "x1000 !");
			peL.clear();
		}
		
		//////////////////////////////////////////////////////////
		
		List<Per2arg> paL = new ArrayList<>();
		for (int i = 0; i < outterLoop2; i++) {
			for (int j = 0; j < 1000; j++) {
				Per2arg p2a = Per2argG.generateP2A(pL1.get((int) (Math.random() * pL1.size())),
						aL1.get((int) (Math.random() * aL1.size())),
						data.p2a.get((int) Math.random() * data.p2a.size()));
				paL.add(p2a);
			}
			w.p2aR.saveAll(paL);
			System.out.println("save P2A" + i + "x1000 !");
			paL.clear();
		}
		
		/////////////////////////////////////////////////////////////
		List<Org2event> oeL = new ArrayList<>();
		for (int i = 0; i < outterLoop2; i++) {
			for (int j = 0; j < 1000; j++) {
				Org2event o2e = Org2eventG.generateO2E(oL1.get((int) (Math.random() * oL1.size())),
						eL1.get((int) (Math.random() * eL1.size())),
						data.o2e.get((int) Math.random() * data.o2e.size()));
				oeL.add(o2e);
			}
			w.o2eR.saveAll(oeL);
			System.out.println("save O2E" + i + "x1000 !");
			oeL.clear();
		}
		/////////////////////////////////////////////////////////////////////
		List<Org2org> ooL = new ArrayList<>();
		for (int i = 0; i < outterLoop2; i++) {
			for (int j = 0; j < 1000; j++) {
				Org2org o2o = Org2orgG.generateO2O(oL1.get((int) (Math.random() * oL1.size())),
						oL1.get((int) (Math.random() * oL1.size())),
						data.o2o.get((int) Math.random() * data.o2o.size()));
				ooL.add(o2o);
			}
			w.o2oR.saveAll(ooL);
			System.out.println("save O2O" + i + "x1000 !");
			ooL.clear();
		}
		//////////////////////////////////////////////////////////////////
		List<Org2arg> oaL = new ArrayList<>();
		for (int i = 0; i < outterLoop2; i++) {
			for (int j = 0; j < 1000; j++) {
				Org2arg o2a = Org2argG.generateO2A(oL1.get((int) (Math.random() * oL1.size())),
						aL1.get((int) (Math.random() * aL1.size())),
						data.o2a.get((int) Math.random() * data.o2a.size()));
				oaL.add(o2a);
			}
			w.o2aR.saveAll(oaL);
			System.out.println("save O2A" + i + "x1000 !");
			oaL.clear();
		}
		////////////////////////////////////////////////////////
		List<Event2loc> elL = new ArrayList<>();
		for (int i = 0; i < outterLoop2; i++) {
			for (int j = 0; j < 1000; j++) {
				Event2loc e2l = Event2locG.generateE2L(eL1.get((int) (Math.random() * eL1.size())),
						lL1.get((int) (Math.random() * lL1.size())),
						data.e2l.get((int) Math.random() * data.e2l.size()));
				elL.add(e2l);
			}
			w.e2lR.saveAll(elL);
			System.out.println("save E2L" + i + "x1000 !");
			elL.clear();
		}
		/////////////////////////////////////////////////////
		List<Cou2cou> ccL = new ArrayList<>();
		for (int i = 0; i < outterLoop2; i++) {
			for (int j = 0; j < 1000; j++) {
				Cou2cou c2c = Cou2couG.generateC2C(cL1.get((int) (Math.random() * cL1.size())), 
						cL1.get((int) (Math.random() * cL1.size())),
						data.c2c.get((int) Math.random()*data.c2c.size() ) );
			}
			w.c2cR.saveAll(ccL);
			System.out.println("save C2C" + i + "x1000 !");
			ccL.clear();
		}
		//////////////////////////////////////////////////
		List<Cou2event> ceL = new ArrayList<>();
		for (int i = 0; i < outterLoop2; i++) {
			for (int j = 0; j < 1000; j++) {
				Cou2event c2e = Cou2eventG.generateC2E(cL1.get((int) (Math.random() * cL1.size())), 
						eL1.get((int) (Math.random() * eL1.size())),
						data.c2e.get((int) Math.random()*data.c2e.size() ) );
			}
			w.c2eR.saveAll(ceL);
			System.out.println("save C2E" + i + "x1000 !");
			ceL.clear();
		}
		
		long finish = System.currentTimeMillis();
		
		long total = finish - start;
		System.out.println("Total time: " + total );
	}
	
}
