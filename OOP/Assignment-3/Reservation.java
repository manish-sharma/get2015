/**
 * This class is to implement the functionality of reservation of tickets
 * @author Sanjay Nainani
 */
import java.io.IOException;
import java.util.*;


public class Reservation {
	static List<String> passengerTrainInfo = new ArrayList<String>();
	static List<String> bookingChart = new ArrayList<String>();
	static List<String> goodsTrainInfo = new ArrayList<String>();
	static String passengerTrainFileName = "C:/Users/Sanjay/Desktop/PassengerTrainInfo.txt";
	static String goodsTrainFileName = "C:/Users/Sanjay/Desktop/GoodsTrainInfo.txt";
	public static void main(String[] args)  throws IOException {
		
		//object of TrainInfo Class
		TrainInfo trainInfoObject = new TrainInfo();
		
		//object of Reservation Class
		Reservation reservationObject = new Reservation();
		
		//List of Goods Train
		goodsTrainInfo=trainInfoObject.readTrainInfo(goodsTrainFileName);
		
		//List of Passenger Trains
		passengerTrainInfo=trainInfoObject.readTrainInfo(passengerTrainFileName);
		
		//Menu
		reservationObject.displayMenu();
		
		
		
	}
	
	/**
	 * Method to display menu
	 * @throws IOException
	 */
	void displayMenu() throws IOException{
		Reservation reservationObject = new Reservation();
		System.out.println("Press 1 for Reservation");
		System.out.println("Press 2 for chart");
		int userInput=0;
		Scanner scan = new Scanner(System.in);
		
		try{
			userInput = scan.nextInt();
			
		}
		catch(InputMismatchException inputError){
			System.out.println("Please enter 1 or 2");
			displayMenu();
		}
		switch(userInput){
		case 1:
			reservationObject.checkAvailability(passengerTrainInfo,goodsTrainInfo);
			break;
		case 2:
			reservationObject.showChart(bookingChart);
		}
		
	}
	
	/**
	 * Method to select trainType
	 * @return trainType
	 * @throws IOException
	 */
	String trainType() throws IOException{
		Scanner scan = new Scanner(System.in);
		String trainType = null;
		System.out.println("Press 1 for Passenger Train");
		System.out.println("Press 2 for Goods Train");
		trainType=scan.next();
		if(trainType.equals("1")){
			trainType="Passenger";
			
			
		}
		else if(trainType.equals("2")){
			trainType="Goods";
			
		}
		else{
			System.out.println("Please Enter 1 or 2");
			trainType();
		}
		return trainType;
			
	}
		
		
		
	
	
