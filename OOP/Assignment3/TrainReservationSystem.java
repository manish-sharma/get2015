// Program to make train reservation system
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Train
{
	String trainName;
	String trainFromTo;
	String trainType;
	String trainCost;
	String trainSeatsOrWeight;
	String trainDuration;
	
	public Train ( String trainName, String trainFromTo, String trainType, String trainCost, String trainSeatsOrWeight, String trainDuration ) 
	{
		this.trainName = trainName ;
		this.trainFromTo = trainFromTo ;
		this.trainType = trainType ;
		this.trainCost = trainCost ; 
		this.trainSeatsOrWeight = trainSeatsOrWeight ;
		this.trainDuration = trainDuration;
	}
}


class Passenger
{
	String passengerName;
	int seatsBooked;
	
	public Passenger()
	{}
}


class Payment
{
	String ccNumber;
	String cvv;
	String bank;
	String userName;
	String password;
	
	public Payment ( String ccNumber, String cvv)    // works in case of credit card
	{
		this.ccNumber = ccNumber;
		this.cvv = cvv;
	}
	
	public Payment ( String bank, String userName, String password)   // works in case of net banking
	{
		this.bank = bank;
		this.userName = userName;
		this.password = password;
	}
	
}


public class TrainReservationSystem 
{
	
