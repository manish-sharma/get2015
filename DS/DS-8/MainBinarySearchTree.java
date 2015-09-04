/**
 * Class to implement the menu for insertion and inOrder traversal options
 * @author Sanjay
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree bst1 = new BinarySearchTree();

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		try{	
			do {

				System.out.println("\nenter your choice\n1. Enter roll number of students" + 
						"\n2. To view ascending order" +
						"\n3.  exit");
				choice = sc.nextInt();

				switch (choice) {

				case 1:					//to insert nodes in the tree
					System.out.println("how many roll numbers to insert?");
					int count = sc.nextInt();
					System.out.println("enter " + count + " numbers.");
					for (int i = 0; i < count; i++)
						bst1.insert(sc.nextInt());
					break;

				case 2:					
					BinarySearchTree object = new BinarySearchTree();
					object.inOrder(bst1.getRoot());
					for (Integer i : BinarySearchTree.getListInAscendingOrder()) {
						System.out.print(i + " ");
					}
					break;
				case 3:					
					System.exit(0);
					break;
				default:
					System.out.println("choose one of the above option only.");
					break;
				}


			}while(choice!=3);
		}
		catch(InputMismatchException e){
			System.out.println("enter only integer values");
		}
	}

}