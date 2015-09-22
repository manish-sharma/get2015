

import java.util.InputMismatchException;
import java.util.Scanner;

/**This class is for creating and performing array list operations but this class is limited to integer only.
*/
public class ArrayList {

    //myArray[] is an array of integer type. this holds all the elements you entered
	private int myArray[];
    //size variable stores the size of array list
	private int size = 0;

    public ArrayList() {
	myArray = new int[10];
    }

    /** takes input from user and check it same time
     * @return a integer type value entered by user
     */
    static int userInput() {
    	int number = 0;
    	Scanner sc = new Scanner(System.in);
    	try {
    		number = sc.nextInt();
    		return number;
    	}
    	catch(InputMismatchException e) {
    		System.out.print("\n enter only integer");
    		number = userInput();
    	}
    	return number;
    }
    
    /** merge two list of array list type
     * @param list1
     * @param list2
     * @return array list containing element of both type
     */
    public ArrayList mergeLists(ArrayList list1, ArrayList list2) {
	ArrayList tempArray = new ArrayList();
	tempArray.size = list1.size + list2.size;
	int i = 0;
	for (; i < list1.size; i++) {
	    tempArray.myArray[i] = list1.myArray[i];
	}
	for (; i < tempArray.size; i++) {
	    tempArray.myArray[i] = list2.myArray[i-list1.size];
	}
	list1 = tempArray;
	return list1;
    }

    
    /** add element in array list
     * @param item
     */
    public void addElement(int item) {
		if (size < myArray.length) {
		    myArray[size] = item;
		    size++;
		} 
		else {
		    int newArray[] = new int[myArray.length + 5];
		    for (int i = 0; i < myArray.length; i++) 
		    {
		    	newArray[i] = myArray[i];
		    }
		    newArray[size] = item;
		    size++;
		    myArray = newArray;
		}
    }

    /** this function sort the element of array in increasing order
     * 
     */
    public void sort() {
		for(int index1 = 0; index1< size-1; index1++){
			for(int index2 = index1; index2<size; index2++){
				if(myArray[index1]>myArray[index2]){
					int temp = myArray[index1];
					myArray[index1] = myArray[index2];
					myArray[index2] = temp;
				}
			}
		}
	}
    
    /** adds a element at a specific position
     * @param index at which element to be inserted
     * @param item value to be inserted
     * @return updated arraylist
     */
    public int[] addElementAtPosition(int index, int item) {
		for (int i = size; i > index; i--) {
		    myArray[i] = myArray[i - 1];
		}
		myArray[index] = item;
		size++;
		return myArray;
    }
	
	    
    /** give the position of a value user entered if value not found in arraylist then it return -1.
     * @param value 
     * @return
     */
    public int retrievingPosition(int value) {
		for (int i = 0; i < size; i++) {
		    if (myArray[i] == value) {
			return i;
		    }
		}
		return -1;
    }

   
    /**gives the position of value entered by user after the index in arraylist entered by user
     * @param value
     * @param position
     * @return index after position
     */
    public int retrievingPositionBasedOnLocation(int value, int position) {
		for (int i = position; i < size; i++) {
		    if (myArray[i] == value) {
			return i;
		    }
		}
		return -1;
    }

    /**remove value at index
     * @param index
     * @return updated arraylist
     */
    public int[] removeAtIndex(int index) {
		if(index>size) {
			System.out.println("index out of bound");
			return myArray;
		}
		else {
	    	for (int i = index; i < size; i++) {
			    myArray[i] = myArray[i + 1];
			}
			size--;
			System.out.println("item removed");
			return myArray;
		}
    }

    /**remove item on the basis of item value enterd by user
     * @param item
     * @return updated array list
     */
    public int[] removeItem(int item) {
		for (int i = 0; i < size; i++) {
		    if (myArray[i] == item) {
				for (int j = i; j < size - 1; j++) {
				    myArray[j] = myArray[j + 1];
				}
				size--;
				System.out.println("entity removed");
				return myArray;
		    }
		}
		System.out.println(item+" not found");
		return myArray;
    }

