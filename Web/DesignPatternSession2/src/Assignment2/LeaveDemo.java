/**
 * program for leave approval includes mentor,Senior mentor and HR manager. 
 * The Mentor ,senior mentor and HR manager can approve 1,2,5 days leaves respectively.
 * (Chain of Responsibility)
 */
package Assignment2;

import java.util.Scanner;

/**
 * @author Anjita
 * LeaveDemo class demonstrating leave approval Chain of Responsibility.
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
