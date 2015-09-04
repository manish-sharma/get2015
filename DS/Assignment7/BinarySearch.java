/**
 * This class is used to check the left most and the right most occurrence of an element in a sorted array
 * @author Riddhi
 *
 */
public class BinarySearch {

	//binary search algorithm to search the position of an element
	int binarySearch(int inputArray[], int left, int right, int key) {
		int mid;
		// Loop invariant:
		// 1 left is always less than or equal to right
		// 2 If element at mid = key,then return
		while (left <= right) {
			mid = left + (right - left) / 2;

			if (inputArray[mid] == key) // first comparison
				return mid;

			if (inputArray[mid] < key) // second comparison
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}
	
	int getLeftMostOccurence(int inputArray[], int left, int right, int key) {
		int mid;
		// Loop Invariant
		// 1 right index-left index will always be greater than or equal to
		// one
		while ((right - left >= 1)) {
			mid = left + (right - left) / 2;

			if (inputArray[mid] >= key)
				right = mid;
			else
				left = mid;
			if(mid==0){
				return right;
			}
		}
		return right;
	}

	
	int getRightMostOccurence(int inputArray[], int left, int right, int key) {
		int mid;
		// Loop Invariant
		// 1 right index-left index will always be greater than one
		while (right - left > 1) {
			mid = left + (right - left) / 2;

			if (inputArray[mid] <= key)
				left = mid;
			else
				right = mid;
		}

		return left;
	}
}
