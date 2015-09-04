class BinarySearchTree {
	String result="";
	Node nodeObject=new Node();
	//to insert a new node in tree
	public Node insertNode(Node node,Integer nodeInformation) {	
		if(node==null) {       //base condition of recursive method
			node=nodeObject.getNewNode(nodeInformation);
			node.leftChildAddress=null;
			node.rightChildAddress=null;
		}
		else if((int)node.nodeInformation>=(int)nodeInformation) {
			node.leftChildAddress=insertNode(node.leftChildAddress,nodeInformation);
		}
		else {
			node.rightChildAddress=insertNode(node.rightChildAddress, nodeInformation);
		}
		return node;
	}		
	//to show BinarySearchTree traversal
	public String inorder(Node node) {
		if(node!=null) {
			inorder(node.leftChildAddress);        
			result=result+node.nodeInformation+" ";
			inorder(node.rightChildAddress);
		}	
		return result;
	}
}
