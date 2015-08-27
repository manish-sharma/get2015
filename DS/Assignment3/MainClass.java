/**
 * @author Girdhari
 * This is main class of assignment 3
 */
package traversal;

import java.util.Scanner;

/* Start of MainClass */
public class MainClass {
	/* End of main function */
	public static void main(String []args) {
		BinarySearchTree bstObject = new BinarySearchTree();
		Scanner scannerObject = new Scanner(System.in);
		Node newNode = new Node();
		Node current = null;
		Node root = null;
		newNode.setDataNode(10);
		current = bstObject.insertElement(current, newNode);
		newNode.setDataNode(9);
		current = bstObject.insertElement(current, newNode);
		newNode.setDataNode(11);
		current = bstObject.insertElement(current, newNode);
		newNode.setDataNode(8);
		current = bstObject.insertElement(current, newNode);
		
		PreOrderTraverse traversalObject = new PreOrderTraverse();
		traversalObject.preOrderTraversal(current);
		
		
	/*	 To check whether two trees are mirror of each other */
		System.out.println("Do You want to check whether to tree are mirror of each other");
		String choice = scannerObject.next();
		if(choice.equalsIgnoreCase("y")) {
			checkMirror();
		}
		else {
			System.exit(0);
		}
	}
	/* End of main function */
	
	/* Starting of checkMirror function*/ 
	public static void checkMirror() {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter total number of nodes per tree: ");
		int numberOfNodes = scannerObject.nextInt();
		System.out.println("Enter Elements of First Tree: ");
		BinarySearchTree bstObject1 = new BinarySearchTree();
		int number;
		for(int count = 0 ; count < numberOfNodes ; count++) {
			System.out.println("Element:");
			number = scannerObject.nextInt();
			
		}

		System.out.println("Enter Elements of Second Tree: ");
		BinarySearchTree bstObject2 = new BinarySearchTree();
		for(int count = 0 ; count < numberOfNodes ; count++) {
			System.out.println("Element:");
			number = scannerObject.nextInt();
			
		}
		CheckMirror checkMirrorObject = new CheckMirror();
		String preOrderString = PreOrderTraverse.getPreOrderString();
		String postOrderString = PostOrderTraverse.getPostOrderString();
		if ( checkMirrorObject.isMirror(preOrderString, postOrderString)) {
			System.out.println("Tree 1 is Mirror Image of Tree 2");
		} else {
			System.out.println("Tree 1 is Not Mirror Image of Tree 2");
		}
	}
	 /* End of checkMirror function*/ 
}
/* End of MainClass */
