package TrainReservationSystemConsoleApplication;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PassengerTrain extends Train {
	
		
	int bookedSeat;
	int availableseat;
	public static String line="";
	public static String location="C:/Users/Nikhil/Desktop/trainDetails.txt";
	public static List<PassengerTrain> question=new ArrayList<PassengerTrain>();
	
	public PassengerTrain()
	{}
	
	public PassengerTrain(int trainNumber,String trainName,String source,String destination,String travelTime,int availableseat,int rate) 
	{
		super(trainNumber, trainName, source, destination, travelTime, rate);
	    this.availableseat=availableseat;
	 }
	/**
	 * readQuestions is a function which is used to read the input from trainDetails file a,make object and store in list
	 *  
	 */
	public  List<PassengerTrain> readQuestions()
	{  Console console=System.console();
		
	try
	{
		//Reading the questions stored in the csv file
		BufferedReader br=new BufferedReader(new FileReader(location));
		while((line=br.readLine())!=null)
		{
			String[] token=line.split(",");
			//Questions are added in the list of string type
			question.add(new PassengerTrain(Integer.parseInt(token[0]),token[1],token[2],token[3], token[4],Integer.parseInt(token[5]),Integer.parseInt(token[6])));
		}
		br.close();
	}
	catch(FileNotFoundException e)
	{
		System.out.println(e);

	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	return question;


}
	/**
	 *SourceDestination is a function which is reduce the object according to source and destination
	 *  
	 */
	public List<PassengerTrain> SourceDestination(String Source,String Destination,List<PassengerTrain> passengerTrains)
	{     
		List<PassengerTrain> cropPassengerTrains=new ArrayList<PassengerTrain>();
		for(PassengerTrain train:passengerTrains)
	
		     {   {if(train.source.equalsIgnoreCase(Source) && train.destination.equalsIgnoreCase(Destination))
		    	   cropPassengerTrains.add(train);
		         
		          }
		    	 
		     }		
		return cropPassengerTrains;
			
	}
	/**
	 *Printdetail is function which is used to print train detail of passenger train
	 *  
	 */
	public void Printdetail(List<PassengerTrain> passengerTrains)
     { 
		 System.out.println("Train Numbaer   train name   source  destination  durationTime   availableseat  fare");
     
    	 {
    		 for(PassengerTrain passengerTrain:passengerTrains)
    	     System.out.println(passengerTrain.trainNumber+"     "+passengerTrain.trainName+"     "+passengerTrain.source+"     "+passengerTrain.destination+"   "+passengerTrain.travelTime+"    "+passengerTrain.availableseat+"   "+passengerTrain.rate);
    	 
    	 }
     }
	/**
	 *SearchForAvailableseat is function which is used to Search seat in a passenger train  
	 *  
	 */
	 public boolean SearchForAvailableseat(int tainno,int seat,List<PassengerTrain> passengerTrains,Ticket ticket)
         {   
        	 boolean flag=false;
        	for(int count=0;count<passengerTrains.size();count++)
        		 {if(passengerTrains.get(count).trainNumber==tainno)
                   {
        			 
            	      if(passengerTrains.get(count).availableseat>=seat)
            	    	  {
            	    	  passengerTrains.get(count).availableseat-=seat;
            	    	  
            	    	  flag=true;
            	    	   ticket.setFare(passengerTrains.get(count).rate);
            	    	  }
            	      else
            	    	  System.out.print("Sorry doesn't have enough seats please select another train");
            	                  	      
                   }
        	 
              }
    		   return flag;
         }

	
	
}
	


