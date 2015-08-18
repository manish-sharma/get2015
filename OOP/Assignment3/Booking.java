import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Class where customer books railway ticket
public class Booking {

	static List<PassengerTrain> passengerList;
	static List<GoodsTrain> goodsList;

	public static void main(String[] args) {
		int temp = 0;
		passengerList = new ArrayList<PassengerTrain>();
		goodsList = new ArrayList<GoodsTrain>();

		try {
			FileInputStream fr = new FileInputStream("E://Train.txt");
			String source = "";
			String destination = "";
			String price = "";
			String availableSeat = "";
			String number = "";
			String trainNum = "";
			int count = 0;
			char c;
			while (((InputStream) fr).available() > 0) {
				c = (char) fr.read();
				if (c != ',') {
					if (count == 0) {
						number = number + c;
					}
					if (count == 1) {
						trainNum = trainNum + c;
					}
					if (count == 3) {
						destination = destination + c;
					}
					if (count == 2) {
						source = source + c;
					}
					if (count == 5) {
						availableSeat = availableSeat + c;

					}
					if (count == 4) {
						price = price + c;

					}
				} else {
					count++;
					if (count == 6) {
						count = 0;

						int num = Integer.parseInt(number);
						if (num == 1) {
							// if user selects passenger train
							PassengerTrain passenger = new PassengerTrain(
									Integer.parseInt(trainNum), source,
									destination, Integer.parseInt(price),
									Integer.parseInt(availableSeat));
							passengerList.add(passenger);
						} else if (num == 2) {
							// if user selects goods train
							GoodsTrain goods = new GoodsTrain(
									Integer.parseInt(trainNum), source,
									destination, Integer.parseInt(price),
									Double.parseDouble(availableSeat));
							goodsList.add(goods);
						}
						number = "";
						source = "";
						destination = "";
						availableSeat = "";
						price = "";
						trainNum = "";
					}
				}

			}
			fr.close();

			do {
				System.out.println("Enter your name");
				Scanner sc = new Scanner(System.in);
				String userName = sc.next();
				int temp1 = 0;
				System.out.println("What type of train you want");
				System.out.println("1.Passenger Train");
				System.out.println("2.Goods Train");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("---CURRENT TRAVELLING CHART");
					System.out
							.println("TRAIN No STARTINGPOINT ENDPOINT	PRICE SEATSAVAILABLE");
					Iterator<PassengerTrain> itr3 = passengerList.iterator();
					while (itr3.hasNext()) {
						PassengerTrain object5 = itr3.next();
						System.out.println(object5.trainNumber + "		"
								+ object5.startingPoint + "	"
								+ object5.endPoint + "	" + object5.price + "	"
								+ object5.seats);

					}

					System.out.println("Enter from where you want to go");
					String fromPlace = sc.next();
					System.out.println("Enter where you want to go");
					String toPlace = sc.next();
					Iterator<PassengerTrain> itr = passengerList.iterator();
					while (itr.hasNext()) {
						PassengerTrain object1 = itr.next();
						if ((object1.startingPoint.equalsIgnoreCase(fromPlace))
								&& (object1.endPoint.equalsIgnoreCase(toPlace))) {
							System.out.println("Enter no of seats");
							int seats = sc.nextInt();
							if (seats < object1.seats) {
								double amount = seats * object1.price;
								System.out.println("enter payment mode");
								System.out.println("1.CreditCard");
								System.out.println("2.Wallet");
								System.out.println("3.Netbanking");
								int choose = sc.nextInt();
								PaymentMode payment = new PaymentMode();
								// switch case to select mode of payment
								switch (choose) {
								case 1:

									payment.creditCard(amount);
									break;

								case 2:

									payment.wallet(amount);
									break;

								case 3:
									payment.netBanking(amount);
									break;

								default:
									System.out.println("Enter right values");
									break;

								}
								int newSeats = object1.seats - seats;
								object1.setSeats(newSeats);
								System.out.println("YOUR DETAILS");

								System.out.println("UserName---" + userName);
								System.out.println("FROM----" + fromPlace);
								System.out.println("TO-------" + toPlace);
								System.out.println("SEATS----" + seats);
								System.out.println("AMOUNT---" + amount);
								System.out
										.println("---CURRENT TRAVELLING CHART");
								System.out
										.println("TRAIN No STARTINGPOINT ENDPOINT	PRICE SEATSAVAILABLE");
								Iterator<PassengerTrain> itr4 = passengerList
										.iterator();
								while (itr4.hasNext()) {
									PassengerTrain object5 = itr4.next();
									System.out.println(object5.trainNumber
											+ "		" + object5.startingPoint
											+ "	" + object5.endPoint + "	"
											+ object5.price + "	"
											+ object5.seats);

								}

							} else {
								System.out.println("seats not available");
							}

						} else {
							temp1 = temp1 + 1;

						}
						if (temp1 == passengerList.size()) {
							System.out.println("no such train");
						}

					}
					break;
				// To display updated traveling chart
				case 2:
					int temp3 = 0;
					System.out.println("---CURRENT TRAVELLING CHART");
					System.out
							.println("TRAIN No STARTINGPOINT ENDPOINT	PRICE WEIGHTAVAILABLE");
					Iterator<GoodsTrain> itr4 = goodsList.iterator();
					while (itr4.hasNext()) {
						GoodsTrain object5 = itr4.next();
						System.out.println(object5.trainNumber + "		"
								+ object5.startingPoint + "	"
								+ object5.endPoint + "	" + object5.price + "	"
								+ object5.weight);

					}

					System.out
							.println("Enter from where you want to send goods");
					fromPlace = sc.next();
					System.out.println("Enter where you want to send goods");
					toPlace = sc.next();
					Iterator<GoodsTrain> itr1 = goodsList.iterator();
					while (itr1.hasNext()) {
						GoodsTrain object1 = itr1.next();
						if ((object1.startingPoint.equalsIgnoreCase(fromPlace))
								&& (object1.endPoint.equalsIgnoreCase(toPlace))) {
							System.out.println("Enter weight");
							double weight = sc.nextDouble();
							if (weight < object1.weight) {
								double amount = weight * object1.price;
								System.out.println("enter payment mode");
								System.out.println("1.CreditCard");
								System.out.println("2.Wallet");
								System.out.println("3.Netbanking");
								int choose = sc.nextInt();
								PaymentMode payment = new PaymentMode();
								switch (choose) {
								case 1:

									payment.creditCard(amount);
									break;

								case 2:

									payment.wallet(amount);
									break;

								case 3:
									payment.netBanking(amount);
									break;

								default:
									System.out.println("Enter right values");

								}
								double availWeight = object1.weight - weight;
								object1.setWeight(availWeight);
								System.out.println("YOUR DETAILS");

								System.out.println("UserName---" + userName);
								System.out.println("FROM----" + fromPlace);
								System.out.println("TO-------" + toPlace);
								System.out.println("WEIGHT----" + weight);
								System.out.println("AMOUNT---" + amount);
								System.out
										.println("---CURRENT TRAVELLING CHART");
								System.out
										.println("TRAIN No STARTINGPOINT ENDPOINT	PRICE SEATSAVAILABLE");
								Iterator<GoodsTrain> itr5 = goodsList
										.iterator();
								while (itr5.hasNext()) {
									GoodsTrain object5 = itr5.next();
									System.out.println(object5.trainNumber
											+ "		" + object5.startingPoint
											+ "	" + object5.endPoint + "	"
											+ object5.price + "	"
											+ object5.weight);

								}

							} else {
								System.out.println("Weight not available");
							}
						} else {
							temp3 = temp3 + 1;
						}
						if (temp3 == goodsList.size()) {
							System.out.println("No such train");
						}

					}
					break;
				default:
					System.out.println("Enter right values");

				}
				System.out.println("Press 0 if you want to continue");
				System.out.println("Else Press 1 if you want to exit");
				temp = sc.nextInt();
			} while (temp != 1);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
