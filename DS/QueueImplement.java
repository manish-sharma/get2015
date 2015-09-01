import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 * queue implementation through java collections
 * @author Ankur
 *
 */
public class QueueImplement {
	static Scanner scan = new Scanner(System.in);
    static Queue<String>  queue = new LinkedList<String>();
   /**
    * main method
    * @param args
    */
    public static void main(String []args) {
		int choice= 0;
		QueueImplement queueImplement = new QueueImplement();
		do{
			choice =  queueImplement.displayMenu();
		    switch (choice) {
		    	case 1:    // to insert elements in queue
		    		System.out.println("how many element to insert?");
		    		int count = scan.nextInt();
		    		for (int i = 0; i < count; i++)
		    			queue.add(scan.next());
		    			break;
		    	case 2:	//to remove element from queue
		    		if(!queue.isEmpty())
		    			queue.remove();
		    		else 
		    			System.out.println("Queue is Empty");
				    break;
		    	case 3:  // to remove all elements from queue
		    		if(!queue.isEmpty())
		    			queue.removeAll(queue);
		    		else 
		    			System.out.println("Queue is Empty");
		    		break; 
		    	case 4:  //to  get Recently added item from queue
		    		if(!queue.isEmpty())
		    			System.out.println(queue.element());
		    		else 
		    			System.out.println("Queue is Empty");
	        		    break;
		    	case 5:  //to display the queue
		    		if(!queue.isEmpty())
		    			System.out.println(queue);
		    		else 
		    			System.out.println("Queue is Empty");
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
     *  method to display main menu
     * @return
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
}