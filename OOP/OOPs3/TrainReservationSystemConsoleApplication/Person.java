package TrainReservationSystemConsoleApplication;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Person {
	
	public String trainType;
    public int trainTypeFlag = 0;
	Scanner scanner = new Scanner(System.in);

	public static List<PassengerTrain> passengerTrains = new ArrayList<PassengerTrain>();
   //list to store the objects of passenger train
	public static List<GoodTrain> goodTrain = new ArrayList<GoodTrain>();
	 //list to store the objects of goods train
	public static List<PassengerTrain> cropPassengerTrains = new ArrayList<PassengerTrain>();
     //list to store the only those objects which is match with source and detination  
	public static List<GoodTrain> cropGoodTrains = new ArrayList<GoodTrain>();
	   //list to store the only those objects which is match with source and detination of good train  
	
	/**
	* UserInput is a function which is used to the user input and validate it
	*
	*/
	private int UserInput() {
		int number;
		try {
			Scanner sc = new Scanner(System.in);

			number = sc.nextInt();
			if (number <= 0 || number > 3) {
				System.out.println("Eneter correct input");
				number = UserInput();

			}
			return number;
		} catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			number = UserInput();
			return number;
		}

	}
	/**
	 * takeUserName is a function which is used to take the user name which is printed on ticket
	 *  
	 */
	private void takeUserName(Ticket ticket)
	{
		ticket.setUserName(scanner.nextLine());
	}
	/**
	 * TrainSelsect is a function which is used to take the train type and take input from file according to train type
	 *  
	 */	
    private	void TrainSelsect()
	  {    
		String trainType = scanner.next();

		if (trainType.equalsIgnoreCase("Passenger")) {
			PassengerTrain passengerTrain=new PassengerTrain();
		    passengerTrain.Printdetail(passengerTrains);	
			trainTypeFlag = 1;
		} else if (trainType.equalsIgnoreCase("Goods")) {
		   GoodTrain goodTrains=new GoodTrain();
		    goodTrains.Printdetail(goodTrain);
			trainTypeFlag = 2;

		} else {
			System.out.println("Enter the correct Train type");
			TrainSelsect();
		}
	}
    /**
	 * CropPassengerAccordingToSourceAndDestination is a function which is used to reduce the list , which is store the object according to source and destination 
	 *  
	 */
	private void CropPassengerAccordingToSourceAndDestination() 
	{
		String source = scanner.next();
		String destination = scanner.next();
		PassengerTrain passengerTrain = new PassengerTrain();
		cropPassengerTrains = passengerTrain.SourceDestination(source,
				destination, passengerTrains);
		if (cropPassengerTrains.size() == 0) {
			System.out
					.print("There is no train found. so Enter correct source and destination.");
			CropPassengerAccordingToSourceAndDestination();
		} else
			passengerTrain.Printdetail(cropPassengerTrains);
	}
	/**
	 * CropPassengerAccordingToSourceAndDestination is a function which is used to reduce the list , which is store the object according to source and destination 
	 */
	void CropGoodTrainAccordingToSourceAndDestination()
	{
		String source = scanner.next();
		String destination = scanner.next();
		GoodTrain Train = new GoodTrain();
		cropGoodTrains = Train.SourceDestinationp(source, destination,
				goodTrain);
		if (cropGoodTrains.size() == 0) {
			System.out
					.print("There is no train found. so Enter correct source and destination.");
			CropPassengerAccordingToSourceAndDestination();
		} else
			Train.Printdetail(cropGoodTrains);

	  }
	/**
	 * TicketBookingForPassengerTrain is a function which is used to book ticket of passenger train 
	 *  
	 */
	void TicketBookingForPassengerTrain(Ticket ticket) {
		int SeatBooking = scanner.nextInt();
		int TrainNo = scanner.nextInt();

		if (new PassengerTrain().SearchForAvailableseat(TrainNo, SeatBooking,
				passengerTrains, ticket))
			ticket.set( TrainNo, SeatBooking, "Passenger");
		else {
			System.out.println("Enter Correct Detail");
			TicketBookingForPassengerTrain(ticket);

		}

	}
	/**
	 *  TicketBookingForGoodTrain is a function which is used to book ticket of goods train 
	 *  
	 */
	void TicketBookingForGoodsTrain(Ticket ticket)
        {
		int SeatBooking = scanner.nextInt();
		int TrainNo = scanner.nextInt();

		if (new GoodTrain().SearchForAvailableseat(TrainNo, SeatBooking,goodTrain, ticket))
			ticket.set(TrainNo, SeatBooking, "Goods");
		else {
			System.out.println("Enter Correct Detail");
			TicketBookingForGoodsTrain(ticket);

		}
	
	
        }
	/**
	 * checkingForPaymentDetail is function which is used to handle the payment
	 *  
	 */
	void checkingForPaymentDetail() {

		Scanner scanner = new Scanner(System.in);
		Payment payment = new Payment();
		int PaymentOption;
		PaymentOption = UserInput();

		switch (PaymentOption) {
		case 1: {
			System.out.println("Eneter ccv number and CCNumber ");
			int ccv = scanner.nextInt();
			int CCNumber = scanner.nextInt();
			while (!payment.DebitCard(ccv, CCNumber)) {
				System.out.println("Eneter ccv number and CCNumber correctly ");

				ccv = scanner.nextInt();
				CCNumber = scanner.nextInt();
			}
			break;
		}

		case 2: {
			break;
		}

		case 3: {
			System.out.println("Eneter user name ,password,bank name");
			String userName = scanner.next();
			String password = scanner.next();
			String bank = scanner.next();
			while (!payment.NetBannking(userName, password, bank)) {
				System.out
						.println("Eneter user name ,password,bank name  correctly");
				userName = scanner.next();
				password = scanner.next();
				bank = scanner.next();

			}
			break;
		}

		}

	}
 
	public static void main(String[] args)
	{   int number=0;
		
		Payment payment = new Payment();

		Person person = new Person();

		Ticket ticket = new Ticket();
		
		PassengerTrain train = new PassengerTrain();
		passengerTrains = train.readQuestions();
		
		GoodTrain goodTrains = new GoodTrain();
		goodTrain =  goodTrains.readQuestions();
		
		while(number!=2)
		{
		System.out.println("Enter the User Name");
		person.takeUserName(ticket);
	
		System.out.println("Enter the Train Type Goods/passenger");
		
		person.TrainSelsect();

		System.out.println("Enter the Source and Destination");

		if (person.trainTypeFlag == 1) 
		 {
			person.CropPassengerAccordingToSourceAndDestination();

			System.out.print("This is Train list. know Enter the no of seats and train no. ");

			person.TicketBookingForPassengerTrain(ticket);

		
		  } 
		else 
		   {

			person.CropGoodTrainAccordingToSourceAndDestination();

			System.out.print("This is Train list. know Enter the no of seats and train no. ");

			person.TicketBookingForGoodsTrain(ticket);

		   }
		
		payment.display();
		person.checkingForPaymentDetail();
		ticket.printTicket();
		
		System.out.print("Press 1 for continue booking or press 2 for exit ");
		number=person.UserInput();
		}

	}

}
