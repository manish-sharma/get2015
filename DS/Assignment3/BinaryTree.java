package ds3;

/** this clas holds the data and functionality of binary tree
 * @author Khemanshu
 *
 */
public class BinaryTree {

	//data holds the value of particular node
	private int data;
	//left points to the left child of the node
	private BinaryTree left;
	//right points to the right child of the node
	private BinaryTree right;

	public BinaryTree() {
		this.data = 0;
		this.left = null;
		this.right = null;
	}
	public BinaryTree(int num) {
		this.data = num;
		this.left = null;
		this.right = null;
	}

	/**adding a node to tree
	 * @param num
	 */
	public void addNode(int num) {
		if (num < this.data) {
			if (this.left != null) {
				this.left.addNode(num);
			} else {
				this.left = new BinaryTree(num);
			}

		} else {
			if (this.right != null) {
				this.right.addNode(num);
			} else {
				this.right = new BinaryTree(num);
			}

		}
	}
	
	/**adding a node in mirror tree this function runs only in mirror image class
	 * @param num
	 */
	public void addNodeInSecondTree(int num) {
		if (num < this.data) {
			if (this.right != null) {
				this.right.addNodeInSecondTree(num);
			} else {
				this.right = new BinaryTree(num);
			}

		} else {
			if (this.left != null) {
				this.left.addNodeInSecondTree(num);
			} else {
				this.left = new BinaryTree(num);
			}

		}
	}

	/**traverse the tree in pre order i.e. root->left->right
	 * 
	 */
	public void traversePreOrder() {
		System.out.println(this.data);
		if (this.left != null) {
			this.left.traversePreOrder();
		}
		if (this.right != null) {
			this.right.traversePreOrder();
		}
	}

	/**traverse the tree in In-order type i.e. left->root->right
	 * 
	 */
	public void traverseInOrder() {
		if (this.left != null) {
			this.left.traverseInOrder();
		}
		System.out.println(this.data);
		if (this.right != null) {
			this.right.traverseInOrder();
		}
	}

	/**traverse the tree in post order i.e. left->right->root
	 * 
	 */
	public void traversePostOrder() {
		if (this.left != null) {
			this.left.traversePostOrder();
		}
		if (this.right != null) {
			this.right.traversePostOrder();
		}
		System.out.println(this.data);
	}
	
	/**checks that the two tree are mirror image of each other or not
	 * @param tree1
	 * @param tree2
	 * @return
	 */
	public static boolean isMirrorImage(BinaryTree tree1, BinaryTree tree2) {
		if (tree1 == null && tree2 == null) {															
			   return true;
			} 
		else if (tree1 != null && tree2 != null) {System.out.println(tree1.data+"->"+tree2.data);
		   return tree1.data == tree2.data && isMirrorImage(tree1.left, tree2.right)
		   && isMirrorImage(tree1.right, tree2.left);
			} 
		else {
			   return false;
		}
	}

	

}