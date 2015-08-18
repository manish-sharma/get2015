import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Booking {
	
	     void book(int trainNumber, int seatOrWeightCount)  {
         	try {
         		
    	
              FileReader fr = new FileReader("C://Users/Banwari/workspace/OOP-session-3/src/trainInfo.txt");
              BufferedReader br = new BufferedReader(fr);
              String currentLine;
              int trainLine=-1;
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
