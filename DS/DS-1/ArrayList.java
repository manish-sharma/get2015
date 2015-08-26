/**
 * Class to implement ArrayList
 * @author Sanjay
 */

import java.util.Scanner;
public class ArrayList {
	
	
	int[] array;
	int size;
	int count = 0;
	
	/**
	 * Constructor of ArrayList
	 */
	public ArrayList(){
		size = 10;
		 array = new int[size];
		
	}
	
	/**
	 * Method to add Element
	 * @param element = element to be added
	 * @return updated array
	 */
	int[] addElement(int element){
		if(size()>0 && size()%10==0){
			size = size + 10;
			int[] arrayTemp= array;
			array = new int[size];
			for(int i = 0;i<size();i++){
				array[i] = arrayTemp[i]; 
			}
		}
		
		array[count]=element;
		count++;
		return array;
		
	}
	
	/**
	 * Method for size of array
	 * @return size of array
	 */
	int size(){
		return count;
	}
	
	/**
	 * Method to insert element at a particular position
	 * @param element = element to be inserted
	 * @param position = location for the element
	 * @return updated array
	 * throws exception if the location is more than the size of array
	 */
	int[] insertElement(int element, int position){
		int[] arrayTemp = new int[size()];
		if(position<0){
			System.out.println("Please enter positive value for position");
			return array;
		}
		if(position>size()){
			System.out.println("The position is greater than the size of array");
			return array;
		}
		for(int i = 0;i<size();i++){
			arrayTemp[i]= array[i];
		}
		if(size()%10 == 0){
			size = size + 10;
			array = new int[size];
		}
		for(int i = 0;i<position;i++){
			array[i] = arrayTemp[i]; 
		}
		array[position] = element;
		for(int i=position+1;i<=count;i++){
			array[i]=arrayTemp[i-1];
		}
		count++;
		return array;
	}
	
	/**
	 * Method to get the location of particular element after a position
	 * @param element = element to be checked
	 * @param location = location after which it will check
	 * @return = location
	 * Throws exception when location is more than size of arrray
	 */
	int getLocation(int element, int location){
		if(location < 0 ){
			System.out.println("Please give a positive value for location");
			return 0;
		}
		else if(location>size()){
			System.out.println("Please give location less than " +size());
			return 0;
		}
		else{
			for(int i=location;i<size();i++ ){
				if(array[i]==element){
					return i;
				}
			}
		}
		return 0;
	}
	
