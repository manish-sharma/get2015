/*
 * It is file based train reservation system
 * User can see the available train
 * User can book the seats  or weights for good
 * @author Banwari
 */
import java.util.Scanner;
import java.io.*;
public class ReservationSystem {

	public static void main(String [] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		User user = new User();
		
		 System.out.print("Enter the User Name: ");
		 String name=sc.nextLine();
		 
		 System.out.print("Enter the UserId: ");
		 String id=sc.nextLine();
		 
		 System.out.print("Enter the User Contact Number: ");
		 String contNum=sc.nextLine();
		
		user.userRegistration(name,id,contNum);
		
		Trains trains= new Trains();
		
		
		// Choice of train type 
		System.out.println("Enter the tpye of trains in which you would like to take service: "
				                  + "\n\t 1 for All Trains"
				                  + "\n\t 2 for Good Trains"
			                      +	"\n\t 3 for Passanger Trains");
		int choice= sc.nextInt();
		if(choice==1){                
			trains.totalTrains();
		}
		else if(choice==2){
			trains.totalTrains("Good");
		}
		else{
			trains.totalTrains("Passanger");
		}
		
		
		System.out.print("\n\nEnter source station Name: ");
		String source;
		source=sc.next();
		System.out.print("Enter destination station Name: ");
		String destination;
		destination=sc.next();
		//Displaying the trains 
		trains.betweenSourceToDestinationTrains(source,destination);
		
		System.out.print("\n\nDo you want to book your seat/weights(Kg):\n\tPress 1 for YES\n\tPress 2 for Exit\n");
		choice= sc.nextInt();
		Booking booking = new Booking();
		int trainNumber;
		int SeatOrWeightCount;
		/*
		 * you have to enter the train number
		 * And number of passenger or goods
		 */
		if(choice==1) {
			System.out.print("Enter Train Number: ");
			trainNumber=sc.nextInt();
			System.out.print("Enter number of seats for Passanger/weight(Kgs) for Goods: ");
			SeatOrWeightCount = sc.nextInt();
			booking.book(trainNumber, SeatOrWeightCount,user);
		}
		
	
	}
}
