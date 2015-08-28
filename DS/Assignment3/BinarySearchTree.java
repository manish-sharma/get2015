import java.util.Scanner;

/**
 * Class that represents normal implementation of binary search tree
 * 
 * @author Riddhi
 *
 */
public class BinarySearchTree {
	private Node root;

	// insert the value in the tree
	public void insert(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return;
		}
		insertInTree(root, newNode);
	}

	// inserts at subtree of a given node depending on the value
	public void insertInTree(Node latestRoot, Node node) {
		if (node.getData() < latestRoot.getData()) {
			if (latestRoot.getLeft() == null) {
				latestRoot.setLeft(node);
				return;
			}
			insertInTree(root.getLeft(), node);
		} else {
			if (latestRoot.getRight() == null) {
				latestRoot.setRight(node);
				return;
			}
			insertInTree(root.getRight(), node);
		}
	}

	// insert the value in the next tree(For mirror image)
	public void insertMirror(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return;
		}
		insertInMirrorTree(root, newNode);
	}

	// inserts at subtree of a given node depending on the value 
	public void insertInMirrorTree(Node latestRoot, Node node) {
		if (node.getData() > latestRoot.getData()) {
			if (latestRoot.getLeft() == null) {
				latestRoot.setLeft(node);
				return;
			}
			insertInTree(root.getLeft(), node);
		} else {
			if (latestRoot.getRight() == null) {
				latestRoot.setRight(node);
				return;
			}
			insertInTree(root.getRight(), node);
		}
	}

	// inorder traversing of the tree
	public void preorderTraversal(Node currentRoot) {
		if (currentRoot == null) // terminating condition for recursion
			return;
		System.out.print(currentRoot.getData() + " ");
		preorderTraversal(currentRoot.getLeft());
		preorderTraversal(currentRoot.getRight());
	}

	// post order traversal of binary tree
	public void postorderTraversal(Node currentRoot) {
		if (currentRoot == null) // terminating condition for recursion
			return;

		postorderTraversal(currentRoot.getLeft());
		postorderTraversal(currentRoot.getRight());
		System.out.print(currentRoot.getData() + " ");
	}

	// main function
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {

			BinarySearchTree object = new BinarySearchTree();
			int y = 1, value;
			int choice;
			do {
				System.out.println("\n 1.Create Tree");
				System.out.println("2.In Order Traversal");
				System.out.println("3.Post Order Traversal");
				System.out.println("4.Check Mirror Tree");
				System.out.println("5.Exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter value of nodes");
					value = sc.nextInt();
					object.insert(value);
					break;

				case 2:
					System.out.println("Pre order Traversal of tree is:\n");
					object.preorderTraversal(object.root);
					break;

				case 3:
					System.out.println("Post order Traversal of tree is:\n");
					object.postorderTraversal(object.root);
					break;

				case 4:
					MirrorImage m = new MirrorImage();
					BinarySearchTree object2 = new BinarySearchTree();
					do {                          
						System.out.println("Enter value of node");         //ask for values for values to be inserted in another tree
						value = sc.nextInt();
						object2.insertMirror(value);
						System.out.println("Press 1 to continue");
						y = sc.nextInt();
					} while (y == 1);
					System.out.println("Tress are Mirror Images : "
							+ m.checkMirrorImage(object.root, object2.root));
					break;

				case 5:
					System.exit(0);
				}
			} while (true);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
		}
	}
}
