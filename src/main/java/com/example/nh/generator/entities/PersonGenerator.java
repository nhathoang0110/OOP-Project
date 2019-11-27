package com.example.nh.generator.entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.example.nh.model.entities.Person;



public class PersonGenerator {
//	private static Integer index;
	private static List<String> firstname_list;
	private static List<String> midname_list;
	private static List<String> lastname_list;
	private static List<String> position_list;
	private static List<String> nationality_list;
	

	/**
	 * 
	 * @param firstname_file đường dẫn tới file danh sách first name
	 * @param midname_file đường dẫn tới file danh sách mid name
	 * @param lastname_file đường dẫn tới file danh sách last name
	 * @param position_file đường dẫn tới file danh sách position
	 * @param nationality_file đường dẫn tới file danh sách nationality
	 */
	public static void getData(String firstname_file, String midname_file,
			String lastname_file, String position_file,String des_element_file) {
//		index = 0;

		// Đọc danh sách tên
		firstname_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(firstname_file), "UTF8"))) {
			String name;
			while ((name = reader.readLine()) != null) {
				firstname_list.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + firstname_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: "
					+ firstname_file);
			e.printStackTrace();
		}

		// Đọc danh sách tên đệm
		midname_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(midname_file), "UTF8"))) {
			String name;
			while ((name = reader.readLine()) != null) {
				midname_list.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + midname_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: " + midname_file);
			e.printStackTrace();
		}

		// Đọc danh sách họ
		lastname_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(lastname_file), "UTF8"))) {
			String name;
			while ((name = reader.readLine()) != null) {
				lastname_list.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + lastname_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out
					.println("Error: Fail to read filename: " + lastname_file);
			e.printStackTrace();
		}

		// Đọc danh sách chức vụ
		position_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(position_file), "UTF8"))) {
			String name;
			while ((name = reader.readLine()) != null) {
				position_list.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + position_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: " + position_file);
			e.printStackTrace();
		}
		
	
		nationality_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(des_element_file), "UTF8"))) {
			String name;
			while ((name = reader.readLine()) != null) {
				nationality_list.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + des_element_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: " + des_element_file);
			e.printStackTrace();
		}
	}
	
	
	public static String randomPosition() {
		int rand = (int)(Math.random()*position_list.size());
		return position_list.get(rand);
	}

	/**
	 * 
	 * @return một tên người ngẫu nhiên phù hợp
	 */
	public static String randomName() {
		if (lastname_list.isEmpty() && midname_list.isEmpty()
				&& firstname_list.isEmpty()) {
			return "";
		}
		String name = "";
		int random_num = (int) (Math.random() * lastname_list.size());
		name = lastname_list.get(random_num)+" ";
		random_num = (int) (Math.random() * midname_list.size());
		name = name+midname_list.get(random_num)+" ";
		random_num = (int) (Math.random() * firstname_list.size());
		name += firstname_list.get(random_num);
		return name;
	}

	/**
	 * 
	 * @return quốc tịch
	 */
	public static String randomNationality() {
		int rand=(int)(Math.random()*nationality_list.size());
		return nationality_list.get(rand);
	}


	
	/**
	 * 
	 * @return thực thể Person với các thuộc sính ngẫu nhiên phù hợp
	 */
	public static Person generatePerson() {
		Person person = new Person();
		person.setLabel(randomName());
		person.setPosition(randomPosition());
		person.setNationality(randomNationality());
		person.setDescription( person.getPosition()+ person.getLabel()+ " phúc hậu,hiền hòa");

		return person;
	}
}



