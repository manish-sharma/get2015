public class QuickSort {
	private static int[] numbers;
	private static int number;

	public static int[] sort(int[] values) {

		if (values == null || values.length == 0) {
			return values;
		}
		numbers = values;
		number = values.length;
		quicksort(0, number - 1);
		return numbers;
	}

	private static void quicksort(int low, int high) {
		int i = low, j = high;

		int pivot = numbers[low];

		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;
			}
			while (numbers[j] > pivot) {
				j--;
			}

			if (i <= j) {

				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;

				i++;
				j--;
			}
		}

		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

}
