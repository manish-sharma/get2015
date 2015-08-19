import java.util.Scanner;

/**
 * @author Sumitra
 *this class is for payment and three different method for three different type
 */
public class Payment {

	Scanner scanner = new Scanner(System.in);
 /**
  * 
  * this is for credit card users and price is inserted and other data is fetched.
  */
	void creditCard(double price) {
		System.out.println("enter the credit card number");
		double cc = scanner.nextInt();
		System.out.println("enter ccv number");
		int cvv = scanner.nextInt();
		System.out.println("credit number ->" + cc);
		System.out.println("cvv number ->" + cvv);
		System.out.println(" amount detected ->" + price);
	}
/**
 * 
 * @param price this is for users who pay by cash
 */
	void wallet(double price) {
		System.out.println(" recevied amount ->" + price);
	}
/**
 * this is for those who use net banking
 * @param price amount to be payed
 */
	void netBanking(double price) {
		System.out.println("enter bank name");
		String bank = scanner.next();
		System.out.println("enter coustomer name");
		String name = scanner.next();
		System.out.println("enter password");
		String password = scanner.next();
		System.out.println("Bank Name ->" + bank);
		System.out.println(" customer name ->" + name);
		System.out.println(" password ->" + password);
		System.out.println("  amount detected ->" + price);
	}
}
