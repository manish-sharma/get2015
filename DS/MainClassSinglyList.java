import java.util.Scanner;


public class MainClassSinglyList {


	public int index;
	Node<Integer> a = new Node<Integer>();
	Scanner scan = new Scanner(System.in);
	
	public static void main(String args[])
	{
		MainClassSinglyList object = new MainClassSinglyList();
		object.listOperations();
	}
	
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
		case 3:
			System.out.println("enter the index at which you want to see the element");
			index = scan.nextInt();
			System.out.println(a.getitem(index));
			break;
		case 4:
			System.out.println("enter the position at which you want to delete the element");
			index = scan.nextInt();
			a.deleteByIndex(index);
			a.display();
			break;
		case 5:
			System.out.println("enter the value you want to delete");
			int value = scan.nextInt();
			if(a.deleteByValue(value))
				System.out.println("item is deleted");
			else
				System.out.println("no such element exist");
			break;
		case 6: 
			a.reverseLinkedList();
			a.display();
			break;
		case 7:
			a.display();
			break;
		case 8:
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
	}while(loopVar==1);
	}
}
	
		
	//	a.add(5);
	//	a.add(96);
	//	a.add(1);
		//a.add(87);
		//a.add(-1);
	   // a.display();
		//System.out.println("position");
		//a.addAtPostion(2, 100);
		//a.display();
		//System.out.println("");
		//if(a.deleteByValue(96))
		//{
			
		//}
		//else{
		//	System.out.println("no such type of number Exist");
		//}
		//System.out.println("");
	   //  a.display();
		//System.out.println("");
	   //  a.deleteByIndex(2);
		// a.display();
		//System.out.println("");
		//System.out.println(a.getitem(3));
	//	a.reverseLinkedList();
	//	System.out.println("");
	//	a.display();
	//	System.out.println("");
	//	a.sortList();
	//	a.display();
	//}
//}/
//
