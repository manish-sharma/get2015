package TrainReservationSystem;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TrainResevationMain {

	public static void main(String[] args) {

		ArrayList<PassengerTrain> passengerTrainList = new ArrayList<PassengerTrain>();
		ArrayList<GoodsTrain> goodsTrainList = new ArrayList<GoodsTrain>();
		String typeP="P",typeG="G";

		Scanner sc = new Scanner(System.in);

		// Reading train data from File

		BufferedReader br = null; // input BY file

		try {

			StringTokenizer stringTokenizer;

			FileInputStream fin = new FileInputStream(
					new File(
							"C:\\Users\\Suman\\workspace\\OPP-Session-3\\src\\TrainReservationSystem\\Trainchart.txt"));

			DataInputStream in = new DataInputStream(fin);

			br = new BufferedReader(new InputStreamReader(in));

			String trainData = "";
			int i = 1;

			String trainType = "", trainID = "", trainName = "", from = "", to = "", duration = "", amount = "", available = "";

			while ((trainData = br.readLine()) != null) {

				stringTokenizer = new StringTokenizer(trainData, ",");
				i = 1;

				while (stringTokenizer.hasMoreTokens()) {
					if (i == 1) {
						trainType = stringTokenizer.nextToken();
					}

					else if (i == 2) {
						trainID = stringTokenizer.nextToken();
					} else if (i == 3) {
						trainName = stringTokenizer.nextToken();
					} else if (i == 4) {
						from = stringTokenizer.nextToken();
					} else if (i == 5) {
						to = stringTokenizer.nextToken();
					} else if (i == 6) {
						duration = stringTokenizer.nextToken();
					} else if (i == 7) {
						amount = stringTokenizer.nextToken();
					} else if (i == 8) {
						available = stringTokenizer.nextToken();
					}

					i++;
				}
				int time = Integer.parseInt(duration);
				int amount1 = Integer.parseInt(amount);
				int available1 = Integer.parseInt(available);

				if (trainType.compareToIgnoreCase("P") == 0) {

					passengerTrainList.add(new PassengerTrain(trainType,
							trainID, trainName, from, to, time, amount1,
							available1));
				} else if (trainType.compareToIgnoreCase("G") == 0) {

					goodsTrainList.add(new GoodsTrain(trainType, trainID,
							trainName, from, to, time, amount1, available1));
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		// Reservation Process for train
		int flag = 1;
	

		ArrayList<Passanger> passengerList = new ArrayList<Passanger>();

		try {
			while (flag == 1) {
				System.out
						.println("Enter which type of train (P for Passenger train and G for Goods train)");
				String tType = sc.next();
				
				
				/*if (tType.compareToIgnoreCase(typeP) != 0 || tType.compareToIgnoreCase(typeG) != 0){
					System.out.println("Please Enter a valid input");
					tType = sc.next();
				}*/

				// Providing Train chart

				System.out.println("\n\t\t\t\t\t\tTrain Chart \n");

				System.out
						.println("Train Id\tTrain Name\t\tFrom\t\tTo\tTime Duration\t\tFare\t\tAvailable");

				if (tType.compareToIgnoreCase(typeP) == 0) {
					java.util.Iterator<PassengerTrain> passengerTrainIterator = passengerTrainList
							.iterator();

					while (passengerTrainIterator.hasNext()) // loop to check weather Participant available or not
					{

						PassengerTrain passengerTrainObject = passengerTrainIterator.next();
						System.out.println(passengerTrainObject._trainID + "\t\t"
								+ passengerTrainObject._trainName + "\t\t" + passengerTrainObject._from
								+ "\t\t" + passengerTrainObject._to + "\t\t" + passengerTrainObject._travelTime
								+ "\t\t" + passengerTrainObject._ticketRate + "\t\t"
								+ passengerTrainObject._availableSeat);
					}
				} else if (tType.compareToIgnoreCase(typeG) == 0) {
					java.util.Iterator<GoodsTrain> goodsTrainIterator = goodsTrainList
							.iterator();

					while (goodsTrainIterator.hasNext()) // loop to check weather Participant
											// available or not
					{

						GoodsTrain goodsTrainObject = goodsTrainIterator.next();
						System.out.println(goodsTrainObject._trainID + "\t\t"
								+ goodsTrainObject._trainName + "\t\t" + goodsTrainObject._from
								+ "\t\t" + goodsTrainObject._to + "\t\t" + goodsTrainObject._travelTime
								+ "\t\t" + goodsTrainObject._ticketRate + "\t\t"
								+ goodsTrainObject._availableWeight);
					}

				} else {
					System.out.println("Please Enter a valid input");
				}

				// Providing 2nd List of Trains according to user input location
				// of from and to

				System.out.println("\nEnter Starting and Ending location : ");
				String from1 = sc.next();
				String to1 = sc.next();

				if (tType.compareToIgnoreCase(typeP) == 0) {
					PassengerTrain.displayTrainChartAccordingToRequirment(
							from1, to1, passengerTrainList);
				} else if (tType.compareToIgnoreCase(typeG) == 0) {
					GoodsTrain.displayTrainChartAccordingToRequirment(from1,
							to1, goodsTrainList);
				} else {
					System.out.println("Please Enter a valid input");
				}

				// Reservation process if user wants to reserve Passenger train
				// or Goods train seat or weight

				Passanger.reservationProcess(tType, passengerTrainList,
						goodsTrainList, passengerList);

				System.out
						.println("Enter 1 if you want to continue Reservation Process  otherwise 0: ");
				flag = sc.nextInt();

				if (flag == 0) {
					break;
				}
			}
		} catch (Exception e) {
			System.out.print(e);
		}
		sc.close();

	}

}
