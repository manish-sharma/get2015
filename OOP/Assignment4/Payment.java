package com.metacube.menu;
/**
 * @author Dheeraj
 * Implement the Train Reservation System
 * Class Payment  will handle payment related task if payment is successful then seat will be reduced
 */


import com.metacube.menu.ActionPayment;
import com.metacube.menu.Menu;


public class Payment 
{
	//BufferedReader bufferReaderObj = new BufferedReader(new InputStreamReader(System.in));
	private static String name;
	private static TrainDetail trainDetail;
	private static int noOfSeats;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TrainDetail getTrainNo() {
		return trainDetail;
	}
	public void setTrainNo(TrainDetail trainDetails) {
		this.trainDetail = trainDetails;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int  noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	void checkOut(TrainDetail trainDetail, int totalSeats)
	{
		System.out.println("Enter Your Name: ");
		String name =UserInterfaceMain.readString();
		setName(name);
		setTrainNo(trainDetail);
		setNoOfSeats(totalSeats);
		Menu menu=new ActionPayment();
	
	}

	public  void  payByCreditCard()
	{
		
		System.out.print("Enter Your Card Number: ");
		String cardNumber = UserInterfaceMain.readString();
		System.out.print("Enter CVV Number: ");
		String cvvNumber =UserInterfaceMain.readString();
		ticketOutput("Hii " + name + " your payment through card number "+ cardNumber + " has been received.", trainDetail, noOfSeats);
	}

	public void payByWallet() 
	{
		ticketOutput("Hii " + name+ " your payment through E-Wallet has been received.",trainDetail, noOfSeats);
	}

	public void payByNetBanking() 
	{
		
		System.out.print("Enter Bank Name: ");
		String bankName = UserInterfaceMain.readString();
		System.out.print("Enter User Name: ");
		String userName = UserInterfaceMain.readString();
		System.out.print("Enter Password: ");
		String password = UserInterfaceMain.readString();
		ticketOutput("Hii " + name+ " your payment through NetBanking's Username " + userName+ " has been received.", trainDetail, noOfSeats);
		
	}

	public void ticketOutput(String userDetail, TrainDetail trainDetail, int totalSeats) 
	{
		System.out.println("\n\t****"+userDetail+"****");
		System.out.println("Train Number: " + trainDetail.getTrainNumber());
		System.out.println("Train Name: " + trainDetail.getTrainName());
		System.out.println("Source: " + trainDetail.getSource());
		System.out.println("Destination: " + trainDetail.getDestination());
		System.out.println("Total Reservation Quantity: " + totalSeats);
		Train trainObject = new Train();
		UserInterfaceMain userInterface = new UserInterfaceMain();
		trainObject.reduceAvailableSeats(trainDetail,totalSeats);
		if(trainDetail.getTypeTrain() == "P")
		userInterface.printTrainList(Train.trainList);	
		else
			userInterface.printTrainList(Train.trainList);	
		System.exit(1);
		
	}
	
}
