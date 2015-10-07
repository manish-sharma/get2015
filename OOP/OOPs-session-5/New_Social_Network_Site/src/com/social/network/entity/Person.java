/* person Class
 * this class will extend Entities Class and implements Records interface
 */
package com.social.network.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Person extends Entities implements Records {
	private String schoolOrCollegeName, subOrStandard;
	private ArrayList<String> interest;

	/*
	 * constructor of Person Class this will call addNodes method of super class
	 * (GraphClass) to add person
	 */
	public Person(String name, String email, String phone, String description,
			String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.description = description;
		this.address = address;
		super.addNodes(name, email, phone, description, address);
	}

	/*
	 * overrided method of Record interface (non-Javadoc)
	 * 
	 * @see com.social.network.entity.Records#schoolOrCollegeRecords() this will
	 * take school or college details from user if he/she doesn't has any
	 * previous account with same email Id
	 */
	@Override
	public void schoolOrCollegeRecords() {
		// TODO Auto-generated method stub
		if (super.flag == 0) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your school or College Name");
			schoolOrCollegeName = scan.nextLine();
			System.out.println("Enter your subject or Standard");
			subOrStandard = scan.nextLine();
		}
	}

	/*
	 * overrided method of Record interface (non-Javadoc)
	 * 
	 * @see com.social.network.entity.Records#interestRecords() this will take
	 * interest details from user if he/she doesn't has any previous account
	 * with same email Id
	 */
	@Override
	public void interestRecords() {
		// TODO Auto-generated method stub
		if (super.flag == 0) {
			Scanner scan = new Scanner(System.in);
			interest = new ArrayList<String>();
			System.out.println("Your Hobbies or interests");
			interest.add(scan.nextLine());
			interest.add(scan.nextLine());
		}
	}

	/*
	 * this method will add person by calling AddEntity() method of parent
	 * Class(Entities)
	 */
	public void AddPerson() {
		AddEntity(1, name, email, phone, description, address,
				schoolOrCollegeName, subOrStandard, interest);

	}

}
