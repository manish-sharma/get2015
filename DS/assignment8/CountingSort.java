package ds8;

import java.util.ArrayList;
import java.util.List;

/** This class holds the function of Counting sort.
 * @author Khemanshu
 *
 */
public class CountingSort {

	/**In this method we traverse each element and when any element occurs then the value at its corresponding position in another array is increased by one.
	 * After then we traverse another array and move their index to parameter list according to their value.
	 * @param list
	 * @return the list of sorted array.
	 */
	public List<Integer> countingSort(List<Integer> list) {
		//index use in storing back the sorted numbers to the list.It represent the index of list.
		int index = 0;
		//countingNumberindex is use in storing back the sorted number to the list.it represent the index of countingNumber kist.
		int countingNumberIndex = 0;
		//countingNumber list is use to store the number of occurrences of each element in the list.
		List<Integer> countingNumber = new ArrayList<Integer>(100);
		//This loop initialize the all the element of countingNumber.
		for (int initializeCount = 0; initializeCount < 100; initializeCount++) {
			countingNumber.add(0);
		}
		//This loop set the value countingNumber list element according to their corresponding occurrence in list.
		for (Integer element : list) {
			countingNumber.set(element, (countingNumber.get(element) + 1));
		}
		//This loop move sorted element in list .
		for (Integer element : countingNumber) {
			while (element != 0) {
				list.set(index, countingNumberIndex);
				index++;
				element--;
			}
			countingNumberIndex++;
		}
		return list;
	}
}
