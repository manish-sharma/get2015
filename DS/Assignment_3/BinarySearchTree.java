package assignmentDS_3;

/* 
 * /*Here we implement the Binary search Tree.
* @author  Neha Bansal
* @version 1.0
* @since   2015-08-31
*/
 
 
 /*
  * Class Node
  */
class Node{
	//data held by the node
	public int nodeValue;
	//left node of the current root node
	public Node left;
	
	//right node of the current root node
	public Node right;
	
	
	//default constructor with no initial value
	public Node() {
		super();
		this.nodeValue = 0;
		this.left = null;
		this.right = null;
	}

	
	//initialize node value to the item and set left and right to null
	public Node(int item) {
		super();
		this.nodeValue = item;
		this.left = null;
		this.right = null;
	}
	
}

/*
 * Class Binary Search Tree
 */
public class BinarySearchTree 
{
	Node root;

	//Constructor
	public BinarySearchTree() {
		super();
		root=null;
		
	}
	
	
	/*
	 * below code is use to insert data in binary search tree
	 * @param data:element that is to insert
	 * @param root:root node of binary search Tree
	 * @return root node of binary search tree
	 */
	public Node insert(int data,Node root)
	{
		
		if(root==null)   
        {
			Node  newNode=new Node(data);
			return newNode;
		}
		if(data<=root.nodeValue)   //if value of current node is less than root then set it as left child
		{
			root.left=insert(data,root.left);
			
		}
		else              ///if value of current node is greater than root then set it as right child
		{
			root.right=insert(data,root.right);    
			
		}
		return root;
			
	}
	
	
	
	/*
	 * below method is to implement pre-order traversal of binary search tree
	 * @param root:Root node of binary search tree
	 */
	public void preOrder(Node root)
	{
		if(root!=null)
		{
			System.out.print(root.nodeValue+" ");
		}
		if(root.left!=null)
		{
			preOrder(root.left);
		}
		if(root.right!=null)
		{
			preOrder(root.right);
		}
		
			
		
	}
	
	
	/*
	 * below method is check whether the given two binary search tree are mirror similar or not
	 * @param root1:root node of one binary search tree
	 * @param root2:root node of another binary search tree
	 * return true if they are mirror similar either return false
	 */
	public boolean mirrorImage(Node root1,Node root2)
	{
		boolean temp=true;
		boolean temp1=true;
		boolean temp2=true;
		
		if(root1==null&&root2==null)
		{
			return true;
		}
		else if((root1!=null&&root2==null)||(root1!=null&&root2==null))
		{
		return false;
		}
		else if(root1.nodeValue!=root2.nodeValue)
		{
			return false;
		}
		else
		{
			temp1=mirrorImage(root1.left,root2.left);
			temp2=mirrorImage(root1.right,root2.right);
			return (temp1&&temp2);
			
		}
		
		
		
		
		
	}
	/*
	 * below method is to implement post-order traversal of binary search tree
	 * @param root:Root node of binary search tree
	 */
	public void postOrder(Node root)
	{
		
		if(root.left!=null)
		{
			postOrder(root.left);
		}
		if(root.right!=null)
		{
			postOrder(root.right);
		}
		if(root!=null)
		{
			System.out.print(root.nodeValue+" ");
		}
		
			
		
	}
	
	//main function
	public static void main(String args[])
	{
		BinarySearchTree binaryTreePreorder=new BinarySearchTree();
		binaryTreePreorder.root=binaryTreePreorder.insert(5, binaryTreePreorder.root);
		binaryTreePreorder.root=binaryTreePreorder.insert(6, binaryTreePreorder.root);
		binaryTreePreorder.root=binaryTreePreorder.insert(2, binaryTreePreorder.root);
		binaryTreePreorder.root=binaryTreePreorder.insert(20, binaryTreePreorder.root);
		binaryTreePreorder.root=binaryTreePreorder.insert(40, binaryTreePreorder.root);
	
		
		BinarySearchTree binaryTreePreorder1=new BinarySearchTree();
		binaryTreePreorder1.root=binaryTreePreorder1.insert(5, binaryTreePreorder1.root);
		binaryTreePreorder1.root=binaryTreePreorder1.insert(6, binaryTreePreorder1.root);
		binaryTreePreorder1.root=binaryTreePreorder1.insert(20, binaryTreePreorder1.root);
		binaryTreePreorder1.root=binaryTreePreorder1.insert(40, binaryTreePreorder1.root);
		binaryTreePreorder1.root=binaryTreePreorder1.insert(2, binaryTreePreorder1.root);

		
		boolean temp=binaryTreePreorder.mirrorImage(binaryTreePreorder.root,binaryTreePreorder1.root);
		
		binaryTreePreorder.postOrder(binaryTreePreorder.root);
		System.out.println("\n ");
		binaryTreePreorder1.preOrder(binaryTreePreorder1.root);
		
		
	}

	

}
