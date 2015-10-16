package com.BinarySearch;

import java.util.HashMap;
import java.util.Map;
/**
 * this is the student class of package binary search 
 * @author Sumitra
 *@purpose this class has create list method to create a list of student and insert into binary search tree 
 *this return a BST
 *this class extends main class TreeSort
 */
public class Student extends TreeSort {
	static int[] studentRollno = null;
	static  String [] studentName=null;
	 Map<Integer, String> map = new HashMap<Integer, String>();
	 /**
	  * this is the method for creating a list of student roll no with there name 
	  * this method take new roll numbers that is unique and name as well
	  * it call bSt method to create a tree
	  * @return root node of tree created by list inserted into sorted form
	  */
	 public Node<Integer> createStudentList(){
		 int noOfStudents=0;
		
		 System.out.println("Enter no of Student to add:");
		  while(!scan.hasNextInt()){
				System.out.println("Enter Integer values only");
				scan.next();
			}
		   noOfStudents  = scan.nextInt();
		   studentRollno = new int[noOfStudents];
		   studentName=new String[noOfStudents];
		    
		  for(int i =0;i<noOfStudents;i++){
			  System.out.println("Enter Roll Number of Student :");
			  while(!scan.hasNextInt()){
					System.out.println("Enter Integer values only");
					scan.next();
				}
			 int studentrollno = scan.nextInt();
			 // if roll number is exist in list
			  while(isExist(studentRollno, studentrollno)){
				  System.out.println("Roll number already exist\nEnter Again");
				  studentrollno = scan.nextInt();
			  }
			  // not exist then take name of that roll number
			  
				   if(!isExist(studentRollno,studentrollno)){
					  studentRollno[i] = studentrollno;
				  System.out.println("Enter  Name of  Student :");
				  studentName[i]=scan.next();
				  // create BST for new value
				  root = insertBinarySearchTree(root, studentRollno[i],studentName[i]);
			 
			  }
		  }
		
		  return root;
		 	 
	 }
	 /**
	  * this method check roll number should unique every time
	  * @param studentRollno take  roll number array
	  * @param rollNumber new inserted roll number to chck
	  * @return true if already exist otherwise false
	  */
	private boolean isExist(int []studentRollno,int rollNumber) {
		for(int i=0;i<studentRollno.length;i++){
			if(rollNumber==studentRollno[i])
				return true;
		}
		return false;
	}
	/**
	 * this method create binary search tree using list of student insert by user to sort
	 * @param root this is the root node of tree
	 * @param item1 roll number of student
	 * @param item2 name of student
	 * @return this method return a BST 
	 */
	public Node<Integer> insertBinarySearchTree(Node<Integer> root, int item1, String item2){
			// if first value is inserted
			if(root==null){
				root = new Node<Integer>(item1,item2);
			}
			// for value less than root node
		else if(root.nodeValue1 > item1 ){
			
			if(root.left == null){
				
				root.left = new Node<Integer>(item1,item2);
			}
			else
				 
		    	insertBinarySearchTree(root.left,item1,item2);
		}
			
		else { // greater than root node
			
			if(root.right == null){
		       
				root.right = new Node<Integer>(item1,item2);
		 	}
			else
			
				insertBinarySearchTree(root.right , item1,item2);
		}
		
		return root	;
		}
	/**
	 * this method is use to sort student list in INORDER
	 * @param newNode this is the root node of tree
	 * @return return a map collection of name and roll number into sorted form
	 * show EMPTY if no element inserted
	 * this use recursion to perform INORDER traversing
	 */
	public Map<Integer, String> showStudentList(Node<Integer> newNode){
		
		 if(root == null)
			  System.out.println("Empty");
		
		if(newNode != null){
		map=showStudentList(newNode.left);
			
			map.put(newNode.nodeValue1, newNode.nodeValue2);
			map= showStudentList(newNode.right);
		}
		
		 
		return map;
		
		
	}
}
