/**
 * @author Dheeraj
 * Implement the Train Reservation System
 * Class Payment  will handle payment related task if payment is successful then seat will be reduced
 */
package trainreservation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Payment 
{
	BufferedReader bufferReaderObj = new BufferedReader(new InputStreamReader(System.in));
	void checkout(TrainDetail trainNumber, int totalSeats)
	{
		boolean isCorrect=false;
		int paymentChoice=0;
		System.out.println("Enter Your Name: ");
		String name =UserInterfaceMain.readString(bufferReaderObj);
		System.out.println("Enter mode of payment: ");
		System.out.println("1 for Credit Card");
		System.out.println("2 for Wallet");
		System.out.println("3 for Net Banking");
		do{
			try 
			{
				paymentChoice = Integer.parseInt(bufferReaderObj.readLine());
			}
			catch (NumberFormatException exception) 
			{
				System.out.println("Please enter correct number like 1 2 3");
				continue;
				
			}
			catch(IOException io)
			{
				System.out.println("Please enter correct number like 1 2 3");
				continue;
			}
			if (paymentChoice == 1) 
			{
				payByCreditCard(name, trainNumber, totalSeats);
				isCorrect=true;
			} 
			else if (paymentChoice == 2) 
			{
				payByWallet(name, trainNumber, totalSeats);
				isCorrect=true;
			} 
			else if (paymentChoice == 3) 
			{
				payByNetBanking(name, trainNumber, totalSeats);
				isCorrect=true;
			}
		}while(!isCorrect);
	
	}

	void payByCreditCard(String name, TrainDetail trainDetail, int totalSeats)
	{
		
		System.out.print("Enter Your Card Number: ");
		String cardNumber = UserInterfaceMain.readString(bufferReaderObj);
		System.out.print("Enter CVV Number: ");
		String cvvNumber =UserInterfaceMain.readString(bufferReaderObj);
		ticketOutput("Hii " + name + " your payment through card number "+ cardNumber + " has been received.", trainDetail, totalSeats);
	}

	void payByWallet(String name, TrainDetail trainDetail, int totalSeats) 
	{
		ticketOutput("Hii " + name+ " your payment through E-Wallet has been received.",trainDetail, totalSeats);
	}

	void payByNetBanking(String name, TrainDetail trainDetail, int totalSeats) 
	{
		
		System.out.print("Enter Bank Name: ");
		String bankName = UserInterfaceMain.readString(bufferReaderObj);
		System.out.print("Enter User Name: ");
		String userName = UserInterfaceMain.readString(bufferReaderObj);
		System.out.print("Enter Password: ");
		String passwd = UserInterfaceMain.readString(bufferReaderObj);
		ticketOutput("Hii " + name+ " your payment through NetBanking's Username " + userName+ " has been received.", trainDetail, totalSeats);
		
	}

	void ticketOutput(String userDetail, TrainDetail trainDetail, int totalSeats) 
	{
		System.out.println(userDetail);
		System.out.println("Train Number: " + trainDetail.getTrainNumber());
		System.out.println("Train Name: " + trainDetail.getTrainName());
		System.out.println("Source: " + trainDetail.getSource());
		System.out.println("Destination: " + trainDetail.getDestination());
		System.out.println("Total Reservation Quantity: " + totalSeats);
	}
}
