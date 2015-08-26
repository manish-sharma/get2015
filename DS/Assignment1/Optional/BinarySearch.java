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
	
	int searchElement(int array[], int value1) {
		int lower, upper, mid;
		lower = 0;
		upper = array.length - 1;
		mid = (lower + upper) / 2 ;
		for(int value : array)
			System.out.println(value);
		while(upper > lower) {
			mid = (lower + upper) / 2 ;
			if (array[mid] == value1) {
				break;
			} else if (array[mid] < value1) {
				lower = mid + 1;
			} else if(array[mid] > value1) {
				upper = mid - 1;
			}
		}
		return mid;
	}
}
