import java.util.Scanner;

/**
 * @author Sumitra
 *
 */
public class ArrayListMain {

	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);

		MyArrayList newlist = new MyArrayList();
		MyArrayList newlist1 = new MyArrayList();
		System.out.println("Enter what do you want to do");
		System.out.println(" 1)Adding an item into array list ");
		System.out
				.println("2)Adding an item into array list at the given particular location i");
		System.out
				.println(" 3)Retrieving the first occurrence of an item based on its given location");
		System.out
				.println("4)Retrieving the first index of particular item in the arraylist");
		System.out.println(" 5)Removing an item based on particular location");
		System.out
				.println(" 6)Remove given particular item from the arraylist");
		System.out
				.println("7)Clear the list i.e. remove all the elements of the list");
		System.out.println("8)Reverse the arraylist");
		System.out.println(" 9)Sort the elements of arraylist");
		System.out.println(" 10)Show the elements of arraylist");
		System.out.println(" 11)Add elements in second list");
		System.out.println(" 12)Merge List");
		int choice;
		int tempVar;
		do {
			System.out.println("Choose something from menu list");
			do {// Validation

				while (!sc.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					sc.next(); // this is important!
				}
				choice = sc.nextInt();
			} while (choice <= 0);

			switch (choice) {
			case 1:
				System.out.println("Enter the no.to add");
				int number;
				do {// Validation

					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					number = sc.nextInt();
				} while (number <= 0);
				newlist.add(new Integer(number));

				break;
			case 2:
				System.out.println("Enter the position of index");
				int index;
				do {// Validation

					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					index = sc.nextInt();
				} while (index <= 0);
				System.out.println("Enter the element");
				int element;
				do {// Validation

					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					element = sc.nextInt();
				} while (element <= 0);
				newlist.addItem(new Integer(element), index);

				break;

			case 3:
				System.out.println("Enter the position of index");
				int indexToCheck;
				do {// Validation

					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					indexToCheck = sc.nextInt();
				} while (indexToCheck < 0);
				System.out.println("Enter the element");
				int elementToSearch;
				do {// Validation

					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					elementToSearch = sc.nextInt();
				} while (elementToSearch < 0);

				int result = newlist.firstOcccurence(new Integer(
						elementToSearch), indexToCheck - 1);
				if (result == -1) {
					System.out.println("not found");
				} else {
					System.out.println("position is" + result);
				}

				break;

			case 4:
				System.out.println("Enter the element");
				do {// Validation

					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					elementToSearch = sc.nextInt();
				} while (elementToSearch < 0);
				int output = newlist.firstIndex(elementToSearch);
				if (output == -1) {
					System.out.println("not found");
				} else {
					System.out.println("position is" + output);
				}

				break;

			case 5:
				System.out.println("Enter the position of index");
				int position;
				do {// Validation

					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					position = sc.nextInt();
				} while (position <= 0);
				newlist.removeAtIndex(position - 1);

				break;

			case 6:
				System.out.println("Enter a value to be removed");
				int value;
				do {// Validation

					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					value = sc.nextInt();
				} while (value < 0);

				newlist.remove(value);
				System.out.println("Elements are:");
				newlist.show();
				break;

			case 7:

				newlist.clear();
				System.out.println("Elements are:");
				newlist.show();

				break;
			case 8:
				newlist.reverse();
				System.out.println("Elements are:");
				newlist.show();
				break;
			case 9:
				newlist.sort();
				System.out.println("Elements are:");
				newlist.show();

				break;
			case 10:
				newlist.show();

				break;

			case 11:
				System.out.println("enter -1 to stop");
				int newElement;
				do {
					System.out.println("Enter a value");
					newElement = sc.nextInt();
					if (newElement != -1) {
						newlist1.add(newElement);
					}
				} while (newElement != -1);

				break;
			case 12:

				newlist.merge(newlist1);
				System.out.println("Elements are:");
				newlist.show();
				break;
			default:
				System.out.println("Enter right value");

			}
			System.out.println("Press 0 if you want to continue");

			do {// Validation

				while (!sc.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					sc.next(); // this is important!
				}
				tempVar = sc.nextInt();
			} while (tempVar < 0);

		} while (tempVar == 0);

		sc.close();
	}
}
