import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * 
 */

/**
 * @author Riddhi
 *
 */
public class Travel 
{

	//main method
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		List<TrainInfo> info=new ArrayList<TrainInfo>();		//info holds the complete train details fetched from the file
		
		TrainInfo.readTrainInfo();					//reading data from  file and storing in the list
		info=TrainInfo.returnInfo();
		
		Booking object=new Booking();
		
		String result="",answer,from,to;
		
		int id,seats=0,y=0,price,paymentMethod;
		double weight=0.0,amount=0.0;
		
		List<TrainInfo> output=new ArrayList<TrainInfo>();		//list to store lists returned by the methods of other classes
		
		object.sorting(info);		//invoking the method to sort the list
		
		try
		{
			do
			{
				System.out.println("Enter your name");
				String user=sc.next();

				do				//accepting input from user until valid input is entered
				{
					System.out.println("Enter type of train required : Goods or Passenger");
					answer=sc.next();
					output=object.typeFiltering(answer);		//invoking method to filter the list based on train type
					if((output.size())==0)
						System.out.println("Enter a valid input");
				}while((output.size())==0);
				object.displayAll(output);

				do				//accepting input from user until valid input is entered
				{
					result="";
					System.out.println("Enter stations :"+"\n"+"From :");
					from=sc.next();
					System.out.println("To :");
					to=sc.next();
					result=object.trainBtwStations(from, to);		//invoking method to filter the list based on source and destination
				}while(result.equals("")==true);

				do			//accepting input from user until valid input is entered
				{
					if(answer.equalsIgnoreCase("Passenger"))
					{
						System.out.println("Enter the id of train to be booked and number of seats");
						id=sc.nextInt();
						seats=sc.nextInt();
						price=object.reservation(id, seats);		//invoking method to return price of booked train
					}
					else
					{
						System.out.println("Enter the id of train to be booked and number of weight");
						id=sc.nextInt();
						weight=sc.nextDouble();
						price=object.reservation(id, weight);		//invoking method to return price of booked train
					}

				}while(price==0);

				do			//accepting input from user until valid input is entered
				{
					System.out.println("chose payment method\n\t1. credit card\n\t2. net banking");
					paymentMethod = sc.nextInt();
					if(paymentMethod!=1 && paymentMethod!=2)
						System.out.println("Enter a valid input");
				}while(paymentMethod!=1 && paymentMethod!=2);

				switch(paymentMethod)
				{
				case 1:	
					System.out.println("enter credit card details");
					System.out.println("enter card number");
					int cardNum = sc.nextInt();
					System.out.println("enter CVV");
					int cvv = sc.nextInt();
					Payment testObj = new Payment();

					Booking bookingObject;
					if(answer.equalsIgnoreCase("Passenger"))
					{
						amount = testObj.makePayment(seats, price);
						bookingObject = new Booking(user, String.valueOf(id) , String.valueOf(seats), amount);
					}
					else
					{
						amount = testObj.makePayment(weight, price);
						bookingObject = new Booking(user, String.valueOf(id) , String.valueOf(weight), amount);
					}
					bookingObject.bookingDetails();				//invoking function to display ticket details
					break;

				case 2:
					System.out.println("Enter net banking details");
					System.out.println("Enter Id");
					int accNum = sc.nextInt();
					System.out.println("enter password");
					String pass = sc.next();
					Payment testObj1 = new Payment();

					Booking bookingObject1;
					if(answer.equalsIgnoreCase("Passenger"))
					{
						amount = testObj1.makePayment(seats, price);
						bookingObject1 = new Booking(user, String.valueOf(id) , String.valueOf(seats), amount);
					}
					else
					{
						amount = testObj1.makePayment(weight, price);
						bookingObject1 = new Booking(user, String.valueOf(id) , String.valueOf(weight), amount);
					}
					bookingObject1.bookingDetails();  			//invoking function to display ticket details
					break;
				}
				System.out.println("Updated Train chart");
				object.update(info);
				object.displayAll(info);

				System.out.println("Press 0 to continue");
				y=sc.nextInt();
			}while(y==0);

		
		}
		//Catchs exception on entering invalid input
		catch(Exception e)
		{
			System.out.println("Enter a valid input hiii");
		}
	}


}
