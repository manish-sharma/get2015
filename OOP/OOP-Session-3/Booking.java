/*
 * This class contains the methods for booking of seats or weights 
 * @author Banwari
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Booking {
	     /*
	      * this is method for reserve train seats or weights
	      * @param trainNumber is the number of trains in which booking have to be done
	      * @param seatOrWeightCount is the number of seats or weights to be reserved
	      * @param user is the User class object
	      */
	     void book(int trainNumber, int seatOrWeightCount,User user)  {
         	try {
         	 FileReader fr = new FileReader("C://Users/Banwari/workspace/OOP-session-3/src/trainInfo.txt");
              BufferedReader br = new BufferedReader(fr);
              String currentLine;
              //trainLine contains the sequence number of train in a list
              int trainLine=0;
              while( (currentLine=br.readLine())!=null ) {
                     trainLine++;
	                String [] tokens = currentLine.split("\\s+");

                     if ( Integer.parseInt(tokens[0]) == trainNumber ) {
                    	 
                    	 if(Integer.parseInt(tokens[7])>=seatOrWeightCount) {
                    		 int fare= seatOrWeightCount * Integer.parseInt(tokens[8]);
                    		 PaymentMode pm = new PaymentMode();
                    		 if(pm.payment(fare)) {
                    			 System.out.println("Payment Done of Rs "+fare);
                    			 FileHandle fh= new FileHandle();
                    			 fr.close();
                    			 br.close();
                    			 fh.updateTrainList(trainLine,currentLine,seatOrWeightCount);                			 
                    			 System.out.println("\nYour Booking is confirmed");
                    			 //Now you ticket is displayed
                    			 System.out.println("\n\n\t\t TICKET");
                    			 System.out.println("\tName: "+user.getName());
                    			 System.out.println("\tUserID: "+user.getUserId());
                    			 System.out.println("\tContact Number: "+user.getContactNumber());
                    			 System.out.println("\tTrain No. :"+tokens[0]);
                    			 System.out.println("\tNumber of Seats/Weights reserved: "+seatOrWeightCount);
                    			 System.exit(0);
                    		 }
                    	 }
                    	 else {
                    		 System.out.println("!!! Seats not available");
                    	 }
                    	 
                     }
              }

         }
         catch(IOException e) {
            e.printStackTrace();
         }
	   }
}
