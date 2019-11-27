package com.example.nh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
import com.example.nh.model.entities.Time;
import com.example.nh.repository.entity.AggrementR;
import com.example.nh.repository.entity.CountryR;
import com.example.nh.repository.entity.EventR;
import com.example.nh.repository.entity.LocationR;
import com.example.nh.repository.entity.OrganizationR;
import com.example.nh.repository.entity.PersonR;
import com.example.nh.repository.entity.TimeR;
import com.example.nh.service.InitDB;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private PersonR pR;
	@Autowired
	private CountryR cR;
	@Autowired
	private LocationR lR;
	@Autowired
	private OrganizationR oR;
	@Autowired
	private EventR eR;
	@Autowired
	private AggrementR aR;
	@Autowired
	private TimeR tR;
	@Autowired
	private InitDB initDbService;
	
	@ResponseBody
    @RequestMapping(value="/")
    public String home() {
        String html = "";
        html += "<ul>";
        html += " <li><a href='/insertData'>Thêm dữ liệu</a></li>";
        html += " <li><a href='/simpleQuery'>Các truy vấn cơ bản</a></li>";
        html += " <li><a href='/complexQuery'>Các truy vấn phức tạp</a></li>";
        html += "</ul>";
        return html;
		
    }
	
	@ResponseBody
    @RequestMapping("/insertData")
	public void insertData() {
		PersonGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\rawData\\entity\\Person\\firstname_list",
				"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\rawData\\entity\\Person\\midname_list",
				"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\rawData\\entity\\Person\\lastname_list",
				"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\rawData\\entity\\Person\\position",
				"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\rawData\\entity\\Person\\nationality");
	     	
	     	AggrementGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Aggrement\\label",
	     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Aggrement\\field", 
	     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Aggrement\\des");
	     	
	     	CountryGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Country\\label",
	     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Country\\des_element1_list", 
	     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Country\\des_element2_list",
	     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Country\\des_element3_list");
	     	
	     	EventGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Event\\label", 
	     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Event\\field", 
	     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Event\\decription");
	     	
	     	LocationGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Location\\name", 
	     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Location\\country_list");
	     	
	     	OrganizationGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Organization\\organization_name_list", 
	     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Organization\\headquarters_list", 
	     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Organization\\des_element1_list", 
	     			"F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Organization\\des_element2_list");
	     	
	     	TimeGenerator.getData("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\Time\\special_day_list");
	     	
	     	System.out.println("read file done");
	     	
	     	initDbService.addData();
	}
	
	@ResponseBody
    @RequestMapping("/simpleQuery")
	public String simpleQuery() {
		String html = "";
		html += "<ul>";
		html += " <li><a href='/simpleQuery1'>Đưa ra các thông tin về tổ chức Dixon</a></li>";
		html += " <li><a href='/simpleQuery2'>Đưa ra mô tả của những người có chức vụ là Giám đốc</a></li>";
		html += " <li><a href='/simpleQuery3'>Đếm số lượng Location ở Việt Nam</a></li>";
		html += " <li><a href='/simpleQuery4'>Đếm tổng số thỏa thuận thuộc lĩnh vực kinh tế</a></li>";
		html += " <li><a href='/simpleQuery5'>Sự kiện họp cổ đông công ty Lam Tran diễn ra tại đâu</a></li>";
		html += " <li><a href='/simpleQuery6'>Đưa ra thông tin của Country có id = 10</a></li>";
		html += " <li><a href='/simpleQuery7'>Đưa ra tên của các Tổ chức ở Thung Lũng Silicon</a></li>";
		html += " <li><a href='/simpleQuery8'>Đếm tổng số lượng các thực thể</a></li>";
		html += " <li><a href='/simpleQuery9'>Có bao nhiêu người là thư ký</a></li>";
		html += " <li><a href='/simpleQuery10'>Liệt kê các hành động của các quan hệ</a></li>";
		html += "</ul>";
		return html;
	}
	
	@ResponseBody
    @RequestMapping("/complexQuery")
	public String complexQuery() {
		String html = "";
		html += "<ul>";
		html += " <li><a href='/complexQuery1'>Đưa ra danh sách các Người có chức vụ giám đốc làm cho Org Viettel</a></li>";
		html += " <li><a href='/complexQuery2'>Tên những nước ủng hộ Việt Nam</a></li>";
		html += " <li><a href='/complexQuery3'>Số lượng Country tham gia Sự kiện nhậm chức Hokaga tại Làng Mây</a></li>";
		html += " <li><a href='/complexQuery4'>Đưa ra Sự kiện gần đây nhất diễn ra tại Hà Lan </a></li>";
		html += " <li><a href='/complexQuery5'>Có bao nhiêu người xem phim The Avengers 4 tại rạp BHD PNT</a></li>";
		html += " <li><a href='/complexQuery6'>Chọn ra tổ chức có nhiều nhân viên có quốc tịch Việt Nam nhất</a></li>";
		html += " <li><a href='/complexQuery7'>Chọn ra top 3 người Event có nhiều người tham gia nhất vào năm 2017</a></li>";
		html += " <li><a href='/complexQuery8'>Bạn Lâm làm ăn với bao nhiêu tổ chức</a></li>";
		html += " <li><a href='/complexQuery9'>Đưa ra tên những Event mà tổ chức LamTran Company tham gia trong quý cuối của năm 2018</a></li>";
		html += " <li><a href='/complexQuery10'>Nước nào ở Europe có quan hệ với Việt Nam</a></li>";
		html += "</ul>";
		return html;
	}
	
	@ResponseBody
	@RequestMapping("/simpleQuery1")
	public String simpleQuery1() {
		String html="";
		List<Organization> lo=oR.findByLabel();
		for(Organization org: lo) {
			 html += "Id: " + org.getId()  + " Description: " + org.getDescription() 
			 + " Headquarter: " + org.getHeadquarter() + " Location: " + org.getLocation().getLabel();
		}
		return html;
	}
	
	
	@ResponseBody
    @RequestMapping("/simpleQuery2")
	public String simpleQuery2() {
		String html = "";
		List<Person> lp = pR.findByPosition("Giám đốc");
		for (Person p : lp) {
			html += "Tên" + "Mô tả" + "<br>" +
					p.getLabel() + "" + p.getDescription() + "<br>";
		}
		return html;
	}
	
	@ResponseBody
    @RequestMapping("/simpleQuery3")
	public String simpleQuery3() {
		String html = "";
		List<Location> ll = lR.findByCountryLabel();
		html += "Số lượng Location ở Việt Nam là: " + ll.size();
		return html;
	}
	
	@ResponseBody
    @RequestMapping("/simpleQuery4")
	public String simpleQuery4() {
		String html = "";
		List<Aggrement> la = aR.findByField("Kinh tế");
		html += "Tổng số lượng thỏa thuận thuộc lĩnh vực kinh tế : " + la.size();
		return html;
	}
	
	@ResponseBody
    @RequestMapping("/simpleQuery5")
	public String simpleQuery5() {
		String html = "";
		List<Event> le = eR.findByLabel("họp cổ đông công ty Lam Tran");
		int size = le.size();
		if (size == 0) {
			html += "Không có sự kiện như vậy!";
		}
		else if (size == 1) {
			html += "Sự kiện họp cổ đông công ty Lam Tran: " + le.stream().findFirst().get().getDescription();
		}
		else if (size > 1) {
			html += "Có " + size + "sự kiện có tên như vậy. Mô tả lần lượt của các sự kiện: " + "<br>";
			for (Event e : le) {
				html = e.getDescription() + "<br>";
			}
		}
		return html;
	}
	
	@ResponseBody
    @RequestMapping("/simpleQuery6")
	public String simpleQuery6() {
		String html = "";
		Country c = cR.findById((long) 10).get();
		html += "Thông tin của nước có Id = 10:" + "<br>" + "Label: " + c.getLabel() + "<br>" + "Description: " + c.getDescription(); 
		return html;
	}
	
	@ResponseBody
    @RequestMapping("/simpleQuery7")
	public String simpleQuery7() {
		String html = "";
		List<Organization> lo = oR.findByLocation("thung lũng Silicon");
		if (lo.size() == 0) {
			html += "Không có tổ chức nào ở đây cả!";
		}
		else {
			html += "Có " + lo.size() + " tổ chức ở đây:" + "<br>";
			for (Organization o : lo) {
				html += o.getLabel() + "<br>";
			}
		}
		return html;
	}
	
	@ResponseBody
    @RequestMapping("/simpleQuery8")
	public String simpleQuery8() {
		String html = "";
		long sum =  aR.count() + cR.count() + eR.count() + lR.count() + oR.count() + pR.count() + tR.count();
		html += "Tổng số thưc thể: " + sum;
		return html;
	}
	
	@ResponseBody
    @RequestMapping("/simpleQuery9")
	public String simpleQuery9() {
		String html = "";
		List<Person> lp = pR.findByPosition("Thư ký");
		html += "Số lượng thư ký là: " + lp.size();
		return html;
	}
	
	@ResponseBody
    @RequestMapping("/simpleQuery10")
	public String simpleQuery10() {
		String html = "";
		
		return html;
	}
}
