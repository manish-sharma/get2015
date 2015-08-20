/****************************************************************************************
Name            : PaymentMode
Revision Log    : 2015-08-18: Babalu patidar : created.
                : 
Use             : This class is used implement paymentAndPrintTicket method.
                :
****************************************************************************************/
import java.io.BufferedReader;

import java.util.Scanner;

//Start of main method
//@param train no. :specify Number of train
//@param ccNo :specify Credit card number
//@param cvv :specify cvv number of credit card
//@param username :specify username of internet banking
//@param password : Specify password of net baking
//@param name : Specify list of passenger in train.
public class PaymentMode {
	String trainNo;
	String ccNo;
	String cvv;
	String userName;
	String password;
	String[] name;
	int op;
	String csvFile ="";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
	
	//makePaymentAndPrintTicket method is used for print ticket.
	public void makePaymentAndPrintTicket(String trainNo,int seat,String trainType,int fare,Scanner scan){
		if(trainType.equalsIgnoreCase("p")){
			name=new String[seat];
			for(int i=0;i<seat;i++){
				System.out.print("Enter "+(i+1)+" Name");
				name[i]=scan.next();
			}	
		}
		else{
			System.out.print("Enter Name");
			name=new String[1];
			name[0]=scan.next();
		}	
		
		System.out.println("Select your payment option :\n1. credit card\n2. Wallet\n3. Net Banking");
		op=Integer.parseInt(scan.next());
		if(op==1){
			System.out.println("Enter your card no");
			ccNo=scan.next();
			System.out.println("Enter CVV");
			cvv=scan.next();
		}
		else if(op==2){	
		}
		else if(op==3){
			System.out.println("UserName : ");
			userName=scan.next();
			System.out.println("Password : ");
			password=scan.next();
		}
		
		System.out.println("Payment Successful of "+fare*seat+"/- Rupees");
		
		System.out.println("Are you want to print ticket Press 1 :");
		if((scan.nextInt())==1){
			System.out.println("\n\n: Ticket Details :");
			if(trainType.equalsIgnoreCase("p")){
				for(int i=0;i<seat;i++){
				System.out.println(""+(i+1)+" Name = "+name[i]);
				}
			}
			else{
				System.out.println(" Name = "+name[0]);
			}
			System.out.println("Train Number : "+trainNo);
			System.out.println("Number of Seat/weight : "+seat);
			System.out.println("Paid Amount : "+fare*seat);
		}else
		{
			System.out.println("Thanks for booking");
		}
		
	}
	//End of method
}
//End of PaymentMode class
