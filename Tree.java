package com;

import java.util.Scanner;

/*
 * @ sumitra
 *  class tree use class node and create tree structure
 *
 */
public class Tree {
              static int item,count;
              static Node<Integer> root =null;
              Node<Integer> newNode = null;
              static Scanner scan =new Scanner(System.in);
 /*
  * main method of class tree
  * it take option from user  and from operation accordingly;
  */
 public static void main(String []args) {
                  int choice =0;
                  Tree treeObject= new Tree();
     try{
           do{
    	         System.out.println("Enter 1 to insert value in tree\nEnter 2 to Display preorder\nEnter 3 to Disply postorder\n Enter 4 to create BST\nEnter 0 to Exit");
        	     choice = scan.nextInt();
        	   
       switch (choice) {
			
       case 1:
    	   System.out.println("ADD Item:");
				  int addMore=0;
				  
			do{     
			      int flag=0;
				  System.out.println("Enter Item:");
			      item = scan.nextInt();
			      root= treeObject.insertBinarySearchTree(root, item);
			      count++;
			      System.out.println("Add more item then press 1 else 0:");
                  addMore = scan.nextInt();
			     
	         if(addMore== 0) flag =1;
			    
	            if(addMore== 1) flag =1;
			      
	            while((flag != 1))  {
	            	
			     System.out.println("choose valid option:");
			     addMore = scan.nextInt();
			    	   
			   if(addMore== 0) flag =1;
				     
			   if(addMore== 1) flag =1;
			       }
				   }while(addMore != 0);
				break;
				
		case 2:   System.out.println("per order");
			      treeObject.preOrder(root);
				
		          break;
			
		case 3:  System.out.println("post order");
			    treeObject.postOrder(root);
			   
		          break;
		case 4:  System.out.println("BST");
		 System.out.println("ADD Item:");
		  int add=0;
		  
	do{     
	      int flag=0;
		  System.out.println("Enter Item:");
	      item = scan.nextInt();
	      root= treeObject.insertBinarySearchTree(root, item);
	      count++;
	      System.out.println("Add more item then press 1 else 0:");
         add = scan.nextInt();
	     
    if(add== 0) flag =1;
	    
       if(add== 1) flag =1;
	      
       while((flag != 1))  {
       	
	     System.out.println("choose valid option:");
	     add = scan.nextInt();
	    	   
	   if(add== 0) flag =1;
		     
	   if(add== 1) flag =1;
	       }
		   }while(add!= 0);
		break;
		case 0:
			System.out.println("**Exit**");
			System.exit(0);
		default:
				System.out.println("Enter valid option");
				
				break;
        	   }
          }while(choice!=0);
     
     }catch (Exception e){
          System.out.println("Enter valid value");
          System.out.println("**Exit**");
               }
			
		}
       /*
        *this method create binary tree
        *and return root node
        */
	public Node<Integer> insert(Node<Integer> root, int item,int node) {
		  
	    	if(node == 0){
			root = new Node<Integer>(item);
		    }
		else{
		     int parent = (node-1)/2;
		
		if(parent == 0){
			
		 if(isEmpty(root.left)){
			 
			root.left = new Node<Integer>(item);
		}
	    else{
			root.right = new Node<Integer>(item);
		}
		}
		else {
			
			if(parent%2 == 1){
				
			insert(root.left, item, parent);
			}
			
			else{
			insert(root.right, item, parent);
			}
	   	}
	}
		return root;
	}
/*
 * this method check is current node is empty or not
 * return true if empty else false
 */
public boolean isEmpty(Node<Integer> newNode) {
	  
	if(newNode == null){
		   return true;
	}
	return false;
}


/*
 * this method create binary search tree
 * it return root node
 */
public Node<Integer> insertBinarySearchTree(Node<Integer> root,int item){
		
		if(root==null){
			root = new Node<Integer>(item);
		}
		
	else if(root.nodeValue > item ){
		
		if(root.left == null){
			
			root.left = new Node<Integer>(item);
		}
		else
			  
	    	insertBinarySearchTree(root.left,item);
	}
		
	else {
		
		if(root.right == null){
	       
			root.right = new Node<Integer>(item);
	 	}
		else
		
			insertBinarySearchTree(root.right , item);
	}
	
	return root	;
	}
	/*
	 *  this method display created tree in to preorder
	 *  in pre order root - left - right node
	 */
	
public void preOrder(Node<Integer> newNode){
		
		 if(root == null)
			  System.out.println("Empty");
		
		if(newNode != null){
			System.out.println(newNode.nodeValue);
			preOrder(newNode.left);
			preOrder(newNode.right);
		}
		
		
	}
	/*
	 * this method display created tree in to pre order
	 *  in pre order  left - right -root  node
	 *  
	 */
public void postOrder(Node<Integer> newNode){
	
		if(root == null)
			  System.out.println("Empty");
		
		if(newNode != null){
			postOrder(newNode.left);
			postOrder(newNode.right);
			System.out.println(newNode.nodeValue);
		}
		
	}
}
