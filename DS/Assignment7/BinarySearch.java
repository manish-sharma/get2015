/**
 * This class is used to check the left most and the right most occurrence of an element in a sorted array
 * @author Riddhi
 *
 */
public class BinarySearch {

	//method used to check the left most occurrence
	public int leftMostOccurrence(int arr[], int lower, int upper, int value) {
		int result = 0;
		//returns if at any time lower bound is greater than upper bound
		if (lower > upper) {
			return -1;
		}
		//if the array is of size one than if the value of the element is similar than return its position
		if (lower == upper) {
			if (arr[lower] == value)
				return lower;
			else
				return -1;
		} 
		//else if lower bound is smaller than upper bound than perform following operations
		else if (lower < upper) {
			//calculated middle element
			int mid = (lower + upper) / 2;
			//checks value at middle element
			if (arr[mid] == value) {
				result = mid;
				//if value is equal than it is recursively called for left sub array
				result = leftMostOccurrence(arr, lower, mid - 1, value);
				//if at any position value returned by the method is -1 than method finally gives the index of middle element
				if (result == -1)
					return mid;
			}
			//method call recursively for left sub array if the value is smaller than middle element
			else if (arr[mid] > value) {
				return leftMostOccurrence(arr, lower, mid - 1, value);
			} 
			//method call recursively for right sub array if the value is greater than middle element
			else {
				return leftMostOccurrence(arr, mid + 1, upper, value);
			}
		}
		return result;
	}

	//method used to check the right most occurrence
	public int rightMostOccurrence(int arr[], int lower, int upper, int value) {
		int result = 0;
		//returns if at any time lower bound is greater than upper bound
		if (lower > upper) {
			return result;             
		}
		//if the array is of size one than if the value of the element is similar than return its position
		if (lower == upper) {
			if (arr[lower] == value)
				return lower;
			else
				return -1;
		}
		//else if lower bound is smaller than upper bound than perform following operations
		else if (lower <= upper) {
			//calculated middle element
			int mid = (lower + upper) / 2;
			//checks value at middle element 
			if (arr[mid] == value) {
				result = mid;
				//if value is equal than it is recursively called for right sub array
				result = rightMostOccurrence(arr, mid + 1, upper, value);
				//if at any position value returned by the method is -1 than method finally gives the index of middle element
				if (result == -1)
					return mid;
			}
			//method call recursively for left sub array if the value is smaller than middle element
			else if (arr[mid] > value) {
				return rightMostOccurrence(arr, lower, mid - 1, value);
			}
			//method call recursively for right sub array if the value is greater than middle element
			else {
				return rightMostOccurrence(arr, mid + 1, upper, value);
			}
		}
		return result;
	}

	//main function
	public static void main(String[] args) {
		//utility class contains function which checks the input string entered
		System.out.println("Enter the size of array");
		int size = Utility.checkInteger();
		System.out.println("Enter the values in array");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {

			arr[i] = Utility.checkInteger();
		}
		System.out.println("Enter the value to be searched");
		int value = Utility.checkInteger();
		BinarySearch object = new BinarySearch();
		do {
			System.out
			.println("Press\n1. For Left Most Occurence Of Character");
			System.out.println("2. For Right Most Occurence Of Character");
			System.out.println("3. Exit");
			int choice = Utility.checkInteger();
			switch (choice) {
			case 1:
				System.out.println("Left most position of element is"
						+ object.leftMostOccurrence(arr, 0, arr.length, value));
				break;
			case 2:
				System.out.println("Right most position of element is"
						+ object.rightMostOccurrence(arr, 0, arr.length, value));
				break;
			case 3:
				System.exit(0);

			default:
				System.out.println("Enter a valid value");
			}

		} while (true);
	}
}
