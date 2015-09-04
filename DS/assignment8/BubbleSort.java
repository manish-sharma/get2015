package ds8;

import java.util.List;

/**this class holds the function of bubble sort
 * @author Khemanshu
 *
 */
public class BubbleSort {
	 
	/**this function compares each element of list with other all element of list
	 * and after each pass maximum element of list is at its proper position.
	 * @param list to be sort
	 * @return sorted list
	 */
	public List<Integer> bubbleSort(List<Integer> list) {
	
		if (list.size() > 1) {
			for (int count = 0; count < list.size(); count++) {
				for (int lenght = 1; lenght < (list.size() - count); lenght++) {
					if (list.get(lenght - 1) > list.get(lenght)) {
						int temp = list.get(lenght);
						list.set(lenght, list.get(lenght - 1));
						list.set(lenght - 1, temp);
					}
				}
			}
		}
		return list;
	}

}
