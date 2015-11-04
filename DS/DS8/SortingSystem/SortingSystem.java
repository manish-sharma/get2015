package SortingSystem;

import java.util.ArrayList;
import java.util.List;
/**
 * This class is sorting Intellgence System.
 * This class automatically use efficient sorting algorithm according to user input.
 * @author Nikhil
 */
public class SortingSystem {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		int printerChoice = 1;
		int choice = 0;
		int maximumElement = 0;
		int minimunElement = 0;
		ComparisonSort comparisonSort = new ComparisonSort();
		/* Showing menu */
		while (choice != 5) {
			Util.menueDisplay();
			choice = Util.userInput();
			switch (choice) {
			case 1:
				Util.print("Enter Element. ");
				int element = Util.userInputInArrayList();
				list.add(element);
				if (minimunElement > element)
					maximumElement = element;
				if (maximumElement < element)
					maximumElement = element;
				break;
			case 2:
				if (list.size() == 0)
					Util.print("List is empty.");
				else {
					if (minimunElement >= 0) {
						if (maximumElement < 100) {
							list = LinearSort.countingSort(list);
							printerChoice = 2;
						} else {
							list = LinearSort.radixSort(list, maximumElement);
							printerChoice = 3;
						}
					} else {
						Util.print("List contain negative Elements.So Linear Sorting can't perform on list.");
					}
				}
				break;
			case 3:
				if (list.size() == 0)
					Util.print("List is empty.");
				else {
					if (list.size() <= 10) {
						list = ComparisonSort.bubbleSort(list);
						printerChoice = 4;
					} else {
						list = comparisonSort.quickSort(list, 0,
								list.size() - 1);
						printerChoice = 5;
					}
				}
				break;
			case 4:
				if (list.size() == 0)
					Util.print("List is empty.");
				else

					Printer.displayOfArrayElement(printerChoice, list);
				break;
			case 5:
				choice = 5;
				break;
			default:
				Util.print("Please Enter correct choice.");
			}
		}
	}
}