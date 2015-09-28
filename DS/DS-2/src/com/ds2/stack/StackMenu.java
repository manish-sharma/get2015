
package com.ds2.stack;

import java.util.Scanner;
/*class containing main function and displaying menu to user and taking input from user 
 * to perform the function
 * @author Shishir Pareek
 *Date 26th August 2015
 */

public class StackMenu {

	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack();
		int ch, item, loc;
		Scanner sc = new Scanner(System.in);
		while (true) {//loop to display menu 
			System.out.print("\n 1. Insert in stack"
					+ "\n 2. Delete from stack"
					+ "\n 3. Display "
					+ "\n 4. Infix to Postfix Conversion"
					+ "\n 5. Exit");
			System.out.print("\n Enter Your choice : ");
			ch = sc.nextInt();
			switch (ch) // Apply switch case and call corresponding method
						// according to the user's choice
			{
			case 1:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				stack.push(item);;
				break;
			case 2:stack.pop();
			    break;
			case 3:stack.display();
				break;
			case 4:InfixToPostfix obj = new InfixToPostfix();
			       Scanner sc1 = new Scanner(System.in);
			       System.out.print("Infix : \t");
			       String infix = sc1.next();
			       System.out.print("Postfix : \t" + obj.convert(infix));
			       break;
			case 5:System.exit(0);
		           break;
			default:System.out.print("Enter correct choice");
		    	   break;
			}
		}
	}
	}

