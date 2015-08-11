public class BinarySearch {

	public static int binarySearch(int[] array, int start, int end, int key) {

		if (start < end) {
			int mid = (start + end)/2;
			if (key < array[mid]) {
				return binarySearch(array, start, mid, key);

			} else if (key > array[mid]) {
				return binarySearch(array, mid + 1, end, key);

			} else {
				return mid + 1;
			}
		}
		return -1;
	}

}
