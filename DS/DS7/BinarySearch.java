import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class BinarySearch {

	List<Integer> SearchArray = new ArrayList<Integer>();

	/**this function is used to insert element in arrayList in sorting order.
 * */
	void insertInBinaySearch() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter Element");
		SearchArray.add(Util.userInputInArrayList());
		Collections.sort(SearchArray);

	}

	/** This method finds the leftmost occurrence of an element in a given array
	 * 
	 * @param itemArray : Array in which item is to be searched
	 * @param searchNumber :
	 * @param lowerBound : 
	 * @param upperBound : 
	 * @return Returns index of the leftmost occurrence of the element in the array,
	 * if the element is not fount then it returns -1

		int index = -1;
		/* If itemArray is null or length of itemArray is zero
		 * then return -1
		 */
	int BinarySearchFunction( int SearchElement,
			int lowerBound, int upperBound) {
           int index=-1;
				
			if(SearchArray.size()==0)
				return -1;
			
			/* If length of itemArray is 1, and if searchNumber is equal to first element of array, 
			 * then return 0 */
			else if(SearchArray.size() == 1)
				if(SearchArray.get(0) == SearchElement)
					return 0;
			while (lowerBound != upperBound) {  //invariants  condition  lowerBound != upperBound.thats independent of element found or not
				int MidIndex = (lowerBound + upperBound) / 2;
				if (SearchArray.get(MidIndex) == SearchElement) {
		           index = MidIndex;
		           upperBound = MidIndex;
				}
		  
				if (SearchArray.get(MidIndex) < SearchElement) {
		           lowerBound = MidIndex + 1;
				} 
				else {
		           upperBound = MidIndex;
				}
			}
			return index;
		}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinarySearch binarySearch =new BinarySearch();
		int choice = 0;
		/* Showing menu */
		while (choice != 4) {
			System.out.println("1.Insert in array");
			System.out.println("2. Search an Element");
			System.out.println("3. showList");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			choice=Util.userInput();
			switch (choice) {
			case 1: binarySearch.insertInBinaySearch();
				    break;
			case 2:  
			       	System.out.println("Enter  Search Element");
				      int element = Util.userInputInArrayList();
					  int OutputIndex=binarySearch.BinarySearchFunction(element, 0,binarySearch.SearchArray.size()-1);
			             if (OutputIndex < 0) // check that array contain that element or not
						{
							System.out.println("Array doesn't contain the Search element");
						
						}
			             else
			            	 System.out.println("List contain LeftMost element at index -> " + (OutputIndex+1));
			         break;
			case 3:  System.out.println("List elements are \n"+binarySearch.SearchArray);;
					    break;
			case 4: choice=4;							      
			default: System.out.println("Enter correct choice");
			
			}
		}

	}
}
