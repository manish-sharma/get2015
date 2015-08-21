package oop3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Khemanshu
 *
 */
public class Main {
	/**
	 * @return
	 */
	static int UserInput() {
		int number;
		try {
			Scanner sc = new Scanner(System.in);

			number = sc.nextInt();
		} 
		catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			number = UserInput();
			return number;
		}
		return number;

	}
	public static void main(String args[]){
		Input input = new Input();
		int option=1;
		Passenger passenger = new Passenger();
		Goods goods = new Goods();
		Passenger.trains=passenger.readTrainDetails();
		Goods.trains=goods.readTrainDetails();
		while(option==1){
		input.startReservation();
		System.out.println("enter 1 to continue");
		option=UserInput();
		}
	}
}
