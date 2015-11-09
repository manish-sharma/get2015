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
	ArrayList<Train> trainArrayList = new ArrayList<Train>();
	ArrayList<Train> RefinedtrainList = new ArrayList<Train>();
	
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
				trainArrayList.add(new Train(trainType,trainId,trainName,trainFrom,trainTO,trainFare,trainDuration,trainAvailability)); 
				
			}
			brTrain.close();
			
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
		System.out.println("Type ID    Name                 Source   Destination   Duration    Fare        availablility");
		for (int i = 0; i < list.size(); i++) {
				Train st = list.get(i);
				System.out.printf("%-4s %-5s %-20s %-8s %-14s %-10s %-13s %-7s ",st.getTrainType(),st.getTrainID(),st.getTrainName(),st.getTrainFrom(),
						st.getTrainTo(),st.getTrainDuration(),st.getTrainFare(),st.getAvailability());
				System.out.println();
			}
	}
	
	
	/*
	 * below code is to search train on the basis of type of train and filter result and save them in refined array list
	 */
	public boolean searchTrainByType(String typeEnteredByUser)
		{
		try
		{
	    	if(typeEnteredByUser.equalsIgnoreCase("P"))
			{
				for (int i = 0; i < trainArrayList.size(); i++) 
				{
					Train st = trainArrayList.get(i);
					if(st.getTrainType().equalsIgnoreCase("P"))
						RefinedtrainList.add(st);
				}
	    	}
			else if(typeEnteredByUser.equalsIgnoreCase("G"))
			{
				for (int i = 0; i < trainArrayList.size(); i++) 
				{
					Train st = trainArrayList.get(i);
					if(st.getTrainType().equalsIgnoreCase("G"))
						RefinedtrainList.add(st);
				}
			}
			else
				return false;
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
					if(st.getTrainID().equalsIgnoreCase(trainID)&&st.getAvailability()>=desiredSeatOrWeight)
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
	 * below code is use to update train chart 
	 */
	public void updateTrainChart(int desiredSeatOrWeight)
	{
		Train st = RefinedtrainList.get(0);
		for (int i = 0; i < trainArrayList.size(); i++) 
		{
			Train st1=trainArrayList.get(i);
			if(st1.getTrainID().equals(st.getTrainID()))
				trainArrayList.set(i, new Train(st1.getTrainType(),st1.getTrainID(),st1.getTrainName(),st1.getTrainFrom(),st1.getTrainTo(),st1.getTrainDuration()
				,st1.getTrainFare(),st1.getAvailability()-desiredSeatOrWeight));
			
		}
		
	}
	
	//public void add train train in list
	
	public static void main(String args[])
	{
		try
		{
			Scanner scanner = new Scanner(System.in);
			TrainReservationSystem trainReservationSystem=new TrainReservationSystem();
			String sourceStation="",destinationStation="";
			String nameOfUser="";
			String typeEnteredByUser="";
			String answer="yes";
			String trainID="";
			int desiredSeatOrWeight=0;
			
			trainReservationSystem.readTrainChart();
			
		
	        
			do{
				trainReservationSystem.showTrainList(trainReservationSystem.trainArrayList);
			
			System.out.println("\n\nEnter Your  Name");
		    nameOfUser=scanner.next();
			System.out.println("Enter the  train type Passenger/Goods (P/G)");
			typeEnteredByUser=scanner.next();
			Boolean temp=trainReservationSystem.searchTrainByType(typeEnteredByUser);
	
		    if(temp)
		    {
		    	System.out.println("\n\nEnter Source Station");
		    	sourceStation=scanner.next();
		    	System.out.println("Enter Destination Station");
		    	destinationStation=scanner.next();
		    	boolean temp1=trainReservationSystem.searchByStation(sourceStation,destinationStation);
		    	if(temp1)
		    	{
		        	
		        	System.out.println("\n\nEnter Train ID");
		        	trainID=scanner.next();
		        	System.out.println("Enter Seat (if Passenger)/Weight (if Goods)");
		        	desiredSeatOrWeight=scanner.nextInt();
		        	Boolean temp2=trainReservationSystem.searchTrainByIdAndVacancy(trainID,desiredSeatOrWeight);
		        	if(temp2)
		        	{
		        		System.out.println("\n\nPlease select the payment mode");
		        		System.out.println("1.Credit Card+\n2.Wallet\n3.Net Banking");	
		        	    int choice=scanner.nextInt();
		        	    switch(choice)
		        	    {
		        	    	case 1:
		        	    		System.out.println("\n\nPlease enter credit card Number and cvv number");
		        	    			int ccNumber=scanner.nextInt();
		        	    			int cvv=scanner.nextInt();
		        	    			break;
		        	    	case 2:
		        	    		break;
		        	    	case 3:
		        	    		System.out.println("\n\nPlease enter Bank name");
		        	    		String bankName=scanner.next();
		        	    		System.out.println("Please enter username");
		        	    		String userName=scanner.next();
		        	    		System.out.println("Please enter Password");
		        	    		String password=scanner.next();
		        	    		break;
		        	    	default:
		        	    		System.out.println("Invalid choice");	
		        	    			
		        	    }
		        	    if(choice==1||choice==2||choice==3)
		        	    {
		        	    	trainReservationSystem.printTicketDetails(nameOfUser,desiredSeatOrWeight);
		        	    	trainReservationSystem.updateTrainChart(desiredSeatOrWeight);
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
		    else
		    {
		    	System.out.println("No result Found");
		    }
		    System.out.println("Do u want to continue(Press yes for continue)");
		    answer=scanner.next();
			}while(answer.equalsIgnoreCase("yes"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

