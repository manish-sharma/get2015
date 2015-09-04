package ds8;

import java.util.ArrayList;
import java.util.List;


/**This class holds the function of radix sort
 * @author Khemanshu
 */
public class RadixSort {

	/**In radix sort we put each element in a bucket according to their digit.
	 * in first pass number are store in bucket according to their unit digit and in second pass number are pass according to their tens digit and so on, 
	 * till the maximum number digit all are traverse.
	 * for bucket we take array of list of integer of 10 size which stores for value 0-9.
	 * @param list
	 * @param maximumElement
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public  List<Integer> radixSort(List<Integer> list, int maximumElement) {
		List<Integer> listArray[] = new ArrayList[10];
		int size = list.size();
		int remender = 10;
		int divisor = 1;
		//initializing each element of array of list
		for (int intialize = 0; intialize < 10; intialize++)
			listArray[intialize] = new ArrayList<Integer>();
		//This loop ends when all digit of maximum number are traversed.
		while (maximumElement != 0) {
			//This loop runs for every element of array and remove number from parameter list and add it to the bucket at specific position.
			for (int count = 0; count < size; count++) {
				int indexOfListArray = (list.get(0) % remender) / divisor;
				//System.out.println("index -> " + indexOfListArray);

				listArray[indexOfListArray].add(list.remove(0));
				//System.out.println("Now list elements are->  " + list);

			}
			/*When all element in parameter list are removed by above loop then this loop again move all element from
			 * bucket(listArray[]) to parameter list.
			 */
			for (int count = 0; count < 10; count++) {
				while (!listArray[count].isEmpty())
					list.add(listArray[count].remove(0));
			}
			//System.out.println("after again insertion list is elements are->  "+ list);
			remender *= 10;
			divisor *= 10;
			maximumElement = maximumElement / 10;
		}
		return list;
	}
}
