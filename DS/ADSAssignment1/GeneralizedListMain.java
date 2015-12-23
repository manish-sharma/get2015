import java.util.Scanner;

public class GeneralizedListMain {

	public static void main(String[] args) {
		// "(5,(8,3),(6,(10,12),4),7)"
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list");
		String list = sc.next();
		GeneralizedList objList = new GeneralizedList(list,
				new GeneralizedList());
		while (true) {
			System.out.println("\n\nMenu.");
			System.out.println("1. Display list");
			System.out.println("2. Sum of list items");
			System.out.println("3. Maximum item in the list");
			System.out.println("4. Search item in the list");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println(objList);// override toString
				break;
			case 2:
				System.out.println("Sum : " + objList.sumOfList());
				break;

			case 3:
				System.out.println("Largest item in list : "
						+ objList.maxItemInList());
				break;
			case 4:
				System.out.println("Enter the element to be searched");
				int itemToFind = sc.nextInt(12);
				System.out.println("Item found : "
						+ objList.findItemInList(itemToFind));
				break;

			case 5:
				System.exit(0);
			default:
				System.out.println("Enter a correct choice");
			}
		}
	}
}
