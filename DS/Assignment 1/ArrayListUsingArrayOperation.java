/****************************************************************************************
Name            : ArrayListUsingArray
Revision Log    : 2015-08-25: Babalu patidar : created.
                : 
                : 
Use             : This class is used to perform operation of an array
                :
****************************************************************************************/
import java.util.*;
public class ArrayListUsingArrayOperation {
	
	//Main method is used for perform all opertion of arraylist
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		ArrayListUsingArray arrayList=new ArrayListUsingArray();
		boolean isElementInArray=false;
		System.out.println("Enter your choice:");
		while(true) {
			
			try{
					System.out.println("1:Add Element\n2:Add item at given Location\n3:Find first occurance of an item:"
							+ "\n4:Retrieving the first occurrence of an item based on its given location"
							+ "\n5Remove Item at given Location\n6:Remove an item\n7:Remove all elements\n8:Reverse List\n9:To Sort List\n10:Display List\n11:Exit");
					int choice=Integer.parseInt(scan.next());
					switch(choice) {
					case 1:
						arrayList.addElementInList(scan);
						isElementInArray=true;
						break;
					case 2:
						System.out.println("Enter location at do you want to insert item:");
						int location=Integer.parseInt(scan.next());
						System.out.println("Enter item value:");
						int itemValue=Integer.parseInt(scan.next());		
						arrayList.addElementAtGivenLocation(location,itemValue);
						break;
					case 3:
						if(isElementInArray) {
							System.out.println("Enter item");
							int item=Integer.parseInt(scan.next());
							arrayList.firstOccurrenceOfItem(item);
							break;
						}
						else {
							System.out.println("First enter element in array:");
							break;
						}	
					case 4:
						if(isElementInArray) {
							System.out.println("Enter location");
							location=Integer.parseInt(scan.next());
							arrayList.firstOccurrenceOfItemBasedOnLocation(location);
							break;
						}
						else {
							System.out.println("First enter element in array:");
							break;
						}
					case 5:
						if(isElementInArray) {
							System.out.println("Enter Location at which do you want to remove item:");
							location=Integer.parseInt(scan.next());
							arrayList.removeItemAtGivenLocation(location);
							break;
						}
						else {
							System.out.println("First enter element in array:");
							break;
						}
					case 6:
						if(isElementInArray) {
							System.out.println("Enter item do you want to remove item:");
							int item=Integer.parseInt(scan.next());
							arrayList.removeItem(item);
							break;
						}
						else {
							System.out.println("First enter element in array:");
							break;
						}
					case 7:
						if(isElementInArray) {
							arrayList.removeAllElement();
							isElementInArray=false;
							break;
						}
						else {
							System.out.println("List is already Empty");
							break;
						}
					case 8:
						if(isElementInArray) {
							arrayList.reverseList();
							break;
						}
						else {
							System.out.println("List is already Empty");
							break;
						}
					case 9:
						if(isElementInArray) {
							arrayList.toSortArrayList();
							break;
						}
						else {
							System.out.println("List is already Empty");
							break;
						}
					case 10:
						if(isElementInArray) {
							arrayList.displayList();
							break;
						}
						else {
							System.out.println("List is already Empty");
							break;
						}
					case 11:System.exit(0);	
					default:System.out.println("Please enter correct choice");
					}
					//End of switch
			}
			catch(Exception e){
				System.out.println("Please Enter Integer value..");
			}
		}
		//End of while
	}
	//End of main
}//End of class
