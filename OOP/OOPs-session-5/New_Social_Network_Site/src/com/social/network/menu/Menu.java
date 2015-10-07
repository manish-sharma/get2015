/*Menu Class
 * this class will add main menu Items in list and then 
 * display them by calling displayMenu() method in ActionableMenu Class
 */
package com.social.network.menu;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<MenuItem> items = new ArrayList<MenuItem>();

	/*
	 * this method will add main menu items in the list
	 */
	public void addMenuItem(MenuItem item) {
		items.add(item);
	}

	/*
	 * this method will display the Main Menu by calling the displayMenu()
	 * method in ActionableMenu Class
	 */
	public void displayMenu() {

		for (MenuItem i : items) {
			i.displayMenu();
		}

	}

}
