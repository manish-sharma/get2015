/**
 * @author: Pooja Khandelwal
 * @created date:31/08/2015
 * @Name: DocumentsMenuItems class
 * @Description: this class implements DocumentsMenuItemInterface and display the menu Items one by one 
 */
package com.menu.admin.printer;

public class DocumentsMenuItems implements DocumentsMenuItemsInterface {
	String displayText;

	public DocumentsMenuItems() {
	}

	/*
	 * @Name: displayMenuForDocuments() function
	 * 
	 * @param: displayText(it is menu Item content)
	 * 
	 * @Description: display each menu item one by one
	 * 
	 * @Return: nothing
	 */
	@Override
	public void displayMenuForDocuments(String displayText) {
		this.displayText = displayText;
		System.out.println(this.displayText);
	}

}
