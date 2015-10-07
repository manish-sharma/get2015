/*ActionableMenu1_3 class
 * this class implements MenuItem1_3 interface
 * this is the nested menu of Main Menu
 */
package com.social.network.menu;

import java.io.IOException;
import java.util.Scanner;

import com.social.network.entity.OperationOnEntities;

public class ActionableMenu1_3 implements MenuItem1_3 {
	private String displayText;

	/*
	 * constructor of ActionableMenu1_3 class this will set the value of
	 * menuItem1_3 for each menuItem1_3
	 */
	public ActionableMenu1_3(String displayText) {
		this.displayText = displayText;

	}

	public ActionableMenu1_3() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * this will display nested menu
	 */
	@Override
	public void displayOperationMenu1_3() {
		// TODO Auto-generated method stub
		System.out.println(displayText);
	}

	/*
	 * this method will take suitable action on the basis of user input this
	 */
	@Override
	public void takeActionOnOperationMenu1_3(int choice, String userName,
			String mailId) throws IOException {
		OperationOnEntities operationOnEntities = new OperationOnEntities();
		try {
			switch (choice) {
			case 1:
				operationOnEntities.showFriendList(userName, mailId);
				break;
			case 2:
				String friend;
				Scanner scanner = new Scanner(System.in);
				System.out
						.println("Enter name of person or organization whom you want to search");
				friend = scanner.nextLine();
				operationOnEntities
						.searchEntityByName(friend, userName, mailId);
				break;
			case 3:

				System.out.println("You are succesfully Loged Out");
				Menu menu = new Menu();
				menu.displayMenu();
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}