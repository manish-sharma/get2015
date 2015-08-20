import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sumitra this is to fetch data from file using buffer reader
 */
public class FetchFromFile {
	static List<PassengerTrain> passengerList;
	static List<GoodsTrain> goodsList;

	public void readData() {
		BufferedReader br = null;

		try {
			passengerList = new ArrayList<PassengerTrain>();
			goodsList = new ArrayList<GoodsTrain>();
			br = new BufferedReader(
					new FileReader(
							"C:/Users/Sumitra/workspace/RefactoredTrainManagement/src/Storage.txt"));
			String line = "";
			String cvsSplitBy = ",";
			String source = "";
			String destination = "";
			double price;
			String availableSeat = "";
			int trainNum;
			int type;
			int time;

			while ((line = br.readLine()) != null) {
				String[] row = line.split(cvsSplitBy);
				type = Integer.parseInt(row[0]);
				trainNum = Integer.parseInt(row[1]);
				source = row[2];
				destination = row[3];
				time = Integer.parseInt(row[4]);
				availableSeat = row[5];
				price = Double.parseDouble(row[6]);

				if (type == 1) {
					// if train is of passenger type than stored in different
					// list
					PassengerTrain passenger = new PassengerTrain(
							trainNum, source, destination,
							price, time,
							Integer.parseInt(availableSeat));
					passengerList.add(passenger);
				} else if (type == 2) {
					// if train is of different type then stored in different
					// list.
					GoodsTrain goods = new GoodsTrain(
							trainNum, source, destination,
							price, time,
							Double.parseDouble(availableSeat));

					goodsList.add(goods);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
