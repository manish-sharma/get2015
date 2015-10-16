package com.BinarySearch;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.BinarySearch.Node;
/**
 * @purpose- this class is the main class of package Binary search
 * this class has main method and display menu 
 * @author Sumitra
 *
 */
public class TreeSort {
       
	static Node<Integer> root = new Node<Integer>();
    static Scanner scan = new Scanner(System.in);
/**
 * this is the main method to perform menu display and  tack action according to user
 * @param arg
 */
    public static void main(String [] arg) {
	    root = null;
	  Student student = new Student();
	  Map<Integer, String> map=new HashMap<Integer, String>();
	   int choice=0;
	 do{
		 choice = student.displayMenu();
		 switch(choice){
	
	  case 1:
		  root = student.createStudentList();
		  break;
	  case 2:
		  System.out.println("Roll Number,   Name");
		   map = student.showStudentList(root);
		  for(int i =0;i<map.size();i++){
			  System.out.println(Student.studentRollno[i]+"\t,\t"+map.get(Student.studentRollno[i]));
		  }
		  break;
		  
	  case 0:
		  System.out.println("***Exit***");
		  System.exit(0);
		  default:
			  System.out.println("Enter valid option");
			  break;
	  }
	 }while(choice !=0);
	
}
/**
 * this method display menu of options and take choice of user
 * @return user choice to perform action
 */
public int displayMenu(){
	System.out.println("Enter 1  for enter Roll number to add in list \nEnter 2 for Show list\nEnter 0 for exit\nEnter your choice:");
	while(!scan.hasNextInt()){
		System.out.println("Enter Integer values only");
		scan.next();
	}
	int choice = scan.nextInt();
	return choice;
}

}
