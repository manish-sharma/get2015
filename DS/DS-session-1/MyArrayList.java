/**main class to carry out all the functionality
 * 
 * @author Gaurav
 * Date : 25/08/2015
 */

import java.util.Scanner;

public class MyArrayList {
	public int index;
	Scanner scan = new Scanner(System.in);
	
	ArrayList arrayListObject = new ArrayList();							//arraylist1 object
	
	Object value;
	
	//main method
	public static void main(String[] args) {
		MyArrayList object = new MyArrayList();
		object.arrayOperations();
	}

	//method to perform list actions until the user wants
	public void arrayOperations() {
		int loopVar = 0;
		do {
			
			ArrayListMenuClass.showBasicMenu();							// method show menu call
			int choice = 0;												//selecting option from the menu
			try {
				choice = scan.nextInt();
			}
			catch (Exception e) {
				System.out.println("please enter integer values only!");;
			}
			switch (choice) {
				
			case 1:														//to add elements in listNew
				System.out.println("how many elements you want to enter");
				
				int number = scan.nextInt();
				for (int i = 0; i < number; i++) {
					System.out.println("enter the element");
					value = scan.nextInt();
					arrayListObject.addElements(value);
				}
				for(int i = 0; i < arrayListObject.size; i++)				
					System.out.println(arrayListObject.get(i));
				break;
				
			case 2:														// to add element in listNew at particular position
				System.out.println("enter the index at which you want to store the element");
				index = scan.nextInt();
				System.out.println("enter the value");
				value = scan.nextInt();
				ArrayList.addElementPosition(index, value);

				for(int i = 0; i < arrayListObject.size; i++)
					System.out.println(arrayListObject.get(i));
				break;
				
			case 3:														//to find index at particular position
				System.out.println("enter the index from where you want to retrieve the element");
				index = scan.nextInt();
				System.out.println("enter the value");
				value = scan.nextInt();
				int returnValue = ArrayList.retrieveFirstOccuerence(index, value);
				if(returnValue == -1)
					System.out.println(value + " not found after index " + index);
				else
					System.out.println(value + " found at index " + returnValue);
				break;
				
			case 4:														//to find find occurrence  of particular item
				System.out.println("enter the value");
				value = scan.nextInt();
				returnValue = ArrayList.retrieveFirstIndexOfParticularItem(value);
				if(returnValue == -1)
					System.out.println(value + " not found in list");
				else
					System.out.println(value + " found at index " + returnValue);
				break;
				
			case 5:														//to delete particular index value
				System.out.println("enter the index from where you want to delete the element");
				index = scan.nextInt();
				ArrayList.removePosition(index);
				break;
				
			case 6:														//to delete particular element
				System.out.println("enter the value");
				value = scan.nextInt();
				ArrayList.removeValue(value);
				break;
				
			case 7:														//to remove whole list
				ArrayList.removeAll();
				break;
				
			case 8:														//to print reverse the list
				ArrayList.reverse();
				break;
				
			case 9:
				ArrayList.sort();
				break;
				
			case 10:														//to show the whole list
				ArrayList.show();
				break;
				
			case 11:													//to add list elements in listSecond
				SecondArrayList ob = new SecondArrayList();
				System.out.println("how many elements you want to enter");
				number = scan.nextInt();
				for(int i = 0; i < number; i++) {
					System.out.println("enter the value");
					value = scan.nextInt();
					ob.addElements(value);
				}
				break;
				
			case 12:													//to merge both the list
				arrayListObject.mergeList();
				break;
				
			default :
				System.out.println("enter valid input");
				break;
			}
			
			System.out.println("\ndo you want to continue?\n1. yes\n2. no");
			try {
				loopVar = scan.nextInt();
			}
			catch (Exception e) {
				System.out.println("enter valid input!");
			}
		} while(loopVar == 1);
	}
}
