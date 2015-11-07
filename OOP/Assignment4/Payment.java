package oop3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author khemanshu
 *
 */
public class Payment {
	
	/** payment is done in this method
	 * @param trainNo
	 * @param noOfSeat
	 * @param fare
	 * @return true or false
	 */
	public boolean doPayment(int trainNo, int noOfSeat, int fare){
		Menu menu = new Menu();
		Scanner scanner = new Scanner(System.in);
		int option = menu.menuPaymentType();
		switch(option){
			case 1:
				return menu.menuCreditCard(fare, noOfSeat);
			case 2:
				return menu.menuWallet(fare, noOfSeat);
			case 3:
				return menu.menuNetBanking(fare, noOfSeat);
				
		}
		return false;
		
	}
}