import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




public class TrainInfo {
	static String passengerTrainFileName = "C:/Users/Ankur/Desktop/PassengerTrainInfo.txt";//static passenger train list
	static String goodsTrainFileName = "C:/Users/Ankur/Desktop/GoodsTrainInfo.txt";//static goods train list
	Reservation reservationObject = new Reservation();
	
	/**
	 * this method is used to read the file
	 * @param fileName stores the file location
	 * @return returns the list of train in the file
	 * @throws IOException
	 */
	List<String> readTrainInfo(String fileName) throws IOException
	{
		String line  =null;
		List<String> trainInfo = new ArrayList<String>();
		try{  
		    FileReader	fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) != null){
				trainInfo.add(line);
			}
			bufferedReader.close();
		}
		catch (FileNotFoundException ex) {
				// TODO: handle exception
				 System.out.println("Unable to open file '" +  fileName + "'");
				readTrainInfo(fileName);
		}
		catch (IOException ex) {
				// TODO: handle exception
				readTrainInfo(fileName);
		}
		return trainInfo;
	}
	
	/**
	 * This method is used to make the reservation if the ticket is available
	 * @param trainType stores train type
	 * @param trainInfo stores the information of the train
	 * @param trainNumber store train number
	 * @param numberOfTickets store number of tickets
	 * @return
	 * @throws IOException
	 */
	
	int[] makeReservation(String trainType,List<String> trainInfo,String trainNumber,int numberOfTickets) throws IOException
	{
		Iterator reservationItr = trainInfo.iterator();
		int[] bookingDetail = new int[2];
		int count = 0;
		while(reservationItr.hasNext()){
			String[] reservationTemp = ((String)reservationItr.next()).split(",");//splitter
			if(trainNumber.equalsIgnoreCase(reservationTemp[0]) && numberOfTickets<=Integer.parseInt(reservationTemp[3])){
				int temp = Integer.parseInt(reservationTemp[3])-numberOfTickets;
				bookingDetail[1] = Integer.parseInt(reservationTemp[2]);
				int totalAmount = bookingDetail[1]*numberOfTickets;
				if(makePayment(totalAmount)){
					trainInfo.set(count,reservationTemp[0]+","+reservationTemp[1]+","+reservationTemp[2]+","+temp+","+reservationTemp[4]);
					
					//trainInfo.remove(count);
					//trainInfo.add(reservationTemp[0]+","+reservationTemp[1]+","+reservationTemp[2]+","+temp+","+reservationTemp[4]);
					bookingDetail[0] = 1;
					
					
				}
				 
				
			}
			count++;
			
		}
		if(bookingDetail[0] == 0){
			System.out.println("The number of tickets you have entered are not available");
			reservationObject.checkAvailability(readTrainInfo(passengerTrainFileName),readTrainInfo(goodsTrainFileName));
			
		}
		return bookingDetail;
		}
	
	/**
	 * this method is used to make the payment
	 * @param totalAmount total amount which is to be paid
	 * @return
	 */
	boolean makePayment(int totalAmount){
		
		System.out.println("Select Payment Method");
		System.out.println("1 for Credit/Debit Card");
		System.out.println("2 for Cash");
		System.out.println("3 for Net Banking");
		System.out.println("0 to cancel booking");
		
		List<String> paymentDetail = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		
		switch (userInput) {
		
		case 1 ://read the credit card detail
			System.out.println("Please Enter 16 Digit Card Number");
			paymentDetail.add(sc.next());
			System.out.println("Enter CVV number");
			paymentDetail.add(sc.next());
			break;
		case 2 ://read the cash detail
			System.out.println("Total Amount to be paid " +totalAmount );
			break;
		case 3://read net banking detail
			System.out.println("Enter bank name");
			paymentDetail.add(sc.next());
			System.out.println("Enter user name");
			paymentDetail.add(sc.next());
			System.out.println("Enter your password");
			paymentDetail.add(sc.next());
			break;

		default:
			break;
		}
		return true;
	}

}
