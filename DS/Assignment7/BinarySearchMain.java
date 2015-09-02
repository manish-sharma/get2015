package ds7;
import java.util.Arrays;

import ds6.Util;
public class BinarySearchMain {

	public static void main(String args[]) {
		int[] sortedArray = null;
		int size = 0;
		do{
			System.out.println(" 1. insert element in array"
					+"\n 2. enter search element"
					+"\n 3. exit");
			int choice = Util.userChoice();
			switch(choice) {
			case 1:
				System.out.println("enter size of array");
				size = Util.userChoice();
				sortedArray = new int[size];
				System.out.println("enter element in array");
				for(int indexCount = 0; indexCount < size; indexCount++)
					sortedArray[indexCount] = Util.arrayInput();
				Arrays.sort(sortedArray);
				break;
			case 2:
				System.out.println("enter the search element");
				int searchItem = Util.arrayInput();
				int position = BinarySearch.getLeftMostOccurrenceIndex(sortedArray, searchItem, 0, size-1);
				if(position == -1)
					System.out.println("element doesn't fount in list");
				else
					System.out.println("left most occurrence of "+searchItem+" is at position "+(position + 1));
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("enter correct choice");
				break;
			}
		}while(true);
	}
}
