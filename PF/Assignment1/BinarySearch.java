/*Program title : find the largest digit in the given number.
 *Date : 08/10/2015
 *Made by : Gaurav Saini
 **/

import java.util.Scanner;

public class BinarySearch {

	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;									//size holds the size of the array
		System.out.println("enter the size of the array. ");
		size = sc.nextInt();
		int[] array = new int[size];
		BinarySearch obj1 = new BinarySearch();
		int min = 0, max = size - 1;				//min holds the smallest array index
													//max holds the largest array index
		int num, position;							//num holds the number to be searched
													//position holds the index of the number to be searched
		System.out.println("enter the array elements. ");
		for (int i = 0; i < size; i++)				//accepting array elements from the user
			array[i] = sc.nextInt();
		System.out.println("enter the number you want to search in the array. ");
		num = sc.nextInt();
		position = obj1.binarySearch(num, array, min, max);
		if (position == -1)
			System.out.println("number not found in the array. ");
		else
			System.out.println("number is found at position : " + (position + 1));
		sc.close();
	}
	
	
	int binarySearch(int num, int[] array, int min, int max){
		int mid = (min + max)/2;						//mid holds the middle index in the array
		if (max < min)
			return -1;									//number not found case
		else if (array[mid] == num)
			return mid;
		else if (array[mid] < num)
			return binarySearch(num, array, mid + 1, max);
		else if (array[mid] > num)
			return binarySearch(num, array, min, mid - 1);
		return mid;										//returning the index at which the number is found
	}

}
