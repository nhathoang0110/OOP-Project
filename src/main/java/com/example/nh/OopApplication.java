package com.example.nh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.example.nh.generator.entities.AggrementGenerator;
import com.example.nh.generator.entities.CountryGenerator;
import com.example.nh.generator.entities.EventGenerator;
import com.example.nh.generator.entities.LocationGenerator;
import com.example.nh.generator.entities.OrganizationGenerator;
import com.example.nh.generator.entities.PersonGenerator;
import com.example.nh.generator.entities.TimeGenerator;
import com.example.nh.model.entities.Aggrement;
import com.example.nh.model.entities.Country;
import com.example.nh.model.entities.Event;
import com.example.nh.model.entities.Location;
import com.example.nh.model.entities.Organization;
import com.example.nh.model.entities.Person;
import com.example.nh.model.entities.entity;
import com.example.nh.model.fact.Per2per;
import com.example.nh.repository.entity.AggrementR;
import com.example.nh.repository.entity.CountryR;
import com.example.nh.repository.entity.EventR;
import com.example.nh.repository.entity.LocationR;
import com.example.nh.repository.entity.OrganizationR;
import com.example.nh.repository.entity.PersonR;
import com.example.nh.repository.entity.TimeR;
import com.example.nh.repository.fact.per2perRepo;
import com.example.nh.service.InitDB;
import com.example.nh.service.ScannerService;
import com.example.nh.service.Wrap;





@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class OopApplication  implements CommandLineRunner{
	
//	@Autowired
//	private Wrap w;
	
	@Autowired
	private CountryR cR;
	@Autowired
	private AggrementR aR;
	@Autowired
	private EventR eR;
	@Autowired
	private LocationR lR;
	@Autowired
	private OrganizationR oR;
	@Autowired
	private TimeR tR;
	
	
	@Autowired
	private InitDB initDbService;

	
	private int selection;
	
	
	public static void main(String[] args) {
	  SpringApplication.run(OopApplication.class, args);
		
		}
	
	public void run(String... args) throws Exception {
		

		
//     	PersonGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\rawData\\entity\\Person\\firstname_list",
//			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\rawData\\entity\\Person\\midname_list",
//			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\rawData\\entity\\Person\\lastname_list",
//			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\rawData\\entity\\Person\\position",
//			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\rawData\\entity\\Person\\nationality");
//     	
//     	AggrementGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Aggrement\\label",
//     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Aggrement\\field", 
//     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Aggrement\\des");
//     	
//     	CountryGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Country\\label",
//     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Country\\des_element1_list", 
//     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Country\\des_element2_list",
//     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Country\\des_element3_list");
//     	
//     	EventGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Event\\label", 
//     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Event\\field", 
//     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Event\\decription");
//     	
//     	LocationGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Location\\name", 
//     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Location\\country_list");
//     	
//     	OrganizationGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Organization\\organization_name_list", 
//     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Organization\\headquarters_list", 
//     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Organization\\des_element1_list", 
//     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Organization\\des_element2_list");
//     	
//     	TimeGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Time\\special_day_list");
//     	
//     	System.out.println("read file done");
//
//     	selection=scn.getInputNum(1000);
     	
//     	initDbService.addData();
     	
     	
     	
     	
     	
     System.out.println(lR.count());
    
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
//		Person p2=PersonGenerator.generatePerson();
//		System.out.println(p2.getId());
//	    pR.save(p2);
		
//		Person p1 = new Person();
//		p1.setId(11);
//		p1.setLabel("abc");
//		p1.setDescription("abc");
//		p1.setNationality("abc");
//		p1.setPosition("abc");
//		pR.save(p1);
//		Person p2 = new Person();
//		p2.setId(12);
//		p2.setLabel("xyz");
//		p2.setDescription("xyz");
//		p2.setNationality("xyz");
//		p2.setPosition("xyz");
//		pR.save(p2);
//		
//		Per2per xP2p = new Per2per();
//		xP2p.setObject(p1);
//		xP2p.setSubject(p2);
//		xP2p.setVerb("dam nhau");
//		
//		p2pR.save(xP2p);
		
//		List<Country> a = cR.findAll();
//		int random_num = (int) (Math.random() * a.size());
//		System.out.println(a.get(random_num).getLabel());
//		
//		
//		
//     	LocationGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Location\\name",
//			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Location\\des_element_list");
//		Location l2=LocationGenerator.generateLocation(a);
//		System.out.println(l2.getLabel());
//       lR.save(l2);
		
		
		
	    
	    
		
	   }

}
