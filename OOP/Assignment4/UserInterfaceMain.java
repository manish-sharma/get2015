package com.metacube.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/*Starting of UserInterface class*/
public class UserInterfaceMain
{
	List<TrainDetail> trainList ;
	Train trainObj = new Train();
	/* Starting of main function */
	public static void main(String args[]) 
	{
		System.out.println("*****************Welcome To Train Reservation System*******************\n" );
			new ActionMain(); 
			
	}
	/* End of main function */
	
	public void reservation(int trainType)
	{
		
		
		List<TrainDetail> filteredTrainList=null;
		List<TrainDetail> filteredTrainListNew=null;
		String source = "";
		String destination = "";
		String contain="Passenger";
		String contain1="seats";
		if(trainType==2)
		{
			contain="Goods";
			contain1="space";
		}
		Payment paymentObj = new Payment(); 
		BufferedReader bufferReaderObj = new BufferedReader(new InputStreamReader(System.in));
		trainList = trainObj.listTrain(trainType);
		printTrainList(trainList);
		System.out.print("Enter Source station: ");
		source = readString(); 
		System.out.print("Enter destination station: ");
		destination =readString(); 
		filteredTrainList = trainObj.filterList(source, destination);
		if(filteredTrainList.size()==0) {
			System.out.println("No train are available for source "+source+" and destination"+destination);
			return ;
		}
		else
		{
			System.out.println("\n\tYour Train are listed according to Source "+source+" and Destination "+destination);
			printTrainList(filteredTrainList);
		}
		boolean repeat = true;
		int seats=0;
		do
		{
			 System.out.print("Enter Train Number: ");
			 String trainNumber = readString();				
			 int trainExist=isTrainExist(filteredTrainList, trainNumber);
			 if(trainExist  == -1)
			 {
				 System.out.println("Please enter valid train no");
				 continue;
			 }
			 System.out.print("Enter total : " +contain);
			 do
			 {
				 try
				 {
					 seats = Integer.parseInt(bufferReaderObj.readLine());	
				 }
				 catch(NumberFormatException nf)
				 {
					 System.out.println("Please enter correct no");
					 continue;
				 }
				 catch(IOException io)
				 {
					 System.out.println("Please enter correct no");
					 continue;
				 }
				 if(seats<=0)
				 {
					 	System.out.println("Please enter correct no");
					 	continue;
				 }
				 break;
			}while(true);
			filteredTrainListNew=filteredTrainList;
			if(Integer.parseInt( filteredTrainListNew.get(trainExist).getSeatAvailable()) >= seats)
			{
				 paymentObj.checkOut( filteredTrainListNew.get(trainExist), seats);
				 repeat = false;
			}
			else
			{
				System.out.println("train has not sufficient"+contain1+" you can select other trains");
				filteredTrainList= trainObj.filterList(filteredTrainListNew,seats);
				printTrainList(filteredTrainList);
				repeat = true;
			 }
		 	}while(repeat);
	}
	
	/* Start of isTrainExist function */
	public static final int isTrainExist(List<TrainDetail> trainListCheck, String trainNumber) { 
																					 
		for (int counter = 0; counter < trainListCheck.size(); counter++) 
		{ 
			if (Integer.parseInt(trainListCheck.get(counter).getTrainNumber()) == Integer.parseInt(trainNumber)) 
				return counter;
		
		}
		return -1;//means train does not exist
	}
	/* End of isTrainExist function */
	
	/* Start of print train list function */
	public void printTrainList(List<TrainDetail> trainList)
	{ 
		System.out.println("Train Number\tTrain Name\t\t\tTrain Type\tSource\t\tDestination\tDuration\tSeat Available");
		for (int rows = 0; rows < trainList.size(); rows++) 
		{
			TrainDetail tempTrainList = trainList.get(rows);
			System.out.print(tempTrainList.getTrainNumber() + "\t\t");
			System.out.print(tempTrainList.getTrainName() + "\t\t");
			System.out.print(tempTrainList.getTypeTrain() + "\t\t");
			System.out.print(tempTrainList.getSource() + "\t");
			System.out.print(tempTrainList.getDestination() + "\t\t");
			System.out.print(tempTrainList.getDuration() + "\t\t\t");
			System.out.println(tempTrainList.getSeatAvailable());
		}
	}
	/* End of print train list function */
	
	
	/*Read String from Keyboard*/
	public static String readString ()
	{
		BufferedReader bufferReaderOb=new BufferedReader(new InputStreamReader(System.in));
		boolean isCorrect = false;
		String input = "";
		do
		{
			try
			{
				input = bufferReaderOb.readLine().trim();
			}
			catch(IOException io)
			{
				System.out.print("Error occured please enter again");
				continue;
			}
			if(input.isEmpty())
			{	
				System.out.print("please enter valid input");
				continue;
			}
			isCorrect=true;
		} while ( ! isCorrect );
		
		
		return input.trim();
		
	}
	
	
}
/* End of UserInterface class */

