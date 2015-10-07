/*ActionableMenu Class
 * this class will implements MenuItem
 * this class will display main Menu of program and 
 * then take suitable action on the basis of user input
 */
package com.social.network.menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import com.social.network.entity.Verification;

public class ActionableMenu implements MenuItem {
	private String displayText;

	/*
	 * Constructor of ActionableMenu class this will set the value of menu item
	 * for each menu item
	 */
	public ActionableMenu(String displayText) {
		this.displayText = displayText;

	}

	public ActionableMenu() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * this method will display main menu of our program
	 */
	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println(displayText);
	}

	/*
	 * this method will take suitable action on the basis of user input this
	 * will further have 3 Menus
	 */
	@Override
	public int takeActionOnMainMenu(int userInput) throws IOException {
		int flag5 = 1;
		switch (userInput) {
		case 1:
			ActionableMenu1_1 actionableMenu1_10 = new ActionableMenu1_1(
					"Enter 1 for sign up with person");
			Menu1_1 menu1_1 = new Menu1_1();
			menu1_1.addMenuItem1_1(actionableMenu1_10);
			int flag6 = 0;
			while (flag6 != 1) {
				menu1_1.displayEntityMenu1_1();
				Scanner scan = new Scanner(System.in);
				int userInput1 = scan.nextInt();
				ActionableMenu1_1 actionableMenu1_1 = new ActionableMenu1_1();
				flag6 = actionableMenu1_1.takeActionOnEntityMenu1_1(userInput1);
			}
			break;
		case 2:
			int flag7 = 0;
			Verification verification = new Verification();
			Scanner scan = new Scanner(System.in);
			System.out.println("Sign in with your account,Enter your mail Id");
			String mailId = scan.nextLine();
			flag7 = verification.checkId(mailId);
			if (flag7 == 1)
				try {
					{
						System.out.println("Friend Requests:");
						int count = 0;
						String fileName = "D:/metacube training/workspace/Nodes.txt";
						String line = null;
						BufferedReader bufferedReader = null;
						try {
							FileReader fileReader = new FileReader(fileName);
							bufferedReader = new BufferedReader(fileReader);
							FileWriter fileWriter = new FileWriter(fileName,
									true);
							BufferedWriter bufferedWriter = new BufferedWriter(
									fileWriter);

							while (!(line = bufferedReader.readLine())
									.equalsIgnoreCase(mailId + "-")
									&& line != null) {
								count++;
							}
						} catch (IOException o) {

						}
						String userName = Files
								.readAllLines(
										Paths.get("D:/metacube training/workspace/Nodes.txt"))
								.get(count - 1);
						try {
							while (!(line = bufferedReader.readLine())
									.equalsIgnoreCase("#")) {
								System.out.println(line);
								ActionableMenu1_2 actionableMenuItem1_20 = new ActionableMenu1_2(
										"Press 1 to add");
								ActionableMenu1_2 actionableMenuItem1_21 = new ActionableMenu1_2(
										"Press 2 to ignore");
								Menu1_2 menu1_2 = new Menu1_2();
								menu1_2.addMenuItem1_2(actionableMenuItem1_20);
								menu1_2.addMenuItem1_2(actionableMenuItem1_21);
								menu1_2.displayFriendRequestMenu1_2();
								int choice = scan.nextInt();
								ActionableMenu1_2 actionableMenu1_2 = new ActionableMenu1_2();
								actionableMenu1_2
										.takeActionOnFriendRequestMenu1_2(
												choice, line, userName, mailId);
							}
							bufferedReader.close();
						} catch (IOException a) {
							System.out.println("");
						}
						int flagChoice = 1;

						while (flagChoice != 3) {
							ActionableMenu1_3 actionableMenu1_30 = new ActionableMenu1_3(
									"Press 1 to show FriendList");
							ActionableMenu1_3 actionableMenu1_31 = new ActionableMenu1_3(
									"Press 2 to Search By Name");
							ActionableMenu1_3 actionableMenu1_32 = new ActionableMenu1_3(
									"Press 3 to sign Out");
							Menu1_3 menu1_3 = new Menu1_3();
							menu1_3.addMenuItem1_3(actionableMenu1_30);
							menu1_3.addMenuItem1_3(actionableMenu1_31);
							menu1_3.addMenuItem1_3(actionableMenu1_32);
							menu1_3.displayOperationMenu1_3();
							int choice = scan.nextInt();
							flagChoice = choice;
							ActionableMenu1_3 actionableMenu1_3 = new ActionableMenu1_3();
							actionableMenu1_3.takeActionOnOperationMenu1_3(
									choice, userName, mailId);

						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else {
				System.out
						.println("This Account does not exist ,Sign up with Your account\n");
			}
			break;
		case 0:
			flag5 = 0;
			System.exit(0);
		default:
			System.out.println("Choose correct option");
			break;

		}
		return flag5;

	}
}