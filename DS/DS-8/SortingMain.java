/**
 * Class to implement sorting techniques
 * @author Sanjay
 */

import java.util.Scanner;


public class SortingMain {
	public static void main(String args[]){
		int[] array = null ; 
		while(true){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 1 to add elements");
			System.out.println("Press to 2 for sorting");
			System.out.println("Press 3 to exit");
			while(!scan.hasNextInt()) {
				System.out.println("Please enter from the given choices only.");
				scan.next();
			}
			int userInput = scan.nextInt();
			switch(userInput){
			case 1 : 
				System.out.println("Enter the number of elements you want to add");
				while(!scan.hasNextInt()) {
					System.out.println("Please enter integers.");
					scan.next();
				}
				int numberOfElements = scan.nextInt();
				array = new int[numberOfElements]; 
				for(int i = 0; i<numberOfElements;i++){
					System.out.println("Please enter " + (i+1) + " element");
					while(!scan.hasNextInt()) {
						System.out.println("Please enter integers only.");
						scan.next();
					}
					array[i]=scan.nextInt();
				}
				break;
			case 2:
				if(array==null){
					System.out.println("There is no element in the array. Please enter some elements first.");
					break;
				}
				else{
					System.out.println("Please enter 1 to choose comparison sorting.");
					System.out.println("Please enter 2 to choose linear sorting.");
					while(!scan.hasNextInt()) {
						System.out.println("Please enter integers only.");
						scan.next();
					}
					int sortingTypeInput = scan.nextInt();
					switch (sortingTypeInput) {
					case 1:
						if(array.length<=10){
							BubbleSort object = new BubbleSort();
							int[] sortedArray =  object.bubbleSort(array);
							System.out.println("System has used Bubble sort technique. Sorted array is as below");
							for(int i = 0;i<sortedArray.length;i++){
								System.out.println(sortedArray[i]);
							}
						}
						else{
							QuickSort object = new QuickSort();
							int[] sortedArray = object.sort(array);
							System.out.println("System has used quick sort technique. Sorted array is as below");
							for(int i = 0;i<sortedArray.length;i++){
								System.out.println(sortedArray[i]);
							}
						}
						break;
					case 2 :
						CountingSort object = new CountingSort();
						int max = object.findMax(array);
						if(max <= 99){
							int[] sortedArray = object.countingSort(array, max);
							System.out.println("System has used counting sort technique. Sorted array is as below");
							for(int i = 0;i<sortedArray.length;i++){
								System.out.println(sortedArray[i]);
							}
						}
						else{
							RadixSort radixSortObject = new RadixSort();
							int[] sortedArray = radixSortObject.radixSort(array);
							System.out.println("System has used radix sort technique. Sorted array is as below");
							for(int i = 0;i<sortedArray.length;i++){
								System.out.println(sortedArray[i]);
							}
						}
						break;
					case 3:
						System.exit(0);
						

					
					}
				}
			}
		}
	}
}
