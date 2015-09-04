/**  
 * @author: Pooja Khandelwa
 *@created date:04/09/2015
 * @Name: Menu Class
 * @Description: it will set the all menu items contens and then display 
 * then by further calling the displayMenu() function of MenuItems class
 *
 */
package com.menu.system.sorting;

import com.menuitems.MenuItems;

public class Menu {
	private String[] menuContent;

	/**
	 * @Name: Menu Class Constructor
	 * 
	 * @Description: set the all menu items content
	 */
	public Menu() {
		menuContent = new String[] { "\npress 1 to use Comparision Sorting",
				"Enter 2 to use Linear Sorting", "Enter 3 for exit" };
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
