package question4;

import java.util.Scanner;

public class BinarySearchMain {
	
	public static void main(String []args){
		BinarySearch binarySearchObject = new BinarySearch(10);
		int array[] = {10,20,30,40,50,60,70,80,90,100};
		binarySearchObject.populateArray(array);
		System.out.print("Enter Number to be searched: ");
		int value = new Scanner(System.in).nextInt();
		int index = binarySearchObject.searchElement(array, value);
		if(index == -1)
			System.out.println("Number doesn't exist!!");
		else
			System.out.println( index + 1);
	}

}
