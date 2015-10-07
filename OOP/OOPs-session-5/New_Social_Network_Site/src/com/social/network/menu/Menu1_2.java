/*Menu1_2 Class
 * this class will add nested menu Items in list and then 
 * display them by calling displayFriendRequestMenu1_2() method in ActionableMenu1_2 Class
 */
package com.social.network.menu;

import java.util.ArrayList;

public class Menu1_2 {
	private ArrayList<MenuItem1_2> items = new ArrayList<MenuItem1_2>();

	/*
	 * this method will add nested menu items in the list
	 */
	public void addMenuItem1_2(MenuItem1_2 item) {
		items.add(item);
	}

	/*
	 * this method will display the nested Menu by calling the
	 * displayFriendRequestMenu1_2() method in ActionableMenu1_2 Class
	 */
	public void displayFriendRequestMenu1_2() {
		for (MenuItem1_2 i : items) {
			i.displayFriendRequestMenu1_2();
		}
	}
}
