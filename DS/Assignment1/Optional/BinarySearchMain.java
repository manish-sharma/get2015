package question4;

import java.util.Scanner;

public class BinarySearchMain {
	
	public static void main(String []args){
		BinarySearch binarySearchObject = new BinarySearch(10);
		int array[] = {10,20,30,40,50,60,70,80,90,100};
		binarySearchObject.populateArray(array);
		int value = new Scanner(System.in).nextInt();
		System.out.println(binarySearchObject.searchElement(array, value));
	}

}