    /** print all elements of array list
     * 
     */
    public void printAllElements() {
    	System.out.println("List Size :"+size);
    	for (int i = 0; i < size; i++) {
		    System.out.println(this.myArray[i]);
		}
    }

    /**reverse array list
     * @return updated array list
     */
    public int[] reverseArrayList() {
    	int start = 0, end = size - 1;
    	if(size==0) {
    		System.out.println("array is empty");
    	}
    	else {
    		int temp;
    		while (start <= end) {
    			temp = myArray[start];
    			myArray[start] = myArray[end];
    			myArray[end] = temp;
    			start++;
    			end--;
    		}
    		System.out.println("array list reversed");
    	}
    	return myArray;
    }

    /** get item on the particular index
     * @param index
     */
    public void getItem(int index) {
    	if(index>size){
    		System.out.println("index not found");
    		}
    	else {
    		System.out.println(myArray[index]);
    	}
    	
    }

    /** clears the all elements of array list
     * 
     */
    public void clearList() {
    	size = 0;
    }
    
    /**
     * @return return the size of array
     */
    public int getSize() {
		
		return size;
	}


	public static void main(String args[]) {
		
		ArrayList arrayList=new ArrayList();
		int ch, item, loc, result;
		while (true) {
			System.out.print("\n 1. Adding an item "+
					 "\n 2. Adding an item into array list at the given particular location i"+
					 "\n 3. Retrieving the first occurrence of an item based on its given location"+
					 "\n 4. Retrieving the first index of particular item in the arraylist"+
					 "\n 5. Removing an item based on particular location"+
					 "\n 6. Remove given particular item from the arraylist  "+
					 "\n 7. Clear the list i.e. remove all the elements of the list"+
					 "\n 8. Reverse the arraylist"+
					 "\n 9. Display List"+
					 "\n 10. get item at particular index"+
					 "\n 11. sort a list"+
					 "\n 12.Exit");
			System.out.print("\n Enter Your Choice : ");
			ch = userInput();
			switch(ch)			// Apply switch case and call corresponding method according to the choice 
			{
				case 1: 
					System.out.print("\n Enter item : ");
					item = userInput();
					arrayList.addElement(item);
					break;
				case 2:
					System.out.print("\n Enter Location : ");
					 loc = userInput();
					System.out.print("\n Enter item : ");
				     item = userInput();
					arrayList.addElementAtPosition(loc, item);
					break;
				case 3:
					 System.out.print("\n Enter Location : ");
					 loc = userInput();
					 System.out.print("\n Enter item : ");
					 item = userInput();
					 result = arrayList.retrievingPositionBasedOnLocation(item, loc);
					 if(result == -1){
						 System.out.print("\n "+item+" not found after location "+loc);
					 }
					 else {
						 System.out.print("\n "+item+" found at location "+result);
					 }
					 break;
				case 4: 
					System.out.print("\n Enter item : ");
					item = userInput();
					result = arrayList.retrievingPosition(item); 
					if(result == -1){
						 System.out.print("\n "+item+" not found");
					 }
					 else {
						 System.out.print("\n "+item+" found at location "+result);
					 }
					break;
				case 5:
					System.out.print("\n Enter Location : ");
					loc = userInput();
					arrayList.removeAtIndex(loc);
					break;
				case 6:
					System.out.print("\n Enter item : ");
					item = userInput();
					arrayList.removeItem(item);
					break;
				case 7:
					arrayList.clearList();
					break;
				case 8:
					arrayList.reverseArrayList();
					break;
				case 9:
					arrayList.printAllElements();
					break;
				case 10:
					System.out.print("\n Enter index");
					loc = userInput();
					arrayList.getItem(loc);
					break;
				case 11:
					arrayList.sort();
					break;
				case 12:
					System.exit(0);
			}
		}
}

	

	}