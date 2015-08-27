import java.util.Scanner;

/**
 * My list is the main class to choose what operation is to make and call methods
 * @author Ankur
 *@since 25-08-2015
 */
public class MyList {
	
	
	
	public int index;
	
	Scanner scan = new Scanner(System.in);
	
	ArrayList1 arrayList1Object = new ArrayList1();//arraylist1 object
	Object value;
	
	public static void main(String[] args)
	{
		MyList object = new MyList();
		object.arrayOperations();//method calling
	}
		
	public void arrayOperations()
	{
	int loopVar = 0;
	
	do {
		MenuClass.showBasicMenu();// method show menu call
		
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
			value = scan.nextInt();
			arrayList1Object.add(value);
			}
			for(int i=0;i<arrayList1Object.size;i++){
				
					System.out.println(arrayList1Object.get(i));
			}
			
			break;
		
		case 2:// to add element in list 1 at particular position
			System.out.println("enter the index at which you want to store the element");
			index = scan.nextInt();
			System.out.println("enter the value");
			value = scan.nextInt();
			ArrayList1.add(index, value);
			for(int i=0;i<arrayList1Object.size;i++){
				
				System.out.println(arrayList1Object.get(i));
			}
			break;
		case 3:////to find index at particular position
			System.out.println("enter the index from where you want to retrieve the element");
			index = scan.nextInt();
			System.out.println("enter the value");
			value = scan.nextInt();
			int returnValue = ArrayList1.retrieveFirstOccuerence(index, value);
			if(returnValue==-1){
		    	System.out.println(value+" not found after index " + index);
		    }
		    else{
		    	System.out.println(value+" found at index " + returnValue);
		    }
			break;
		case 4://to find find occurence  of particulat item
			System.out.println("enter the value");
			value = scan.nextInt();
			returnValue = ArrayList1.retrieveFirstIndexOfParticularItem(value);
			if(returnValue == -1){
		    	System.out.println(value+" not found in list");
		    }
		    else{
		    	System.out.println(value+" found at index "+returnValue);
		    }
			break;
		case 5://to delete particular index value
			System.out.println("enter the index from where you want to delete the element");
			index = scan.nextInt();
			ArrayList1.remove(index);
			break;
		case 6://to delete particular element
			System.out.println("enter the value");
			value = scan.nextInt();
			ArrayList1.removeValue(value);
			break;
		case 7://to remove whole list
			ArrayList1.removeAll();
			break;
		case 8://to print reverse the list
			ArrayList1.reverse();
			break;
		case 9://to show the whole list
			ArrayList1.show();
			break;
		case 10://to add list elements in list2
			ArrayList2 ob = new ArrayList2();
			System.out.println("how many elements you want to enter");
			number = scan.nextInt();
			for(int i = 0; i < number; i++){
			System.out.println("enter the value");
			value = scan.nextInt();
			ob.add(value);
			}
			break;
		case 11://to merge both the list
			arrayList1Object.merge();
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
	}}
