import java.util.Scanner;

public class BinarySearch {
	
	//main method
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();											//accepting size of array
		int[] sortedArray = new int[size];									//initialize new array

		System.out.println("enter sorted array");
		for (int i = 0; i < size; i++)										//enter array values
			sortedArray[i] = sc.nextInt();

		int start = 0;
		int end = sortedArray.length - 1;
		
		System.out.println("enter value to search");						//accepting value to search
		int value = sc.nextInt();
		
		System.out.println("recursive method-----------");
		int index = recursiveBinarySearch(sortedArray, start, end, value);	//calling binary search recursively
		if (index != -1) {
			System.out.println("value found at " + index);
			index = leftMost(sortedArray, index, value);
			System.out.println("left most occurrence of " + value + " is " + index);		//showing leftmost occurrence
			index = rightMost(sortedArray, index, value);
			System.out.println("right most occurrence of " + value + " is " + index);		//showing rightmost occurrence
		}
		else
			System.out.println("value not found!");
		
		System.out.println("\nloop method-----------");
		index = binarySearchWithLoop(sortedArray, value);								//calling binary search with loop
		if (index != -1) {
			System.out.println("value found at " + index);
			index = leftMost(sortedArray, index, value);
			System.out.println("left most occurrence of " + value + " is " + index);		//showing leftmost occurrence
			index = rightMost(sortedArray, index, value);
			System.out.println("right most occurrence of " + value + " is " + index);		//showing rightmost occurrence
		}
		else
			System.out.println("value not found!");
		sc.close();
	}
	
	//method to find leftmost occurrence of value to find
	public static int leftMost(int[] sortedArray, int index, int value) {
		if ((index - 1) >= 0 && sortedArray[index - 1] == value)
			return leftMost(sortedArray, index - 1, value);
		else
			return index;
	}
	
	//method to find rightmost occurrence of value to find
	public static int rightMost(int[] sortedArray, int index, int value) {
		if ((index + 1) <= (sortedArray.length - 1) && sortedArray[index + 1] == value)
			return rightMost(sortedArray, index + 1, value);
		else
			return index;
	}
	
	//binary search recursive method
	public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {
        
        if (start < end) {
            int mid = (start + end) / 2;
            
            if (key < sortedArray[mid])
                return recursiveBinarySearch(sortedArray, start, mid, key);
            else if (key > sortedArray[mid])
                return recursiveBinarySearch(sortedArray, mid+1, end , key);
            else
                return mid;   
        }
        return -1;								//if value is not found
    }
	
	//binary search method loop variant
	public static int binarySearchWithLoop(int[] array, int value)  {
	    int start = 0;
	    int end = array.length - 1;              
	     
	    for (int i = 0; i < array.length; i++)   {
	        int mid = (end + start) / 2;
	        
	        if (array[i] == value)
	        	return i;
	        else if (array[mid] > value)
	            end = mid - 1;
	        else
	            start = mid + 1;
	    }
	    return -1;								//if value is not found
	}

}
