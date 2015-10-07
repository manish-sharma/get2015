/*this class will display menu items
 * and then take suitable action for user defined choice
 * this class implements menuItem interface
 */
package com.metacube.menu;

public class ActionableMenuItem implements MenuItem {
	// Action action ;
	String displayText;

	/*
	 * parameterized constructor of ActionableMenuItem class
	 */
	public ActionableMenuItem(String displayText) {
		this.displayText = displayText;
	}

	/*
	 * this fn will display menu items
	 */
	@Override
	public void display() {
		System.out.println(displayText);

	}

	/*
	 * this fn will take suitable action for user defined choice
	 */
	@Override
	public int takeAction(int i) {
		int flag = 1;
		switch (i) {
		case 1:
			System.out.println("you choose 1");
			break;
		case 2:
			System.out.println("you choose 2");
			break;
		case 3:
			flag = 3;
			System.out.println("exit");
			System.exit(3);
			;

		default:
			System.out.println("you choose other than 1,2,3");
			break;
		}

		return flag;
	}

}
