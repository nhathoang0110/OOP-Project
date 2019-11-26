package com.example.nh.generator.entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.example.nh.model.entities.Location;
import com.example.nh.model.entities.Organization;



public class OrganizationGenerator {
	private static List<String> organization_name_list;
	private static List<String> headquarters_list;
	private static List<String> des_element1_list;
	private static List<String> des_element2_list;
	
	

	/**
	 * 
	 * @param organization_file :đường dẫn tới file chứa tên các tổ chức
	 * @param headquarters_file :đường dẫn tới file chứa tên các trụ sở
	 * @param firstname_file :đường dẫn tới file chứa danh sách first name
	 * @param midname_file :đường dẫn tới file chứa danh sách mid name
	 * @param lastname_file :đường dẫn tới file chứa danh sách last name
	 * @param email_domain_file :đường dẫn tới file chứa danh sách các email domain
	 * @param des_element_file :đường dẫn tới file chứa danh sách phần tử phù hợp để sinh description
	 * @param country_file :đường dẫn tới file chứa danh sách các quốc gia
	 */
	public static void getData(String organization_file,
			String headquarters_file,String des_element1_file,
			String des_element2_file) {
		

		// Đọc tên tổ chức
		organization_name_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(organization_file), "UTF8"))) {
			String name;

			while ((name = reader.readLine()) != null) {
				organization_name_list.add(name);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + organization_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: "
					+ organization_file);
			e.printStackTrace();
		}

		// Đọc địa điểm
		headquarters_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(headquarters_file), "UTF8"))) {
			String name;
			while ((name = reader.readLine()) != null) {
				headquarters_list.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + headquarters_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: "
					+ headquarters_file);
			e.printStackTrace();
		}
		
		// Đọc danh sách phần tử 1 phục vụ sinh mô tả phù hợp
		des_element1_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(des_element1_file), "UTF8"))) {
			String name;
			while ((name = reader.readLine()) != null) {
				des_element1_list.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Missing filename: " + des_element1_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Fail to read filename: "+ des_element1_file);
			e.printStackTrace();
		}
		
		// Đọc danh sách phần tử 2 phục vụ sinh mô tả phù hợp
		des_element2_list = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(des_element2_file), "UTF8"))) {
			String name;
			while ((name = reader.readLine()) != null) {
				des_element2_list.add(name);}
			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing filename: " + des_element2_file);
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "+ des_element2_file);
				e.printStackTrace();
				
			}
	}
		

	
	/**
	 * 
	 * @return tên tổ chức ngẫu nhiên phù hợp
	 */
	public static String randomName() {
		if (organization_name_list.isEmpty())
			return "";
		int random_num = (int) (Math.random() * organization_name_list.size());
		return organization_name_list.get(random_num);
	}
	
	/**
	 * 
	 * @return mô tả ngẫu nhiên phù hợp
	 */
	public static String randomDescription() {
		if (des_element1_list.isEmpty()||des_element2_list.isEmpty())
			return "là một tổ chức";
		int rand1=(int)(Math.random()*des_element1_list.size());
		int rand2=(int)(Math.random()*des_element2_list.size());
		
		return "là một "+des_element1_list.get(rand1)+" "+des_element2_list.get(rand2)+" trên thế giới";
	}

	/**
	 * 
	 * @return một trụ sở chính phù hợp
	 */
	public static String randomHeadquarters() {
		if (headquarters_list.isEmpty())
			return "";
		int random_num = (int) (Math.random() * headquarters_list.size());
		return headquarters_list.get(random_num);
	}

	
	
	

	/**
	 * 
	 * @return một thực thể Oganization với các thuộc tính ngẫu nhiên phù hợp
	 */
	public static Organization generateOrganization(List<Location> L) {
		Organization organization = new Organization();
		organization.setLabel(randomName());
		organization.setDescription(randomDescription());
		organization.setHeadquarter(randomHeadquarters());
		organization.setLocation(L.get((int) (Math.random() * L.size())));
		return organization;
	}
	
	
}
