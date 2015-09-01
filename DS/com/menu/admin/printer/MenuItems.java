/**
 * @author: Pooja Khandelwal
 * created date:31/08/2015
 * Name: MenuItems class
 * Description: this class implements MenuItemInterface and display the menu Items one by one 
 *
 */

package com.menu.admin.printer;

public class MenuItems implements MenuItemInterface {
	String displayText;

	public MenuItems() {
	}

	/*
	 * @Name: displayMenu() function
	 * 
	 * @param: displayText(it is menu Item content)
	 * 
	 * @Description: display each menu item one by one
	 * 
	 * @Return: nothing
	 */
	@Override
	public void displayMenu(String displayText) {
		this.displayText = displayText;
		System.out.println(this.displayText);
	}

}
