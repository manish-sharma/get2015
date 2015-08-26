import java.util.InputMismatchException;
import java.util.Scanner;
//class used to define a stack and its operation
class StackUsingLinkedList {
	Object listInformation;
	StackUsingLinkedList addressOfNextNode,top;
	public StackUsingLinkedList() { //constructor to initialize stack
		top=null;
	}
	//method to used add an item 
	public void pushAnItem(String listInformation) {
		StackUsingLinkedList node=new StackUsingLinkedList();
		node.listInformation=listInformation;
		if(top==null) {
			top=node;
			node.addressOfNextNode=null;
		}
		else {
			node.addressOfNextNode=top;
			top=node;
		}
	}
	//method to remove an item
	public void popAnItem() {
		if(top==null) 
			System.out.println("Stack is Empty");
		else if(top.addressOfNextNode==null) {
			top=null;
		}
		else {
			top=top.addressOfNextNode;
		}
	}
	// method to display stack items
	public void display() {
		if(top==null) {
			System.out.println("Stack is empty");
		}
		else {
			StackUsingLinkedList traversingNode=top;
			while(traversingNode!=null) {
				System.out.println(traversingNode.listInformation);
				traversingNode=traversingNode.addressOfNextNode;
			}
		}
	}
}
public class MainStackImplementation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		StackUsingLinkedList stackUsingLinkedListObject=new StackUsingLinkedList();
		try {
			// menu for options
			while(true) {
				System.out.println("Enter your choise");
				System.out.println("1:Push an Item\n2:Pop an Item\n3:display\n4:Exit");
				int choise=sc.nextInt();
				switch(choise) {
				case 1:
					System.out.println("Enter information");
					String listInformation=sc.next();
					stackUsingLinkedListObject.pushAnItem(listInformation);
					break;
				case 2:
					stackUsingLinkedListObject.popAnItem();
					break;
				case 3:
					stackUsingLinkedListObject.display();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Please Enter correct choise");
				}
			}
		}catch(InputMismatchException exception){System.out.println("Please enter only values given at screen");}
	}
}
