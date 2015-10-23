package secondprogram;
/**
 * this class contains function used to sort a array using counting sort
 * @author Riddhi
 *
 */
public class CountingSort {

	public static int[] sortedArray(int arr[], int num) {
		int newArr[] = new int[num + 1];
		int index = 0;
		for (index = 0; index < arr.length; index++) {
			newArr[arr[index]] = newArr[arr[index]] + 1;
		}
		int index2 = 0;
		for (index = 0; index < newArr.length; index++) {
			for (int index3 = 0; index3 < newArr[index]; index3++) {
				arr[index2] = index;
				index2++;
			}
		}
		return arr;
	}

}
