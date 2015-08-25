import java.util.*;

public class MainTrainBooking 
{
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<TrainInfo> info=new ArrayList<TrainInfo>();		//info holds the complete train details fetched from the file
		
		TrainInfo.readTrainInfo();					//reading data from  file and storing in the list
		info = TrainInfo.returnInfo();
		
		ReservationProcessing reservationObj = new ReservationProcessing();
		
		String result = "", answer, source, destination;
		
		int id, seats = 0, y = 0, price, paymentMethod;
		double weight = 0.0, amount = 0.0;
		
		List<TrainInfo> filteredList = new ArrayList<TrainInfo>();		//list to store lists returned by the methods of other classes
		
		reservationObj.sorting(info);		//invoking the method to sort the list
		
		try {
			do {
				System.out.println("Enter your name");
				String user = sc.next();

				do {				//accepting input from user until valid input is entered
					System.out.println("Enter type of train required : Goods or Passenger");
					answer = sc.next();
					filteredList = reservationObj.filterByType(answer);		//invoking method to filter the list based on train type
					if((filteredList.size()) == 0)
						System.out.println("Enter a valid Train type");
				} while((filteredList.size()) == 0);
				
				reservationObj.display(filteredList);

				do {				//accepting input from user until valid input is entered
					result="";
					System.out.println("Enter stations :"+"\n"+"From :");
					System.out.println("source :");
					source = sc.next();
					System.out.println("destination :");
					destination = sc.next();
					result = reservationObj.filterByStation(source, destination);		//invoking method to filter the list based on source and destination
				} while(result.equals("") == true);

				do {			//accepting input from user until valid input is entered
					if(answer.equalsIgnoreCase("Passenger")) {
						System.out.println("Enter the id of train");
						id = sc.nextInt();
						System.out.println("Enter number of seats to be booked");
						seats = sc.nextInt();
						price = reservationObj.reservation(id, seats);		//invoking method to return price of booked train
					} else {
						System.out.println("Enter the id of train");
						id = sc.nextInt();
						System.out.println("Enter the weight to be booked");
						weight = sc.nextDouble();
						price = reservationObj.reservation(id, weight);		//invoking method to return price of booked train
					}

				} while(price == 0);

				do {			//accepting input from user until valid input is entered
					System.out.println("chose payment method\n\t1. credit card\n\t2. net banking");
					paymentMethod = sc.nextInt();
					if(paymentMethod != 1 && paymentMethod != 2)
						System.out.println("Please choose patment method from above mentioned options only");
				} while(paymentMethod != 1 && paymentMethod != 2);

				switch(paymentMethod) {
				
				case 1:
					System.out.println("enter credit card details");
					System.out.println("enter card number");
					int cardNum = sc.nextInt();
					System.out.println("enter CVV");
					int cvv = sc.nextInt();
					Payment paymentObj = new Payment();

					if(answer.equalsIgnoreCase("Passenger")) {
						amount = paymentObj.makePayment(seats, price);
						BookTicket bookingObj = new BookTicket(user, String.valueOf(id) , String.valueOf(seats), amount);
						bookingObj.bookingDetails();				//invoking function to display ticket details
					} else {
						amount = paymentObj.makePayment(weight, price);
						BookTicket bookingObj = new BookTicket(user, String.valueOf(id) , String.valueOf(weight), amount);
						bookingObj.bookingDetails();				//invoking function to display ticket details
					}

					break;

				case 2:
					System.out.println("Enter net banking details");
					System.out.println("Enter Id");
					int accNum = sc.nextInt();
					System.out.println("enter password");
					String pass = sc.next();
					Payment paymentObj1 = new Payment();

					if(answer.equalsIgnoreCase("Passenger")) {
						amount = paymentObj1.makePayment(seats, price);
						BookTicket bookingObj = new BookTicket(user, String.valueOf(id) , String.valueOf(seats), amount);
						bookingObj.bookingDetails();				//invoking function to display ticket details
					} else {
						amount = paymentObj1.makePayment(weight, price);
						BookTicket bookingObj = new BookTicket(user, String.valueOf(id) , String.valueOf(weight), amount);
						bookingObj.bookingDetails();				//invoking function to display ticket details
					}
					
					break;
				}
				
				System.out.println("Updated Train chart");
				reservationObj.update(info);
				reservationObj.display(info);

				System.out.println("Press 0 to continue");
				y = sc.nextInt();
			} while(y == 0);	
		}
		
		catch(Exception e) {
			System.out.println("Enter a valid input");
		}
	}

}