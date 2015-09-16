/**  
 * @author: Pooja Khandelwa
 *@created date:04/09/2015
 * @Name: Menu Class
 * @Description: it will set the all menu items contens and then display 
 * then by further calling the displayMenu() function of MenuItems class
 *
 */
package com.menu.libraryInfoSystem;

import com.menuItems.MenuItems;

public class Menu {
	private String[] menuContent;

	/**
	 * @Name: Menu Class Constructor
	 * 
	 * @Description: set the all menu items content
	 */
	public Menu() {
		menuContent = new String[] {
				"\npress 1 to Fetch all the books published by author, given the name of the author",
				"Enter 2 to find  whether the  the book has been issued or not",
				"Enter 3 to Delete all those books from library which were not issued in last 1 year",
				"Enter 0 to exit" };
	}

	/**
	 * @Name : displayMenu() function
	 * 
	 * @Description :this function will display the menu contents by further
	 *              calling the displayMenu() function of MenuItems class
	 * 
	 * @Param :
	 * 
	 * @Return :
	 */
	public void displayMenu() {
		MenuItems menuItems = new MenuItems();
		for (int i = 0; i < menuContent.length; i++) {
			menuItems.displayMenu(menuContent[i]);
		}

	}

}