	/**
	 * Method to remove element from a particular location
	 * @param location = location to delete the element
	 * @return = updated array
	 */
	int[] removeElementFromLocation(int location){
		
		if(location < 0 ){
			System.out.println("Please give a positive value for location");
			return array;
		}
		else if(location>size()){
			System.out.println("Please give location less than " +size());
			return array;
		}
		else{
			
			for(int i=location;i<size()-1;i++){
				array[i]=array[i+1];
		}
			count--;
			return array;
			
	}
	}
	
	
	/**
	 * Method to remove a particular element from the list and the instances of it
	 * @param element = element to be deleted
	 * @return flag
	 */
	int removeElement(int element){
		int flag = 0;
		for(int i = 0;i<size();i++){
			if(array[i] == element){
				removeElementFromLocation(i);
				flag=1;
				i=0;
			}
			
		}
		return flag;
		
	}
	
	
	/**
	 * Method to clear the list
	 */
	void clearList(){
		array = new int[10];
		count =0;
	}
	
	
	/**
	 * Method to reverse the array
	 * @return = reversed array
	 */
	int[] reverseArrayList(){
		int[] reverseArray = new int[size()];
		int k=0;
		for(int i = size()-1;i>=0;i--){
			reverseArray[k]=array[i];
			k++;
		}
		return reverseArray;
	}
	
	
	/**
	 * Method to partition the array for sorting using Quick Sort
	 * @param array = array
	 * @param left = first index
	 * @param right = last index
	 * @return
	 */
	int partition(int array[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      
	      // pivot is middle index
	      int pivot = array[(left + right) / 2];
	     
	      
	      // Divide into two arrays
	      while (i <= j) {
	    	  
	    	  
	    	  /**
	             * We will check a number from left side which is greater then the pivot value,
	             * and a number from right side which is less then the pivot value.
	             * Once search is complete, we can swap both numbers.
	             */
	    	  
	            while (array[i] < pivot)
	                  i++;
	            while (array[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = array[i];
	                  array[i] = array[j];
	                  array[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	
	/**
	 * This method implements and calls the quickSort method recursively
	 * @param array = input array
	 * @param left = index of the array
	 * @param right = length of the array
	 * @return array = the sorted array
	 */
	
	int[] quickSort(int array[], int left, int right) {
	      int index = partition(array, left, right);
	      if (left < index - 1)
	            quickSort(array, left, index - 1);
	      if (index < right)
	            quickSort(array, index, right);
	      return array;
	}
	
	void sort(){
		int left = 0;
		int right = size()-1;
		int[] sortedArray = quickSort(array, left, right);
		for(int i = 0;i<size();i++){
			System.out.println(sortedArray[i]);
		}
	}
	void addList(ArrayList newList){
		for(int i = 0;i<newList.size();i++){
			addElement(newList.array[i]);
		}
		for(int i = 0;i<size();i++){
			System.out.println(array[i]);
		}
		
	}
	
	
	/**
	 * Method to display the menu
	 */
	void displayMenu(){
		ArrayList object = new ArrayList();
		ArrayList newListObject = new ArrayList();
		Scanner scan = new Scanner(System.in);
		int element;
		int location;
		
		while(true){
			System.out.println("Please enter your choice");
			System.out.println("1.Adding an item into array list");
			System.out.println("2.Retrieving the first occurrence of an item based on its given location");
			System.out.println("3.Retrieving the first index of particular item in the arraylist");
			System.out.println("4.Removing an item based on particular location");
			System.out.println("5.Remove given particular item from the arraylist");
			System.out.println("6.Clear the list ");
			System.out.println("7.Reverse the arraylist");
			System.out.println("8.Sort the elements of arraylist");
			System.out.println("9.Add another List");
			System.out.println("10.Display Array");
			System.out.println("0. to exit");
			int userInput =  scan.nextInt();
			
			switch (userInput){
			
			case 1:
				System.out.println("Enter the element to be added into the list");
				element = scan.nextInt();
				object.addElement(element);
				break;
				
			case 2:
				if(object.size()==0){
					System.out.println("there is no element in the list");
					
				}
				else{
					System.out.println("Please enter the element you want to search");
					element = scan.nextInt();
					System.out.println("Enter the location of the element");
					location = scan.nextInt();
					location = object.getLocation(element, location);
					if(location == 0){
						System.out.println("Element is not present in the list or is not after the location mentioned ");
					}
					else{
						System.out.println("element is present at "+location);
					}
					
					
				}
				
				break;
				
			case 3:
				System.out.println("Enter the element that you want to search");
				element = scan.nextInt();
				if(object.size()==0){
					System.out.println("There is no element in the list");
					
				}
				else{
					location = object.getLocation(element,0);
					if(location==0){
						System.out.println("the element is not present in the list");
					}
					else{
						System.out.println("Element is present at "+location);
					}
					
				}
				
				break;
				
			case 4:
				System.out.println("Enter the location from where you want to remove the element");
				location = scan.nextInt();
				int[] arrayRemove = object.removeElementFromLocation(location);
				System.out.println("New array list is");
				for(int i = 0; i<object.size();i++){
					System.out.println(arrayRemove[i]);
				}
				
				break;
				
			case 5:
				System.out.println("Enter the element that you want to delete from the list");
				element = scan.nextInt();
				int check = object.removeElement(element);
				if(check == 0){
					System.out.println("Element not present in the list");
				}
				
				break;
			
			case 6:
				System.out.println("The list has been cleared");
				object.clearList();
				break;
			
			case 7:
				System.out.println("The list has been reversed");
				int[] reversedArray = object.reverseArrayList();
				for(int i=0;i<object.size();i++){
					System.out.println(reversedArray[i]);
				}
				break;
				
			case 8:
				System.out.println("The list has been sorted");
				object.sort();
				System.out.println();
				break;
				
			case 9:
				System.out.println("Please add element to new list");
				System.out.println("Enter the number of elements you want to add");
				int number = scan.nextInt();
				for(int i=0;i<number;i++){
					newListObject.addElement(i);
				}
				object.addList(newListObject);
				break;
			
			case 10:
				if(object.size()==0){
					System.out.println("There is no element in the list. Please add elements first");
				}
				else{
					for(int i = 0;i<object.size();i++){
						System.out.println(object.array[i]);
					}
				}
				
				break;
			
			case 0:
				System.exit(0);
			}
		}
		
	}

	public static void main(String[] args){
		ArrayList object = new ArrayList();
		object.displayMenu();
		
		
	}
}
