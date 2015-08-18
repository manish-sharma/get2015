/**
 * Class to read information and make reservation and payment
 * @author Sanjay Nainani
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
	public class TrainInfo {
		static String passengerTrainFileName = "C:/Users/Sanjay/Desktop/PassengerTrainInfo.txt";
		static String goodsTrainFileName = "C:/Users/Sanjay/Desktop/GoodsTrainInfo.txt";
		Reservation reservationObject = new Reservation();
		
		/**
		 * Method to read file for passenger train list and goods train list
		 * @param fileName = path of file for information of trains
		 * @return list of information of trains
		 * @throws IOException
		 */
		List<String> readTrainInfo(String fileName) throws IOException{
		String line = null;
	    List<String> TrainInfo = new ArrayList<String>();

	        try {
	            	FileReader fileReader = 
	                new FileReader(fileName);

	            	BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	            	TrainInfo.add(line);
	            }    

	            bufferedReader.close();            
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileName + "'"); 
	            readTrainInfo(fileName);
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileName + "'");   
	            readTrainInfo(fileName);
	            
	        }
	        return TrainInfo;
	}
	
	/**
	 * This method is used to do reservation in a train	
	 * @param trainType = passenger or goods
	 * @param trainInfo = list of information of train type
	 * @param trainNo = train number
	 * @param numberOfTickets = tickets to book
	 * @return booking details
	 * @throws IOException
	 */
	int[] makeReservation(String trainType, List<String> trainInfo, String trainNo, int numberOfTickets) throws IOException{
		Iterator reservationItr = trainInfo.iterator();
		int[] bookingDetail = new int[2];
		
		int count=0;
		while(reservationItr.hasNext()){
			String[] reservationTemp = ((String)reservationItr.next()).split(",");
			if(trainNo.equalsIgnoreCase(reservationTemp[0]) && numberOfTickets<=Integer.parseInt(reservationTemp[3])){
				int temp = Integer.parseInt(reservationTemp[3])-numberOfTickets;
				bookingDetail[1]=Integer.parseInt(reservationTemp[2]);
				int totalAmount = bookingDetail[1]*numberOfTickets;
				if(makePayment(totalAmount)){
					trainInfo.set(count,reservationTemp[0]+","+reservationTemp[1]+","+reservationTemp[2]+","+temp+","+reservationTemp[4]);
					bookingDetail[0]=1;
					
					
				}
				 
				
			}
			count++;
			
		}
		if(bookingDetail[0]==0){
			System.out.println("The number of tickets you have entered are not available");
			reservationObject.checkAvailability(readTrainInfo(passengerTrainFileName),readTrainInfo(goodsTrainFileName));
			
		}
		return bookingDetail;
	}
	
	/**
	 * method to make payment 
	 * @param totalAmount = total of reservation
	 * @return
	 */
	boolean makePayment(int totalAmount){
		System.out.println("Select Payment Method");
		System.out.println("1 for Credit/Debit Card");
		System.out.println("2 for Cash");
		System.out.println("3 for Net Banking");
		System.out.println("0 to cancel booking");
		
		List<String> paymentDetail = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		switch (userInput){
		case 1  :
			System.out.println("Please Enter 16 Digit Card Number");
			paymentDetail.add(scan.next());
			System.out.println("Enter CVV number");
			paymentDetail.add(scan.next());
			break;
		case 2 :
			System.out.println("Total Amount to be paid " +totalAmount );

			break;
		case 3:
			System.out.println("Enter bank name");
			paymentDetail.add(scan.next());
			System.out.println("Enter user name");
			paymentDetail.add(scan.next());
			System.out.println("Enter your password");
			paymentDetail.add(scan.next());
			break;
		}
		return true;
		
	}
		
		
}


