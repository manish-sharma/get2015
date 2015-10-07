/*Main Class of social Network Project
 * @author:Pooja Khandelwal
 *
 * this class call displayMenu() fn of Menu class
 * and then call takeActionOnMainMenu() fn of Menu Class 
 * to perform suitable action based on user's choice
 */
package com.social.network;

import java.io.IOException;
import java.util.Scanner;
import com.social.network.menu.ActionableMenu;
import com.social.network.menu.Menu;

public class MainSocialNetworkClass {
	public static void main(String args[]) throws IOException {
		ActionableMenu actionableMenu0 = new ActionableMenu("Enter 0 for exit");
		ActionableMenu actionableMenu1 = new ActionableMenu(
				"Enter 1 to sign up");
		ActionableMenu actionableMenu2 = new ActionableMenu(
				"Enter 2 for sign in ");
		Menu menu = new Menu();
		menu.addMenuItem(actionableMenu0);
		menu.addMenuItem(actionableMenu1);
		menu.addMenuItem(actionableMenu2);
		int flag5 = 1;
		while (flag5 != 0) {
			menu.displayMenu();

			Scanner scan = new Scanner(System.in);
			int userInput = scan.nextInt();
			ActionableMenu actionableMenu = new ActionableMenu();
			flag5 = actionableMenu.takeActionOnMainMenu(userInput);
		}
	}
}
