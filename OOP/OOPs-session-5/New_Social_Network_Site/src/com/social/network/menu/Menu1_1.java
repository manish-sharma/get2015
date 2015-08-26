/*Menu1_1 Class
 * this class will add nested menu Items in list and then 
 * display them by calling displayEntityMenu1_1() method in ActionableMen1u1_1 Class
 */
package com.social.network.menu;

import java.util.ArrayList;

public class Menu1_1 {
	private ArrayList<MenuItem1_1> items = new ArrayList<MenuItem1_1>();

	/*
	 * this method will add nested menu items in the list
	 */
	public void addMenuItem1_1(MenuItem1_1 item) {
		items.add(item);
	}

	/*
	 * this method will display the nested Menu by calling the
	 * displayEntityMenu1_1() method in ActionableMenu1_1 Class
	 */
	public void displayEntityMenu1_1() {
		for (MenuItem1_1 i : items) {
			i.displayEntityMenu1_1();
		}
	}
}
