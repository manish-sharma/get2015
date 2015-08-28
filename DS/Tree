import java.util.Scanner;
/*This class implements all the function of creating tree and insertion of nodes,pre-order travesal,post order traversal and 
 * checking if two trees are mirror images or not 
 * @author Shishir Pareek
 * Date 27th August 2015
 */
public class Tree{

	TreeNode root;//global variable to hold root node address of tree1
	TreeNode root2;//global variable to hold root node address of tree2
	/*function to insert data in tree*/
	public void insert(int data)
	{
		root=insert(root,data);
	}
	/*overloaded method to perfrom all the checks for inserting the tree nin node and then returning the node*/ 
	public TreeNode insert(TreeNode r,int value) 
	{
		
		
		if(r==null)//tree is not created 
		{
			
			r=new TreeNode(value);//creating tree
		}
		else if(value<r.getValue())//if value is less than root value so insert in left
		{
			r.lefChild=insert(r.lefChild,value);//recursive function call
		}
		
		else
		{
			r.rightChild=insert(r.rightChild,value);//value is greater than root value so insert in right
		}
		
		return r;
		
	}
	
	public void insertReverse(int data)//value to insert the node for mirror tree
	{
		root2=insertReverse(root2, data);
	}
	/*overloaded method to performs checks to insert node in mirror tree*/ 
	public TreeNode insertReverse(TreeNode r,int value)
	{

		if(r==null)//tree is created
		{
			
			r=new TreeNode(value);
		}
		else if(value>r.getValue())//value is greater than root than insert in left
		{
			r.lefChild=insertReverse(r.lefChild,value);//recursive function call
		}
		
		else
		{
			r.rightChild=insertReverse(r.rightChild,value);//value is less than root
		}
		
		return r;
	}
	/*function to print tree node in pre order that is parent,left child,right child*/
	public void preOrderTraversal()
	{
		preOrderTraversal(root);
	}
	/*overloaded function to perform check of pre-order traversal*/
	public void preOrderTraversal(TreeNode r)
	{
		if(r!=null)//base condition
		{
	
	    System.out.print(r.value + "  ");//print parent
		preOrderTraversal(r.lefChild);//to print left subtree elements
		preOrderTraversal(r.rightChild);//to print right subtree elements
		}
		
		
	}
	/*function to traverse tree in post order i.e,leftchild,rightchild,parent*/
	public void postOrderTraversal()
	{
		postOrderTraversal(root);
	}
	/*overloaded function to perform check of post-order traversal*/
	public void postOrderTraversal(TreeNode r)
	{
		if(r!=null)//base condition for recursion
		{
	    
		postOrderTraversal(r.lefChild);//to print left child
		postOrderTraversal(r.rightChild);//to print right child
		System.out.print(r.value + " ");//to print parent
		}
	
	}
	/*
	public TreeNode mirrorImage(TreeNode root)
	{
		TreeNode tempRoot=null;
		if(root==null)
		{
			return null;
		}
		
		else
		{
		tempRoot=root.getLefChild();
		root.setLefChild(root.getRightChild());
		root.setRightChild(tempRoot);
		mirrorImage(root.getLefChild());
		mirrorImage(root.getRightChild());
		}
		
		return root;
	}*/
	
	/*function to compare if two tree are mirror image or not*/ 
	public void compare()
	{
		boolean check=compare(root,root2);
		if(check==true)//if check is true than its mirror image
			System.out.println("Both trees are mirror image of each other");
		else//two trees are not mirror images
			System.out.println("Trees are not mirror image of each other");
	}
	/*overloaded function to perform check for comparison of two trees for mirror images*/
	public boolean compare (TreeNode r,TreeNode r2)
	{  
		
		
		if(r==null && r2==null)//if both are null then its mirror image
		{
	        return true;
		}
		
		else
		{
	     if(r.getValue() == r2.getValue()
			&& compare(r.getLefChild(), r2.getRightChild())
			&& compare(r.getRightChild(), r2.getLefChild()))//recursive function call to check the conditon i.e,leftsubtree of tree1=rightsubtree of tree2 vice versa
	     {
	    	 return true;
	     }
	     
	     return false;
   }
}

	
}
