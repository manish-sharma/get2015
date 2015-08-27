package com.queue.array;

import java.util.InputMismatchException;
import java.util.Scanner;



public class MainClass {
	 private static Scanner scan = new Scanner(System.in);
	public static void main(String []args) {
        String item ;
		int choice= 0;
		 Scanner scan = new Scanner(System.in);
         Queue queueObject = new Queue();
         MainClass mainClass=new MainClass();
 do{
    	choice =  mainClass.displayMenu();
          
          
switch (choice) {
   
    case 1:
               int addMore;
   do{         int flag=0;
		       System.out.println("Enter Item:");
		       item = scan.next();
		       queueObject.enQueue(item);
		       System.out.println("Add more item then press 1 else 0:");
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
    	 queueObject.deleteItem();
		    break;
  case 3:
	  queueObject.makeEmptyQueue();
		    break; 
  case 4:
    	queueObject.getRecentlyAddedItem();
		    break;
  case 5:
    	 queueObject.display();
		    break;
  case 0:
    	 System.out.println("Exit");
    	 System.exit(0);
		    break;
		default: System.out.println("Enter valid option");
			break;
		}
    
     }while(choice != 0);
     
}
	/*
	 * method to display main menu
	 */
	public int displayMenu() {
		int choice = 0;
		    System.out.println("Enter 1 to add item in to Queue\nEnter 2 to delete item from Queue\n"+
	        "Enter 3 to make Empty Queue \nEnter 4 to  get Recently added item\nEnter 5 to Display \nEnter 0 to Exit");
		try{
			choice = scan.nextInt();
		}catch(InputMismatchException p){
			System.out.println("enter integer1 value\n**Exit**");
		}
		return choice;
	}
}
