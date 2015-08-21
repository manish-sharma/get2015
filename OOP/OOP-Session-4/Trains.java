/*
 * This class display the trains according to the user
 * @Banwari
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Trains {
	final String TRAIN_LIST="C://Users/Banwari/workspace/OOP-session-3/src/trainInfo.txt";
	// this method display all  trains available
	void totalTrains() {
                 System.out.println("\nList of available trains and Availability of seats:  \n");
		         System.out.println("TrainNo., Type, Name, From, To, Dept.Time, JourneyDuration, AvailableSeats/Weights(Kg) ");
		 
		     try {
			       FileReader fr = new FileReader(TRAIN_LIST);
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
    	
    	           FileReader fr = new FileReader(TRAIN_LIST);
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
	
	
	

}
