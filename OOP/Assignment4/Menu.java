package oop3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	/** take cc number from user and check it.
	 * @return the string of number
	 */
	public String checkTypeCreditCard(){
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
	/**
	 * takes string type input from user
	 * 
	 * @return the input from console
	 */
	public String input() {
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next();
		return name;
	}
	/**takes train type from user and checks if it is correct or not.
	 * @return type of train.
	 */
	public String checkType(){
		Scanner scanner = new Scanner(System.in);
		String temp=scanner.nextLine();
		if(temp.equalsIgnoreCase("Passenger") || temp.equalsIgnoreCase("Goods")){
			return temp;
		}
		else{
			System.out.println("enter correct train type");
			temp=checkType();
		}
		return temp;
	}
	public String menuTrainType(){
		System.out.println("enter train type");
		String trainType=checkType();
		return trainType;
	}
	public String[] menuSourceDestinationStation(){
		String[] stations = new String[2];
		System.out.println("enter source station");
		stations[0] = input();
		System.out.println("enter destination station");
		stations[1] = input();
		return stations;
	}
	public int menuPaymentType(){
		System.out.println("Select mode of payment."+"\n 1 for credit card"+"\n 2 for wallet"+"\n 3 for net banking");
		int option=userInput(1);
		return option;
	}
	public boolean menuCreditCard(int fare, int noOfSeat){
		System.out.println("enter 16 digit credit card number");
		String ccNumber=checkTypeCreditCard();
		System.out.println("enter ccv number");
		int ccvNumber=userInput(2);
		System.out.println("your seats are booked and balance deducted from your account is Rs "+(fare*noOfSeat));
		return true;
	}
	public boolean menuWallet(int fare, int noOfSeat){
		System.out.println("your seats are booked and balance deducted from your account is Rs "+(fare*noOfSeat));
		return true;
	}
	public boolean menuNetBanking(int fare, int noOfSeat){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter name of bank");
		String bankName=scanner.nextLine();
		System.out.println("enter account number");
		String accNumber=scanner.nextLine();
		System.out.println("enter password");
		String password=scanner.nextLine();
		System.out.println("your seats are booked and balance deducted from your account is Rs "+(fare*noOfSeat));
		return true;
	}
}
