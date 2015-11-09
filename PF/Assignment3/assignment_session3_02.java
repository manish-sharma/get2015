// 2nd assignment of PF session 3
public class assignment_session3_02 {
	// below code is to search a number in given array using binary search
	public int binarySearch(int arr[], int start, int last, int num) {
		int temp;
		int mid = (start + last) / 2;
		if (start > last)
			return -1;
		if (arr[mid] == num)
			return mid;

		if (num < arr[mid])
			temp = binarySearch(arr, start, mid - 1, num); // search the given
															// number in first
															// half of array
		else
			temp = binarySearch(arr, mid + 1, last, num); // search the given
															// number in second
															// half of array
		return temp;
	}

	public int linearSearch(int arr[], int i, int n) {
		// below code is to search a number in given array using linear search
		int temp;
		if (i >= arr.length)
			return -1;
		if (arr[i] == n)
			return i;
		temp = linearSearch(arr, i + 1, n);
		return temp;
	}

	public static void main(String args[]) {
		assignment_session3_02 ob = new assignment_session3_02();
		int arr1[] = new int[] { 2, 5, 8, 9, 10, 55, 77 };
		int num = 77;
		int index1 = ob.binarySearch(arr1, 0, arr1.length - 1, num);
		System.out.println("index is " + index1);

		int arr2[] = new int[] { 1, 5, 8, 6, 9 };
		int index2 = ob.linearSearch(arr2, 0, 98);
		System.out.println("index is " + index2);

	}

}