	/**
	 * Method to check availability of seats in the train
	 * @param passengerTrainInfo = list of passenger trains
	 * @param goodsTrainInfo = list of goods train
	 * @throws IOException
	 */
	void checkAvailability(List<String> passengerTrainInfo, List<String> goodsTrainInfo) throws IOException{
		String trainType=trainType();
		boolean passengerTrainAvailable=false;
		boolean goodsTrainAvailable=false;
		boolean ticketAvailable=false;
		Scanner scan = new Scanner(System.in);
		if(trainType.equalsIgnoreCase("passenger")){
			System.out.println("Enter the source staion");
			String sourceStation = scan.next();
			System.out.println("Enter the destination station");
			String destinationStation = scan.next();
			Iterator availability = passengerTrainInfo.iterator();
			while(availability.hasNext()){
				String[] availabilityTemp = ((String)availability.next()).split(",");
				if(availabilityTemp[1].equalsIgnoreCase(sourceStation+"-"+destinationStation) && Integer.parseInt(availabilityTemp[3])>0){
					System.out.println("The following train is available");
					System.out.println("Train No. \t Source-Destination \t Price \t Availability \t Time");
					System.out.println(availabilityTemp[0]+"\t\t"+availabilityTemp[1]+"\t\t"+availabilityTemp[2]+"\t\t"+availabilityTemp[3]+"\t\t"+availabilityTemp[4]);
					passengerTrainAvailable=true;
					ticketAvailable = true;
				}
				
				
				
			}
			
		}
		else{
			
			System.out.println("Enter the source staion");
			String sourceStation = scan.next();
			System.out.println("Enter the destination station");
			String destinationStation = scan.next();
			
			Iterator availability = goodsTrainInfo.iterator();
			while(availability.hasNext()){
				String[] availabilityTemp = ((String)availability.next()).split(",");
				if(availabilityTemp[1].equalsIgnoreCase(sourceStation+"-"+destinationStation) && Integer.parseInt(availabilityTemp[3])>0){
					System.out.println("The following train is available");
					System.out.println("Train No. \t Source-Destination \t Price \t Availability \t Time");
					System.out.println(availabilityTemp[0]+"\t\t"+availabilityTemp[1]+"\t\t"+availabilityTemp[2]+"\t\t"+availabilityTemp[3]+"\t\t"+availabilityTemp[4]);
					goodsTrainAvailable=true;
					ticketAvailable = true;
				}
				
			}
			
		}
		if(passengerTrainAvailable){
			doBooking(passengerTrainInfo,trainType);
		}
		else if(goodsTrainAvailable){
			doBooking(goodsTrainInfo,trainType);
		}
		
		//if seats are not available in requested train
		else if(ticketAvailable==false){
			System.out.println("Ticket not available");
			checkAvailability(passengerTrainInfo,goodsTrainInfo);
		}
		
		//if the requested train available
		else{
			System.out.println("Train not available");
		}
	}
	
	
	/**
	 * Method to do reservation in the requested train
	 * @param trainInfo = depends on the train type either passenger train info or goods train info
	 * @param trainType = passenger train or goods train
	 * @return a list of all the current bookings
	 * @throws IOException
	 */
	List<String> doBooking(List<String> trainInfo, String trainType ) throws IOException {
		TrainInfo trainInfoObject = new TrainInfo();
		Scanner scan = new Scanner(System.in);
		System.out.println("if you want to book your ticket now press 1 else press 2");
		if(scan.nextInt()==1){
			System.out.println("Enter your name");
			String nameOfCustomer = scan.next();
			System.out.println("Enter The Train Number");
			String trainNumber = scan.next();
			System.out.println("Enter the number of tickets");
			int numberOfTickets = scan.nextInt();
			
			int[] reservation = trainInfoObject.makeReservation(trainType,trainInfo,trainNumber,numberOfTickets);
			if(reservation[0] == 1){
				
				System.out.println("Your Ticket is booked");
				System.out.println("Name \t\t Train No. \t\t number of seats \t\t total amount");
				int totalAmount=reservation[1]*numberOfTickets;
				System.out.println(nameOfCustomer+"\t\t" +trainNumber+"\t\t\t\t"+numberOfTickets+"\t\t\t\t"+totalAmount);
				bookingChart.add(trainNumber+","+nameOfCustomer+","+numberOfTickets);
				displayMenu();
			}
			
		}
		return bookingChart;
	}
	
	
	/**
	 * This method is used to show the booking chart of a particular train
	 * @param bookingChart = booking information
	 * @throws IOException
	 */
	void showChart(List<String> bookingChart) throws IOException{
		System.out.println("Enter the Train Number");
		Scanner scan = new Scanner(System.in);
		String trainNumber = scan.next();
		Iterator bookingItr = bookingChart.iterator();
		if(bookingChart.isEmpty()){
			System.out.println("There is no reservation");
		}
		else{
			while(bookingItr.hasNext()){
				String[] bookingTemp = ((String)bookingItr.next()).split(",");
				if(trainNumber.equalsIgnoreCase(bookingTemp[0])){
					System.out.println(bookingTemp[0]+"\t\t"+bookingTemp[1]+"\t\t"+bookingTemp[2]);
					
				}
				else{
					System.out.println("Chart not found for the requested train number");
					
				}
			}
		}
		
		displayMenu();
		
	}
	
	

}
