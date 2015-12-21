package TrainReservationSystemConsoleApplication;
import java.io.BufferedReader;
import java.io.Console;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GoodTrain extends Train

{ 
    int availableweight;
 
    public static String line="";
    public static String location="C:/Users/Nikhil/Desktop/Goods.txt";
    public static List<GoodTrain> goodTrains=new ArrayList<GoodTrain>();
     	
   	public GoodTrain() {
		
		}
     	
   	public GoodTrain(int trainNumber,String trainName,String source,String destination,String travelTime,int availableWeigth,int rate) 
     	{
     		super(trainNumber, trainName, source, destination, travelTime, rate);
     	    this.availableweight=availableWeigth;
       	}
   	/**
	 * readQuestions is a function which is used to read the input from Goods file a,make object and store in list
	 *  
	 */
   	public  List<GoodTrain> readQuestions()
     	{ 
     	try
     	  {
     		//Reading the questions stored in the csv file
     		BufferedReader br=new BufferedReader(new FileReader(location));
     		while((line=br.readLine())!=null)
     		{
     			String[] token=line.split(",");
     			//Questions are added in the list of string type
     			goodTrains.add(new GoodTrain(Integer.parseInt(token[0]),token[1],token[2],token[3], token[4],Integer.parseInt(token[5]),Integer.parseInt(token[6])));
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
     	return goodTrains;


     }
     
   	/**
	 *SourceDestination is a function which is reduce the object according to source and destination
	 *  
	 */
    public List<GoodTrain> SourceDestinationp(String Source,String Destination,List<GoodTrain> goodTrains)
	    {  
     		List<GoodTrain> cropGoodTrains=new ArrayList<GoodTrain>();   
     		
	     for(GoodTrain train:goodTrains)
	     {
	    	 if(train.source.equalsIgnoreCase(Source) && train.destination.equalsIgnoreCase(Destination))
	    	   cropGoodTrains.add(train);
	    	 
	     }
		return cropGoodTrains;
	  }
	/**
	 *Printdetail is function which is used to print train detail of goods train
	 *  
	 */
    public void Printdetail(List<GoodTrain>goodTrains)
     { 
		 System.out.println("Train Numbaer   train name   source  destination  durationTime   availableWeigth   Fare");
     
    	 {
    		 for(GoodTrain goodTrain:goodTrains)
    	     System.out.println(goodTrain.trainNumber+"            "+goodTrain.trainName+"           "+goodTrain.source+"                "+goodTrain.destination+"               "+goodTrain.travelTime+"               "+goodTrain.availableweight+"           "+goodTrain.rate);
    	 
    	 }
     }
    /**
	 *SearchForAvailableseat is function which is used to Search seat in a goods train  
	 *  
	 */
	public boolean SearchForAvailableseat(int tainno,int weight,List<GoodTrain> goodTrains,Ticket ticket)
         {  boolean flag=false;
        	 
         for(GoodTrain train:goodTrains)
              { 
        	    if(train.trainNumber==tainno)
                   {       	    	
            	      if(train.availableweight>=weight)
            	    	  {
            	    	  train.availableweight-=weight;
            	    	   flag=true;
            	    	  ticket.setFare(train.rate);
            	    	  }
            	      else
            	    	  System.out.print("Sorry doesn't have enough seats please select another train");
            	                  	      
                   }
        	 
              }
    		   return flag;
         }

}
     	





