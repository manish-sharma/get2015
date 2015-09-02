/**
 * class to find the leftmost occurrence and rightmost occurrence of x.
 * @author Sanjay
 */

import java.util.*;
public class BinarySearchInvarient {
	public static void main(String args[]) {
		ArrayList<Integer> elementList=new ArrayList<Integer>();
		BinarySearchInvarient object = new BinarySearchInvarient();
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("Enter 1 to add elements");
			System.out.println("Enter 2 to display leftmost and right most element");
			System.out.println("Enter 3 to display list");
			while(!scan.hasNextInt()) {
				System.out.println("Enter integer only. Please enter again");
				scan.next();
			}
			int userInput = scan.nextInt();
			switch (userInput) {
			case 1:
				System.out.println("Enter the element");
				while(!scan.hasNextInt()) {
					System.out.println("Enter integer only. Please enter again");
					scan.next();
				}
				int element = scan.nextInt();
				elementList.add(element);
				Collections.sort(elementList);
				break;
			case 2:
				if(elementList.isEmpty()){
					System.out.println("The list is empty. Please enter some elements first");
				}
				else{
					System.out.println("Enter the element you want to search");
					while(!scan.hasNextInt()) {
						System.out.println("Enter integer only. Please enter again");
						scan.next();
					}
					int searchElement = scan.nextInt();
					int index=Collections.binarySearch(elementList,searchElement);
					if(index<0){
						System.out.println("The element is not in the list");
					}
					else{
						System.out.println("Left most element is : " + object.findLeftMost(index, elementList));
						System.out.println("Right most element is : " + object.findRightMost(index, elementList));
					}
				}
				break;
			case 3:
				object.displayList(elementList);
				break;
			default:
				System.out.println("Please enter integer elements");
				break;
			}
		}   
	}

	/**
	 * Method to find the leftmost occurrence
	 * @param index = index of element
	 * @param elementList = list of elements
	 * @return = leftmost index of element
	 */
	protected int findLeftMost(int index, ArrayList<Integer> elementList){
		int left =index;
		
		//this loop runs till the previous element is not less than zero and is equal to the element to be searched
		while(left-1 >= 0 && elementList.get(left-1)==elementList.get(index)){
			left=left-1;
		}
		return left;
	}

	/**
	 * Method to find the rightmost occurrence
	 * @param index = index of the element
	 * @param elementList = list of elements
	 * @return = rightmost index of elements
	 */
	protected int findRightMost(int index, ArrayList<Integer> elementList){
		int right=index;
		//this loop runs till the next element is not less than zero and is equal to the element to be searched
		while(right+1 < elementList.size() && elementList.get(right+1)==elementList.get(index)){
			right=right+1;
		}
		return right;
	}

	/**
	 * Method to display the array list
	 * @param elementList
	 */
	protected void displayList(ArrayList<Integer> elementList){
		Iterator itr = elementList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

