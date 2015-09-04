/**
 * Class to implement radix sort
 * @author Sanjay
 */
import java.util.LinkedList;
import java.util.Queue;

public class RadixSort 
{
   
	/**
	 * Method to do radix sort
	 * @param array = input array
	 * @return = sorted array
	 */
	public static int[] radixSort (int [ ] array) {
		boolean flag = true;
		int divisor = 1;
		Queue [ ] buckets = new Queue[10];
		for (int i = 0; i < 10; i++)
			buckets[i] = new LinkedList();

		while (flag) {
			flag = false;
				// first copy the values into buckets
			for (int i = 0; i < array.length; i++) {
				int hashIndex = (array[i] / divisor) % 10;
				if (hashIndex > 0) flag = true;
				((LinkedList) buckets[hashIndex]).addLast(new Integer(array[i]));
			}
				// then copy the values back into vector
			divisor *= 10;
			int i = 0;
			for (int j = 0; j < 10; j++) {
				while (! buckets[j].isEmpty()) {
					Integer ival = (Integer) ((LinkedList) buckets[j]).getFirst();
					((LinkedList) buckets[j]).removeFirst();
					array[i++] = ival.intValue();
				}
			}
		}
		return array;
	}
}