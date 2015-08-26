/****************************************************************************************
Name            : ArrayListUsingArray
Revision Log    : 2015-08-25: Babalu patidar : created.
                : 
                : 
Use             : This class is used to perform operation of an array
                :
****************************************************************************************/

import java.util.Scanner;

public class ArrayListUsingArray {
	int[] arrayList,arrayListBuffer;
	int size=10,index;
	//Constructor for class
	public ArrayListUsingArray() {
		index=0;
		arrayList=new int[10];
	}
	
	//Method addElementInList is used to add element at last
	public void addElementInList(Scanner sc) {
		int arrayElement = 1;
		System.out.println("Enter element");
		try{
			arrayElement=Integer.parseInt(sc.next());
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
		catch(Exception e){
			System.out.println("Please Enter Integer value..");
			addElementInList(sc);
		}
	}
	
	//Method addElementInListAtGivenLocation is used to add element at given position
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
	
	//Method is used to find first index of given item
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
	
	//Method is used to find first Of Item Based On Location
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
	
	//Method is used to remove Item at given location
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
	
	//Method is used to remove given item
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
	
	//remove all element
	public void removeAllElement() {
		for(int i=0;i<index;i++) {
			arrayList[i]=0;
		}
		index=0;
	}
	
	//Method is used to reverse the list
	public void reverseList() {
		int swapVariable;
		for(int i=0;i<index/2;i++) {
			swapVariable=arrayList[i];
			arrayList[i]=arrayList[index-i-1];
			arrayList[index-i-1]=swapVariable;
		}
	}
	
	//Method is used to sort the list
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
	
	//Method is used to sort array list
	public void displayList() {
		System.out.print(" Array List is : ");	
		for(int i=0;i<index;i++){
			System.out.print(arrayList[i]+" ");	
		}
		System.out.println();	
	}
	
	//MergeList is used to merge to list and store in first object
	public void mergeList(ArrayListUsingArray arrayListObject,ArrayListUsingArray arrayListObject1) {
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
	

}
//End of class
