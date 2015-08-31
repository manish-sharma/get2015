/**
 * 
 * @author Pooja Khandelwal

 * created date:28/08/2015
 * Name: Menu Class
 * Description: it will set the all menu items contens and then display them by further calling the display() function of MenuItems class
 *
 */
package com.menu.tree.binarySearchTree;

public class Menu {
	/*
	 * Name: Menu Class Constructor 
	 * Description: set the all menu items content
	 * and then display them by further calling the display() function of
	 * MenuItems class
	 */
	public Menu() {
		MenuItems menuItems = new MenuItems();
		String[] menuContent = {
				"\nEnter 1 to add items into Binary Search tree",
				"Enter 2 to traverse the Binary tree in in pre-Order ",
				"Enter 3 to traverse the Binary tree in in post-Order ",
				"Enter 0 to exit" };
		for (int i = 0; i < menuContent.length; i++) {
			menuItems.displayMenu(menuContent[i]);
		}
	}

}
