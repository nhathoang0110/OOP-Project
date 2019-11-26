package com.example.nh.generator.entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.example.nh.model.entities.Country;



public class CountryGenerator  {
	
	private static List<String> label_list;
	private static List<String> description1_list;
	private static List<String> description2_list;
	private static List<String> description3_list;
	
	public static void getData(String label_file, String description1_file,
				String description2_file,String description3_file ){
		

		// Đọc danh sách tên
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
		
		// đọc danh sách description

		description1_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(description1_file), "UTF8"))) {
			String name;
			while ((name = reader.readLine()) != null) {
				description1_list.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + description1_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: " + description1_file);
			e.printStackTrace();
		}
		
		description2_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(description2_file), "UTF8"))) {
			String name;
			while ((name = reader.readLine()) != null) {
				description2_list.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + description2_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: " + description2_file);
			e.printStackTrace();
		}
		
		description3_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(description3_file), "UTF8"))) {
			String name;
			while ((name = reader.readLine()) != null) {
				description3_list.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + description3_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: " + description3_file);
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @return tên 
	 */
	
	
	public static String randomLabel() {
		int rand = (int)(Math.random()*label_list.size());
		if(rand>0) {
		return label_list.get(rand);}
		else return label_list.get(rand+1);
	}
	
	
	
	
	public static String randomDescription() {
		int rand1 = (int)(Math.random()*description1_list.size());
		int rand2 = (int)(Math.random()*description2_list.size());
		int rand3 = (int)(Math.random()*description3_list.size());
		
		if(rand1>0 || rand2>0 || rand3>0) {
		return description1_list.get(rand1)+description2_list.get(rand2) + description3_list.get(rand3);
		}else return "Tươi đẹp tuyệt vời";
	}
	
	public static Country generateCountry() {
		Country country = new Country();
		country.setLabel(randomLabel());
		country.setDescription(randomDescription());
		return country;
	}


}

	
		
		
	
