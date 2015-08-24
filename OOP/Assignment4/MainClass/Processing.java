package MainClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Processing
{
	List<String> str = new ArrayList<String>();
	
	// bubble sort for sorting train list according to duration
	void bubbleSort ( ArrayList<Train> trainList)
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
	
	
	
	// reads all train's info from file & stores them in a list = trainList
	ArrayList<Train> loadTrainListFromFile ( ArrayList<Train> trainList )
	{
		String filePath = "C://javaprg/eclipse/Assignment8/src/MainClass/" ; //"C://javaprg/eclipse/Assignment7/src/"   // "C://Users/Kajal/workspace/Assignment7/src/"
		InputStream in = null;
		BufferedReader reader = null;
		int index = 0;
		
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
		       	trainList.add ( new Train ( arr[0], arr[2], arr[5], arr[3], arr[1], arr[4] ) );
		    	}
			in.close();
			reader.close();
		}
		catch( Exception ex )
		{
			ex.printStackTrace();
		}
		return trainList;
	}
	
	
	// places train list according to entered train type in a new list
	ArrayList<Train> createNewListByTrainType ( String trainType, ArrayList<Train>trainList, ArrayList<Train>trainListFinal )
	{	
		for ( Train trainObj : new ArrayList<Train>(trainList) )
		{
			if ( trainObj.trainType.equals(trainType+".."))
			{
				trainListFinal.add(new Train (trainObj.trainName, trainObj.trainFromTo, trainObj.trainType, trainObj.trainCost, trainObj.trainSeatsOrWeight, trainObj.trainDuration) );
				trainList.remove(trainObj);
			}
		}
		return trainListFinal ;
	}
	
	
	// sorts train list according to entered train from-to station and places final selected trains in a new list & rejected trains back to previous list
	ArrayList<Train> createNewListByFromToStation ( String fromToStation, ArrayList<Train>trainList, ArrayList<Train>trainListFinal )
	{
		str.clear();
		for ( Train trainObj : new ArrayList<Train>(trainListFinal) )
		{
			if ( (trainObj.trainFromTo.equals(fromToStation)) == false )
			{
				trainListFinal.remove(trainObj);
			    trainList.add(trainObj);
			}
		}
		return trainListFinal ;
	}
	
	
	// sorts train list according to entered train name and weight/seat and then places final selected trains in a new list & rejected trains back to previous list
	ArrayList<Train> createNewListBySeatOrWeight ( String trainName, int seatOrWeight, ArrayList<Train>trainList, ArrayList<Train>trainListFinal )
	{
		Passenger passengerObj = new Passenger();
		str.clear();
		for ( Train trainObj : new ArrayList<Train>(trainListFinal) )
		{
			if ( trainObj.trainName.equals(trainName))
			{
				if ( Integer.parseInt(trainObj.trainSeatsOrWeight) > seatOrWeight)
				{
					passengerObj.setSeatsOrWeightBooked(seatOrWeight);
					trainObj.trainSeatsOrWeight = ""+( Integer.parseInt(trainObj.trainSeatsOrWeight) - seatOrWeight );
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
		return trainListFinal;
	}
	
	
	List<String> generateTrainTicket ( ArrayList<Train>trainList, ArrayList<Train>trainListFinal, Passenger passengerObj )
	{
		for ( Train trainObj :  new ArrayList<Train>(trainListFinal))
		{
			str.add (passengerObj.getPassengerName()+"\t\t"+trainObj.trainName+"\t\t"+passengerObj.getSeatsOrWeightBooked() + "\t\t\t\t" + (Integer.parseInt(trainObj.trainCost)*passengerObj.getSeatsOrWeightBooked()) ) ;
			trainList.add(trainObj);
			trainListFinal.remove(trainObj);
		}
		trainListFinal.clear();
		return str;
	}
	
	
	List<String> generateUpdatedTrainChart ( ArrayList<Train>trainList )
	{
		str.clear();
		bubbleSort (trainList);
		for ( Train trainObj : trainList )
		{
			str.add ( trainObj.trainName+"\t\t"+trainObj.trainCost+"\t\t"+trainObj.trainDuration+"\t\t"+trainObj.trainSeatsOrWeight ) ;
		}
		return str;
	}
	
}
