/*MainClass for stack
 * this class will take the user choice to perform stack operations
 */
package com.stack.linked.list;

import java.util.Scanner;

public class MainClass {
	public static void main(String arg[]) {
		ActionableMenuForStack actionableMenu1 = new ActionableMenuForStack(
				"Enter 1 to push an element in Stack");
		ActionableMenuForStack actionableMenu2 = new ActionableMenuForStack(
				"Enter 2 to pop an element from stack");
		ActionableMenuForStack actionableMenu3 = new ActionableMenuForStack(
				"Enter 3 to display  elements of stack");
		ActionableMenuForStack actionableMenu4 = new ActionableMenuForStack(
				"Enter 0 to exit");
		MenuForStackOperations menu = new MenuForStackOperations();
		menu.addMenuItems(actionableMenu1);
		menu.addMenuItems(actionableMenu2);
		menu.addMenuItems(actionableMenu3);
		menu.addMenuItems(actionableMenu4);
		ActionableMenuForStack actionableMenu = new ActionableMenuForStack();
		int flag5 = 1;
		while (flag5 != 0) {
			menu.display();
			Scanner scan = new Scanner(System.in);
			int userInput = scan.nextInt();

			flag5 = actionableMenu.takeActionOnUserChoice(userInput);
		}
	}
}