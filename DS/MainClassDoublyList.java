import java.util.Scanner;

/**
 * main class of doubly linked list
 * @author Ankur
 *
 */
public class MainClassDoublyList {
	public int index;//initializes index value
	NodeDoubly<Integer> newNode = new NodeDoubly<Integer>();//object of node class
	Scanner scan = new Scanner(System.in);//scanner class
	
	public static void main(String args[])
	{
		MainClassDoublyList object = new MainClassDoublyList();//class object
		object.listOperations();//method calling
	}
	/**
	 *  list of operations to be performed
	 */
	public void listOperations()
	{
	int loopVar = 0;
	
	do {
		MenuSinglyList.showBasicMenu();// method show menu call
		
		int choice = 0;
		try {
			choice = scan.nextInt();
		} catch (Exception e) {
			System.out.println("please enter integer values only!");;
		}
		switch (choice) {
		case 1://to add elements in list 1
			System.out.println("how many elements you want to enter");
			int number = scan.nextInt();
			for(int i = 0; i < number; i++){
			System.out.println("enter the element");
			newNode.addElement(scan.nextInt());
			}
			newNode.display();
			
			break;
		case 2:// to add element in list  at particular position
			System.out.println("enter the index at which you want to store the element");
			index = scan.nextInt();
			System.out.println("enter the value");
			newNode.addAtPostion(index, scan.nextInt());
			newNode.display();
			break;
		case 3://to get element at particular index
			System.out.println("enter the index at which you want to see the element");
			index = scan.nextInt();
			System.out.println(newNode.getItem(index));
			break;
		case 4://delete the element at particular [position
			System.out.println("enter the position at which you want to delete the element");
			index = scan.nextInt();
			newNode.deleteByIndex(index);
			newNode.display();
			break;
		case 5://to delete particular value
			System.out.println("enter the value you want to delete");
			int value = scan.nextInt();
			if(newNode.deleteByValue(value))
				System.out.println("item is deleted");
			else
				System.out.println("no such element exist");
			break;
		case 6:  //reverse the list
			newNode.reverseLinkedList();
			newNode.display();
			break;
		case 7://to display the list
			newNode.display();
			break;
		case 8://to sort the list
			newNode.sortList();
			newNode.display();
			break;
			
		default :
			System.out.println("enter proper input");
		}
		System.out.println("\ndo you want to continue?\n1. yes\n2. no");
		try {
			loopVar = scan.nextInt();
		} catch (Exception e) {
			System.out.println("enter valid input!");
		}
	}while(loopVar == 1);
	}

}
