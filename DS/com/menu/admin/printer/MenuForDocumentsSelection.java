/**  
 * @author: Pooja Khandelwal
 * @created date:31/08/2015
 * @Name: MenuForDocumentsSelection Class
 * @Description: it will set the all menu items contens and then display then by
 * further calling the displayMenuForDocuments() function of DocumentsMenuItems class
 */
package com.menu.admin.printer;

public class MenuForDocumentsSelection {
	String[] menuContent;

	/*
	 * @Name: MenuForDocumentsSelection Class Constructor
	 * 
	 * @Description: set the all menu items content
	 */
	public MenuForDocumentsSelection() {
		menuContent = new String[] {
				"Press 4 if document is sent by Chairman",
				"Press 3 if document is sent by professor",
				"press 2 if document is sent by graduate student",
				"press 1 if document is sent by underGraduate" };
	}

	/*
	 * @Name : displayMenuForDocuments() function
	 * 
	 * @Param : nothing
	 * 
	 * @Description :this function will display the menu contents by further
	 * calling the displayMenuForDocuments() function of DocumentsMenuItems
	 * class
	 * 
	 * @Return :nothing
	 */
	public void displayMenuForDocuments() {
		DocumentsMenuItems menuItems = new DocumentsMenuItems();
		for (int i = 0; i < menuContent.length; i++) {
			menuItems.displayMenuForDocuments(menuContent[i]);
		}

	}

}
