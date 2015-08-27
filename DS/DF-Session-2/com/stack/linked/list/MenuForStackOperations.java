/*
 * MenuForStackOperations Class
 * this class will display the menu by further calling the display fn 
 * of ActionableMenuFor Stack class to perform operations on Stack
 */
package com.stack.linked.list;

import java.util.ArrayList;

import java.util.Scanner;

public class MenuForStackOperations {
	private ArrayList<MenuItemForStack> menuItems = new ArrayList<MenuItemForStack>();

	public void addMenuItems(MenuItemForStack item) {
		menuItems.add(item);
	}

	public void display() {
		for (MenuItemForStack i : menuItems) {
			i.displayMenu();
		}

	}

}
