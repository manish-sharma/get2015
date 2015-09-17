package oopAssignment5;
import java.util.ArrayList;
import java.util.List;
/**
 * Class that stores all methods to perform functions on train data for booking ticket
 * @author Riddhi
 *
 */
public class Processing {

	public static List<PassengerTrain> selectedListOfPassenger = new ArrayList<PassengerTrain>(); //stores the filtered list of passenger train
	public static List<GoodsTrain> selectedListOfGoods = new ArrayList<GoodsTrain>();             //stores the filtered list of goods train

	// method to show passenger train details
	public void displayAllPassengerTrains(
			List<PassengerTrain> selectedList) {

		System.out
				.println("TrainID  Type  Source Destination Available Journey Time  Cost");
		for (PassengerTrain s : selectedList) {
			if (Integer.parseInt(s.seats) != 0)
				System.out.println(s.trainId + " \t " + s.type + "  " + s.from
						+ "   " + s.to + "\t " + s.seats + "  " + s.travelTime
						+ "   " + s.price);

		}
	}

	// method to show goods train details
	public void displayAllGoodsTrains(List<GoodsTrain> selectedList) {
		System.out
				.println("TrainID  Type  Source  Destination  Available Journey Time  Cost");
		for (GoodsTrain s : selectedList) {
			if (Integer.parseInt(s.weight) != 0)
				System.out.println(s.trainId + " \t " + s.type + " " + s.from
						+ " " + s.to + " " + s.weight + "  " + s.travelTime
						+ "  " + s.price);

		}
	}

	// method to return the filtered list of passenger train according to source
	// and destination
	public List<PassengerTrain> passengerTrainBtwStations() {

		return selectedListOfPassenger;
	}

	// method to return the filtered list of goods train according to source and destination
	public List<GoodsTrain> goodsTrainBtwStations() {
		return selectedListOfGoods;
	}

	// this method returns true if the specified train by the passenger is available
	public static boolean match(String from, String to, int type) {
		selectedListOfPassenger.clear();
		selectedListOfGoods.clear();
		boolean flag = false;
		if (type == 1) {
			for (PassengerTrain s : TrainDetails.passengerTrainInfo) {

				if ((s.from).equalsIgnoreCase(from)
						&& (s.to).equalsIgnoreCase(to)) {
					selectedListOfPassenger.add(s);
					flag = true;

				}

			}
			return flag;
		} else if (type == 2) {
			for (GoodsTrain s : TrainDetails.goodsTrainInfo) {

				if ((s.from).equalsIgnoreCase(from)
						&& (s.to).equalsIgnoreCase(to)) {
					selectedListOfGoods.add(s);
					flag = true;
				}

			}
			return flag;
		}
		return flag;
	}

	// method to print the ticket of the user
	public static void ticketPrint(String userName, int trainId, double seats,
			double price) {
		//Booking objOfBooking = new Booking(userName, trainId, seats, price);
		System.out.println("Ticket is:");
		System.out.println("Passenger Name : " + userName + "\n Train Id : "
				+ trainId + "\n Seats : " + seats
				+ "\n Amount :" + (seats*price));
	}

	// method to check the availability of the seats in passenger train and
	// returns total price to be payed by the user
	public static double checkAvailabilityForPassenger(int trainId, int seats) {
		for (PassengerTrain s : selectedListOfPassenger) {
			if (Integer.parseInt(s.trainId) == (trainId)
					&& Integer.parseInt(s.seats) >= (seats)) {
				return Double.parseDouble(s.price);
			}
		}
		return 0.0;
	}

	// method to check the availability of the seats in passenger train and
	// returns total price to be payed by the user
	public static double checkAvailabilityForGoods(int trainId, Double weight) {
		for (GoodsTrain s : selectedListOfGoods) {
			if (Integer.parseInt(s.trainId) == (trainId)
					&& Double.parseDouble(s.weight) >= (weight)) {
				return Double.parseDouble(s.price);
			}
		}
		return 0.0;
	}

	// method used to update the available seats in the passenger train
	public static  void updateChartForPassenger(int trainId, int seats) {
		for (PassengerTrain s : TrainDetails.passengerTrainInfo) {
			if (Integer.parseInt(s.trainId) == trainId
					&& Integer.parseInt(s.seats) >= (seats)) {
				s.seats = String.valueOf(Integer.parseInt(s.seats) - seats);
			}
		}
	}

	// method used to update the available weight in the goods train
	public static void updateChartForGoods(int trainId, double weight) {
		for (GoodsTrain s : TrainDetails.goodsTrainInfo) {
			if (Integer.parseInt(s.trainId) == trainId
					&& Integer.parseInt(s.weight) >= (weight)) {
				s.weight = String
						.valueOf(Double.parseDouble(s.weight) - weight);
			}
		}
	}
}
