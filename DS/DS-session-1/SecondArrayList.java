/**second array list which is to be merged with the first one
 * 
 * @author Gaurav
 * Date : 25/08/2015
 */

import java.util.Arrays;

public class SecondArrayList {
	
	public static int defaultSize = 10;									// default size of array list
	public static int size = 0;											// Starting size of array
	public static Object newData[] = new Object[defaultSize];			// object created of data
	int index = 0;

	//method to add elements in the second list
	public static void addElements(Object value) {
		if (size == newData.length)
			increaseCapacity();
		newData[size] = value;
		size++;
	}

	//method to increase size of the list if it the limit exceeds
	public static void increaseCapacity() {
		int newsize = newData.length * 2;
		newData = Arrays.copyOf(newData, newsize);
	}
	
	//method to get the size of second list
	public int size() {
		return size;
	}
}
