import java.util.InputMismatchException;
import java.util.Scanner;


public class BinaryTreeUse {
	

    /** takes input from user and check it same time
     * @return a integer type value entered by user
     */
	static int userInput() {
    	int number = 0;
    	Scanner sc = new Scanner(System.in);
    	try {
    		number = sc.nextInt();
    		return number;
    	}
    	catch(InputMismatchException e) {
    		System.out.println("\n enter only integer");
    		number = userInput();
    	}
    	return number;
    }
	public static void main(String args[]) {

		BinaryTree binaryTree = new BinaryTree();
		BinaryTree binaryTree1 = new BinaryTree();
		while (true) 
		{
			System.out.print("\n 1. Create tree and insert in a tree"
					+ "\n 2. preorder traversal"
					+ "\n 3. Postorder travesal"
					+ "\n 4. Inorder travesal"
					+ "\n 5. create and insert in mirror tree"
					+ "\n 6. check the both tree is mirror or not"
					+ "\n 7. Exit");
			System.out.println("\n Enter Your choice : ");
			int choice = BinaryTreeUse.userInput();	
	     switch (choice) {
		    case 1:   System.out.println("Enter the value");
		    	       int value=BinaryTreeUse.userInput();
			          binaryTree.root= binaryTree.insertionInBinaryTree(value,binaryTree.root);
			          break;
            case 2:     binaryTree.preOrderTraverse(binaryTree.root, true);
                       break;
		    case 3:     binaryTree.postOrderTraverse(binaryTree.root,true);
	                	break;
            case 4:    binaryTree.inorderTraverse(binaryTree.root);
                       break;                  
	        case 5:   System.out.println("Enter the value");
 	                  value=BinaryTreeUse.userInput();
 	                   binaryTree1.root=binaryTree1.insertionInMirrorBinaryTree(value,binaryTree1.root);
	                   break;
	        case 6:     if(binaryTree.checkForMirrorImageOfBinaryTree(binaryTree.root,binaryTree1.root))
	        	         System.out.println("Both trees are mirror image to each other");
	                     else
	                   	 System.out.println("both are not mirror image");
	                    break;
	        case 7:      choice=7;      
                         break;
             default:   System.out.println("Enter correct choice");            

		}	
	      	 
		
		
	}

	}
	}
