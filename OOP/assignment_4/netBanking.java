package assignmentOOP_3;

import java.util.Scanner;

public class netBanking implements PaymentMethod {

	@Override
	public int makePayment(int no, int rate) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter name of bank:");
 		@SuppressWarnings("unused")
		String bank=sc.nextLine();
 		System.out.println("Enter user name:");
 		@SuppressWarnings("unused")
		String userName=sc.next();
 		System.out.println("Enter password:");
 		@SuppressWarnings("unused")
		String password=sc.next();
 		System.out.println("Proceeding to pay amount...");
 		int totalFare=no*rate;
 		return totalFare;

	}

}
