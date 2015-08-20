package oop3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author khemanshu
 *
 */
public class Payment {
	/** take input from user
	 * @param callee
	 * @return input
	 */
	int userInput(int callee) {
		int number;
		try {
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();
			if(callee==1){
				if (number<1 || number>3) {
					System.out.println("enter the correct input");
					number = userInput(1);
	
				}
			}
			else if(callee==2){
				if (number<99 || number>1000) {
					System.out.println("enter the correct 3 digit ccv number");
					number = userInput(2);
				}
			}
			return number;
		} 
		catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			number = userInput(callee);
			return number;
		}

	}
	/** take cc number from user and check it.
	 * @return the string of number
	 */
	public String checkType(){
		Scanner scanner = new Scanner(System.in);
		String temp=scanner.nextLine();
		if(temp.length()==16){
			return temp;
		}
		else{
			System.out.println("enter only 16 digit number");
			temp=checkType();
		}
		return temp;
	}
	/** payment is done in this method
	 * @param trainNo
	 * @param noOfSeat
	 * @param fare
	 * @return true or false
	 */
	public boolean doPayment(int trainNo, int noOfSeat, int fare){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select mode of payment."+"\n 1 for credit card"+"\n 2 for wallet"+"\n 3 for net banking");
		int option=userInput(1);
		System.out.println(option);
		switch(option){
			case 1:
				System.out.println("enter 16 digit credit card number");
				String ccNumber=checkType();
				System.out.println("enter ccv number");
				int ccvNumber=userInput(2);
				System.out.println("your seats are booked and balance deducted from your account is Rs "+(fare*noOfSeat));
				return true;
			case 2:
				System.out.println("your seats are booked and balance deducted from your account is Rs "+(fare*noOfSeat));
				return true;
			case 3:
				System.out.println("enter name of bank");
				String bankName=scanner.nextLine();
				System.out.println("enter account number");
				String accNumber=scanner.nextLine();
				System.out.println("enter password");
				String password=scanner.nextLine();
				System.out.println("your seats are booked and balance deducted from your account is Rs "+(fare*noOfSeat));
				return true;
				
		}
		return false;
		
	}
}