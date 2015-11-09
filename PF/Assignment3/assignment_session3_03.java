// 3rd assignment of PF session 3
public class assignment_session3_03 {
	public int[] quicksort(int arr[], int left, int right) {
		// below code is to sort an array using quicksort algorithm
		int temp, i = left, j = right;
		int pivot = arr[(i + j) / 2];
		while (i <= j) {
			while (arr[i] < pivot)
				// find the index from left whose element is greater then pivot
				// element
				i++;
			while (arr[j] > pivot)
				// find the index from right whose element is less then pivot
				// element
				j--;
			if (i <= j) // swap element at index i and j
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			i++;
			j--;

		}
		if (left < i - 1)
			arr = quicksort(arr, left, i - 1); // call the function to sort the
												// element in the left of pivot

		if (right > i)
			arr = quicksort(arr, i, right); // call the function to sort the
											// element in the right of pivot

		return arr;

	}

	public static void main(String args[]) {
		assignment_session3_03 ob = new assignment_session3_03();
		int arr[] = new int[] {};
		if (arr.length > 0)
			arr = ob.quicksort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

}
