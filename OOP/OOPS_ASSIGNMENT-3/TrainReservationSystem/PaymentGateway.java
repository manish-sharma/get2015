package TrainReservationSystem;

import java.util.Scanner;

public class PaymentGateway {
	// Class implementing Payment gateway

	String _ccNo;
	String _cvv;
	String _branch = "";
	String _uname;
	String _password;

	Scanner sc = new Scanner(System.in);

	void paymentByCC(int amount) {
		// Method implementing payment by credit card

		System.out.println("Enter CC Number: ");
		_ccNo = sc.next();

		System.out.println("Enter cvv : ");
		_cvv = sc.next();

		System.out.println("Amount deducted from credit card : " + amount);
	}

	void paymentByWallet(int amount) {
		// Method implementing payment by Wallet

		System.out.print("Amount charged by wallet : " + amount);
	}

	void paymentByNetBanking(int amount) {
		// Method Implementing payment by Net Banking

		System.out.println("Enter branch/bank name : ");
		_branch = sc.next();

		System.out.println("Enter user name: ");
		_uname = sc.next();

		System.out.println("Enter password: ");
		_password = sc.next();

		System.out.print("Amount deducted from your account : " + amount);
	}
}
