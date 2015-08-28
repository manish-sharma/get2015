import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//class to create a binary tree
public class BinaryTree {
	int nodevalue;
	BinaryTree left;
	BinaryTree right;
	public BinaryTree root;
	int countNode = 1;//variable to count total number of nodes
	ArrayList<Integer> inorderItem = new ArrayList<Integer>();
	BinaryTree() {
		root = null;
	}
	//method to insert a node in binary tree
	BinaryTree insert ( BinaryTree node, int item ) {
		if( node == null ) {    //base condition of recursive method
			node = new BinaryTree();
			node.nodevalue = item;
			node.left = null;
			node.right = null;
			countNode++;
		}
		else {         //recursive call of method
			if( countNode%2 == 0 ) {
				node.left = insert( node.left, item );
			}
			else {
				node.right = insert( node.right, item );
			}
		}
		return node;
	}
	//method to show inorder traversal
	ArrayList<Integer> inorder( BinaryTree node ) {
		if( node != null ) {
			inorder( node.left );
			inorderItem.add( node.nodevalue );
			inorder( node.right );
		}
		return inorderItem;
	}
	/*void preorder( BinaryTree node ) {
		if( node != null ) {
			System.out.print(node.nodevalue+" ");
			preorder( node.left );
			preorder( node.right );
		}
	}
	void postorder( BinaryTree node ) {
		if( node != null ) {
			postorder( node.left );
			postorder( node.right );
			System.out.print(node.nodevalue+" ");
		}
	}*/
	//Method to check trees are mirror image or not
	void mirrorImage( BinaryTree m2 ) {
		ArrayList<Integer> tree1, tree2;
		tree1 = this.inorder( this.root );
		tree2 = m2.inorder( m2.root );
		Collections.reverse(tree2);
		System.out.print("\n"+tree1);
		System.out.print("\n"+tree2);
		if( tree1.size() == tree2.size() ) {
			for(int i=0; i<tree1.size(); i++) {
				if(tree1.get(i) != tree2.get(i)) {
					System.out.print("\n Not mirror image ");
					return;
				}
			}
			System.out.print("\n yes mirror image ");
		}
		else {
			System.out.print("\n Not mirror image");
		}
	}
	public static void main(String[] args) {
		int item, choise;
		Scanner sc = new Scanner(System.in);
		BinaryTree tree1 = new BinaryTree();
		BinaryTree tree2 = new BinaryTree();
		try {
			while(true) {
				System.out.print("\n 1. Insert in first tree\n 2. Insertion in second tree\n 3. Check Mirror Image\n 4. Exit");
				System.out.print("\n Enter your choice : ");
				choise = sc.nextInt();
				switch(choise) { 
				case 1:
					System.out.print("\n Enter node value : ");
					item = sc.nextInt();
					tree1.root = tree1.insert( tree1.root, item );
					break;
				case 2:
					System.out.print("\n Enter node value : ");
					item = sc.nextInt();
					tree2.root = tree2.insert( tree2.root, item );
					break;
				case 3:
					tree1.mirrorImage(tree2); break;
				case 4:
					System.exit(0); break;
				default:System.out.println("PLease enter only integer value");
				}
			}
			
		}catch(Exception e){System.out.println("Please enter correct value");}

	}

}
