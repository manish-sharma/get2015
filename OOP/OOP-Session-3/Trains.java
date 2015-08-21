/*
 * This class display the trains according to the user
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Trains {
	// this method display all  trains available
	void totalTrains() {
                 System.out.println("\nList of available trains and Availability of seats:  \n");
		         System.out.println("TrainNo., Type, Name, From, To, Dept.Time, JourneyDuration, AvailableSeats/Weights(Kg) ");
		 
		     try {
			       FileReader fr = new FileReader("C://Users/Banwari/workspace/OOP-session-3/src/trainInfo.txt");
			       BufferedReader br = new BufferedReader(fr);
			       String currentLine;
			      while( (currentLine=br.readLine())!=null ) {
				   System.out.println(currentLine);
			       }
			 }
		  catch(IOException e) {
			 e.printStackTrace();
		     }
	}
	/*
	 * This method will display trains of specific type
	 * @param ttype is the type of train whether it is good type or passenger type
	 */
	void totalTrains(String ttype) {
               System.out.println("\nList of available "+ttype+" trains and Availability of seats:  \n");

               System.out.println("TrainNo., Type, Name, From, To, Dept.Time, JourneyDuration, AvailableSeats");

               try {
    	
    	           FileReader fr = new FileReader("C://Users/Banwari/workspace/OOP-session-3/src/trainInfo.txt");
	               BufferedReader br = new BufferedReader(fr);
	               String currentLine;
	               while( (currentLine=br.readLine())!=null ) {
	   
	    	              String [] tokens = currentLine.split("\\s+");
		  
		                  if (tokens[1].equals(ttype))
		            	   System.out.println(currentLine);
		           
	               }
	 
               }
            catch(IOException e) {
	              e.printStackTrace();
            }
    }
	/*
	 * This method will display all trains between two specific stations
	 * @param source is the name of source station 
	 * @param destination is the name of destination station
	 */
	
	void betweenSourceToDestinationTrains(String source,String destination) {
		
		System.out.println("\nTrainNo., Type, Name, From, To, Dept.Time, JourneyDuration, AvailableSeats");

        try {
	
	           FileReader fr = new FileReader("C://Users/Banwari/workspace/OOP-session-3/src/trainInfo.txt");
               BufferedReader br = new BufferedReader(fr);
               String currentLine;
               boolean available= false;
              
               while( (currentLine=br.readLine())!=null ) {
                       String [] tokens = currentLine.split("\\s+");
	                   if (tokens[3].equalsIgnoreCase(source) && tokens[4].equalsIgnoreCase(destination) ) {
	            	           System.out.println(currentLine);
	            	           available=true;
	                   }
               }
              
              if(!available) {
            	  System.out.println("Regret !!!! Sorry Train is not available from "+source+" to "+destination);
              }
               

        }
     catch(IOException e) {
           e.printStackTrace();
     }
		
	}
	
	

}
