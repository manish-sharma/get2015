import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * This class does insertion of elements in linked list in sorted order
 * 
 * @author Riddhi
 *
 */
public class LinkedListClass {
	List<Integer> list;

	// Constructor
	public LinkedListClass() {
		list = new LinkedList<Integer>();
	}

	// used to insert values in linked list in sorted order
	public void sorting(int element, int i) {
		if (list.size() == i) {
			list.add(element);
		} else if (element > list.get(i)) {
			sorting(element, ++i);
		} else {
			list.add(i, element);
			return;
		}
	}

	// overridden toString method for displaying linked list
	public String toString() {
		String result = "[ ";
		for (int i = 0; i < list.size(); i++) {
			result = result + list.get(i) + " ";
		}
		result = result + " ]";
		return result;
	}

	// main method
	public static void main(String args[]) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			LinkedListClass object = new LinkedListClass();
			do {
				// display menu
				System.out.println("1. Enter elements in the list");
				System.out.println("2. Display");
				System.out.println("3. Exit");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter value");
					int value = sc.nextInt();
					object.sorting(value, 0);
					break;

				case 2:
					System.out.println("Sorted Linked List");
					System.out.println(object.toString());
					break;

				case 3:
					System.out.println("Bye..!!");
					System.exit(0);

				default:
					System.out.println("Enter a valid choice");
				}
			} while (true);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
		}

	}
}
