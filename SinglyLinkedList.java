import java.util.Scanner;

public class SinglyLinkedList{
	         static Node<Integer> first ;
			static Node<Integer> pre;
			static Node<Integer> nextNew;
	         Scanner scan = new Scanner(System.in);
	public static void main(String [] args) {
		   int choice=0;
		   Scanner scan = new Scanner(System.in);
		  
		 do{
			 System.out.println("Enter 1 for create Linked List \n Enter 2 for Display "+
		 "\n Enter 3 for add element in the List\n Enter 4 to remove \n Enter 5 to Sort linkedList"+
		 "\n Enter 6 to reverse LinkedList \nEnter 0 for Exit");
		  
			   choice = scan.nextInt();
		  switch (choice) {
		case 1:
		first=	new CreateLinkedList().createLinkedList();
			break;
		case 2:
			 new Display().displayLinkedList(first);
			 break;
		case 3:
			new SinglyLinkedList().addMenu();
			
			 break;
		case 4:
			new SinglyLinkedList().removeMenu();
			 break;
		case 5:
			first =	new Sorting().sortedList(first);
			break;
		case 6:
			first =	new Reversal().reverseLinkedList(first);
			break;
		default:
			break;
		}
		   } while(choice != 0);
	      scan.close(); 
	}
	private void addMenu() {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 for add element at Start\n Enter 2 for add element at the End of list \n Enter 3 for spacific position");
		int position = scan.nextInt();
		if(position == 1){
		first=	new AddElement().addAtStart(first);
		}
		else if(position == 2){
			first=new AddElement().addAtLast(first);
		}
		else	if(position == 3){
			first=new AddElement().addAtPosition(first);
		}
		return;
	}	
	private void removeMenu() {
		
		System.out.println("Enter 1 for remove element from Start\n Enter 2 for remove element at the End of list \n Enter 3 remove for spacific position \n Enter 4 for remove specific elemet");
		int positionRemove = scan.nextInt();
		if(positionRemove == 1){
		first=	new RemoveElement().removeFromStart(first);
		}
		else if(positionRemove == 2){
			first=new RemoveElement().RemoveFromLast(first);
		}
		else if(positionRemove == 3){
			first=new RemoveElement().removeFromPosition(first);
		}
		else if(positionRemove == 4){
			first=new RemoveElement().removeElement(first);
		}
		return;
	}
}
