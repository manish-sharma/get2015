/**  
 * @author: Pooja Khandelwa
 *@created date:01/09/2015
 * @Name: Menu Class
 * @Description: it will set the all menu items contens and then display 
 * then by further calling the displayMenu() function of MenuItems class
 *
 */
package com.queue;

public class Menu {
	private String[] menuContent;

	/**
	 * @Name: Menu Class Constructor
	 * 
	 * @Description: set the all menu items content
	 */
	public Menu() {
		menuContent = new String[] { "\nEnter 1 to add element into Queue",
				"Enter 2 to delete an element from Queue",
				"Enter 3 to show the elements of Queue", "Enter 0 to exit" };
	}

	/**
	 * @Name : displayMenu() function
	 * 
	 * @Param : nothing
	 * 
	 * @Description :this function will display the menu contents by further
	 *              calling the displayMenu() function of MenuItems class
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
