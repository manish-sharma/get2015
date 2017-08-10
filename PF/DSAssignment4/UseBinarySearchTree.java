import java.util.Scanner;

/**
 * @author Sumitra
 * this is the main class to implement psotfix and prefix.
 */
public class UseBinarySearchTree {
	public static void main(String arg[]) {
		BinarySearchTree binary = new BinarySearchTree();
		Scanner scanner = new Scanner(System.in);
		char choice = 0;
		do {
			System.out.println("enter 1 insert");
			System.out.println("enter 2 to postfix");
			System.out.println("enter 3 for prefix");
			System.out.println("enter your choice");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				//to insert in binary tree.
				System.out.println("enter data");
				int data = scanner.nextInt();
				binary.insert(data);
				break;
			case 2:
				System.out.println("postfix is---");
				binary.postOrder();
				break;
			case 3:
				System.out.println("prefix is----");
				binary.preorder();
				break;
			default:
				System.out.println("enter correct choice");
				break;
			}
			System.out.println("enter y to continue");
			System.out.println("enter n to exit");
			System.out.println("enter your choice");
			choice = scanner.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');
		scanner.close();
	}
}
