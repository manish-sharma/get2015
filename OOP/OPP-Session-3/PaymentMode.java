import java.io.*;
import java.io.IOException;
import java.util.*;
public class PaymentMode {
	
	
	boolean payment(int payAmount){
		
		boolean successful=false;
		
	     Scanner sc= new Scanner(System.in);
		 System.out.print("Enter the mode of payment: \n\tPress 1 for Credit Card"
		 		                                     + "\n\tPress 2 for Wallet Payment"
		 		                                     + "\n\tPress 3 for Net Bnaking "
		 		                                     + "\n\tPress 4 for Exit");
		 
		 int mode=sc.nextInt();
		 
			 
		 if(mode==1) {
			 System.out.println("Regret!!! Service is not Available\nTry another mode");
			 	payment(payAmount);		 
		 }
		 else if (mode==2) {
			 if(updateBankAmount(payAmount) ) {
				 System.out.println("Thanks!!!!  Transection Sucessfully Completed");
				 successful=true;
			 }			
		 }
		 else if(mode==3){
			 System.out.println("Regret!!! Service is not Available\nTry another mode");
			 payment(payAmount);
		 }
		 else if(mode==4) {
			 System.exit(0);
		 }
		 else {
			 System.out.println("Invalid Input");
			 return payment(payAmount);
		 }
		return successful;
		
	}
	
	boolean updateBankAmount(int amt) {
		
     boolean successful=false;
	 try {
		 FileReader fr= new FileReader("C://Users/Banwari/workspace/OOP-session-3/src/BankAmount.txt");
		 BufferedReader br= new BufferedReader(fr);	
		 
		 String[] token = br.readLine().split("\\s+");
		 int updatedAmount=amt+Integer.parseInt(token[0]);
		 FileWriter fw= new FileWriter("C://Users/Banwari/workspace/OOP-session-3/src/BankAmount.txt");
		 BufferedWriter bw= new  BufferedWriter(fw);
		 bw.write(Integer.toString(updatedAmount));
		 bw.close();
		 successful=true;
		  }
		  catch(IOException  e) {
			  e.getStackTrace();
		  }
		 return successful;
	}
	

}
