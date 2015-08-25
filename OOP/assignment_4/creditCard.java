package assignmentOOP_3;

import java.util.Scanner;
/*
 * This class implement PaymentMethod interface.it shows the functionality when user make payment through credit card.
 */
public class creditCard implements PaymentMethod
{

	@Override
	public int makePayment(int no, int rate) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter CC no.:");
 		@SuppressWarnings("unused")
		long ccNo=sc.nextLong();
 		System.out.println("Enter CVV no.:");
 		@SuppressWarnings("unused")
		long cvvNo=sc.nextLong();
 		System.out.println("Proceeding to pay amount...");
 		int totalFare=no*rate;
 		
 		return totalFare;

		
	}

	
}
