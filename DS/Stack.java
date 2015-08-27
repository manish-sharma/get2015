import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class is used to make operations on stack
 * @author Ankur
 * @since 26-08-2015
 */
public class Stack {
	
	 	static Node<Object> top;
	 	Node<Object> newNode;
	 	static Scanner scan = new Scanner(System.in);

	 	/**
	 	 * main method of stack
	 	 * @param args
	 	 */
	 	
	 	public static void main(String [] args) {
	  
	 		int choice; 
	 		Stack stackObject = new Stack();
	 		do{
	 			System.out.println("Enter 1 to add item in Stack \nEnter 2 to delete item from Stack\nEnter 3 to Display \nEnter 0 to exit");
	 			choice = scan.nextInt();
	 			switch (choice) {
	 			
	 			case 1:
	 				int flag = 0, addMore;
	 				do{	System.out.println("Enter data to push into Stack");
	 				int data = scan.nextInt();
	 				stackObject.pushItem(data);
	 				System.out.println("Add more item press 1 otherwise press 0");
	 				addMore = scan.nextInt();
	      
	 				if(addMore == 0 || addMore == 1) flag = 1;
	 				while((flag != 1)){
	 					System.out.println("choose valid option:");
	 					addMore = scan.nextInt();
	 					if(addMore == 0 || addMore == 1) flag = 1;
	 				}
	 				}while(addMore != 0);
	 				break;
	 			case 2:
	 				top = stackObject.popItem();
	 				break;
	 			case 3:
	 				stackObject.displayItem(top);
	 				break;
	 			case 0:
	 				System.out.println("Exit");
	 				System.exit(0);
	 				break;
	 			default:
	 				break;
	 			}
	 		}while(choice != 0);  
	   
	 	}
	 	/**
	 	 * this method is used to display the stack items
	 	 * @param top
	 	 */

	 	public void displayItem(Node<Object> top) {

	 		Node<Object> current = top;
	 		if(current.data == null){
	 			System.out.println("Stack is empty");
	 		}
	 		while (current != null) {
	 			System.out.println(current.data);
	 			current = current.next;
	 		}
	 	}
	 	/**
	 	 * this method is used to pop the item in the list
	 	 * @return.. returns the top of the value
	 	 */

	 	public Node<Object> popItem() {
	 		if(top == null){
	 			System.out.println("Stack is Empty");
	 		}
	 		else{
	 			top = top.next;
	 		}
	 		return top;
	 	}
	 	/**
	 	 * this method is used to insert the element in the stack
	 	 * @param data...value to be inserted in the stack
	 	 * @return.. returns the top of the stack
	 	 */
	 	public Node<Object> pushItem(int data) {
	 		Node<Object> newNode = new Node<Object>(data);
	 		newNode.next = top;
	 		top = newNode;
	 		return top;
	 	}

}