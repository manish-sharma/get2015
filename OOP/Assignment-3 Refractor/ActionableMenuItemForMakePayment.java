import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ActionableMenuItemForMakePayment implements MenuItem {
	String displayText; 
	public ActionableMenuItemForMakePayment(String displayText) {
		// TODO Auto-generated constructor stub
		this.displayText = displayText;
	}
	public void display() {
		System.out.println(displayText);
		
	}
	public void takeAction(int choice) {
	
		List<String> paymentDetail = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		switch (choice){
		case 1  :
			System.out.println("Please Enter 16 Digit Card Number");
			paymentDetail.add(scan.next());
			System.out.println("Enter CVV number");
			paymentDetail.add(scan.next());
			break;
		case 2 :
			System.out.println("Total Amount to be paid " );

			break;
		case 3:
			System.out.println("Enter bank name");
			paymentDetail.add(scan.next());
			System.out.println("Enter user name");
			paymentDetail.add(scan.next());
			System.out.println("Enter your password");
			paymentDetail.add(scan.next());
			break;
		}
	}

}
