import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Sumitra Write a program to insert a number in sorted LinkList. Use
 *         recursive approach.
 *
 */
public class InsertAtPosition {
	static LinkedList<Integer> arr = new LinkedList<Integer>();

	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		Character choice = null;
		do {
			System.out.println("1 to create");
			System.out.println("2 to insert");
			System.out.println("3 to display");
			System.out.println("enter your choice");
			int choose = scanner.nextInt();

			switch (choose) {
			case 1:
				//to add in list at first
				if (i == 0) {
					System.out.println("enter the value");
					int e = scanner.nextInt();
					arr.add(e);
					i++;
					break;
				} else
					System.out.println("enter the value");
				int e = scanner.nextInt();
				addElement(0, e);
				break;
			case 2:
//to insert in list
				System.out.println("enter the new element you want to insert");
				int newElement = scanner.nextInt();
				if (i == 0) {
					arr.add(newElement);
					break;
				} else {
					addElement(0, newElement);
				}
				break;
			case 3:
// to show list.
				if (i == 0) {
					System.out.println("list is empty");
					i++;
					break;
				} else {
					for (int j = 0; j < arr.size(); j++) {
						System.out.println(arr.get(j));
					}
					break;
				}
			default:
				System.out.println("entered wrong choice");
				break;

			}

			System.out.println("do You want to add again");
			System.out.println("enter Y for yes");
			System.out.println("enter your choice");
			choice = scanner.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');

		scanner.close();
	}
//method to insert at right place.
	static void addElement(int index, int value) {
		if (index<arr.size() && arr.get(index) < value ) {
			index++;
			addElement(index, value);

		} else
			arr.add(index, value);
	}
}
