import java.util.Scanner;

/**
 * @author Priyamvada---- This class is to select the payment mode from the user
 * 
 */
public class PaymentMode {
	Scanner sc = new Scanner(System.in);

	/**
	 * @param price
	 *            --to be detected IT IS VIA CREDIT CARD MODE
	 */
	public void creditCard(double price) {
		System.out.println("Enter your cc value");
		System.out.println("IT MUST BE INTEGER VALUE");

		int ccValue = sc.nextInt();
		System.out.println("Enter your csv value");
		System.out.println("IT MUST BE INTEGER VALUE");
		int csvValue = sc.nextInt();
		System.out.println("Your processing as follows");

		System.out.println("ccValue-" + ccValue + "	csv value->" + csvValue
				+ "	amount detected->" + price);
	}

	/**
	 * @param price
	 *            ---PRICE TO BE DETECTED IT IS VIA WALLET MODE
	 */
	public void wallet(double price) {
		System.out.println("Your amount is detected with price" + price);

	}

	/**
	 * @param price
	 *            ---PRICE TO BE DETECTED IT IS VIA NET BANKING MODE
	 */
	public void netBanking(double price) {
		System.out.println("enter your bank detail------");
		System.out.println("enter your bank name");
		String bankName = sc.next();
		System.out.println("enter your user name");
		String userName = sc.next();
		System.out.println("enter your password");
		sc.next();
		System.out.println("Your processing as follows");
		System.out.println("bank name-" + bankName + "	User Name->" + userName
				+ "	amount detected->" + price);

	}

}
