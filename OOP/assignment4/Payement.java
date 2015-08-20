package oopAssignment5;
import java.util.Scanner;

public class Payement {

	//method to take details for credit card payment
	public static void creditCard() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your credit card number");
		long creditCardNum = sc.nextLong();
		System.out.println("Enter your cvv number");
		long cvv = sc.nextLong();

	}

	//method to take details for net banking payment
	public static void netBanking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your bank name");
		String bankName = sc.next();
		System.out.println("Enter your account number");
		long cvv = sc.nextLong();
	}

}
