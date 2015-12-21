package TrainReservationSystem;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Train {

	// Generalizing details of both Passenger and Goods Train
	String _trainType;
	String _trainID;
	String _trainName;
	String _from;
	String _to;
	int _travelTime;
	int _ticketRate;

	public Train(String trainType, String trainID, String trainName,
			String from, String to, int travelTime, int ticketRate) {
		this._trainType = trainType;
		this._trainName = trainName;
		this._trainID = trainID;
		this._from = from;
		this._to = to;
		this._travelTime = travelTime;
		this._ticketRate = ticketRate;
	}

}

class PassengerTrain extends Train {
	// Subclass having Passenger train details

	int _availableSeat;

	public PassengerTrain(String trainType, String trainID, String trainName,
			String from, String to, int travelTime, int ticketRate,
			int availableSeat) {
		// Constructor for passenger Train
		super(trainType, trainID, trainName, from, to, travelTime, ticketRate);
		this._availableSeat = availableSeat;

	}

	static void displayTrainChartAccordingToRequirment(String from1,
			String to1, ArrayList<PassengerTrain> passengerTrainList) {

		// Displaying Passenger Train chart according to Passe3nger requirement

		Iterator<PassengerTrain> passengerTrainIterator = passengerTrainList
				.iterator();

		int i = 1, j = 1, k = 1;

		while (passengerTrainIterator.hasNext())// loop to check weather Train
												// available or not in list
		{
			PassengerTrain passengertrainObject = passengerTrainIterator.next();

			if (passengertrainObject._from.equalsIgnoreCase(from1)
					&& passengertrainObject._to.equalsIgnoreCase(to1)) {

				// if Train match according to Passenger Requirement

				System.out.println(passengertrainObject._trainID + "\t\t"
						+ passengertrainObject._trainName + "\t\t"
						+ passengertrainObject._from + "\t\t"
						+ passengertrainObject._to + "\t\t"
						+ passengertrainObject._travelTime + "\t\t"
						+ passengertrainObject._ticketRate + "\t\t"
						+ passengertrainObject._availableSeat);
				i++;
				// break;
			}
		}
		Iterator<PassengerTrain> passengerTrainIterator1 = passengerTrainList
				.iterator();
		while (passengerTrainIterator1.hasNext() && i == 1)// loop to check  weather Train available or not in list
		{
			PassengerTrain pass = (PassengerTrain) passengerTrainIterator1
					.next();

			if (pass._from.equalsIgnoreCase(from1)
					|| pass._to.equalsIgnoreCase(to1)) {
				if (j == 1 && i == 1) {

					// if Train match only on location according to Passenger
					// Requirement

					System.out
							.println("Sorry we not have direct Passanger train from "
									+ from1
									+ " to "
									+ to1
									+ " but following trains are available\n");
				}
				System.out.println(pass._trainID + "\t\t" + pass._trainName
						+ "\t\t" + pass._from + "\t\t" + pass._to + "\t\t"
						+ pass._travelTime + "\t\t" + pass._ticketRate + "\t\t"
						+ pass._availableSeat);

				j++;
			}
		}
		Iterator<PassengerTrain> passengerTrainIterator2 = passengerTrainList
				.iterator();
		while (passengerTrainIterator2.hasNext() && i == 1 && j == 1)// loop to// check weather Train available or not in list															
		{
			PassengerTrain pass = (PassengerTrain) passengerTrainIterator2
					.next();
			// if Train not match according to Passenger Requirement

			if (k == 1 && j == 1 && i == 1) {
				System.out
						.println("Sorry we not have direct Passanger train from "
								+ from1
								+ " to "
								+ to1
								+ " but following trains are available\n");
			}

			System.out.println(pass._trainID + "\t\t" + pass._trainName
					+ "\t\t" + pass._from + "\t\t" + pass._to + "\t\t"
					+ pass._travelTime + "\t\t" + pass._ticketRate + "\t\t"
					+ pass._availableSeat);
			k++;

		}

	}

}

class GoodsTrain extends Train {
	// Subclass having Goods train details

	int _availableWeight;

	public GoodsTrain(String trainType, String trainID, String trainName,
			String from, String to, int travelTime, int ticketRate,
			int availableWeight) {
		super(trainType, trainID, trainName, from, to, travelTime, ticketRate);
		this._availableWeight = availableWeight;
	}

	static void displayTrainChartAccordingToRequirment(String from1,
			String to1, ArrayList<GoodsTrain> goosTrainList) {
		// Displaying Goods Train chart according to Passenger requirement

		Iterator<GoodsTrain> goosTrainIterator = goosTrainList.iterator();

		int i = 1, j = 1, k = 1;

		while (goosTrainIterator.hasNext())// loop to check weather Participant
											// available or not
		{

			GoodsTrain goodsTrainObject = goosTrainIterator.next();
			if (goodsTrainObject._from.equalsIgnoreCase(from1)
					&& goodsTrainObject._to.equalsIgnoreCase(to1)) {
				// if Train match according to Passenger Requirement

				System.out.println(goodsTrainObject._trainID + "\t\t"
						+ goodsTrainObject._trainName + "\t\t"
						+ goodsTrainObject._from + "\t\t"
						+ goodsTrainObject._to + "\t\t"
						+ goodsTrainObject._travelTime + "\t\t"
						+ goodsTrainObject._ticketRate + "\t\t"
						+ goodsTrainObject._availableWeight);
				i++;
				// break;
			}
		}
		
		Iterator<GoodsTrain> goosTrainIterator1 = goosTrainList.iterator();
		
		while (goosTrainIterator1.hasNext() && i == 1)// loop to check weather
														// Train available or
														// not in list
		{
			GoodsTrain goodsTrainObject = goosTrainIterator1.next();
			if (goodsTrainObject._from.equalsIgnoreCase(from1)
					|| goodsTrainObject._to.equalsIgnoreCase(to1)) {
				// if Train match only on location according to Passenger
				// Requirement

				if (j == 1 && i == 1) {
					System.out
							.println("Sorry we not have direct Goods train from "
									+ from1
									+ " to "
									+ to1
									+ " but following trains are available\n");
				}

				System.out.println(goodsTrainObject._trainID + "\t\t" + goodsTrainObject._trainName
						+ "\t\t" + goodsTrainObject._from + "\t\t" + goodsTrainObject._to + "\t\t"
						+ goodsTrainObject._travelTime + "\t\t" + goodsTrainObject._ticketRate + "\t\t"
						+ goodsTrainObject._availableWeight);
				j++;
			}
		}
		Iterator<GoodsTrain> goosTrainIterator2 = goosTrainList.iterator();
		
		while (goosTrainIterator2.hasNext() && i == 1 && j==1)// loop to check weather
														// Train available or
														// not in list
		{
			GoodsTrain goodsTrainObject = goosTrainIterator2.next();
			// if Train not match according to Passenger Requirement

			if (k == 1 && j == 1 && i == 1) {
				System.out.println("Sorry we not have direct Goods train from "
						+ from1 + " to " + to1
						+ " but following trains are available\n");
			}
			System.out.println(goodsTrainObject._trainID + "\t\t" + goodsTrainObject._trainName
					+ "\t\t" + goodsTrainObject._from + "\t\t" + goodsTrainObject._to + "\t\t"
					+goodsTrainObject._travelTime + "\t\t" + goodsTrainObject._ticketRate + "\t\t"
					+ goodsTrainObject._availableWeight);
			k++;
		}

	}
}
