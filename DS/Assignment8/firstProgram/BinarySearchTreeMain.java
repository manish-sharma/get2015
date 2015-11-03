package firstProgram;
import java.util.Scanner;


public class BinarySearchTreeMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {

			BinarySearchTree object = new BinarySearchTree();
			int value;
			int choice;
			do {
				System.out.println("\n1.Insert Roll Numbers");
				System.out.println("2.Roll Numbers in Ascending order");
				System.out.println("3.Exit");
				choice = Utility.checkInteger();
				switch (choice) {
				case 1:
					System.out.println("Enter number of students");
					value = Utility.checkInteger();
					System.out.println("Enter students roll number ");
					int arr[] = new int[value];
					for (int i = 0; i < arr.length; i++) {
						arr[i] = Utility.checkInteger();
						for (int j = 0; j < i; j++) {
							if (arr[i] == arr[j]) {
								System.out.println("Element already present");
								i--;
							}
						}
					}
						object.insert(arr);
					break;

				case 2:
					System.out.println("Ascending order of roll numbers is : "
							+ object.printInAscending());
					break;

				case 3:
					System.exit(0);

				default:
					System.out
							.println("Enter a input from available number of options");
				}
			} while (true);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
		}
	}
}
