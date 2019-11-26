package com.example.nh.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DataService {
	    public  List<String> p2p;
	    public  List<String> p2c;
	    public  List<String> p2o;
	    public  List<String> p2e;
	    public  List<String> p2a;
	    public  List<String> o2o;
	    public  List<String> o2e;
	    public  List<String> o2a;
	    public  List<String> e2l;
	    public  List<String> c2e;
	    public  List<String> c2c;
	  
	    public  DataService(){
	        p2p = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\realtion\\p2p"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					p2p.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }
	        

	        p2c = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\realtion\\p2c"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					p2c.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }


	        p2o = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\realtion\\p2o"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					p2o.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        p2e = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\realtion\\p2e"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					p2e.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        p2a = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\realtion\\p2a"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					p2a.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        o2o = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\realtion\\o2o"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					o2o.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        o2e = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\realtion\\o2e"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					o2e.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        o2a = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\realtion\\o2a"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					o2a.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        e2l = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\realtion\\e2l"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					e2l.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }

	        c2e = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\realtion\\c2e"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					c2e.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }
			
			c2c = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream("F:\\WP_SpringBoot\\oop\\src\\main\\resources\\dataok\\realtion\\c2c"), "UTF8"))) {
				String name;

				while ((name = reader.readLine()) != null) {
					c2c.add(name);
				}

			} catch (FileNotFoundException e) {
				System.out.println("Error: Missing file name");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: Fail to read filename: "
						);
				e.printStackTrace();
	        }
}
}
