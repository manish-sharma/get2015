import java.util.Scanner;

/**
 * main class of singly linked list
 * @author Ankur
 *
 */
public class MainClassSinglyList {


	public int index;//initializes index value
	Node<Integer> a = new Node<Integer>();//object of node class
	Scanner scan = new Scanner(System.in);//scanner class
	
	public static void main(String args[])
	{
		MainClassSinglyList object = new MainClassSinglyList();//class object
		object.listOperations();//method calling
	}
	/**
	 * list of operations to be performed
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
			a.add(scan.nextInt());
			}
			a.display();
			
			break;
		case 2:// to add element in list  at particular position
			System.out.println("enter the index at which you want to store the element");
			index = scan.nextInt();
			System.out.println("enter the value");
			a.addAtPostion(index, scan.nextInt());
			a.display();
			break;
		case 3://to get element at particular index
			System.out.println("enter the index at which you want to see the element");
			index = scan.nextInt();
			System.out.println(a.getitem(index));
			break;
		case 4://delete the element at particular [position
			System.out.println("enter the position at which you want to delete the element");
			index = scan.nextInt();
			a.deleteByIndex(index);
			a.display();
			break;
		case 5://to delete particular value
			System.out.println("enter the value you want to delete");
			int value = scan.nextInt();
			if(a.deleteByValue(value))
				System.out.println("item is deleted");
			else
				System.out.println("no such element exist");
			break;
		case 6: //reverse the list
			a.reverseLinkedList();
			a.display();
			break;
		case 7://to display the list
			a.display();
			break;
		case 8://to sort the list
			a.sortList();
			a.display();
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
	
		
	