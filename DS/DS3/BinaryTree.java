/**
 * @author Nikhil
 *
 */
public class BinaryTree {
	Node root;
	String binaryTree = "";
	String mirrorMinaryTree = "";

	BinaryTree() {
		root = null;
	}
	 /**
     * insertionInBinaryTree is a function which is used to insert an element in binary tree.
     * if binary tree is not created this function created the tree.
     */
	Node insertionInBinaryTree(int value, Node insert) {

		if (insert == null) {
			Node newNode = new Node(value, null, null);
			return newNode;
		} else {
			if (insert.getValue() > value) {
				insert.setLeftChild(insertionInBinaryTree(value,
						insert.getLeftChild()));
			} else if (insert.getValue() < value) {
				insert.setRightChild(insertionInBinaryTree(value,
						insert.getRightChild()));
			}
		}
		return insert;
	}

/**
* insertionInMirrorBinaryTree is a function which is used to insert an element in binary tree.
* if binary tree is not created this function created the tree.
*/
	Node insertionInMirrorBinaryTree(int value, Node insert) {

		if (insert == null) {
			Node newNode = new Node(value, null, null);
			return newNode;
		} else {
			if (insert.getValue() < value) {
				insert.setLeftChild(insertionInMirrorBinaryTree(value,
						insert.getLeftChild()));
			} else if (insert.getValue() > value) {
				insert.setRightChild(insertionInMirrorBinaryTree(value,
						insert.getRightChild()));
			}
		}
		return insert;
	}
	/**
	* inorderTraverse is a function which is used to print all node in sorted order
	* it's print Left,Root,Right order 
	*/
	public void inorderTraverse(Node inorder) {
		if (inorder != null) {
			inorderTraverse(inorder.getLeftChild());
			System.out.println(inorder.getValue());
			inorderTraverse(inorder.getRightChild());
		}

	}
	/**
	* postOrderTraverse is a function which is used to print all node of tree
	* in Left,Right,Root order 
	*/
	public void postOrderTraverse(Node postorder, boolean flag) {
		if (postorder != null) {

			postOrderTraverse(postorder.getLeftChild(), flag);
			postOrderTraverse(postorder.getRightChild(), flag);

			if (flag)
				System.out.println(postorder.getValue());

			else
				mirrorMinaryTree = postorder.getValue() + mirrorMinaryTree;
		}

	}
	/**
	* preOrderTraverse is a function which is used to print all node of tree
	* in Root,Left,Right order 
	*/
	public void preOrderTraverse(Node preorder, boolean flag) {
		if (preorder != null) {
			if (flag)
				System.out.println(preorder.getValue());
			else
				binaryTree = binaryTree + preorder.getValue();
			preOrderTraverse(preorder.getLeftChild(), flag);
			preOrderTraverse(preorder.getRightChild(), flag);

		}

	}
	/**
	* checkForMirrorImageOfBinaryTree is a function which is used to check that two trees are mirror image or not
	*
	*/
	public boolean checkForMirrorImageOfBinaryTree(Node originalNode,
			Node mirrorNode) {
		preOrderTraverse(originalNode, false);
		postOrderTraverse(mirrorNode, false);

		if (mirrorMinaryTree.equals(binaryTree))
			return true;
		else
			return false;

	}

	
}
