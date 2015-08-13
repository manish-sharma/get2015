public class LeanearSearch {
	public static int leanearSearch(int[] arr, int first, int last,
			int searchNum) {
		if (first == last)
			return -1;
		else {
			if (arr[first] == searchNum)
				return first + 1;
			else
				return leanearSearch(arr, first + 1, last, searchNum);
		}
	}
}
