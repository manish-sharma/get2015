import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*This class contains main class which implements and perform all the user input functions and output functions
 * @author Shishir Pareek
 * Date 17th August 2015
 */
public class TrainReservationMain {

 public static void main(String args[])
 {
	// TODO Auto-generated method stub
	 /*List Object to get the train object contain information*/
	List<TrainInformation> info=new ArrayList<TrainInformation>();
	info=TrainInformation.readTrainInfo();//function call to reads the train data from file
	Reservation object=new Reservation();//object of type reservation
	String result="",answer,from,to;
	Scanner sc=new Scanner(System.in);//input from user
	int id,seats=0,y=0,price,paymentMethod;
	double weight=0.0,amount=0.0;
	List<TrainInformation> output=new ArrayList<TrainInformation>();
	object.sorting(info);//function to sort the list of trains
	try //try block starts
	{
		do
		{  
			System.out.println("Enter your name");
			String user=sc.next();//user input

			do
			{
				System.out.println("Enter type of train required : Goods or Passenger");
				answer=sc.next();
				output=object.display(answer);
				//condition to check if the valid input is entered or not 
				if((output.size())==0)
					System.out.println("Enter a valid input");
			}while((output.size())==0);//do wile loop to iterate the message to enter correct input and asking the user for input
			object.displayAll(output);//function to display the available trains according the user 

			do//do wile loop to iterate the message to enter correct input and asking the user for input
			{
				result="";
				System.out.println("Enter stations :"+"\n"+"From :");
				from=sc.next();
				System.out.println("To :");
				to=sc.next();
				//answer=from+" "+to;
				result=object.listOFAvilabelTrains(from, to);//function to retrieve the listOfTrains according to the user source and destination
			}while(result.equals("")==true);

			do//do wile loop to iterate the message to enter correct input and asking the user for input
			{
				/*Condition to check if user choice of train is passenger*/
				if(answer.equalsIgnoreCase("Passenger"))
				{
					System.out.println("Enter the id of train to be booked and number of seats");
					id=sc.nextInt();
					seats=sc.nextInt();
					price=object.reservation(id, seats);
				}
				/*the user input is goods*/
				else
				{
					System.out.println("Enter the id of train to be booked and number of weight");
					id=sc.nextInt();
					weight=sc.nextDouble();
					price=object.reservation(id, weight);
				}

			}while(price==0);

			do //do wile loop to iterate the message to enter correct input and asking the user for input
			{
				System.out.println("chose payment method\n\t1. credit card\n\t2. net banking");
				paymentMethod = sc.nextInt();
				/*condition to check type of payment method*/ 
				if(paymentMethod!=1 && paymentMethod!=2)
					System.out.println("Enter a valid input");
			}while(paymentMethod!=1 && paymentMethod!=2);

			switch(paymentMethod)//Switch case
			{
			case 1:	//payment method is credit card
				System.out.println("enter credit card details");
				System.out.println("enter card number");
				int cardNum = sc.nextInt();
				System.out.println("enter CVV");
				int cvv = sc.nextInt();
				Payment testObj = new Payment();

				Reservation bookingObject;
				//condition to check if the input type is passenger
				if(answer.equalsIgnoreCase("Passenger"))
				{
					amount = testObj.makePayment(seats, price);
					bookingObject = new Reservation(user, String.valueOf(id) , String.valueOf(seats), amount);
				}
				else
				{
					amount = testObj.makePayment(weight, price);
					bookingObject = new Reservation(user, String.valueOf(id) , String.valueOf(weight), amount);
				}
				bookingObject.bookingDetails();
				break;

			case 2://payment option is netBanking
				System.out.println("Enter net banking details");
				System.out.println("Enter Id");
				int accNum = sc.nextInt();
				System.out.println("enter password");
				String pass = sc.next();
				Payment testObj1 = new Payment();

				Reservation bookingObject1;
				////condition to check if the input type is passenger
				if(answer.equalsIgnoreCase("Passenger"))
				{
					amount = testObj1.makePayment(seats, price);
					bookingObject1 = new Reservation(user, String.valueOf(id) , String.valueOf(seats), amount);
				}
				else
				{
					amount = testObj1.makePayment(weight, price);
					bookingObject1 = new Reservation(user, String.valueOf(id) , String.valueOf(weight), amount);
				}
				bookingObject1.bookingDetails();
				break;
			}

			object.update(info);
			object.displayAll(info);

			System.out.println("Press 0 to continue");
			y=sc.nextInt();
		}while(y==0);


	}catch(Exception e)
	{
		System.out.println("Enter a valid input hiii");
	}
  }
}
