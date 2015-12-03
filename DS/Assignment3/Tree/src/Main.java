import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		/* Initialization */
		BinaryTree binaryTreeObj1 = null;
		BinaryTree binaryTreeObj2 = null;
		Scanner scan = null;
		boolean flag = false, result;
		
		try
		{
			binaryTreeObj2 = new BinaryTree();
			binaryTreeObj1 = new BinaryTree();
			scan = new Scanner(System.in);
			int choice, number;
			int count = 0;
					
			while (true) {
				
				/* Menu shown to the user */
				System.out.println("Enter your choice\n");
				System.out.println("1. Insert Element into tree");
				System.out.println("2. Preorder Traversal");
				System.out.println("3. Postorder Traversal");
				System.out.println("4. Check for mirror image");
				System.out.println("5. Exit");
				
				/* Taking user's choice as input */
				choice = Validation.isInteger();
	
				switch (choice) {
			
					/* Case to insert elements into tree */
					case 1:
						System.out.println("Enter Number of elements to be inserted in the tree: ");
						do {// Validation
							System.out.println("Enter number greater than zero");
							
							/* taking input number of elements in count */
							count = Validation.isInteger();
							} while (count <= 0);
						/* If count is zero then elements are not taken as input */
						if(count == 0) {
							System.out.println("Number of elements should be at least 1");
							break;
						}
						System.out.println("enter " + count + " numbers.");
						for (int i = 0; i < count;) {
							
							/* Taking elements as input */
							number = Validation.isInteger();	
							result = binaryTreeObj1.insert(number);
							if(result) {
								System.out.println("Succesfully Added");
								i++;
							}
							else
								System.out.println("This number is not successfully added");
						}
						flag = true;
						break;
				
						/* Case for preorder traversal */
					case 2:
						if(flag == false) {
							System.out.println("First insert element into tree");
							break;
						}
						/* Clearing preorderList */
						BinaryTree.preorderList.clear();
						
						/* Clearing postorderList */
						BinaryTree.postorderList.clear();
						result = binaryTreeObj1.preOrder(binaryTreeObj1.getRoot());
						if(result) {
							/* Showing preorder traversal stored in preorderList*/
							System.out.print("Preorder Traversal is : ");
							for (Integer i : BinaryTree.preorderList) {
								System.out.print(i + " ");
							}
							System.out.println();
						}
						else
							System.out.println("Not Traversed Successfully");
						break;
			
						/* Case for postorder traversal */
					case 3:
						
						if(flag == false) {
							System.out.println("First insert element into tree");
							break;
						}
						/* Clearing preorderList */
						BinaryTree.preorderList.clear();
						
						/* Clearing postorderList */
						BinaryTree.postorderList.clear();
						result = binaryTreeObj1.postOrder(binaryTreeObj1.getRoot());
						
						if(result) {
							/* Showing postorder traversal stored in postorderList*/
							System.out.print("Postorder traversal is : ");
							for (Integer i : BinaryTree.postorderList) {
								System.out.print(i + " ");
							}
							System.out.println();
						}
						else
							System.out.println("Not Successfully Traversed");
						break;	
			
						/* Case to insert elements into mirror tree and check whether
						 * both the trees are mirror image or not */
					case 4:
						
						if(flag == false) {
							System.out.println("First insert element into first tree");
							break;
						}
						/* Clearing preorderList */
						BinaryTree.preorderList.clear();
						
						/* Clearing postorderList */
						BinaryTree.postorderList.clear();
						
						/* Inputting elements of second tree */
						System.out.println("Enter "+count+" numbers for Second Tree.");
						for (int i = 0; i < count;) {
							number = Validation.isInteger();
							result = binaryTreeObj2.insertInMirrorTree(number);
							if(result) {
								System.out.println("Succesfully Added");
								i++;
							}
							else
								System.out.println("This number is not successfully added");
						}
						
						/* Checking for mirror image */
						BinaryTree.checkMirrorImage(binaryTreeObj1, binaryTreeObj2);
						
						if (BinaryTree.checkMirrorImage(binaryTreeObj1, binaryTreeObj2))
							System.out.println("Both trees are mirror image of each other.");
						else
							System.out.println("Both trees are not mirror image of each other.");
						break;
			
						/* Exit Case */
					case 5:
						System.out.println("System Exited");
						System.exit(0); // Code to exit the system
						break;
				
						/* Default Case */
					default:
						System.out.println("Enter Correct Choice");
						break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			scan.close();
		}
	}
}
