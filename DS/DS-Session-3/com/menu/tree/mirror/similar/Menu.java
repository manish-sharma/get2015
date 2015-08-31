/**
 * 
 * @author Pooja Khandelwal

 * created date:28/08/2015
 * Name: Menu Class
 * Description: it will set the all menu items contens and then display them by further calling the display() function of MenuItems class
 *
 */
package com.menu.tree.mirror.similar;

public class Menu {
	/*
	 * Name: Menu Class Constructor Description: set the all menu items content
	 * and then display them by further calling the display() function of
	 * MenuItems class
	 */
	public Menu() {
		MenuItems menuItems = new MenuItems();
		String[] menuContent = {
				"\nEnter 1 to add elements into 1st tree",
				"Enter 2 to add elements into 2nd tree",
				"Enter 3 to find if both trees are Mirror similar trees or not?",
				"Enter 0 to exit" };
		for (int i = 0; i < menuContent.length; i++) {
			menuItems.displayMenu(menuContent[i]);
		}
	}

}
