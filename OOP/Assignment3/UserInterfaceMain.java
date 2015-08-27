package trainreservation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/*Starting of UserInterface class*/
public class UserInterfaceMain
{
	/* Starting of main function */
	public static void main(String args[]) 
	{
		Payment paymentObj = new Payment();           // Object of Payment class
		UserInterfaceMain classObj = new UserInterfaceMain(); // object of current class
		BufferedReader bufferReaderObj = new BufferedReader(new InputStreamReader(System.in));   // Reading input from keyboard
		List<TrainDetail> trainList = null; 
		List<TrainDetail> filteredTrainList=null;
		List<TrainDetail> filteredTrainListNew=null;// List of TrainDetail class objects
		int trainType = 1;
		Train trainObj = new Train(); // Object of train class
		boolean flag = false;
		String source = "";
		String destination = "";
		System.out.print("Enter Your name: ");
		String passengerName =readString(bufferReaderObj);// read passenger
		do 
		{
			System.out.print("Enter Train Type:(1 for Passenger, 2 for Goods) ");
			try 
			{
				trainType = Integer.parseInt(bufferReaderObj.readLine()); // read for choice of train type
			} 
			catch (NumberFormatException nf)
			{
				System.out.println("You have entered a wrong choice: ");
				continue;
			} 
			catch (IOException io)
			{
				System.out.println("Error occured please enter again");
				continue;
			}
			if (trainType == 1 || trainType == 2)
				flag = true;
			else
			{
				System.out.println("You have entered a wrong choice: ");
				continue;
			}
		} while (!flag);
		trainList = trainObj.listTrain(trainType);
		classObj.printTrainList(trainList);
		System.out.print("Enter Source station: ");
		source = readString(bufferReaderObj); // enter source station
		System.out.print("Enter destination station: ");
		destination =readString(bufferReaderObj); // enter destination station 
		filteredTrainList = trainObj.filterList(source, destination);
		classObj.printTrainList(filteredTrainList);
		boolean repeat = true;
		int seats=0;
		 do{
			 System.out.print("Enter Train Number: ");
			 String trainNumber = readString(bufferReaderObj);				//enter train number
			 int trainExist=classObj.isTrainExist(filteredTrainList, trainNumber);
			 if(trainExist  == -1){
				 System.out.println("Wrong Train Number");
				 System.out.println("System will Halt Now....");
				 System.exit(1);
			 }
			 
			 else if(trainType == 1){
				 System.out.print("Enter total number of Passengers: ");
			 }
			 else{
				 System.out.print("Enter total weight: ");
			 }
			 do
			 {
				 try
				 {
					 seats = Integer.parseInt(bufferReaderObj.readLine());	 //enter total number of passenger
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
						 continue;
				 break;
			}while(true);
			 
			filteredTrainListNew=filteredTrainList;
			if(Integer.parseInt( filteredTrainListNew.get(trainExist).getSeatAvailable()) >= seats)
			{
				 paymentObj.checkout( filteredTrainListNew.get(trainExist), seats);
				 repeat = false;
			}
			else
			{
				 filteredTrainList= trainObj.filterList(filteredTrainListNew,seats);
				 classObj.printTrainList(filteredTrainList);
				 repeat = true;
			 }
		 	}while(repeat);
	}
	/* End of main function */
	
	/* Start of isTrainExist function */
	public final int isTrainExist(List<TrainDetail> trainListCheck, String trainNumber) { // check if selected train exist or not
																					 
		for (int counter = 0; counter < trainListCheck.size(); counter++) 
		{ 
			if (Integer.parseInt(trainListCheck.get(counter).getTrainNumber()) == Integer.parseInt(trainNumber)) 
				return counter;
		
		}
		return -1;//means train does not exist
	}
	/* End of isTrainExist function */
	
	/* Start of print train list function */
	public void printTrainList(List<TrainDetail> trainList) // print train list in a format
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
	
	public static String readString (BufferedReader bufferReaderObj)
	{
		boolean isCorrect=false;
		String input="";
		do
		{
			try
			{
				input=bufferReaderObj.readLine();
			}
			catch(IOException io)
			{
				System.out.print("Error occured please enter again");
				continue;
			}
			if(input.isEmpty())
			{	
				System.out.print("please enter alteast one character like a b c d or A B C D");
				continue;
			}
			isCorrect=true;
		}while(!isCorrect);
		
		return input;
		
	}
}
/* End of UserInterface class */

