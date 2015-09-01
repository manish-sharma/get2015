package com;
import java.util.*;
/**
 * @author Sumitra godara
 * @Description this class named QueueImplement is use to implement a queue data Structure using java collection
 * this class contains method 
 * @main()
 * @displayMenu
 * @java utility package 
 */
public class QueueImplement {
              static Scanner scan = new Scanner(System.in);
     
              static Queue<String>  queue = new LinkedList<String>();
            
/**
* this is the main method of class QueueImplement
* this tack choice from user and perform different operations accordingly
* @param args
* this method use java collection methods
* @isEmpty(),@add() method
* @remove() method
* @removeAll() method
*/
     
        public static void main(String []args) {
		                    String item ;
				            int choice= 0;
		                    QueueImplement queueImplement = new QueueImplement();
		       
		   do{
		    	            choice =  Integer.parseInt(queueImplement.displayMenu());
		          
		          
	   switch (choice) {
	       
	      case 1:    
		                    String addMore;
		         do{        int flag=0;
				            System.out.println("Enter Item:");
				            item = scan.next();
				            queue.add(item);
				            System.out.println("Add more item then press 1 else 0:");
				            addMore = scan.next();
                 if(addMore.equals("0")) 
		                    flag =1;
				 if(addMore.equals("1")) 
					        flag =1;
	       	while((flag != 1)) {
	       		
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
	    	
	    	   if(!queue.isEmpty())
	    		            queue.remove();
	    	   else 
	    		            System.out.println("Queue is Empty");
				               break;
	      case 3:
	    	
	    	  if(!queue.isEmpty())
	    		            queue.removeAll(queue);
	    	  else 
	    		            System.out.println("Queue is Empty");
				                break; 
	      case 4:
	    	
	    	  if(!queue.isEmpty())
	    		            System.out.println(queue.element());
	    	 else 
	    		            System.out.println("Queue is Empty");
	        	              break;
	      case 5:
	    	 
	    	  if(!queue.isEmpty())
	    		            System.out.println(queue);
	    	 else 
	    		            System.out.println("Queue is Empty");
                              break;
	      case 0:
	        	            System.out.println("Exit");
	        	            System.exit(0);
				               break;
		default:            System.out.println("Enter valid option");
				            	break;
		 
	                   }
		     }while(choice != 0);
     }
/**
 *  this method display menu of operations which provide
 * @return choice of user
 */
    public String displayMenu() {
          		    
    	            String choice = null;
    	            String regex = "[0-5]";
          		    System.out.println("Enter 1 to add item in to Queue\nEnter 2 to delete item from Queue\n"+
          	        "Enter 3 to make Empty Queue \nEnter 4 to  get Recently added item\nEnter 5 to Display \nEnter 0 to Exit");
          do{
        	 
          			choice = scan.next();
          			if(!choice.matches(regex)){
          				System.out.println("Enter valid choice:");
          			}
          		
              }while(!choice.matches(regex));
          		
          return choice;
          	}
}
