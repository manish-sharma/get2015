/**
 * Q2. WAP to find if 2 given trees are mirror similar trees or not?

Note -- A tree A is mirror similar to tree B if:

-------------- Both A and B are blank

-------------- Both A and B are NOT blank, and left subtree of each tree is mirror similar to right subtree of the other tree, and vice versa
 */
import java.util.Scanner;

/**
 * @author Sumitra
 *
 */
public class MirrorImage {
public static void main(String arg[]){
		
		Scanner sc= new Scanner(System.in);
		TreeOperations tree = new TreeOperations();
		TreeOperations treeOperations = new TreeOperations();
		int noOfNodes,choice;
		Node rootFirst = null,rootSecond=null;
		int element;
		char mainChoice;
		String resultFirst = "";
		String resultSecond = "";
		do{
			//menu
			System.out.println("enter value 1 for First tree input,"
					+ "\n2 for Second tree input,"
					+ "\n3 for checking mirror image ,"
					+ "\n4 to exit");
			do {// Validation
				
				while (!sc.hasNextInt()) {
					System.out
							.println("That's not a number!Please enter again");
					sc.next(); // this is important!
				}
				choice = sc.nextInt();
			} while (choice <= 0);
			switch (choice) {
			case 1://To insert data
				
			
				System.out.println("Enter the number of nodes for first Tree");

				do {// Validation
					
					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					noOfNodes=sc.nextInt();
				} while (noOfNodes <= 0);
				System.out.println("First tree");
				System.out.println("Insert an element");
				rootFirst = new Node(sc.nextInt());
				for (int i = 0; i < noOfNodes - 1; i++) {
					System.out.println("Insert an element");
					element = sc.nextInt();
					tree.insertLeft(rootFirst, element);
				}
			
				break;
			case 2: //To insert data
				
			
				System.out.println("Enter the number of nodes for Second Tree");

				do {// Validation
					
					while (!sc.hasNextInt()) {
						System.out
								.println("That's not a number!Please enter again");
						sc.next(); // this is important!
					}
					noOfNodes=sc.nextInt();
				} while (noOfNodes <= 0);
				System.out.println("Second tree");
				System.out.println("Insert an element");
				rootSecond = new Node(sc.nextInt());
				for (int i = 0; i < noOfNodes - 1; i++) {
					System.out.println("Insert an element");
					element = sc.nextInt();
					treeOperations.insertRight(rootSecond, element);
				}
				break;
			case 3: //To check if mirror image or not
				resultFirst = tree.mirrorImageOfTree(rootFirst);
		
				resultSecond = treeOperations.mirrorImageOfTree(rootSecond);
				
				// reversing the string
				String reverse = new StringBuffer(resultSecond).reverse().toString();
			
				if (resultFirst.equals(reverse)) {
					System.out.println("Tree are mirror image");
				}
				else {
					System.out.println("Tree are not mirror Image");
				}
				break;
			default:
				System.out.println("enter rightvalues");
	
			}
			do {// validation
				System.out.println("Do you want to continue(Y/N)"); // continuing
																	// the
																	// procedure
				while (!sc.hasNext()) {
					System.out.println("That's not a character!");
					sc.next(); // this is important!
	
				}
				mainChoice = sc.next().toUpperCase().charAt(0);
				if (mainChoice == 'N')
					System.exit(0);
			} while (mainChoice != 'Y');

		} while (mainChoice == 'Y');
		sc.close();
		
	}
}
