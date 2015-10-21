/**
 * 
 */
package Assignment2;

import java.util.Scanner;

/**
 * @author Anjita
 *
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
		leave = scanner.nextInt();
		handler.handleRequest(leave);
		scanner.close();
	}

}
