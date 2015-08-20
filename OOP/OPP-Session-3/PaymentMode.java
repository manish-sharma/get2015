/*
 * This contains the payment mode  methods
 * and types of mode
 * @author Banwari
 */
import java.io.*;
import java.io.IOException;
import java.util.*;
public class PaymentMode {
	/*
	 * payment method is used for payment
	 * @param parAmount the amount of payment 
	 */
	boolean payment(int payAmount){
		//successful is the variable which indicate the transaction is complete or not 
		boolean successful=false;
		
	     Scanner sc= new Scanner(System.in);
		 System.out.print("Enter the mode of payment: \n\tPress 1 for Credit Card"
		 		                                     + "\n\tPress 2 for Wallet Payment"
		 		                                     + "\n\tPress 3 for Net Bnaking "
		 		                                     + "\n\tPress 4 for Exit\n");
		 //selection of mode of payment
		 int mode=sc.nextInt();	 
		 if(mode==1) {
			 System.out.print("Enter card number: ");
			 sc.nextLine();
			 System.out.print("Enter CCV number: ");
			 sc.nextLine();
			 if(updateBankAmount(payAmount) ) {
				 System.out.println("Thanks!!!!  Transection Sucessfully Completed");
				 successful=true;
		 }
		 else if (mode==2) {
			 if(updateBankAmount(payAmount) ) {
				 System.out.println("Thanks!!!!  Transection Sucessfully Completed");
				 successful=true;
			 }			
		 }
		 else if(mode==3){
			 System.out.print("Enter Bank Name: ");
			 sc.nextLine();
			 System.out.print("Enter NetBanking User Id: ");
			 sc.nextLine();
			 System.out.print("Enter Password: ");
			 sc.nextLine();
			 if(updateBankAmount(payAmount) ) {
				 System.out.println("Thanks!!!!  Transection Sucessfully Completed");
				 successful=true;
		 }
		 else if(mode==4) {
			 System.exit(0);
		 }
		 else {
			 System.out.println("Invalid Input");
			 //if input mode is invalid then it again ask for enter mode of payment
			 return payment(payAmount);
		 }
		return successful;
		
	}
	/*
	 * This method update the bank account file 
	 * @param amt is amount which added to the bank account
	 */
	boolean updateBankAmount(int amt) {
		
     boolean successful=false;
	 try {
		 FileReader fr= new FileReader("C://Users/Banwari/workspace/OOP-session-3/src/BankAmount.txt");
		 BufferedReader br= new BufferedReader(fr);	
		 
		 String[] token = br.readLine().split("\\s+");
		 //updatedAmount contains the old amount of bank + current payment amount
		 int updatedAmount=amt+Integer.parseInt(token[0]);
		 FileWriter fw= new FileWriter("C://Users/Banwari/workspace/OOP-session-3/src/BankAmount.txt");
		 BufferedWriter bw= new  BufferedWriter(fw);
		 //Now updated amount is written to the bankAcount file
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
