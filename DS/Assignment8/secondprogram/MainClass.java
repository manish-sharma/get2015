package secondprogram;
import firstProgram.Utility;
/**
 * class is used to take input from the user and perform sorting based on best available options for sorting
 * @author Riddhi
 *
 */
public class MainClass {

	public static void main(String args[]) {
		try {
			do {
				SortingSystem object = new SortingSystem();
				System.out.println("\nEnter your choice");
				System.out.println("1. Comparison Sorting");
				System.out.println("2. Linear Sorting");
				System.out.println("3. Exit");
				int choice = Utility.checkInteger();

				System.out.println("Enter a size of array");
				int size = Utility.checkInteger();
				int arr[] = new int[size];
				System.out.println("Enter elements in array");
				for (int i = 0; i < size; i++) {
					arr[i] = Utility.checkInteger();
				}

				switch (choice) {
				case 1://case for comparison sorting
					if (object.selectComparisonSort(arr).equals("Bubble Sort")) {
						System.out.println("Sorting used is : Bubble Sort"
								+ "\nElements are:");
						object.display(BubbleSort.sortedArray(arr));
					} else {
						System.out.println("Sorting used is : QuickSort"
								+ "\nElements are:");
						object.display(QuickSort
								.sortedArray(arr, 0, arr.length));
					}
					break;

				case 2://case for linear sorting
					int num = object.checkMaximumNumber(arr);
					System.out.println(num);
					if (object.selectLinearSort(num).equals("Radix Sort")) {
						System.out.println("Sorting used is : Radix Sort"
								+ "\nElements are:");

						object.display(RadixSort.sortedArray(arr));
					} else {
						System.out.println("Sorting used is : Counting Sort"
								+ "\nElements are:");
						object.display(CountingSort.sortedArray(arr, num));
					}
					break;

				case 3:
					System.out.println("Bye !!");
					System.exit(0);
				}

			} while (true);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
