/*ActionableMenu1_1 class
 * this class implements MenuItem1_1 interface
 * this is the nested menu of Main Menu
 */
package com.social.network.menu;

import java.util.Scanner;

import com.social.network.entity.Person;

public class ActionableMenu1_1 implements MenuItem1_1 {
	private String displayText;
	private String name, email, phone, description, address;

	/*
	 * constructor of ActionableMenu1_1 class this will set the value of
	 * menuItem1_1 for each menuItem1_1
	 */
	public ActionableMenu1_1(String displayText) {
		this.displayText = displayText;

	}

	public ActionableMenu1_1() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * this will display nested menu
	 */
	@Override
	public void displayEntityMenu1_1() {
		// TODO Auto-generated method stub
		System.out.println(displayText);
	}

	/*
	 * this method will take suitable action on the basis of user input this
	 */
	@Override
	public int takeActionOnEntityMenu1_1(int userInput1) {
		// TODO Auto-generated method stub
		int flag6 = 0;
		Scanner scan = new Scanner(System.in);
		while (flag6 != 1) {
			switch (userInput1) {
			case 1:
				flag6 = 1;
				System.out.println("Enter name of a person");
				name = scan.nextLine();
				System.out.println("Enter email Id of a person");
				email = scan.nextLine();
				System.out.println("Enter phone no. of a person");
				phone = scan.nextLine();
				System.out.println("Enter description of a person");
				description = scan.nextLine();
				System.out.println("Enter address of a person");
				address = scan.nextLine();
				Person person = new Person(name, email, phone, description,
						address);
				person.schoolOrCollegeRecords();
				person.interestRecords();
				person.AddPerson();
				break;
			default:
				System.out.println("Please Enter Correct Choice");
				ActionableMenu actionableMenu = new ActionableMenu();
				userInput1 = scan.nextInt();
				break;
			}
		}
		return flag6;
	}
}
