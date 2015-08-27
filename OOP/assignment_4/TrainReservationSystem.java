/*
 * This is a Train Reservation System Console Application

 */
package assignmentOOP_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.lang.StringUtils;

public class TrainReservationSystem 
{
	ArrayList<Train> trainArrayList=new ArrayList<Train>();
	ArrayList<Train> RefinedtrainList=new ArrayList<Train>();;
	
	/*
	 * Below function is used to read list of trains from text file make a object of them and create a arraylist
	 */
	public void readTrainChart()
	{
		try
		{
			String line = "";
	        BufferedReader	brTrain = new BufferedReader(new FileReader("C:\\Users\\Neha\\workspace\\assignmentOOP_3\\src\\TrainChart.txt"));
			while ((line = brTrain.readLine()) != null&& StringUtils.isNotEmpty(line)) // read Trains from text  file
														
			{
				String[] lineArray = line.split(","); // use comma as separator
				String trainType = lineArray[0].trim();
				String trainId = lineArray[1].trim();
				String trainName = lineArray[2].trim();
				String trainFrom = lineArray[3].trim();
				String trainTO = lineArray[4].trim();
				int trainFare = Integer.parseInt(lineArray[5].trim());
				int trainDuration = Integer.parseInt(lineArray[6].trim());
				int trainAvailability = Integer.parseInt(lineArray[7].trim());
				if(trainType.equals(TrainType.PASSENGER.toString())){
					trainArrayList.add(new PassengerTrain(trainId,trainName,trainFrom,trainTO,trainFare,trainDuration,trainAvailability));	
				} else {
					trainArrayList.add(new GoodsTrain(trainId,trainName,trainFrom,trainTO,trainFare,trainDuration,trainAvailability));
				}
				 
				
			}
			brTrain.close();
			//showTrainList(trainArrayList);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	
	/*
	 * Below code is to show the list of available trains
	 */
	
	
	
	public void showTrainList(ArrayList<Train> list)
	{
		
		System.out.println("\n\nTYPE  ID    Name                 Source   Destination   Duration    Fare        availablility");
		for (int i = 0; i < list.size(); i++) {
				Train st = list.get(i);
				if(st instanceof PassengerTrain){
					System.out.printf("%-4s ",TrainType.PASSENGER.toString());
				} else if(st instanceof GoodsTrain){
					System.out.printf("%-4s ",TrainType.GOODS.toString());
				}
				System.out.printf("%-5s %-20s %-8s %-14s %-10s %-13s",st.getTrainID(),st.getTrainName(),st.getTrainFrom(),
						st.getTrainTo(),st.getTrainDuration(),st.getTrainFare());
				if(st instanceof PassengerTrain){
					System.out.printf("%-4s ",((PassengerTrain) st).getAvailableSeat());
				} else if(st instanceof GoodsTrain){
					System.out.printf("%-4s ",((GoodsTrain) st).getAvailableWeight());
				}
				
				System.out.println();
			}
	}
	
	
	
	
	/*
	 * below function is used display list of trains on the basis of their type.
	 */
	public void displayByType(String type)
	{
		System.out.println("ID    Name                 Source   Destination   Duration    Fare        availablility");
		for (int i = 0; i < trainArrayList.size(); i++) {
			Train st = trainArrayList.get(i);
			if(type.equalsIgnoreCase("P"))
			{
				if(st instanceof PassengerTrain)
			       {
		              	System.out.printf("%-5s %-20s %-8s %-14s %-10s %-13s",st.getTrainID(),st.getTrainName(),st.getTrainFrom(),
				     	st.getTrainTo(),st.getTrainDuration(),st.getTrainFare());
		              	System.out.printf("%-4s ",((PassengerTrain) st).getAvailableSeat());
		              	System.out.println();
		        	}
				
			}
			else if(type.equalsIgnoreCase("G"))
			{
				if(st instanceof GoodsTrain)
			       {
		              	System.out.printf("%-5s %-20s %-8s %-14s %-10s %-13s",st.getTrainID(),st.getTrainName(),st.getTrainFrom(),
				     	st.getTrainTo(),st.getTrainDuration(),st.getTrainFare());
		              	System.out.printf("%-4s ",((GoodsTrain) st).getAvailableWeight());
		              	System.out.println();
		        	}
				
			}
		}
	}
	
	
	
	
	/*
	 * below code is to search train on the basis of type of train and filter result and save them in refined array list
	 */
	public boolean searchTrainByType(String typeEnteredByUser)
		{
		try
		{
			ArrayList<Train> RefinedtrainList1 = new ArrayList<Train>();
	    	if(typeEnteredByUser.equalsIgnoreCase(TrainType.PASSENGER.toString()))
			{
				for (int i = 0; i < trainArrayList.size(); i++) 
				{
					Train st = trainArrayList.get(i);
					if(st instanceof PassengerTrain)
						RefinedtrainList1.add(st);
				}
	    	}
			else if(typeEnteredByUser.equalsIgnoreCase(TrainType.GOODS.toString()))
			{
				for (int i = 0; i < trainArrayList.size(); i++) 
				{
					Train st = trainArrayList.get(i);
					if(st instanceof GoodsTrain)
						RefinedtrainList1.add(st);
				}
			}
			else
				return false;
	    	    RefinedtrainList=RefinedtrainList1;
				showTrainList(RefinedtrainList);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			return true;
	}
	
	
	
	/*
	 * below code is to search train on the basis of source station and destination station and filter result and save them in refined array list
	 */
	public boolean searchByStation(String sourceStation,String destinationStation)
	{
		ArrayList<Train> RefinedtrainList1 = new ArrayList<Train>();
		boolean temp=false;
		try
		{
			for (int i = 0; i < RefinedtrainList.size(); i++) 
				{
					Train st = RefinedtrainList.get(i);
					if(st.getTrainFrom().equalsIgnoreCase(sourceStation)&&st.getTrainTo().equalsIgnoreCase(destinationStation))
					{
						temp=true;
						RefinedtrainList1.add(st);
					}
				}
				RefinedtrainList=RefinedtrainList1;
				if(temp)
					showTrainList(RefinedtrainList);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return temp;
		
	}
	
	
	
	
	/*
	 * below code is to search train on the basic of train type and available vacancy and filter result and save them in refined array list
	 */
	public boolean searchTrainByIdAndVacancy(String trainID,int desiredSeatOrWeight)
	{
		ArrayList<Train> RefinedtrainList1 = new ArrayList<Train>();
		boolean temp=false;
		try
		{
			for (int i = 0; i < RefinedtrainList.size(); i++) 
				{
					Train st = RefinedtrainList.get(i);
					if(st instanceof PassengerTrain)
					{
						
					if(st.getTrainID().equalsIgnoreCase(trainID)&&((PassengerTrain) st).getAvailableSeat()>=desiredSeatOrWeight)
					{
						temp=true;
						RefinedtrainList1.add(st);
					}
					}
					else if(st instanceof GoodsTrain)
					{
						if(st.getTrainID().equalsIgnoreCase(trainID)&&((GoodsTrain) st).getAvailableWeight()>=desiredSeatOrWeight)
						{
							temp=true;
							RefinedtrainList1.add(st);
						}
						
					}
				}
				RefinedtrainList=RefinedtrainList1;
				if(temp)
					showTrainList(RefinedtrainList);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return temp;
	}
	
	
	
	
	/*
	 * Below code is to print the ticket details
	 */
	public void printTicketDetails(String nameOfUser,int desiredSeatOrWeight)
	{
		Train st = RefinedtrainList.get(0);
		System.out.println("\n\nBooked Ticket Deatails");
		System.out.println("Username                      "+nameOfUser);
	    System.out.println("Train ID                      "+st.getTrainID());
	    System.out.println("Train Name                    "+st.getTrainName());
	    System.out.println("Number of Booked Seats/weight "+desiredSeatOrWeight);
	    System.out.println("Paid Amount is                "+st.getTrainFare()*desiredSeatOrWeight);	
		
	}
	
	
	/*
	 * below function is used for make payment when user reserve a seat/weight in train.
	 
	 */
	public void payment(String nameOfUser,int desiredSeatOrWeight)
	{
		Train st = RefinedtrainList.get(0);
		int rate=st.getTrainFare();
		System.out.println("\n\nPlease select the payment mode");
		System.out.println("1.Credit Card+\n2.Wallet\n3.Net Banking");	
	    Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
	    PaymentMethod paymentMethod;
	    switch(choice)
	    {
	    	case 1:
	    		paymentMethod=new creditCard();
	    		paymentMethod.makePayment(desiredSeatOrWeight, rate);
	    			break;
	    	case 2:
	    		paymentMethod=new wallet();
	    		paymentMethod.makePayment(desiredSeatOrWeight, rate);
	    		break;
	    	case 3:
	    		paymentMethod=new netBanking();
	    		paymentMethod.makePayment(desiredSeatOrWeight, rate);
	    		break;
	    	default:
	    		System.out.println("Invalid choice");	
	    			
	    }
	    if(choice==1||choice==2||choice==3)
	    {
	    	printTicketDetails(nameOfUser,desiredSeatOrWeight);
	    	updateTrainChart(desiredSeatOrWeight);
	    }
		
	}
	
	
	/*
	 * below code is use to update train chart 
	 */
	public void updateTrainChart(int desiredSeatOrWeight)
	{
		Train st = RefinedtrainList.get(0);
		for (int i = 0; i < trainArrayList.size(); i++) 
		{
			Train st1=trainArrayList.get(i);
			if(st1.getTrainID().equals(st.getTrainID())){
				if(st1 instanceof PassengerTrain){
					trainArrayList.set(i, new PassengerTrain(st1.getTrainID(),st1.getTrainName(),st1.getTrainFrom(),st1.getTrainTo(),st1.getTrainDuration()
							,st1.getTrainFare(),((PassengerTrain) st1).getAvailableSeat()-desiredSeatOrWeight));		
				} else if (st1 instanceof GoodsTrain){
					trainArrayList.set(i, new GoodsTrain(st1.getTrainID(),st1.getTrainName(),st1.getTrainFrom(),st1.getTrainTo(),st1.getTrainDuration()
							,st1.getTrainFare(),((GoodsTrain) st1).getAvailableWeight()-desiredSeatOrWeight));
				}
			}
			
			
		}
		
	}
	
	/*
	 * below code is to used to whole booking of train and seat.
	 */
	public void booking()
	{
		try
		{
			Scanner scanner = new Scanner(System.in);
			
			String sourceStation="",destinationStation="";
			String nameOfUser="";
			String typeEnteredByUser="";
			String answer="yes";
			String trainID="";
			int desiredSeatOrWeight=0;
	
			showTrainList(trainArrayList);
			System.out.println("\n\nEnter Your  Name");
		    nameOfUser=scanner.next();
			System.out.println("Enter the  train type Passenger/Goods (P/G)");
			typeEnteredByUser=scanner.next();
			Boolean temp=searchTrainByType(typeEnteredByUser);
	
		    if(temp)
		    {
		    	System.out.println("\n\nEnter Source Station");
		    	sourceStation=scanner.next();
		    	System.out.println("Enter Destination Station");
		    	destinationStation=scanner.next();
		    	boolean temp1=searchByStation(sourceStation,destinationStation);
		    	if(temp1)
		    	{
		        	
		        	System.out.println("\n\nEnter Train ID");
		        	trainID=scanner.next();
		        	System.out.println("Enter Seat (if Passenger)/Weight (if Goods)");
		        	desiredSeatOrWeight=scanner.nextInt();
		        	Boolean temp2=searchTrainByIdAndVacancy(trainID,desiredSeatOrWeight);
		        	if(temp2)
		        	{
		        		payment(nameOfUser,desiredSeatOrWeight);
		        		
		        	}
		        	else
		        	{
		        		System.out.println("No result Found");
		        	}
		    	}
		    	else
		    	{
		    		System.out.println("No result Found");
		    		
		    	}
		    }
		    else
		    {
		    	System.out.println("No result Found");
		    }
		  
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

