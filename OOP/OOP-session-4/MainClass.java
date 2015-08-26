/*Main class to implement Menu driven code
 
  @author Pooja Khandelwal
 *
 */
package com.metacube;

import com.metacube.menu.ActionableMenuItem;
import com.metacube.menu.Menu;

public class MainClass {
	public static void main(String[] args) {
		Menu menu = new Menu();
		ActionableMenuItem Item1 = new ActionableMenuItem("Enter 1 for add");
		ActionableMenuItem Item2 = new ActionableMenuItem("Enter 2 delete");
		ActionableMenuItem Item3 = new ActionableMenuItem("Enter 3 exit");
		menu.addMenuItem(Item1);
		menu.addMenuItem(Item2);
		menu.addMenuItem(Item3);
		menu.display();

	}

}
