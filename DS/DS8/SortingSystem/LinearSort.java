package SortingSystem;

import java.util.ArrayList;
import java.util.List;
/**
 * This class is used to perform the Linear sort.
 * This class  implement two method countingSort and radixSort.
 * In Linearsort  sort the elements according to their indexes.Inseated of comparasion to each other.
 * @author Nikhil
 */
public class LinearSort {

	/**In this method we traverse each element and when any element occurs then the value at its corresponding position in another array is increased by one.
	 * After then we traverse another array and move their index to parameter list according to their value.
	 * @param list
	 * @return the list of sorted array.
	 */
	public static List<Integer> countingSort(List<Integer> list) {
		int index = 0;
		int countingNumberIndex = 0;
		
		List<Integer> countingNumber = new ArrayList<Integer>(100);
		
		//This loop initialize the all the element of countingNumber.
		for (int initialize = 0; initialize < 100; initialize++) {
			countingNumber.add(0);
		}
		//the Element of list stored in countingNumber list of array.
		for (Integer element : list) {
			countingNumber.set(element, (countingNumber.get(element) + 1)); //increment previous value by 1.

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
	
	/**In radix sort we put each element in a bucket according to their digit.
	 * In first pass number are store in bucket according to their unit digit and in second pass number are pass according to their tens digit and so on, 
	 * Till the maximum number digit all are traverse.
	 * For bucket we take array of list of integer of 10 size which stores for value 0-9.
	 * @param list
	 * @param maximumElement
	 * @return
	 */
	public static List<Integer> radixSort(List<Integer> list, int maximumElement) {
		List<Integer> listArray[] = new ArrayList[10];
		int size = list.size();
		int remender = 10;
		int divisor = 1;

		for (int intialize = 0; intialize < 10; intialize++)  //Initialize the list array to new Array List.
			listArray[intialize] = new ArrayList<Integer>();

		while (maximumElement != 0) {       //loop continue for digit of maximumElement.
			for (int count = 0; count < size; count++) {
				int indexOfListArray = (list.get(0) % remender) / divisor;
				//System.out.println("index -> " + indexOfListArray);

				listArray[indexOfListArray].add(list.remove(0));
				//System.out.println("Now list elements are->  " + list);

			}

			for (int count = 0; count < 10; count++) {
				while (!listArray[count].isEmpty())//listArray  of particular position is not empty
					list.add(listArray[count].remove(0)); //add again to original list.
			}

		//	System.out.println("after again insertion list is elements are->  "+ list);
			remender *= 10;
			divisor *= 10;
			maximumElement = maximumElement / 10;
		}

		return list;

	}

}
