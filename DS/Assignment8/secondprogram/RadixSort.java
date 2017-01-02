package secondprogram;
import java.util.LinkedList;
/**
 * this class us used to sort array using radix sort
 * @author Riddhi
 *
 */
public class RadixSort {

	public static int[] sortedArray(int arr[]) {
		LinkedList<Integer>[] list = new LinkedList[10];
		boolean flag = true;
		int divisor = 1;

		for (int index = 0; index < 10; index++) {
			list[index] = new LinkedList<Integer>();
		}
		
		while (flag) {
			flag = false;
//calculates the digits of the number and then adds it to the corresponding list
			for (int index = 0; index < arr.length; index++) {
				int modulus = (arr[index] / divisor) % 10;
				if (modulus > 0)
					flag = true;
				list[modulus].add(arr[index]);
			}

			int index2 = 0;
			for (int index = 0; index < 10; index++) {
				while (list[index].isEmpty() == false) {
					arr[index2] = list[index].removeFirst();
					index2++;
				}
			}
			divisor *= 10;

		}
		return arr;
	}

}
