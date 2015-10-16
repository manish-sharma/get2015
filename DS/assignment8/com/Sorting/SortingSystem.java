package com.Sorting;

import java.util.Scanner;

import com.metacube.menu.*;
/**
 * this class named sorting System is the main class of sorting system
 * its child classes are in sorting package -1.Comparison Sorting Linear Sorting
 * this class import package menu item  to display item and perform actions
 * @author Sumitra
 *
 */
public class SortingSystem {
	 static Scanner scan = new Scanner(System.in);
	 public static int [] arrayList = null;
	 static int flag;
	 /**
	  * this is the main method of package sorting and class sorting system
	  * this take array value to sort array according to user
	  * @param args
	  */
  public static void main(String [] args) {
	
	              int noOfStudents =0;
	              
	              System.out.println("Enter number of element to be inserted in Array:");
	   
	     while(!scan.hasNextInt()){
			      System.out.println("Enter Integer values only");
			      scan.next();
		         }
	              noOfStudents  = scan.nextInt();
	              arrayList = new int[noOfStudents];
	              System.out.println("Enter element in Array: :");
	
	   for(int i =0;i<noOfStudents;i++){
		
		while(!scan.hasNextInt()){
				 System.out.println("Enter Integer values only");
				 scan.next();
			 }
		         arrayList[i] = scan.nextInt();
	   }
	    Menu menu=new Menu();
	  // initialialize package menu
	    ActionableMenuItem Item=new ActionableMenuItem("Enter 1  for comparison sorting ");
		ActionableMenuItem Item2=new ActionableMenuItem("Enter 2 for linear sorting");
		ActionableMenuItem Item3=new ActionableMenuItem("Enter 3 for  Display sorted list");	
		ActionableMenuItem Item4=new ActionableMenuItem("Enter 4 for exit");
		menu.addMenuItem(Item);
		menu.addMenuItem(Item2);
		menu.addMenuItem(Item3);
		menu.addMenuItem(Item4);
		menu.display();
}
  /**
   * this method is used to display sorted list
   * as well which method is used by System
   */
  public void displayList() {
	  if(flag == 0 ) System.out.println("Sorted Array using Bubble Sort:");
		else if(flag == 1) System.out.println("Sorted Array using Quick Sort:");
		else if(flag == 2) System.out.println("Sorted Array using Counting Sort:");
		else if(flag == 3) System.out.println("Sorted Array using Radix Sort:");
		for(int k = 0; k < arrayList.length;k++){
			System.out.print(arrayList[k]+"\t\t");
		}
		System.out.println();
	}
	

}
