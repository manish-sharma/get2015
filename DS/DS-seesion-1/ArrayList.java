/*
 * This class contain methods operate  on the list of items using array
 * All operations are encapsulated in this class which operates on List
 * @author Banwari
 */
public class ArrayList {
	private int arrayList[];
	private int maxLength;
		
	ArrayList(int sizeOfList) {
		arrayList = new int[sizeOfList];
		maxLength=-1;
	}
	
	//This method check the list is full or not 
	public boolean isFull() {
		if(maxLength==arrayList.length-1)
			return true;
		else 
			return false;
	}
	
	
	/*
	 * this method add an element at the last of list
	 * @param element is item which will be insert to the last of list
	 */
	public boolean addElement(int element) {
		if( isFull() ) {
			int i;
			int[] tempList = new int[maxLength+2];
			for( i=0;i<arrayList.length;i++ )
				  tempList[i]=arrayList[i];
			tempList[i]=element;
			arrayList=tempList;
			maxLength++;
			return true;
									
		}
		else {
			maxLength++;
			arrayList[maxLength] = element;
			return true;
		}	
	}
	
	
	/*
	 * This method will another list element to the current list
	 * @param list2 is the list
	 */
	
	public void addElements(ArrayList list2) {
		 for(int i=0;i<=list2.maxLength;i++) {
			 addElement(list2.arrayList[i]);
		 }
	}
	
	
	
	/*
	 * this method add an element into the given index of list
	 * @param element is item which will be insert to the last of list
	 * @param index is the index at which item will be inserted
	 */
	public boolean addElement(int item, int index) {
		 if( index>=0 && index <= maxLength ) {
			 if( index == maxLength ) {
				 addElement(item);
				 arrayList[index]=item;
				 return true;
			 }
			 else {
				 
				 for(int i=maxLength;i>=index;i--) { 
					 arrayList[i+1]=arrayList[i];					 
				 }
				 arrayList[index] = item;	
			      maxLength++;
			 return true;
			 }
			 
		 }	 
		 else return false;		 
	}
	
	
	/*
	 * This method return the index of element of first occurrence
	 * if element not found then it return -1
	 * @param element is the element whose index will be returned
	 */
	public int indexOfElement(int element){
		 for(int i = 0; i<=maxLength;i++) {
			 if(element==arrayList[i]) {
				 return i;
			 }
	      }
		 return -1;	 
	}
	
	
	
	/*
	 * This method return the index of element of first occurrence after given location
	 * if element not found then it return -1
	 * @param element is the element whose index will be returned
	 * @param index is location after that element is searched
	 */
	public int indexOfElement(int element , int locationAfterSearch){
		if(locationAfterSearch>=0 && locationAfterSearch<=maxLength) {
		     for(int i = locationAfterSearch; i<=maxLength;i++) {
			     if(element==arrayList[maxLength]) {
			    	 return i;
			     }
	          }
		    
		}
	return -1;	     
	}
	
	
	//this method remove the item of given location from list
	public boolean removeElementOfLocation(int location) {
		if(location>=0 && location <= maxLength) {
			for(int i=location; i<maxLength; i++)
				arrayList[i]=arrayList[i+1];
			maxLength--;
			return true;
		}
		else
			return false;
	}
	
	//this method remove the given item from list
	public int removeElement(int removeElement) {
		int countOfRemovedElement = 0;
		for(int i=0;i<=maxLength;i++) {
			if(arrayList[i]==removeElement) {
				for(int j=i;j<=maxLength-1;j++)
					arrayList[j]=arrayList[j+1];
			    i--;
				maxLength--;
				countOfRemovedElement++;
			}
		}
		return countOfRemovedElement;
	}
	
	
	//This method will clear the list
	public void clearArrayList() {
		System.out.println("List is cleared");
		arrayList = new int[0];
		maxLength=-1;
	}
	
	//this will return the reverse array list	 
	public int[] reverseArrayList() {
		int [] tempList = new int[arrayList.length];
		for(int i = 0 ; i< arrayList.length;i++) {
			tempList[i]= arrayList[arrayList.length-1-i];
		}
		return tempList;
	}
	
	//This method return the sorted list in ascending order by default
	public int [] sortedArrayList() {
		int [] temp = new int[arrayList.length];
		temp[0]=arrayList[0];
		int j;
		for(int i = 1 ; i<arrayList.length;i++) {
			for( j=i-1;j >= 0;j--) {
				if(temp[j]>arrayList[i]) {
					//shifting of element by one position 
					temp[j+1] = temp[j];
				}
				else {
					temp[j+1]=arrayList[i];
					break;
				}
			}
			if(j==-1) {
				temp[j+1]=arrayList[i];
			}
		}
		return temp;
	}
	
	//This method return the list reference
	public int[]  getArrayList(){
		return arrayList;

	}
	
	/*
	 * This method add current list to another list2
	 * @param list2 is the list which will be added to current list
	 */
	
	void addList(ArrayList list2) {
			addElements(list2);
		}

}
