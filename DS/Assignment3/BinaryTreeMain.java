package ds3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**this class is use to run the normal functioning of the binary tree
 * @author Khemanshu
 *
 */
public class BinaryTreeMain {

	/**takes integer from console
	 * @return
	 */
	private static int userInput() {
    	int number = 0;
    	Scanner sc = new Scanner(System.in);
    	try {
    		number = sc.nextInt();
    		return number;
    	}
    	catch(InputMismatchException e) {
    		System.out.println("enter only integer");
    		number = userInput();
    	}
    	return number;
    }
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		//ch is the choice variable in switch 
		//value is the value entered by the user for node
		int ch, value;
		//isCreate checks that the tree is created or not
		boolean isCreate = false;
		while (true) {
			System.out.print("\n 1. Create a tree"
					+ "\n 2. Add Element to tree"
					+ "\n 3. pre-order traversal "
					+ "\n 4. post-order traversal"
					+ "\n 5. in-order traversal"
					+ "\n 6. Exit");
			System.out.print("\n Enter Your choice : ");
			ch = userInput();
			switch (ch) // Apply switch case and call corresponding method
						// according to the user's choice
			{
			case 1:
				if(isCreate == false){
					isCreate = true;
					System.out.println("enter a root value");
					value = userInput();
					tree = new BinaryTree( value );
				}
				else {
					System.out.println("tree is already been created kindly add only node in tree");
				}
				break;
			case 2:
				if(isCreate == true) {
					System.out.println("enter value");
					value = userInput();
					tree.addNode(value);
				}
				else {
					System.out.println("firstly create tree then add element");
				}
				break;
			case 3:
				tree.traversePreOrder();
				break;
			case 4:
				tree.traversePostOrder();
				break;
			case 5:
				tree.traverseInOrder();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("enter correct option");
				break;
			}
		}
	}
}
