/*
 * ActionableMenuForStack Class 
 * it implements MenuItemForStack interface 
 * it will display the menu for stack operations and then take appropriate action based on user choice
 * 
 */
package com.stack.linked.list;

import java.util.Scanner;

import com.stack.linked.list.Stack;

public class ActionableMenuForStack implements MenuItemForStack {
	private String displayText;
	private Stack<Integer> stack = new Stack<Integer>();

	/*
	 * constructor of ActionableMenuForStack Class it will set the content of
	 * each menu item
	 */
	public ActionableMenuForStack(String displayText) {

		this.displayText = displayText;
	}

	public ActionableMenuForStack() {

	}

	/*
	 * this fn will display the menu for stack operations
	 */
	@Override
	public void displayMenu() {
		System.out.println(displayText);

	}

	/*
	 * this fn will take approp[riate action base on the user choice
	 */
	@Override
	public int takeActionOnUserChoice(int userchoice) {

		int flag = 1;

		switch (userchoice) {
		case 1:
			while (userchoice == 1) {
				System.out
						.println("Press data which you want to store in Stack");
				Scanner scanner = new Scanner(System.in);
				int data = scanner.nextInt();
				stack.push(data);
				System.out.println(data + " inserted in stack");
				System.out
						.println("press 1 to continue push operation/nOtherwise press 2");
				userchoice = scanner.nextInt();

			}

			break;

		case 2:
			while (userchoice == 2) {
				stack.pop();
				System.out
						.println("press 2 to continue push operation/nOtherwise press 1");
				Scanner scanner = new Scanner(System.in);
				userchoice = scanner.nextInt();
			}

			break;
		case 3:

			stack.display();
			System.out.println();
			break;
		case 0:
			flag = 0;
			break;
		default:
			System.out.println("Enter correct choice");
		}
		return flag;

	}

}
