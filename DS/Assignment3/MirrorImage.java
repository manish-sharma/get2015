public class MirrorImage {
	//
	// function returns a node type object and creates a new mirrored tree
	// public Node createMirrorImage(Node originalTreeNode,Node mirrorTreeNode){
	//
	// mirrorTreeNode.setData(originalTreeNode.getData());
	//
	// if(originalTreeNode.getLeft() != null){
	// mirrorTreeNode.setLeft(createMirrorImage(originalTreeNode.getRight(),new
	// Node(0)));
	// }
	//
	// if(originalTreeNode.getRight() != null){
	// mirrorTreeNode.setRight(createMirrorImage(originalTreeNode.getLeft(), new
	// Node(0)));
	// }
	//
	// return mirrorTreeNode;
	//
	// }

	//function to check if two trees are mirror images of each other
	public boolean checkMirrorImage(Node root1, Node root2) {
		if (root1==null &&  root2==null) {
			return true;
		} else {
			if (root1.getData() == root2.getData()
					&& checkMirrorImage(root1.getLeft(), root2.getRight())
					&& checkMirrorImage(root1.getRight(), root2.getLeft())) {
				return true;
			}
		}
		return false;
	}

}
