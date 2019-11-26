package com.example.nh.generator.entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.example.nh.model.entities.Event;



public class EventGenerator {
	
	private static List<String> label_list;
	private static List<String> field_list;
	private static List<String> des_list;
	

	
	public static void getData(String label_file,String field_file,String des_file) {
		
		
		//Khởi tạo danh sách địa điểm
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
		//Khởi tạo danh sách các lĩnh vực
		field_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(field_file), "UTF8"))) {
			String name;
			while ((name = reader.readLine()) != null) {
				field_list.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + field_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: " + field_file);
			e.printStackTrace();
		}
		
		//Khởi tạo danh sách tên các mô tả
		des_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(des_file), "UTF8"))) {
			String name;
			while ((name = reader.readLine()) != null) {
				des_list.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + des_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: " + des_file);
			e.printStackTrace();
		}
		
		
	}

	

	/**
	 * 
	 * @return Sinh ngẫu nhiên tên cho event
	 */
	public static String randomName() {
		int rand = (int)(Math.random()*label_list.size());
		return label_list.get(rand);
	}

	/** 
	 * 
	 * @return Sinh ngẫu nhiên mô tả cho sự kiện
	 */
	public static String randomDes() {
		int rand = (int)(Math.random()*des_list.size());
		return des_list.get(rand);
	}
	
	public static String randomField() {
		int rand = (int)(Math.random()*field_list.size());
		return field_list.get(rand);
	}

	
	
	/**
	 * 
	 * @return Sinh ngẫu nhiên một sự kiện
	 */
	public static Event generateEvent(){
		Event event = new Event();
		event.setLabel(randomName());
		event.setDescription(randomDes());
		event.setField(randomField());
		return event;
	}

	
}
