/**
 * 
 * @author: Pooja Khandelwal


 * created date:28/08/2015
 * Name: MenuItems class
 * Description: this class implements MenuItemInterface and display the menu Items one by one 
 *
 */
package com.menu.tree.binarySearchTree;

public class MenuItems implements MenuItemInterface {
	public MenuItems() {
	}

	/*
	 * Name: displayMenu() function
	 * 
	 * @param: displayText(it is menu Item content) 
	 * Description: display each
	 * menu item one by one
	 * 
	 * @return: nothing
	 */
	@Override
	public void displayMenu(String displayText) {
		System.out.println(displayText);
	}

}
