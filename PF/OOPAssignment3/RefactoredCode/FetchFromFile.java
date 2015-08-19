import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sumitra
 *this is to fetch data from file using buffer reader
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
			String price = "";
			String availableSeat = "";
			String trainNum = "";
			String type = "";
			String time = "";

			while ((line = br.readLine()) != null) {
				String[] row = line.split(cvsSplitBy);
				type = row[0];
				trainNum = row[1];
				source = row[2];
				destination = row[3];
				time = row[4];
				availableSeat = row[5];
				price = row[6];
				int num = Integer.parseInt(type);
				if (num == 1) {
					// if train is of passenger type than stored in different list
					PassengerTrain passenger = new PassengerTrain(
							Integer.parseInt(trainNum), source, destination,
							"passenger", Integer.parseInt(availableSeat),
							Double.parseDouble(price), Integer.parseInt(time));
					passengerList.add(passenger);
				} else if (num == 2) {
					//if train is of different type then stored in different list.
					GoodsTrain goods = new GoodsTrain(
							Integer.parseInt(trainNum), source, destination,
							"goods", Integer.parseInt(availableSeat),
							Double.parseDouble(price), Integer.parseInt(time));
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
