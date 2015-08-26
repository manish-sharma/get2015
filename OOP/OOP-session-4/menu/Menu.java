/*this class will add menu items in a list for further use
 * and take choice value from user
 */
package com.metacube.menu;

import java.util.*;

public class Menu {
	List<MenuItem> items = new ArrayList<>();
	private Scanner scan = new Scanner(System.in);

	/*
	 * this method will add menu items in a list
	 */
	public void addMenuItem(MenuItem item) {
		items.add(item);
	}

	/*
	 * this will call the display method of ActionableMenuItem class for each
	 * menu item andthen display the menu list and then call takeAction method
	 * of ActionableMenuItem class to perform operation on user defined choice
	 */
	public void display() {
		try {
			int flag = 1;
			while (flag != 3) {

				for (MenuItem i : items) {
					i.display();
				}
				System.out.println("Enter your choice");
				int choice = scan.nextInt();
				MenuItem a = items.get(choice - 1);
				flag = a.takeAction(choice);

			}
		} catch (IndexOutOfBoundsException ae) {
			System.out.println("cdfv");
			return;
		}

	}
}
