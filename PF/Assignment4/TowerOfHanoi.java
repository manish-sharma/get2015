import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {

	private static List<String> towerOfHanoi(String source, String destination,
			String temp, int noOfDisk, List<String> outputstring) {

		if (noOfDisk == 1) {
			outputstring.add("move " + noOfDisk + " from " + source + " to "
					+ destination);

		} else {
			towerOfHanoi(source, temp, destination, noOfDisk - 1, outputstring);
			outputstring.add("move " + noOfDisk + " from " + source + " to "
					+ destination);
			towerOfHanoi(temp, destination, source, noOfDisk - 1, outputstring);

		}

		return outputstring;
	}

	public static List<String> towerOfHanoi(String source, String destination,
			String temp, int noOfDisk) {
		List<String> list = new ArrayList<String>();

		List<String> list1 = towerOfHanoi(source, destination, temp, noOfDisk,
				list);
		return list1;

	}

}
