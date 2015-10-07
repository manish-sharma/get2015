package secondprogram;
/**
 * class hold methods used for processing array before sorting it with required sorting algorithm
 * @author Riddhi
 *
 */
public class SortingSystem {
	public void display(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public int checkMaximumNumber(int arr[]) {
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 100)
				return 0;
			else {
				if (arr[i] > max)
					max = arr[i];
			}
		}
		return max;
	}

	public String selectComparisonSort(int arr[]) {
		if (arr.length <= 10) {
			return "Bubble Sort";
		} else {
			return "Quick Sort";
		}
	}

	public String selectLinearSort(int num) {

		if (num == 0) {
			return "Radix Sort";
		} else {
			return "Counting Sort";
		}
	}

}
