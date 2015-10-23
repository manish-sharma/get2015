/**
 * 
 */
package Assignment2;

import java.util.Scanner;

/**
 * @author Ravika
 * @since 23/10/2015
 */
public class LeaveDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int leave;
		
		LeaveHandler handler = HandlerHelper.initializer();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many leaves do you want?");
		while(!scanner.hasNextInt()) {
			scanner.next();
		}
		leave = scanner.nextInt();
		handler.handleRequest(leave);
		scanner.close();
	}

}
