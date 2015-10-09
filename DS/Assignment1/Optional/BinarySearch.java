package question4;

public class BinarySearch {
	private int array[] ;
	
	public BinarySearch(int sizeOfArray) {
		// TODO Auto-generated constructor stub
		array= new int[sizeOfArray];
	}
	
	public void populateArray(int []array) {
		this.array = array;
		
	}
	
	int searchElement(int array[], int value) {
		int lower, upper, mid;
		lower = 0;
		upper = array.length - 1;
		mid = (lower + upper) / 2 ;
		while(upper >= lower) {
			mid = (lower + upper) / 2 ;
			if (array[mid] == value) {
				break;
			} else if (array[mid] < value) {
				lower = mid + 1;
			} else if(array[mid] > value) {
				upper = mid - 1;
			}
		}
		if(array[mid] != value)
			mid = -1;
		return mid;
	}
}
