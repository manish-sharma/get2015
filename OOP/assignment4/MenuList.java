package oopAssignment5;

import java.util.Scanner;
/**
 * Class to print menu and take uinput from user
 * @author Riddhi
 *
 */
public class MenuList {

	public static String from, to, userName;
	public static int mode, seats, trainId, type;
	public static double weight, price;
	public static boolean ans = false;

	public static void userDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		userName = sc.next();
	}

	public static int displayMenu() {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter type of train required\n1. Passenger 2. Goods");
		if (sc.hasNextInt()) {
			type = sc.nextInt();
		}
		return type;
	}

	public static boolean travelPath() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stations :" + "\n" + "From :");
		from = sc.next();
		System.out.println("To :");
		to = sc.next();
		ans = Processing.match(from, to, type);             //invokes method to check if the match is found for the train
		return ans;
	}

	public static double trainInfo() {
		Scanner sc = new Scanner(System.in);

		if (type == 1) {
			System.out.println("Enter train id");
			trainId = sc.nextInt();
			System.out.println("Seats");
			seats = sc.nextInt();
			price = Processing.checkAvailabilityForPassenger(trainId, seats);      //invokes method to check availability of seat entered by the passenger
			return price;

		} else {
			System.out.println("Enter train id");
			trainId = sc.nextInt();
			System.out.println("Weight");
			weight = sc.nextDouble();
			price = Processing.checkAvailabilityForGoods(trainId, weight);        //invokes method to check availability of weight entered by the passenger
			return price;
		}
	}

	public static int modeOfPayment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mode of Payement");
		System.out.println("1. Credit Card \n 2. Net Banking ");
		mode = sc.nextInt();
		switch (mode) {
		case 1: {
			Payement.creditCard();
			if (type == 1) {
				Processing.ticketPrint(userName, trainId, seats, price);          //invokes method to print ticket on successful booking
				Processing.updateChartForPassenger(trainId, seats);               //invokes method to update train chart
			} else {
				Processing.ticketPrint(userName, trainId, weight, price);        //invokes method to print ticket on successful booking
				Processing.updateChartForGoods(trainId, weight);                 //invokes method to update train chart
			}

		}
			break;

		case 2:
			Payement.netBanking();
			if (type == 1) {
				Processing.ticketPrint(userName, trainId, seats, price);           //invokes method to print ticket on successful booking
				Processing.updateChartForPassenger(trainId, seats);                //invokes method to update train chart
			} else {
				Processing.ticketPrint(userName, trainId, weight, price);          //invokes method to print ticket on successful booking
				Processing.updateChartForGoods(trainId, weight);                   //invokes method to update train chart
			}
			break;
		default:
			ErrorPrint.print();            //invokes function of ErrorPrint class to display message
		}
		return mode;
	}
}
