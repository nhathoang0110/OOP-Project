package com.example.nh.generator.entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.example.nh.model.entities.Country;
import com.example.nh.model.entities.Location;
import com.example.nh.repository.entity.CountryR;



/**
 * Lớp tiện ích phục vụ sinh ngẫu nhiên thành phần con/thực thể Location
 * 
 */
public class LocationGenerator {
	
	static List<String> label_list;
	static List<String> des_element_list;
	
	static CountryR cR;
	
	/**
	 * Đọc dữ liệu từ file,trích rút và lưu lại làm thông tin phục vụ sinh ngẫu
	 * nhiên
	 * 
	 * @param location_file
	 *            :đường dẫn tới file chứa danh sách các địa danh
	 * @param country_file
	 *            :đường dẫn tới file chứa danh sách các đất nước
	 * @param des_element_file 
	 * 			  :đường dẫn tới file chứa danh sách phần tử phục vụ sinh mô tả
	 */
	public static void getData(String label_file,String des_element_file) {
		
		
		// Khởi tạo danh sách locations
		label_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(label_file), "UTF8"))) {
			String name;

			while ((name = reader.readLine()) != null) {
				label_list.add(name);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + label_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: " + label_file);
			e.printStackTrace();
		}

		// Khởi tạo danh sách countries
		
		
		
		
		
		
		// Khởi tạo danh sách des_element_list
		des_element_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(des_element_file), "UTF8"))) {
			String name;

			while ((name = reader.readLine()) != null) {
				des_element_list.add(name);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + des_element_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: " + des_element_file);
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return tên 1 location ngẫu nhiên
	 */
	public static String randomName() {
		if (label_list.isEmpty())
			return "";
		int random_num = (int) (Math.random() * label_list.size());
		return label_list.get(random_num);
	}

	/**
	 * 
	 * @return Tên một đất nước ngẫu nhiên
	 */
//	public static Country randomCountry() {
//		
//		List<Country> country_list = cR.findAll();
//		int random_num = (int) (Math.random() * country_list.size());
//		return country_list.get(1);
//	}

	/**
	 * 
	 * @return description ngẫu nhiên cho location
	 */
	public static String randomDescription() {
		int rand1 = (int) (Math.random() * des_element_list.size());
		int rand2 = (int) (Math.random() * 50);
		return "Là một "
				+ des_element_list.get(rand1)
				+ " nổi tiếng thế giới,trung bình mỗi năm đón tiếp khoảng "
				+ rand2 + " triệu lượt khách du lịch";
	}
	

	/**
	 * 
	 * @return một object Location với các thuộc tính ngẫu nhiên
	 */
	public static Location generateLocation(List<Country> a) {
		Location location = new Location();
		location.setLabel(randomName());
		location.setDescription(randomDescription());

		
		location.setCountry(a.get((int) (Math.random() * a.size())));
		return location;
	}

	

}