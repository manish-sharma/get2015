package ds3;

import java.util.InputMismatchException;
import java.util.Scanner;

/** this class is use to run the mirror functioning of the binary tree
 * @author Khemanshu
 *
 */
public class MirrorImageMain {

	/**this function takes the input from the user of only integer type
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
		
		//tree1 is the tree 1 of binary tree type
		BinaryTree tree1 = new BinaryTree();
		//tree2 is the 2 tree of binary tree type
		BinaryTree tree2 = new BinaryTree();
		//ch is the choice variable in switch case
		// value is the value of node of a tree
		int ch, value;
		// isCreateTree1 checks that tree 1 is created or not
		boolean isCreateTree1 = false;
		//isCreateTree2 checks that tree2 is created or not
		boolean isCreateTree2 = false;
		//isMirror checks that the tree are mirror image or not
		boolean ismirror = false;
		while (true) {
			System.out.print("\n 1. Create a tree1"
					+ "\n 2. Add Element to tree1"
					+ "\n 3.traverse in-order 1 tree"
					+ "\n 4. Create a tree2 "
					+ "\n 5. Add Element to tree2"
					+ "\n 6. traverse in-order 2 tree"
					+ "\n 7. compare mirror image"
					+ "\n 8. Exit");
			System.out.print("\n Enter Your choice : ");
			ch = userInput();
			switch (ch) // Apply switch case and call corresponding method
						// according to the user's choice
			{
			case 1:
				if(isCreateTree1 == false){
					isCreateTree1 = true;
					System.out.println("enter a root value");
					value = userInput();
					tree1 = new BinaryTree( value );
				}
				else {
					System.out.println("tree is already been created kindly add only node in tree");
				}
				break;
			case 2:
				if(isCreateTree1 == true) {
					System.out.println("enter value");
					value = userInput();
					tree1.addNode(value);
				}
				else {
					System.out.println("firstly create tree then add element");
				}
				break;
			case 3:
				tree1.traverseInOrder();
				break;
			case 4:
				if(isCreateTree2 == false){
					isCreateTree2 = true;
					System.out.println("enter a root value");
					value = userInput();
					tree2 = new BinaryTree( value );
				}
				else {
					System.out.println("tree is already been created kindly add only node in tree");
				}
				break;
			case 5:
				if(isCreateTree2 == true) {
					System.out.println("enter value");
					value = userInput();
					tree2.addNodeInSecondTree(value);
				}
				else {
					System.out.println("firstly create tree then add element");
				}
				break;
			case 6:
				tree2.traverseInOrder();
				break;
			case 7:
				ismirror = BinaryTree.isMirrorImage(tree1,tree2);
				if(ismirror)
					System.out.println("tree are mirror image of each other");
				else
					System.out.println("tree are not mirror image of each other try one morer time with another example");
				break;
			case 8:
				System.exit(0);
			default:
				System.out.println("enter correct option");
				break;
			}
		}
	}
}
