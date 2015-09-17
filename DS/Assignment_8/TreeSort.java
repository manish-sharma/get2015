

import java.util.ArrayList;

/**
* Here we implement the Binary search Tree.
* @author  Neha Bansal
* @version 1.0
* @since   2015-09-6
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
public class TreeSort 
{
	Node root;

	//Constructor
	public TreeSort() {
		super();
		root=null;
		
	}
	
	
	/**
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
	
	public ArrayList<Integer> DispalyInSortedOrder(Node root,ArrayList<Integer> arr)
	{
		
		
		if(root.left!=null)
		{
			arr=DispalyInSortedOrder(root.left,arr);
		}
		if(root!=null)
		{
			arr.add(root.nodeValue);
			//System.out.print(root.nodeValue+" ");
			
		}
		if(root.right!=null)
		{
			arr=DispalyInSortedOrder(root.right,arr);
		}
		return arr;
		
			
		
	}
	
}
