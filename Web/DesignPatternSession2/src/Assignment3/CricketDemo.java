/**
 * Write a Template class for different formats of Cricket.(Template Method)
 */
package Assignment3;

import java.util.Scanner;

/**
 * @author Ravika
 * CricketDemo class demonstrating different cricket play function
 *  @since 23/10/2015
 */
public class CricketDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter 1 for One day\n2 for 20-20 \n 3 for Test Match\n 0 for Exit");
			while(!scanner.hasNextInt()) {
				scanner.next();
			}
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Cricket oneDay = new OneDay();
				oneDay.play();
				break;
			case 2 :
				Cricket t20 = new T20();
				t20.play();
				break;
			case 3:
				Cricket test = new Test();
				test.play();
				break;
			case 0 :
				System.out.println("Exit!!!");
				System.exit(0);
			}
		} while(choice != 0);			
	}

}
