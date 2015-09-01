/**  
 * @author: Pooja Khandelwal

 * @created date:31/08/2015
 * @Name: Menu Class
 * @Description: it will set the all menu items contens and then display 
 * then by further calling the displayMenu() function of MenuItems class
 *
 */
package com.menu.hotel.roomAllocation;

public class Menu {
	private String[] menuContent;

	/*
	 * @Name: Menu Class Constructor
	 * 
	 * @Description: set the all menu items content
	 */
	public Menu() {
		menuContent = new String[] {
				"\nEnter 1 to allocate room to the guest in your hotel",
				"Enter 2 to see the list of rooms and their allocations ",
				"Enter 0 to exit" };
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
