package ds8;

import java.util.ArrayList;
import java.util.List;



public class SortingMainClass {
	
	//this list stores the elements to be sorted.
	List<Integer> list = new ArrayList<Integer>();
	public static void main(String args[]) {
		SortingMainClass sortingMainClass = new SortingMainClass();
		do {
			System.out.println("select the choice"
					+"\n 1. enter elements in list"
					+"\n 2. do comparision sorting"
					+"\n 3. do linear sorting"
					+"\n 4. display list"
					+"\n 5. exit from system");
			int choice = Util.userChoice();
			switch(choice) {
			case 1:
				ListInput listInput = new ListInput();
				sortingMainClass.list.addAll(listInput.inputOfList());
				break;
			case 2:
				if(sortingMainClass.list.size() <= 10) {
					System.out.println("performing bubble sort");
					BubbleSort bubbleSort = new BubbleSort();
					bubbleSort.bubbleSort(sortingMainClass.list);
				}
				else {
					System.out.println("performing quick sort");
					QuickSort quickSort = new QuickSort();
					quickSort.quickSort(sortingMainClass.list,0 , (sortingMainClass.list.size()-1));
				}
				break;
			case 3:
				int maximumOfList = Util.returnMaximumOfList(sortingMainClass.list);
				if(maximumOfList > 99) {
					System.out.println("performing radix sort");
					RadixSort radixSort = new RadixSort();
					radixSort.radixSort(sortingMainClass.list, maximumOfList);
				}
				else {
					System.out.println("performing counting sort");
					CountingSort countingSort = new CountingSort();
					countingSort.countingSort(sortingMainClass.list);
				}
				break;
			case 4:
				System.out.println(sortingMainClass.list);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("enter correct choice");
			}
		}while(true);
	}
}