	// bubble sort for sorting train list according to duration
	static void bubbleSort ( ArrayList<Train> trainList)
	{
		for ( int index = 0; index<trainList.size() ; index++)
		{
			for ( int index1 = 0; index1<trainList.size()-1 ; index1++)
			{
				if ( Integer.parseInt(trainList.get(index1).trainDuration) > Integer.parseInt(trainList.get(index1+1).trainDuration) )
				{
					Train tempObj = trainList.get(index1);
					trainList.set(index1,trainList.get(index1+1)) ;
					trainList.set(index1+1,tempObj);
				}
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		int index ;
		Scanner sc = null;
		InputStream in = null;
		BufferedReader reader = null;
		String filePath = "C://Users/Kajal/workspace/Assignment7/src/";
		
		ArrayList<Train> trainList = new ArrayList<Train>();
		ArrayList<Train> trainListFinal = new ArrayList<Train>();
		
		Passenger passengerObj = new Passenger();
		
		sc = new Scanner(System.in);
        
		// reads all train's info from file & stores them in a list = trainList
		try
		{	
			in = new FileInputStream( new File(filePath + "train.txt"));  
			reader = new BufferedReader (new InputStreamReader(in));
			String line;
			index = 0;
			while((line = reader.readLine())!= null)
			{  
	        	String arr[] = line.split(",");
	        	
	        	String trainName1 = arr[0];
	        	String trainSeatsOrWeight1 = arr[1];
	        	String trainFromTo1 = arr[2];
	        	String trainCost1 = arr[3];
	        	String trainDuration1 = arr[4];
	        	String trainType1 = arr[5];
	        	trainList.add ( new Train ( trainName1, trainFromTo1, trainType1, trainCost1, trainSeatsOrWeight1, trainDuration1 ) );
	        }
			in.close();
			reader.close();
		}
		catch( Exception ex )
		{
			ex.printStackTrace();
		}
		
		// bubble sort for sorting train list according to duration
		bubbleSort (trainList);    
		
		// takes multiple users for booking
		char ch = 'y';
		while ( ch=='Y' ||ch=='y' )
		{
			System.out.println("\n\nEnter your name");
			passengerObj.passengerName = sc.next();
			
			System.out.println("\n\nEnter Train Type  -  Passenger/Goods (P/G)");
			String trainType = sc.next();
			
			System.out.println("\n\nThe available trains : \nTrain Name\tTrain Fare\tTrain Duration\tTrain Seat/Weight\tTrain fron-to\tTrain Type");
			// sorts train list according to entered train type and places final selected trains in a new list
			for ( Train trainObj : new ArrayList<>(trainList) )
			{
				if ( trainObj.trainType.equals(trainType+".."))
				{	
					System.out.println (trainObj.trainName+"\t\t"+trainObj.trainCost+"\t\t"+trainObj.trainDuration+"\t\t"+trainObj.trainSeatsOrWeight+"\t\t"+trainObj.trainFromTo+"\t\t"+trainObj.trainType) ;
					trainListFinal.add(new Train (trainObj.trainName, trainObj.trainFromTo, trainObj.trainType, trainObj.trainCost, trainObj.trainSeatsOrWeight, trainObj.trainDuration) );
					trainList.remove(trainObj);
				}
			}
			
			
			System.out.println("\n\nPlease enter from-to Station");
			String fromToStation = sc.next();
				
			System.out.println("\n\nThe available trains : \nTrain Name\tTrain Fare\tTrain Duration\tTrain Seat/Weight");
			// sorts train list according to entered train from-to station and places final selected trains in a new list & rejected trains back to previous list
			for ( Train trainObj : new ArrayList<>(trainListFinal) )
			{
				if ( trainObj.trainFromTo.equals(fromToStation))
					System.out.println (trainObj.trainName+"\t\t"+trainObj.trainCost+"\t\t"+trainObj.trainDuration+"\t\t"+trainObj.trainSeatsOrWeight) ;
				else
				{
					trainListFinal.remove(trainObj);
				    trainList.add(trainObj);
				}
			}
			
			
			System.out.println("\n\nPlease enter Train name");
			String trainName = sc.next();
			System.out.println("Enter Seat (if Passenger)/Weight (if Goods)");
			int seatOrWeight = sc.nextInt();
			
			System.out.println("\n\nThe available train : \nTrain Name\tTrain Fare\tTrain Duration\tTrain Seat/Weight");
			// sorts train list according to entered train name and weight/seat and then places final selected trains in a new list & rejected trains back to previous list
			for ( Train trainObj : new ArrayList<>(trainListFinal) )
			{
				if ( trainObj.trainName.equals(trainName))
				{
					if ( Integer.parseInt(trainObj.trainSeatsOrWeight) > seatOrWeight)
					{
						passengerObj.seatsBooked = seatOrWeight ;
						trainObj.trainSeatsOrWeight = ""+( Integer.parseInt(trainObj.trainSeatsOrWeight) - seatOrWeight );
						System.out.println (trainObj.trainName+"\t\t"+trainObj.trainCost+"\t\t"+trainObj.trainDuration+"\t\t"+trainObj.trainSeatsOrWeight) ;
					}
					else if ( Integer.parseInt(trainObj.trainSeatsOrWeight) < seatOrWeight)
					{	
						System.out.println ("Sorry, Seats are unavailable");
						System.exit(0);   
					}				
				}
				else
				{
					trainListFinal.remove(trainObj);
					trainList.add(trainObj);
				}
			}
			
            
			// does payment 
			Payment paymentObj;
			String paymentMethod [] = {"Credit_Card", "Wallet", "Net_Banking"};
			System.out.println("\n\nPlease enter payment method [ Credit_Card / Wallet / Net_Banking] ");
			String paymentType = sc.next();
			if ( paymentType.equals(paymentMethod[0]))        // for credit card
			{
				System.out.println ("\n\nEnter your ccNumber");
				String ccNumber = sc.next();
				System.out.println ("\n\nEnter your ccNumber");
				String cvv = sc.next();
				paymentObj = new Payment ( ccNumber, cvv) ;
			}
			else if ( paymentType.equals(paymentMethod[2]))    //  for net banking
			{
				System.out.println ("\n\nEnter your Bank");
				String bank = sc.next();
				System.out.println ("\n\nEnter your username");
				String username = sc.next();
				System.out.println ("\n\nEnter your password");
				String password = sc.next();
				paymentObj = new Payment ( bank, username, password) ;
			}
			else
				System.out.println ("Processing the payment amt...");    // for wallet
			
			
			// generates train ticket
			for ( Train trainObj :  new ArrayList<>(trainListFinal))
			{
				System.out.println ("\n\nYour train ticket : \nUsername\tTrain Name\tNo. of seats/weight booked\tPaid amt");  
				System.out.println (passengerObj.passengerName+"\t\t"+trainObj.trainName+"\t\t"+passengerObj.seatsBooked + "\t\t\t\t" + trainObj.trainCost);
				trainList.add(trainObj);
				trainListFinal.remove(trainObj);
			}
			
			
			// generates updated train chart
			System.out.println ("\n\nUpdated train chart : \nTrain Name\tTrain Fare\tTrain Duration\tTrain Seat/Weight");
			bubbleSort (trainList);
			for ( Train trainObj : trainList )
			{
				System.out.println (trainObj.trainName+"\t\t"+trainObj.trainCost+"\t\t"+trainObj.trainDuration+"\t\t"+trainObj.trainSeatsOrWeight) ;
			}
			
			
			// if user wishes , booking continues
			System.out.println ("\nDo you want to book more trains ? [Y/N]");
			ch = sc.next().charAt(0);
		}
	}
}
