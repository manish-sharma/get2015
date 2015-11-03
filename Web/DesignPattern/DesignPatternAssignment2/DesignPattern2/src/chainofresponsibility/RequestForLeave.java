package chainofresponsibility;

import java.util.Scanner;

/**
 * Main Class that takes the input from the user and handles the request
 * 
 * @author Riddhi
 * 
 */
public class RequestForLeave {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LeaveApproval l1 = new Mentor();
		LeaveApproval l2 = new SeniorMentor();
		LeaveApproval l3 = new HRManager();
		l1.setNext(l2);
		l2.setNext(l3);
		System.out.println("Enter the number of days you want leave for : ");
		int days = sc.nextInt();
		Leaves objOfLeaves = new Leaves();
		objOfLeaves.setNoOfDays(days);
		l1.process(objOfLeaves);
	}
}
