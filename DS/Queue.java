import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * this method is used to make operations in queue
 * @author Ankur
 * @since 26-08-2015
 */

public class Queue {
	static Scanner scan = new Scanner(System.in);
	   String [] queue = new String[5];
	  int front =-1;
	   int rear = -1;
	   int max =5;
	  /**
	   * main method of queue class
	   * @param args
	   */
	public static void main(String []args) {
		String item ;
		int choice= 0;
		Queue queueObject = new Queue();
		do{
	    	choice =  queueObject.displayMenu();
	    	switch (choice) {
	    	case 1:
	    			int addMore;
	    			do{        
	    				int flag=0;
	    				System.out.println("Enter Item:");
	    				item = scan.next();
	    				queueObject.enQueue(item);
	    				System.out.println("Add more item then press 1 else 0:");
	    				addMore = scan.nextInt();
				      
	    				if(addMore == 0 || addMore == 1) flag = 1;
	    				while((flag != 1)) {
	    					System.out.println("choose valid option:");
	    					addMore = scan.nextInt();
	    					if(addMore == 0 || addMore == 1) flag = 1;
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
	/**
	 * this method is used to find last added element
	 */
	
	private void getRecentlyAddedItem() {
		System.out.println("Recently added item is- "+queue[rear]);
	}
	
	/**
	 *  method to make queue empty
	 */

	public void makeEmptyQueue() {
		int flag = 0;
		System.out.println("You want to make Empty Queue If yes then press 1 Else press 0");
		int deleteQueue = scan.nextInt();
		if(deleteQueue  == 0) flag =1;
	       if(deleteQueue == 1) flag =1;
	       while((flag != 1)){
	    	   System.out.println("choose valid option:");
	    	   deleteQueue = scan.nextInt();
	    	   if(deleteQueue == 0) flag =1;
		       if(deleteQueue == 1) flag =1;
	       }
	       if(deleteQueue == 1){
	    	   front=-1;
	    	   rear=-1;
	       }
	 	}
	/**
	 * method to delete item from queue from start
	 */
	public void deleteItem() {
		if(front == -1)
			System.out.println("Queue is Empty");
		else{
			//System.out.println(queue[front]);
			//front=front+1;
			for(int i =front;i<rear;i++){
				queue[i]=queue[i+1];
			}
			rear=rear-1;
			}
		}
	/**
	 *  method to display main menu
	 * @return... return the choice of user from the menu list
	 */
	public int displayMenu() {
		int choice = 0;
		System.out.println("Enter 1 to add item in to Queue\nEnter 2 to delete item from Queue\n"+
							"Enter 3 to make Empty Queue \nEnter 4 to  get Recently added item\nEnter 5 to Display \nEnter 0 to Exit");
		try{
			choice = scan.nextInt();
		}
		catch(InputMismatchException p){
			System.out.println("enter integer value\n**Exit**");
		}
		return choice;
	}
	/**
	 * method to display Queue items
	 */
	public void display(){
		if(front == -1)
		System.out.println("Queue is Empty");
		else{
			for(int i =front; i<=rear;i++){
				System.out.println(queue[i]);
			}
		}
	  }
	/**
	 * method to add item in Queue
	 * @param string... value to be added in the queue
	 */
	public void enQueue(String string){
		if((rear == max-1)&& (front == 0)){                                      // when space not available
			System.out.println("Queue Overflow");
		}
		else{
			if(front == -1){                                     // when queue is empty
				front =0;
				rear =rear+1;
				queue[rear] = string;
			}
			else	if((rear == max-1)&& (front != 0)){                 // Pseudo Queue is full
				rear =0;
				queue[rear] =string;
			}
			else{
				rear++;                                      // normal condition
				queue[rear] = string;
			}
		}
	}
}

