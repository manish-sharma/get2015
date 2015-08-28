import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Main Binary search class is used to make binary search tree
 * various operations are to be performed like insertion ,pre order traversal, post order traversal
 * Mirror images of two binary tree
 * @author Sanjay
 * @since 27-08-2015
 */

public class MainBinarySearchTree {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree bst1 = new BinarySearchTree();			//first tree
		BinarySearchTree bst2 = new BinarySearchTree();			//second tree for comparing mirror image
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		try{	
		   do {
			
			System.out.println("enter your choice\n1. insert into tree" + // display menu
					"\n2. preOrder traversal" +
					"\n3. postOrder traversal" +
					"\n4. check mirror image" +
					"\n5. exit");
			choice = sc.nextInt();

			switch (choice) {
		
				case 1:					//to insert nodes in the tree
					System.out.println("how many element to insert?");
					int count = sc.nextInt();
					System.out.println("enter " + count + " numbers.");
					for (int i = 0; i < count; i++)
						bst1.insert(sc.nextInt());
					break;
			
				case 2:					//to print the preorder traversal
					BinarySearchTree.list1.clear();
					BinarySearchTree.list2.clear();
					System.out.print("Pre-Order traversal is : ");
					bst1.preOrder(bst1.root);
					for (Integer i : BinarySearchTree.list1) {
						System.out.print(i + " ");
					}
					System.out.println();
					break;
		
				case 3:					//to print the postorder traversal
					BinarySearchTree.list1.clear();
					BinarySearchTree.list2.clear();
					System.out.print("Post-Order traversal is : ");
					bst1.postOrder(bst1.root);
					for (Integer i : BinarySearchTree.list2) {
						System.out.print(i + " ");
					}
					System.out.println();
					break;	
		
				case 4:					//to find whether tree is mirror image of another tree
					System.out.println("how many elements you want to insert");
					int number = sc.nextInt();
					for (int i = 0; i < number; i++)
						bst2.insertInMirror(sc.nextInt());
					BinarySearchTree.checkMirrorImage(bst1, bst2);
					if (BinarySearchTree.checkMirrorImage(bst1, bst2) == true)
						System.out.println("trees are mirror image.");
					else
						System.out.println("trees are not mirror image.");
					break;
		
				case 5:					//exit
					System.exit(0);
					break;
			
				default:
					System.out.println("choose one of the above option only.");
					break;
			}
			
			
		}while(choice!=5);
		}
		catch(InputMismatchException e){
			System.out.println("enter only integer values");
		}
	}

}