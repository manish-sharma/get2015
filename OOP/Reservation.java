package oops_assignment_3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

/**reservation class is used to make the reservation of the passenger as well as good strain
* Name: reservation
* @author ankur gupta
* Since: 18 August,2015
*  
*/

public class Reservation {
	
	
	static List<String> passengerTrainInfo = new ArrayList<String>();//static passenger train list
	static List<String> bookingChart = new ArrayList<String>();//static booking list

	static List<String> goodsTrainInfo = new ArrayList<String>();//static goods train list
	
	
	static String passengerTrainFileName = "C:/Users/Ankur/Desktop/PassengerTrainInfo.txt";//file location of passenger train
	static String goodsTrainFileName = "C:/Users/Ankur/Desktop/GoodsTrainInfo.txt";//file location of goods train
	
	/**
	 * main method used to create objects and to call the display method through objects
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args)  throws IOException {
		
		Reservation reservationObject = new Reservation();//reservation class object
		TrainInfo trainInfoObject = new TrainInfo();//train information object
		goodsTrainInfo=trainInfoObject.readTrainInfo(goodsTrainFileName);//read goods train file 
		passengerTrainInfo=trainInfoObject.readTrainInfo(passengerTrainFileName);//read passenger train file
		reservationObject.displayMenu();
		
	}
	/**display method is used to display the list for reservation or to display chart
	 * @user input to read the next step
	 * @throws IOException
	 */
	
	void displayMenu() throws IOException{
		Reservation reservationObject = new Reservation();
		System.out.println("Press 1 for Reservation");
		System.out.println("Press 2 for chart");
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();//scan user input
		switch(userInput){
		case 1:
			reservationObject.checkAvailability(passengerTrainInfo,goodsTrainInfo);//call checkavailability method
			break;
		case 2:
			reservationObject.showChart(bookingChart);//call show chart method
		}
		
	}
	
	/**
	 * this method is used to check the train type
	 * @return type of the train whether it is goods train or passenger train
	 * @throws IOException
	 */
	String trainType() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String trainType = null;
		System.out.println("press 1 for the passenger train");
		System.out.println("press 2 for goods train");
		trainType = sc.next();
		
		if(trainType.equals("1"))
		{
			trainType = "passenger";
			
		}
		
