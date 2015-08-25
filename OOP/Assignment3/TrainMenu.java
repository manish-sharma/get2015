import java.util.*;

/**class for showing train menu
 * 
 * @author Gaurav Saini
 *
 */
public class TrainMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		int tempVar;
		do {
			int count = 0;

			String fromPlace, toPlace;
			System.out.println("Enter your name");

			String userName = sc.next();
			MenuList menulist = new MenuList();
			int trainType, trainid;
			do {
				menulist.displayMenu();
				do {// Validation
					System.out.println("Please enter a positive number!");
					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					trainType = sc.nextInt();
				} while (trainType <= 0);

				if ((trainType != 1) && (trainType != 2)) {
					System.out.println("Enter right values");

				}
			} while ((trainType != 1) && (trainType != 2));
			Procedure procedure = new Procedure();
			procedure.displayChart(trainType);

			System.out.println("Enter from where are you going");
			fromPlace = sc.next();
			System.out.println("Enter where are you going");
			toPlace = sc.next();
			procedure.availableTrains(trainType, fromPlace, toPlace);

			if (trainType == 1) {
				System.out.println("Enter train id ");

				do {// Validation
					System.out.println("Please enter a positive number!");
					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					trainid = sc.nextInt();
				} while (trainid <= 0);

				Iterator<PassengerTrain> itr = TrainDetails.passengerList
						.iterator();
				while (itr.hasNext()) {
					PassengerTrain object1 = itr.next();
					if ((object1.trainId == trainid)) {
						System.out.println("Enter no of seats");// tracking
																// seats
						int seats;
						do {// Validation
							System.out
									.println("Please enter a positive number!");
							while (!sc.hasNextInt()) {
								System.out
										.println("That's not a number!Please enter again");
								sc.next(); // this is important!
							}
							seats = sc.nextInt();
						} while (seats <= 0);
						if (seats < object1.seats) {
							double amount = seats * object1.price;
							int newSeats = object1.seats - seats;
							object1.setSeats(newSeats);

							menulist.displayPaymentMenu();// tracking payment
							int paymentType;
							do {
								do {// Validation
									System.out
											.println("Please enter a positive number!");
									while (!sc.hasNextInt()) {
										System.out
												.println("That's not a number!Please enter again");
										sc.next(); // this is important!
									}
									paymentType = sc.nextInt();
								} while (paymentType <= 0);
								PaymentMode paymentmode = new PaymentMode();
								if (paymentType == 1) {
									paymentmode.creditCard(amount);
								} else if (paymentType == 2) {
									paymentmode.wallet(amount);
								} else if (paymentType == 3) {
									paymentmode.netBanking(amount);
								} else {
									System.out.println("enter right value");

								}
							} while ((paymentType != 1) && (paymentType != 2)
									&& (paymentType != 3));
							System.out.println("YOUR DETAILS");// showing
							// details
							// of ticket
							System.out.println("TRAINID-------" + trainid);
							System.out.println("UserName---" + userName);
							System.out.println("FROM----" + fromPlace);
							System.out.println("TO-------" + toPlace);
							System.out.println("SEATS----" + seats);
							System.out.println("AMOUNT---" + amount);

						} else {
							System.out
									.println("seats are less. Try another one");
							menu();

						}
					} else {
						count = count + 1;
					}

				}
				if (count == TrainDetails.passengerList.size()) {
					System.out.println("your id is wrong.No such trains");
					menu();
				}

			}

			if (trainType == 2) {

				System.out.println("Enter train id ");
				do {// Validation
					System.out.println("Please enter a positive number!");
					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					trainid = sc.nextInt();
				} while (trainid <= 0);

				Iterator<GoodsTrain> itr = TrainDetails.goodsList.iterator();
				while (itr.hasNext()) {
					GoodsTrain object1 = itr.next();
					if ((object1.trainId == trainid)) {
						System.out.println("Enter weight");// tracking weight
						double weight;
						do {// Validation
							System.out
									.println("Please enter a positive number!");
							while (!sc.hasNextDouble()) {
								System.out
										.println("Wrong Value!Please enter again");
								sc.next(); // this is important!
							}
							weight = sc.nextDouble();
						} while (weight <= 0);
						if (weight < object1.weight) {
							double amount = weight * object1.price;
							double newWeight = object1.weight - weight;
							object1.setWeight(newWeight);
							menulist.displayPaymentMenu();
							int paymentType;
							do {
								do {// Validation
									System.out
											.println("Please enter a positive number!");
									while (!sc.hasNextInt()) {
										System.out
												.println("That's not a number!Please enter again");
										sc.next(); // this is important!
									}
									paymentType = sc.nextInt();
								} while (paymentType <= 0);
								PaymentMode paymentmode = new PaymentMode();
								if (paymentType == 1) {
									paymentmode.creditCard(amount);
								} else if (paymentType == 2) {
									paymentmode.wallet(amount);
								} else if (paymentType == 3) {
									paymentmode.netBanking(amount);
								} else {
									System.out.println("enter right value");

								}
							} while ((paymentType != 1) && (paymentType != 2)
									&& (paymentType != 3));

							System.out.println("YOUR DETAILS");// ticket
							// details
							System.out.println("TRAIN ID-------" + trainid);
							System.out.println("UserName---" + userName);
							System.out.println("FROM----" + fromPlace);
							System.out.println("TO-------" + toPlace);
							System.out.println("WEIGHT----" + weight);
							System.out.println("AMOUNT---" + amount);

						} else {
							System.out
									.println("seats are less. Try another one");
							menu();

						}
					} else {
						count = count + 1;
					}
					if (count == TrainDetails.goodsList.size()) {
						System.out.println("your id is wrong.No such trains");
						menu();
					}

				}

			}
			System.out.println("Press 0 if you want to continue");
			// tempVar = sc.nextInt();
			do {// Validation
				System.out.println("Please enter a positive number!");
				while (!sc.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					sc.next(); // this is important!
				}
				tempVar = sc.nextInt();
			} while (tempVar < 0);

		} while (tempVar == 0);

		sc.close();
	}

}