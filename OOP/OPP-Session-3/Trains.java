import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Trains {
	
	
	void totalTrains() {
                 System.out.println("\nList of available trains and Availability of seats:  \n");
		 
		         System.out.println("TrainNo., Type, Name, From, To, Dept.Time, JourneyDuration, AvailableSeats/Weights(Kg) \n");
		 
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
	
	
	void totalTrains(String ttype) {
               System.out.println("\nList of available "+ttype+" trains and Availability of seats:  \n");

               System.out.println("TrainNo., Type, Name, From, To, Dept.Time, JourneyDuration, AvailableSeats \n");

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
	
	
	void betweenSourceToDestinationTrains(String source,String destination) {
		
		System.out.println("\nTrainNo., Type, Name, From, To, Dept.Time, JourneyDuration, AvailableSeats \n");

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
