/**
 * @author Pooja Khandelwal
 * @created date:31/08/2015
 * @Name: Menu Class
 *@Description: it will set the all menu items contens and then display them by further calling the displayMenu() function of MenuItems class
 *
 */
package com.menu.admin.printer;

public class Menu {
	String[] menuContent;

	/*
	 * @Name: Menu Class Constructor
	 * 
	 * @Description: set the all menu items content
	 */
	public Menu() {
		menuContent = new String[] {
				"\npress 1 to send documents to print",
				"press 2 to print the documents",
				"press 3 to show all documents priority which are still assigned to printer",
				"press 4 to exit" };
	}

	/*
	 * @Name : displayMenu() function
	 * 
	 * @Param : nothing
	 * 
	 * @Description :this function will display the menu contents by further
	 * calling the displayMenu() function of MenuItems class
	 * 
	 * @Return :nothing
	 */
	public void displayMenu() {
		MenuItems menuItems = new MenuItems();
		for (int i = 0; i < menuContent.length; i++) {
			menuItems.displayMenu(menuContent[i]);
		}

	}

}
