
import java.util.InputMismatchException;
import java.util.Scanner;
//this class is used to define an array list and its functionality
class ArrayList {
	private int[] arrayList,arrayListBuffer;
	private int size=10,index;
	//constructor of class to initialize an empty list
	public ArrayList() {
		index=0;
		arrayList=new int[10];
	}
	//this method is used to add an item in list
	public void addElementInList() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element");
		int arrayElement=sc.nextInt();
		if(index==size) {
			arrayListBuffer=new int[index];
			for(int i=0;i<arrayList.length;i++)
			arrayListBuffer[i]=arrayList[i];
			arrayList=new int[index+10];
			for(int i=0;i<index;i++){
				arrayList[i]=arrayListBuffer[i];
			}
		}
		arrayList[index++]=arrayElement;
	}
	//this method is used to add a particular item in list at particular location 
	public void addElementAtGivenLocation(int location,int itemValue) {
		if(location>=index) {
			System.out.println("Please enter correct location");
			return;
		}
		else {
			int i=index-1;
			while(i!=location) {
				arrayList[i]=arrayList[i-1];
				i--;
			}
			arrayList[location]=itemValue;
		}
	}
	//this method is used to to find first location of user given item 
	public void firstOccurrenceOfItem(int item) {
		for(int i=0;i<index;i++) {
			if(arrayList[i]==item) {
				System.out.println("Item found at "+(i+1)+"location");
				return;
			}
			else
				System.out.println("Item not found");
		}
	}
	//this method is used to to find first location of item at the location given by user
	public void firstOccurrenceOfItemBasedOnLocation(int location) {
		if(location>=index) {
			System.out.println("Enter correct location");
			return;
		}
		else {
			int item=arrayList[location];
			for(int i=0;i<index;i++) {
				if(arrayList[i]==item) {
					System.out.println("Item found at "+(i+1)+"location");
					return;
				}
			}
		}
	}	
	//this method is used to remove item from list at the location given by user 
	public void removeItemAtGivenLocation(int location) {
		if(location>=index) {
			System.out.println("Please Enter correct Location:");
			return;
		}
		else {
			for(int i=location-1;i<index-1;i++) {
				arrayList[i]=arrayList[i+1];
			}
			index--;
		}
			
	}
	//to remove first item given by user
	public void removeItem(int item) {
		boolean isItemFound=false;
		for(int i=0;i<index;i++) {
			if(arrayList[i]==item) {
				for(int j=i;j<index-1;j++)
					arrayList[j]=arrayList[j+1];
					index--;
					i--;
					isItemFound=true;
			}
		}
		if(isItemFound==false) {
			System.out.println("Item not found");
			return;
		}
	}
	//to empty the list
	public void removeAllElement() {
		for(int i=0;i<index;i++) {
			arrayList[i]=0;
		}
		index=0;
	}
	//to reverse the list
	public void reverseList() {
		int swapVariable;
		for(int i=0;i<index/2;i++) {
			swapVariable=arrayList[i];
			arrayList[i]=arrayList[index-i-1];
			arrayList[index-i-1]=swapVariable;
		}
	}
	//to sort the list
	public void toSortArrayList() {
		for(int i=0;i<index;i++) {
			for(int j=0;j<index-1-i;j++) {
				if(arrayList[j]>arrayList[j+1]) {
					int swapVariable;
					swapVariable=arrayList[j];
					arrayList[j]=arrayList[j+1];
					arrayList[j+1]=swapVariable;
				}
			}
		}
	}
	//this method is used to merge the two list
	public void mergeList(ArrayList arrayListObject,ArrayList arrayListObject1) {
		int newSize=arrayListObject.index+arrayListObject1.index;
		int[] arrayListBuffer=new int[newSize];
		int k=0;
		for(int i=0;i<arrayListObject.index;i++)
			arrayListBuffer[i]=arrayListObject.arrayList[i];
		for(int i=arrayListObject.index;i<newSize;i++) {
			arrayListBuffer[i]=arrayListObject1.arrayList[k++];
			arrayListObject.index++;
		}		
		for(int i=0;i<arrayListObject.index;i++) {
			arrayListObject.addElementAtGivenLocation(i, arrayListBuffer[i]);
		}
	}
	//to display the list
	public void displayList() {
		for(int i=0;i<index;i++)
			System.out.println(arrayList[i]);	
	}
}
//Main class
public class MainArrayList {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList arrayListObject=new ArrayList();
		ArrayList arrayListObject1=new ArrayList();
		boolean isElementInArray1=false;//boolean to check list is empty or not
			System.out.println("Enter your choise:");
			try{
				while(true) {
					System.out.println("1:Add Element\n2:Add item at given Location\n3:Find first occurance of an item:"
							+ "\n4:Retrieving the first occurrence of an item based on its given location"
							+ "\n5Remove Item at given Location\n6:Remove an item\n7:Remove all elements\n8:Reverse List\n9:To Sort List"
							+ "\n10:To merge Element\n11:Display List\n12:Exit");
					int choise=sc.nextInt();
					switch(choise) {
					case 1:
						arrayListObject.addElementInList();
						isElementInArray1=true;
						break;
					case 2:
						System.out.println("Enter location at do you want to insert item:");
						int location=sc.nextInt();
						System.out.println("Enter item value:");
						int itemValue=sc.nextInt();		
						arrayListObject.addElementAtGivenLocation(location,itemValue);
						break;
					case 3:
						if(isElementInArray1) {
							System.out.println("Enter item");
							int item=sc.nextInt();
							arrayListObject.firstOccurrenceOfItem(item);
							break;
						}
						else {
							System.out.println("First enter element in array:");
							break;
						}	
					case 4:
						if(isElementInArray1) {
							System.out.println("Enter location");
							location=sc.nextInt();
							arrayListObject.firstOccurrenceOfItemBasedOnLocation(location);
							break;
						}
						else {
							System.out.println("First enter element in array:");
							break;
						}
					case 5:
						if(isElementInArray1) {
							System.out.println("Enter Location at which do you want to remove item:");
							location=sc.nextInt();
							arrayListObject.removeItemAtGivenLocation(location);
							break;
						}
						else {
							System.out.println("First enter element in array:");
							break;
						}
					case 6:
						if(isElementInArray1) {
							System.out.println("Enter item do you want to remove item:");
							int item=sc.nextInt();
							arrayListObject.removeItem(item);
							break;
						}
						else {
							System.out.println("First enter element in array:");
							break;
						}
					case 7:
						if(isElementInArray1) {
							arrayListObject.removeAllElement();
							isElementInArray1=false;
							break;
						}
						else {
							System.out.println("List is already Empty");
							break;
						}
					case 8:
						if(isElementInArray1) {
							arrayListObject.reverseList();
							break;
						}
						else {
							System.out.println("List is already Empty");
							break;
						}
					case 9:
						if(isElementInArray1) {
							arrayListObject.toSortArrayList();
							break;
						}
						else {
							System.out.println("List is already Empty");
							break;
						}
					case 10:
						System.out.println("How many Item do you want to enter");
						int numberOfElement=sc.nextInt();
						for(int i=0;i<numberOfElement;i++) {
							arrayListObject1.addElementInList();
						}	
						arrayListObject.mergeList(arrayListObject,arrayListObject1);
						break;
					case 11:
						if(isElementInArray1) {
							arrayListObject.displayList();
							break;
						}
						else {
							System.out.println("List is already Empty");
							break;
						}
					case 12:System.exit(0);	
					default:System.out.println("Please enter correct choise");
					}
				}
			}catch(InputMismatchException exception){System.out.println("Please Enter value provided on screen");}
		}
	}