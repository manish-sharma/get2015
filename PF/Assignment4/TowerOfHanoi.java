import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TowerOfHanoi {

	public static List<String> towerOfHanoi(String source, String destination,
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

	public static void main(String a[]) {
		List<String> list1 = new ArrayList<String>();
		List<String> list = TowerOfHanoi.towerOfHanoi("a", "b", "c", 1, list1);
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}
	}

}
