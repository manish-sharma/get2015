package com;

import java.util.*;
/**
 * 
 * @author Sumitra
 *
 */
public class SortedLinkedList {
                       static Scanner scan =new Scanner(System.in);
	                   static  LinkedList<Integer> linkedList = new LinkedList<Integer>();
	                   int index =0;
/**
 * 	this is the main method of class
 * @param args null
 * 
 */
	 
   public static void main(String []args) {
		                String choice=null;
		                String regex ="[0-4]";
		                int  choice1=0;
		                SortedLinkedList sortedLinkedList = new SortedLinkedList();
             	do{           
		                 System.out.println("Enter 1 for create Sorted Linked List \nEnter 2 for Display "+
		    	         "\nEnter 3 for add element in sorted List\nEnter 0 for Exit");

	            do{
	            			choice = scan.next();
	            	if(!choice.matches(regex)){
	            			 System.out.println("Enter valid choice:");
	            			}
	                }while(!choice.matches(regex));
	            		     choice1 =Integer.parseInt(choice);
	  switch (choice1) {
	
	       case 1:
	    	                String addMore=null;
	    	      out:
	 			do{     
	 			             int flag=0;
	 			             System.out.println("Enter item  to add in LinkedList:");
	 			             String item = scan.next();
	 			                 	 if(!isInteger(item)){
	 			            		 System.out.println("Enter integer value only:");
	 			            		 break out;
	 			            	     }
	 			                 	 else{
	 			            	int item1 = Integer.parseInt(item);
		    	             sortedLinkedList.insert(item1);
	 			            	
	 			                 	 }
	 			            
	 			             System.out.println("Add more item then press 1 else 0:");
	                         addMore = scan.next();
	 			     
	 	         if(addMore.equals("0"))
	 	        	         flag =1;
	 			    
	 	            if(addMore.equals("1")) 
	 	            	     flag =1;
	 			      
	 	            while((flag != 1)){
	 	            	
	 			            System.out.println("choose valid option:");
	 			            addMore = scan.next();
	 			    	   
	 			   if(addMore.equals("0")) 
	 				         flag =1;
	 				     
	 			   if(addMore.equals("1")) 
	 				          flag =1;
	 			       }
	 				 }while(!addMore.equals("0"));
	 			
	 	
	 				            break;
	       case 2:
	    	   if(linkedList.isEmpty()){
	    		   System.out.println("Linked List is Empty");
	    	   }
	    	   else
	    	           System.out.println(linkedList);
	    	               break;
	       
	       case 3:
	    	            System.out.println("Enter item:");
	    	            String item = scan.next();
	    	            if(isInteger(item)){
	    	        	int item1=  Integer.parseInt(item);
	    	            sortedLinkedList.insert(item1);
	    	             
	    	           }
	    	           else{
	    	        	   System.out.println("Enter Intger value only");
	    	        	  
	    	           }
	    	            break; 
	       case 0:
	    	            System.out.println("***Exit***");
	    	            System.exit(0);
	     default:
	    	            System.out.println("Enter valid option");
	           }
	      }while(choice1 != 0);
	
}
   /**
    * 
    * @param item its is an item to add in linked list
    * @return true if value is integer else false
    */
private static boolean isInteger(String  item) {
	try{ 
		Integer.parseInt(item);
		return true;
	}catch(NumberFormatException n){
	
	return false;
}
}
/**
 * this method to insert item into Linked list
 * @param item it is an item to add into list
 * @return nothing
 */

public void insert(int item){
	
	if (index >= linkedList.size() || linkedList.get(index) >= item){
		linkedList.add(index,item);
		index = 0;
	}
	else if(linkedList.get(index)<item){

		index++;
		insert( item);

	}
	else{
		linkedList.addLast(item);
		index = 0;
	}
}
}