		else if(trainType.equals("2"))
		{
			trainType = "goods";
			
				
		}
		else
		{
			System.out.print("Please enter the valid number");
			trainType();
		}
		return trainType;//return train type
			
	 }
	
	/**
	 * this method is used to check the availability of the seats or the available weights in the train
	 * @param passengerTrainInfo read the list of passenger train
	 * @param goodsTrainInfo read the list of goods train
	 * @throws IOException
	 */
	void checkAvailability(List<String> passengerTrainInfo,List<String> goodsTrainInfo) throws IOException
	
	{
		String trainType = trainType();//trainType return the train type
		boolean passengerTrainAvailable = false;
		boolean goodsTrainAvailable = false;
		boolean ticketAvailable = false;
		Scanner sc = new Scanner(System.in);
		List<String> trainInfo = new ArrayList<String>();
		//checks the train type is passenger or goods
		if(trainType.equalsIgnoreCase("passenger"))
		{
			
			System.out.println("Enter the source station:");
			String source = sc.next();
			System.out.println("Enter the destination station:");
			String destination = sc.next();
			Iterator availability = passengerTrainInfo.iterator();
			while(availability.hasNext())
			{
				String[]  available = ((String)availability.next()).split(",");
				if(available[1].equalsIgnoreCase(source+"-"+destination) && Integer.parseInt(available[3]) > 0)//checks availabilty
				{
					System.out.println("The following train is available");
					System.out.println("Train No. \t Source-Destination \t Price \t Availability \t Time");
					System.out.println(available[0]+"\t\t"+available[1]+"\t\t"+available[2]+"\t\t"+available[3]+"\t\t"+available[4]);
					passengerTrainAvailable = true;
					ticketAvailable = true;
				}
			}
		}
		else
		{
			
			System.out.println("Enter the source station:");
			String source = sc.next();
			System.out.println("Enter the destination station:");
			String destination = sc.next();
			Iterator availability  =goodsTrainInfo.iterator();
			while(availability.hasNext())
			{
				String[]  available = ((String)availability.next()).split(",");
				if(available[1].equalsIgnoreCase(source+"-"+destination) && Integer.parseInt(available[3]) > 0)
				{
					System.out.println("The following train is available");
					System.out.println("Train No. \t Source-Destination \t Price \t Available_weight \t Time");
					System.out.println(available[0]+"\t\t"+available[1]+"\t\t"+available[2]+"\t\t"+available[3]+"\t\t"+available[4]);//checks availability
					goodsTrainAvailable = true;
					ticketAvailable = true;
				}
			}
		}
		if(passengerTrainAvailable){
			doBooking(passengerTrainInfo,trainType);//method calling
		}
		else if(goodsTrainAvailable){
			doBooking(goodsTrainInfo,trainType);
		}
		else if(ticketAvailable == false){
			System.out.println("Ticket is not available");
			checkAvailability(passengerTrainInfo,goodsTrainInfo);//dobooking method calling
		}
		else
		{
			System.out.println("Train is not available");
			checkAvailability(passengerTrainInfo,goodsTrainInfo);//dobooking method calling
		}
	}
		
		/**
		 * this method is used to book the ticket
		 * @param trainInfo stores information  of the train
		 * @param trainType stores information of the train type
		 * @return the booking chart
		 * @throws IOException
		 */
	List<String> doBooking(List<String> trainInfo,String trainType) throws IOException
	{
		
		TrainInfo tainInfoObject = new TrainInfo();//object of trainInfo class
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 if you want to book ticket or 2 for exit");
		if(sc.nextInt() == 1)
		{
			System.out.println("Enter The Train Number");
			String trainNumber = sc.next();
			System.out.println("Enter the number of tickets");
			int numberOfTickets = sc.nextInt();
			System.out.println("Enter your name");
			String nameOfCustomer = sc.next();
			
			int[] reservation = tainInfoObject.makeReservation(trainType, trainInfo, trainNumber, numberOfTickets);//method call to makereservation
			if(reservation[0] == 1)
			{
				System.out.println("Your Ticket is booked");
				System.out.println("Name \t\t Train No. \t\t number of seats \t\t total amount");
				int totalAmount = reservation[1]*numberOfTickets;
				System.out.println(nameOfCustomer+"\t\t" +trainNumber+"\t\t\t\t"+numberOfTickets+"\t\t\t\t"+totalAmount);
				bookingChart.add(trainNumber+","+nameOfCustomer+","+numberOfTickets);//add the deatails in booking chart
				displayMenu();
			}
			
		}
		return bookingChart;//return booking chart
	}
	/**
	 * this method is used to show the updated chart
	 * @param bookingChart to book the chart
	 * @throws IOException
	 */

	void showChart(List<String> bookingChart) throws IOException{
		System.out.println("Enter the Train Number");
		Scanner scan = new Scanner(System.in);
		String trainNumber = scan.next();//scan train number
		Iterator bookingItr = bookingChart.iterator();
		
		while(bookingItr.hasNext()){
			String[] bookingTemp = ((String)bookingItr.next()).split(",");
			if(trainNumber.equalsIgnoreCase(bookingTemp[0])){
				System.out.println("train number \t name \t alloatedNumber");
				System.out.println(bookingTemp[0]+"\t\t"+bookingTemp[1]+"\t\t"+bookingTemp[2]);	
			}
			else{
				System.out.println("Chart not found for the requested train number");
				displayMenu();//display method call
			}
		}
		displayMenu();//display method call
		
	}
	
}
