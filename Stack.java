package com;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * class to implement stack
 */
public class Stack {
	   public static Node<Object> top =null;
       Node<Object> newNode;
       static Scanner scan = new Scanner(System.in);
/*
 * main method of class stack
 */
public static void main(String [] args) {
	  
	     int choice = 0; 
	     Stack stackObject = new Stack();
	   do{
		   System.out.println("Enter 1 to add item in Stack \nEnter 2 to delete item from Stack\nEnter 3 to Display \nEnter 0 to exit");
	      try{
	    	  choice =scan.nextInt();
	      }catch(InputMismatchException p){
	    	  System.out.println("enter only integer value\n **Exit**");
	      }
switch (choice) {
case 1:
		int flag = 0, addMore;
do{	System.out.println("Enter data to push into Stack");
		    String data = scan.next();
		    stackObject.pushItem(data.charAt(0));
		    System.out.println("Add more item press 1 otherwise press 0");
		    addMore = scan.nextInt();
	      
   if(addMore== 0) flag =1;
	if(addMore== 1) flag =1;
	       while((flag != 1))
	       {
	    	   System.out.println("choose valid option:");
	    	   addMore = scan.nextInt();
	    	   if(addMore== 0) flag =1;
		       if(addMore== 1) flag =1;
	       }
}while(addMore != 0);
		break;
case 2:
	top=stackObject.popItem();
	break;
case 3:
	stackObject.displayItem(top);
	break;
case 0:
	 System.out.println("Exit");
	 System.exit(0);
	    break;
	default:System.out.println("Enter valid option");
		break;
	}
 }while(choice != 0);  
	   
}

/*
 * method display stack items
 */
public void displayItem(Node<Object> top) {

 Node<Object> current = top;
   while (current != null) {
       System.out.println(current.data);
       current = current.next;
   }
}

/*
 * method to pop item from stack
 */

public  Node<Object> popItem() {
 if(top == null){
	  System.out.println("Stack is Empty");
 }
 else{
	
   top = top.next;  // set top to next item and delete top item
   
 }
 return top;                  //return stack
}


/*
 * method to add new item push in stack
 */
public Node<Object> pushItem(char ch) {
	  Node<Object> newNode = new Node<Object>(ch);        // set value

 
   newNode.next = top;
   top = newNode;                           //set top of stack
   return top;
}

}
