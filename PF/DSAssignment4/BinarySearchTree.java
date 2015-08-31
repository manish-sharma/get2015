/**
 * @author Sumitra
 *this class is to implement binary search tree.
 */
public class BinarySearchTree {

	BinarySearchTreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void insert(int data) {
		root = insert(root, data);
	}
/**
 * 
 * @param node node where to insert
 * @param data to be inserted
 * @return
 */
	public BinarySearchTreeNode insert(BinarySearchTreeNode node, int data) {
		if (node == null) {
			return node = new BinarySearchTreeNode(data);
		} else {
			if (data <= node.getData()) {
				node.leftNode = insert(node.leftNode, data);
			} else {
				node.rightNode = insert(node.rightNode, data);
			}
		}
		return node;

	}

	public void preorder() {
		preorder(root);
	}
/**
 * 
 * @param r root node of the tree
 */
	private void preorder(BinarySearchTreeNode r) {
		if (r != null) {
			System.out.print(r.getData() + " ");
			preorder(r.getLeftNode());
			preorder(r.getRightNode());
		}
	}

	public void postOrder() {
		postOrder(root);
	}
/**
 * 
 * @param r root node of the tree
 */
	private void postOrder(BinarySearchTreeNode r) {
		if (r != null) {
			postOrder(r.getLeftNode());
			postOrder(r.getRightNode());
			System.out.print(r.getData() + " ");

		}
	}

}
