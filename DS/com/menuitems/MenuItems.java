/**
 * @author: Pooja Khandelwal
 * @created date:04/09/2015
 * @Name: MenuItems class
 * @Description: this class implements MenuItemInterface and display the menu Items one by one 
 */
package com.menuitems;

public class MenuItems implements MenuItemInterface {
	private String displayText;

	public MenuItems() {
	}

	/**
	 * @Name: displayMenu() function
	 * 
	 * @Description: display each menu item one by one
	 * 
	 * @param: displayText(it is menu Item content)
	 * 
	 * @Return: 
	 */
	@Override
	public void displayMenu(String displayText) {
		this.displayText = displayText;
		System.out.println(this.displayText);
	}

}
