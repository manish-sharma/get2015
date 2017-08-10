/**
 * @author Sumitra
 *to print the different menu at different task we call the methods of this class
 */
public class MenuList {

	void displayMainMenu() {
		System.out.println("Enter your choice");
		System.out.println("1-> Passenger Train");
		System.out.println("2-> Goods Train");
		System.out.println("enter->");
	}

	void displayPaymentMenu() {
		System.out.println("enter your choice for payment mode");
		System.out.println("1-> Credit Card");
		System.out.println("2-> Wallet");
		System.out.println("3-> NetBanking");
		System.out.println("enter->");
	}

	void continuechoice() {
		System.out.println("Do you want to book again ");
		System.out.println("enter Y for yes");
		System.out.println("enter N for No");
	}
}
