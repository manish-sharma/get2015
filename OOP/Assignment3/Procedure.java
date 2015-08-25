import java.util.Iterator;

/**It is a class containing all the procedures to to do
 *
 * @author Gaurav Saini
 * 
 */
public class Procedure {

	public void displayChart(int choice) { // To display the chart of train

		if (choice == 1) {
			System.out.println("---CURRENT TRAVELLING CHART");
			System.out
					.println("TRAIN No	STARTINGPOINT	ENDPOINT	PRICE		DURATION	SEATSAVAILABLE");
			Iterator<PassengerTrain> itr3 = TrainDetails.passengerList
					.iterator();
			while (itr3.hasNext()) {
				PassengerTrain object5 = itr3.next();
				System.out.println(object5.trainId + "		" + object5.fromPlace
						+ "		" + object5.toPlace + "		" + object5.price + "		"
						+ object5.duration + "		" + object5.seats);

			}

		} else if (choice == 2) {
			System.out.println("---CURRENT TRAVELLING CHART");
			System.out
					.println("TRAIN No	STARTINGPOINT	 ENDPOINT	PRICE	  DURATION	WEIGHTAVAILABLE");
			Iterator<GoodsTrain> itr4 = TrainDetails.goodsList.iterator();
			while (itr4.hasNext()) {
				GoodsTrain object5 = itr4.next();
				System.out.println(object5.trainId + "		" + object5.fromPlace
						+ "		 " + object5.toPlace + "	" + object5.price
						+ "     " + object5.duration + "		" + object5.weight);

			}

		} else {
			System.out.println("enter right values");

		}

	}

	public void sortChart() { // sorting the chart according to duration
		PassengerTrain temp;
		GoodsTrain temp1;

		for (int index = 0; index < TrainDetails.passengerList.size(); index++) {
			for (int i = 0; i < TrainDetails.passengerList.size(); i++) {
				double totalTime1 = ((TrainDetails.passengerList).get(index).duration);
				double totalTime2 = (TrainDetails.passengerList.get(i).duration);
				if (totalTime1 < totalTime2) {
					temp = TrainDetails.passengerList.get(index);
					TrainDetails.passengerList.set(index,
							TrainDetails.passengerList.get(i));
					TrainDetails.passengerList.set(i, temp);
				}
			}
		}

		for (int index = 0; index < TrainDetails.goodsList.size(); index++) {
			for (int i = 0; i < TrainDetails.goodsList.size(); i++) {
				double totalTime1 = ((TrainDetails.goodsList).get(index).duration);
				double totalTime2 = (TrainDetails.goodsList.get(i).duration);
				if (totalTime1 < totalTime2) {
					temp1 = TrainDetails.goodsList.get(index);
					TrainDetails.goodsList.set(index,
							TrainDetails.goodsList.get(i));
					TrainDetails.goodsList.set(i, temp1);
				}
			}
		}

	}

	public void availableTrains(int type, String source, String destination) { // Checking
																				// for
																				// availability
																				// of
																				// train

		int i = 0, temp = 0;

		if (type == 1) {

			Iterator<PassengerTrain> itr = TrainDetails.passengerList
					.iterator();// For passenger train

			while (itr.hasNext()) {
				PassengerTrain passenger = itr.next();

				if (source.equalsIgnoreCase(passenger.getFromPlace())
						&& destination.equalsIgnoreCase(passenger.getToPlace())) {
					temp = temp + 1;
					System.out.println(temp);

					if (i == 0) {
						System.out
								.println("TRAINID		SOURCE 		DESTINATION	DURATION	SEATS	       PRICE");
						i++;
					}
					System.out.println(passenger.getTrainId() + "		 "
							+ passenger.getFromPlace() + "		 "
							+ passenger.getToPlace() + " 		"
							+ passenger.getDuration() + " 		"
							+ passenger.getSeats() + " 		"
							+ passenger.getPrice());

				}

			}
			if (temp == 0) {
				System.out.println("No such trains.Try Another");
				TrainMenu menu1 = new TrainMenu();
				menu1.menu();
			}

		}

		else {// For goods train
			Iterator<GoodsTrain> itr = TrainDetails.goodsList.iterator();
			while (itr.hasNext()) {
				GoodsTrain goods = itr.next();
				if (source.equalsIgnoreCase(goods.getFromPlace())
						&& destination.equalsIgnoreCase(goods.getToPlace())) {
					temp = temp + 1;
					if (i == 0) {
						System.out
								.println("Train Number 	SOURCE 		DESTINATION		TIME		WEIGHT		PRICE");
						i++;
					}
					System.out.println(goods.getTrainId() + "		 "
							+ goods.getFromPlace() + "		 " + goods.getToPlace()
							+ " 		" + goods.getDuration() + " 		"
							+ goods.getWeight() + " 		" + goods.getPrice());

				}

			}
			if (temp == 0) {
				System.out.println("No such trains.Try another");
				TrainMenu menu1 = new TrainMenu();
				menu1.menu();
			}
		}
	}

}