package sorting;

import java.util.Scanner;
/**
 * purpose : for Sorting the array 
 * ask user to do linear sort or Comparison Sort
 * automatically will select the algo : if user select Linear then it will select Counting if all the elements positive and < 99 else Radix Sort
 * if user select Comparison then it will select Bubble if number of elements < 10 else Quick Sort
 * @author Ravika
 * @since 4/9/2015
 */
public class SortingSystem {

	public SortingSystem() {
		
	}
	
	public static void main(String[] args) {
		int numberOfElementsInArray ;
		String sortingAlgoName = "";
		boolean negative = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******Welcome to Sorting System******");
		int userInput;
		do {
			System.out.println("Please Enter the Size of Array : ");
			while(!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("Please enter an Integer :");
			}
			numberOfElementsInArray = scanner.nextInt();
			while(numberOfElementsInArray <= 0) {
				System.out.println("Please enter size > 0 :");
				numberOfElementsInArray = scanner.nextInt();
			}
		
			int[] array = new int[numberOfElementsInArray];
			System.out.println("Please enter the Elements of Array");
			for(int index = 0 ; index < numberOfElementsInArray; index++) {
				while(!scanner.hasNextInt()) {
					scanner.next();
					System.out.println("Please enter an Integer :");
				}
				array[index] = scanner.nextInt();
				if(array[index] < 0) {
					negative = true;
				}
			}
			
			System.out.println("Please enter 1 for  Comparison Sorting \n 2 for Linear Sorting ");
			
			while(!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("Please enter an Integer :");
			}
			int choice = scanner.nextInt();
			while(choice > 2 || choice < 1) {
				System.out.println("Please enter 1 or 2 :");
				numberOfElementsInArray = scanner.nextInt();
			}
			
			switch (choice) {
			case 1:
				if(numberOfElementsInArray <= 10 ) {
					sortingAlgoName = " Bubble Sort ";
					BubbleSort.bubbleSort(array);
				} else {
					sortingAlgoName = " Quick Sort ";
					new QuickSort().quickSort(array, 0, array.length - 1);
				}
				break;
				
			case 2:
				if(!negative && max(array) <= 99 ) {				//if any number is negative then there we can't use Counting sort
					sortingAlgoName = " Counting Sort ";
					CountingSort.countingSort(array);
				} else {
					sortingAlgoName = " Radix Sort ";
					new RadixSort().radixSort(array);
				}
				break;
			}
			
			System.out.println("System has used " + sortingAlgoName + "sorting technique and sorted list as below : " );
			for(int iteration = 0; iteration < array.length ; iteration++) {
				System.out.print(array[iteration] + " ");
			}
			System.out.println();
			System.out.println("Please enter 1 for  Sort another array \n 2 for exit ");
			
			while(!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("Please enter an Integer :");
			}
			userInput = scanner.nextInt();
			while(userInput > 2 || userInput < 1) {
				System.out.println("Please enter 1 or 2 :");
				numberOfElementsInArray = scanner.nextInt();
			}	
		} while(userInput != 2);
		scanner.close();
		
	}
	
	/**
	 * purpose : to check maximum element  
	 * if maximum element is greater than range 
	 * @param array
	 * @return
	 */
	private static int max(int[] array) {
		int max = 0;
		for(int a : array) {
			if(a > max ) {
				max = a;
			}
		}
		return max;
	}
}
