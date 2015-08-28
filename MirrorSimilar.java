package com;

import java.util.Scanner;
/*
 * @ sumitra
 * class MirrorSimilar compare two tree
 */
public class MirrorSimilar{
	static Scanner scan =new Scanner(System.in);
	static Node<Integer> root1;
	static Node<Integer> root2;
	/*
	 * main method of class mirror similar
	 * it take value of two trees using method insert tree and create binary tree
	 */
public static void  main(String []args) {
	   
	
	          Tree treeObject =new Tree();
	          MirrorSimilar mirrorSimilar = new MirrorSimilar();
	     
	     try{
	    	 
	         System.out.println("Enter  no of Nodes in First tree :");
	         int noOfNodes1 = scan.nextInt();
	         System.out.println("Enter First tree values:");
	    
	    for(int i =0;i<noOfNodes1;i++)
	     {
	    	
		    int item =scan.nextInt();
	    	Tree.root = treeObject.insert(Tree.root, item,i);
	     }
		
	          root1 = Tree.root;
	    	 System.out.println("Enter  no of Nodes in Second tree :");
	         int noOfNodes2 = scan.nextInt();
	         System.out.println("Enter Second tree values:");
	   for(int i =0;i<noOfNodes2;i++)
	     {
		     int item =scan.nextInt();
		     Tree.root = treeObject.insert(Tree.root, item,i);
		
	     }
	       	root2 = Tree.root;
		    boolean result = mirrorSimilar.mirrorSimilar(root1, root2);
		
		if(result){
			System.out.println("Both trees are mirror similar");
			System.out.println("**Exit**");
		}
		else{
			System.out.println("Both trees are not mirror similar");
	     	System.out.println("**Exit**");
		}
	  }catch(Exception e){
		System.out.println("Enter valid values");
		System.out.println("**Exit**");
	}
	
	}
/*
 * @ return boolean value true if both trees are are mirror similar
 * 
 */
	
	public boolean  mirrorSimilar(Node<Integer> root1, Node<Integer> root2) {
		                 
		     boolean status=false;
		  
		     if(root1 ==null && root2 == null){
		               	status = true;
		          }
		
		else	{
			
			if(root1 == null && root2 != null) return false;
			if(root2 == null && root1 != null) return false;
		
	   else if(root1.nodeValue == root2.nodeValue){
			status = (mirrorSimilar(root1.left, root2.right) && mirrorSimilar(root1.right, root2.left));
		}
		else
			return false;
		}
		return status;
		
	}
}
