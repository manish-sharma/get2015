
public class BinarySearchTree<T> 
{
	
	private String inOrderString="";
	
	public String getInOrderString() {
		return inOrderString;
	}


	public void setInOrderString(String inOrderString) {
		this.inOrderString = inOrderString;
	}


	//Insertion of data
	public Node<T> insertData(Node<T> root, T data ) 
	{
		if(root==null) 
		{
			Node<T> newNode = new Node<T>(data);
			return newNode;
		}
		else if((Integer)root.getData()>(Integer)data) 
			root.setLeftNode(insertData(root.getLeftNode(),data));
		else  
			root.setRightNode(insertData(root.getRightNode(), data)); 
		return root;
	}
	
	
	// In order traversal of tree
	public Node<T> inOrderTraversal(Node<T> root)
	{
		if(root!=null) 
		{
			inOrderTraversal(root.getLeftNode());
			System.out.println(root.getData()+" ");
			inOrderString+=root.getData();
			inOrderTraversal(root.getRightNode());
		}
		return null;
	}
	


}
