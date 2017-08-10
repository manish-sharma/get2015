package com.ds5.queue;

import java.util.Scanner;
/**This class contains main function which gives user menu options and takes input from user 
 * 
 * @author Shishir
 * Date 31st August 2015
 *
 */

public class QueueMain {
  
	/**main method from where execution of program starts 
	 * 
	 * @param args
	 */
	public static void main(String args[])
	{
		Queue queue = new Queue();
		int ch, item, loc;
		Scanner sc = new Scanner(System.in);
		while (true) {//loop to display menu 
			System.out.print("\n 1. Insert element in queue"
					+ "\n 2. Remove element from queue"
					+ "\n 3. Display Queue"
					+ "\n 4. Exit");
			System.out.print("\n Enter Your choice : ");
			ch = sc.nextInt();
			switch (ch) // Apply switch case and call corresponding method
						// according to the user's choice
			{
			case 1://to enter value in queue
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				queue.enqueue(item);
				break;
			case 2:queue.dequeue();//to delete element from queue
			    break;
			case 3:queue.display();//to display queue
				break;
			case 4:
				System.exit(0);//to exit from program
				break;
			default:System.out.println("Enter correct choice");
			    break;
			}
		}
	}
}

