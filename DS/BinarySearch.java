import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * to do binary search if found then get the leftMost and right most occurrence of searching element
 * @author Ravika
 * @since 2/9/2015
 */

public class BinarySearch {
	
	/**
	 * to get the leftMost and right most occurrence of searching element
	 * @param array = sorted array
	 * @param elementToSearch 
	 * @return = leftmost and right most occurrence of element in array
	 */
	int[] binarySearch(int[] array, int elementToSearch) {
		int left = -1,right = -1;
		int first = 0;
		int last = array.length-1;
		int mid = -1;
		int index = -1;
		//if element is present in array then it will be in array[first,...,last]
		while(first <= last) {
			mid = (first + last ) / 2;
			//if element greater than array[mid] ,it will present in [mid+1,...,last]
			if( elementToSearch > array[mid]) {
				first = mid +1;
			} else if(elementToSearch < array[mid]) {				//if element greater than array[mid] ,it will present in [first, ...,mid-1]
				last = mid - 1;
			} else {
				index = mid;
				break;
			}
		}		
		left = index;
		right = index;
		
		//if more elements present in left of index
		while(left > 0 && array[left - 1] == elementToSearch) {
			left--;
		}
		
		//if more elements present in right of index
		while(right < array.length - 1 && array[right + 1] == elementToSearch) {
			right++;
		}
		int[] leftMostAndRightMostOccurrence = new int[2];
		leftMostAndRightMostOccurrence[0] = left;
		leftMostAndRightMostOccurrence[1] = right;
		return leftMostAndRightMostOccurrence;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] leftMostAndRightMostOccurrence = new int[2];
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the number of elements in array ");
		
		while(!scanner.hasNextInt()) {
			System.out.println("enter integer only ");
			scanner.next();
		}
		
		int numberOfElements = scanner.nextInt();
		int array[] = new int[numberOfElements];
		System.out.println("Enter the elements of array ");
		for(int index = 0 ; index < numberOfElements ; index++) {
			while(!scanner.hasNextInt()) {
				System.out.println("enter integer only ");
				scanner.next();
			}
			list.add(scanner.nextInt());
		}
		
		list.sort(null);
		int j=0;
		for (int i :list) {
			array[j] = i;
			j++;
		}
		
		do {
			System.out.println("Enter 1 for search \n 2 for exit ");
			while(!scanner.hasNextInt()) {
				System.out.println("enter integer only ");
				scanner.next();
			}
			
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter Element to search ");
				while(!scanner.hasNextInt()) {
					System.out.println("enter integer only ");
					scanner.next();
				}
				
				int elementToSearch = scanner.nextInt();
			
				BinarySearch binarySearch = new BinarySearch();
				leftMostAndRightMostOccurrence = binarySearch.binarySearch(array, elementToSearch);
				if(leftMostAndRightMostOccurrence[0] == -1){
					System.out.println(" Element is not in array ");
				} else {
					System.out.println("left Occurance : " + leftMostAndRightMostOccurrence[0] + "\nRight Occurance : " + leftMostAndRightMostOccurrence[1]);
				}
				break;

			case 2:
				scanner.close();
				System.exit(0);
			}
		} while(true);
		
		
	}
}
