/*Program title : search for a given number in an array using linear search.
 * Date : 10/10/2015
 * Made by : Gaurav Saini
 * */

import java.util.Scanner;

public class LinearSearch {
		
	int index = 0;									//index holds the array index
	
	//main method
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size;									//size holds the size of the array
		System.out.println("enter the size of the array. ");
		size = sc.nextInt();
		int[] array = new int[size];
		LinearSearch obj1 = new LinearSearch();
		int num, position, testVar;							//num holds the number to be searched
													//position holds the index of the number to be searched
		System.out.println("enter the array elements. ");
		for (int i = 0; i < size; i++)				//accepting array elements from the user
			array[i] = sc.nextInt();
		do {
		System.out.println("enter the number you want to search in the array. ");
		num = sc.nextInt();
		position = obj1.search(num, array, size);		/*search method finds the number in the array
															and returns the index which is stored in position*/
		if (position == -1)
			System.out.println("the number is not in the array. ");
		else
			System.out.println("the number is found at position : " + (position + 1));
		System.out.println("Do you want to search another number? (1 yes/0 no)");
		testVar = sc.nextInt();
		} while (testVar != 0);
		sc.close();
	}
	
	//method for finding the position of the element
	int search(int num, int[] array, int size){
		if (index == size)						//number not found case
			return -1;
		else if (array[index] == num)
			return index;
		else{
			index +=1;							//incrementing the index and recursively calling the search method
			return search(num, array, size);
		}
			
	}

}
