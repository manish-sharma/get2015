package TrainReservationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Passanger {
	// Class holding Passenger details
	
	String _trainID;
	String _userName;
	int _paymentMode;
	int _capacityRequired;
	int _totalAmount;
	private static Scanner sc;

	public Passanger(String trainID, String userName, int mode,
			int capacityRequired, int totalAmount) {
		
		this._trainID = trainID;
		this._userName = userName;
		this._paymentMode = mode;
		this._capacityRequired = capacityRequired;
		this._totalAmount = totalAmount;
	}

	static void reservationProcess(String tType, ArrayList<PassengerTrain> passengerTrainList,ArrayList<GoodsTrain> goodsTrainList, ArrayList<Passanger> passengerList) {
		
		//Function performing reservation of Passenger
		
		sc = new Scanner(System.in);
		String typeP="P";//,typeG="G";

		if (tType.compareToIgnoreCase(typeP) == 0) {
			java.util.Iterator<PassengerTrain> passengerTrainIterator = passengerTrainList.iterator();
			System.out.println("\nEnter train Id : ");
			String id1 = sc.next();

			System.out.println("Enter Number of seats/ weight: ");
			int required = sc.nextInt();

			while (passengerTrainIterator.hasNext()) // loop to check weather Passenger Train
									// available or not
			{
				PassengerTrain passengerTrainObj = passengerTrainIterator.next();

				if (passengerTrainObj._trainID.equalsIgnoreCase(id1)
						&& (passengerTrainObj._availableSeat >= required)) {
					System.out.println("\nPayment Details : ");
					System.out.println("Enter Username: ");
					String uname = sc.next();

					System.out
							.println("Enter Payment Mode:(1 for  Credit Card / 2 for  Wallet /3 for Net Banking ) ");
					int mode = sc.nextInt();

					passengerList.add(new Passanger(passengerTrainObj._trainID, uname, mode, required,
							passengerTrainObj._ticketRate));

					int amount = passengerTrainObj._ticketRate * required;

					PaymentGateway paymentGateway = new PaymentGateway();
                    
					//Implementation of Payment methods
					
					if (mode == 1) {
						paymentGateway.paymentByCC(amount);
					} else if (mode == 2) {
						paymentGateway.paymentByWallet(amount);
					} else if (mode == 3) {
						paymentGateway.paymentByNetBanking(amount);
					} else {
						System.out.println("Please Enter a valid input");
						mode = sc.nextInt();
					}

					passengerTrainObj._availableSeat = passengerTrainObj._availableSeat - required;

					System.out
							.println("\n\n\t\t\t\t\tReservation successful !!!!!!");
					
					//Ticket generation code

					System.out.println("\n\n\t\t\t\t\t\tTicket Details");

					System.out.println("\nUser Name : " + uname
							+ "\t\t\tWeight Booked : " + required
							+ "\t\t\tAmount Paid :" + amount
							+ "\t\t\tLocation :" + passengerTrainObj._from + "-" + passengerTrainObj._to
							+ "\n");
					System.out
							.println("Train ID : " + id1
									+ "\t\t\t\tTrain Name : " + passengerTrainObj._trainName
									+ "\t\t\tTrain Type : " + passengerTrainObj._trainType
									+ "\t\t\tJourney Time : "
									+ passengerTrainObj._travelTime + "\n");
					break;
				} else{
					System.out.println("We not have " + required
							+ " empty seats in Train " + passengerTrainObj._trainName
							+ " please choose other Train");
					break;
				}
			}

		} else {
			java.util.Iterator<GoodsTrain> goodsTrainIterator = goodsTrainList.iterator();

			System.out.println("\nEnter train Id : ");
			String id1 = sc.next();

			System.out.println("Enter weight: ");
			int required = sc.nextInt();

			while (goodsTrainIterator.hasNext()) // Loop to check weather Goods train
									// available or not
			{

				GoodsTrain goodsTrainObj = goodsTrainIterator.next();

				if (goodsTrainObj._trainID.equalsIgnoreCase(id1)
						&& (goodsTrainObj._availableWeight >= required)) {
					System.out.println("\nPayment Details : ");
					System.out.println("Enter Username: ");
					String uname = sc.next();

					System.out
							.println("Enter Payment Mode:(1 for  Credit Card / 2 for  Wallet /3 for Net Banking ) ");
					int mode = sc.nextInt();

					passengerList.add(new Passanger(goodsTrainObj._trainID, uname, mode, required,
							goodsTrainObj._ticketRate));

					int amount = goodsTrainObj._ticketRate * required;

					PaymentGateway paymentGateway = new PaymentGateway();
                    
					//Implementation of Payment methods
					
					if (mode == 1) {
						paymentGateway.paymentByCC(amount);
					} else if (mode == 2) {
						paymentGateway.paymentByWallet(amount);
					} else if (mode == 3) {
						paymentGateway.paymentByNetBanking(amount);
					} else {
						System.out.println("Please Enter a valid input");
						mode = sc.nextInt();
					}

					goodsTrainObj._availableWeight = goodsTrainObj._availableWeight - required;

					System.out
							.println("\n\n\t\t\t\t\tReservation successful !!!!!!");

					System.out.println("\n\n\t\t\t\t\t\tTicket Details");
                    
					//Ticket generation/printing code
					
					System.out.println("\nUser Name : " + uname
							+ "\t\t\tWeight Booked : " + required
							+ "\t\t\tAmount Paid :" + amount
							+ "\t\t\tLocation :" + goodsTrainObj._from + "-" + goodsTrainObj._to
							+ "\n");
					System.out
							.println("Train ID : " + id1
									+ "\t\t\t\tTrain Name : " +goodsTrainObj._trainName
									+ "\t\t\tTrain Type : " + goodsTrainObj._trainType
									+ "\t\t\tJourney Time : "
									+ goodsTrainObj._travelTime + "\n");
					break;
				} else {
					System.out.println("We not have " + required
							+ " empty Weight in Goods Train "
							+ goodsTrainObj._trainName
							+ " please choose other Goods Train");
					break;
				}
			}
		}

	}
}
