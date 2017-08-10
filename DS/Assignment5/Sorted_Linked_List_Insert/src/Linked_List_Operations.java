import java.util.Iterator;
import java.util.List;
/**
 * @author Amit
 *
 */

public class Linked_List_Operations{
	int index;
	
	/** Method to insert element at correct position in linked list
	 *
	 * @param element : element to be inserted
	 * @param list : sorted linked list in which element is to be inserted
	 */
	public boolean insert(int element, List<Integer> list) {
	
		if(list == null)
			return false;
		/* If index becomes equal to list size then element
		 * will be added to list directly*/
		if(index == list.size()) {
			list.add(element);
			index = 0;
		}
		
		/* if element i greater than the element at the index
		 * then method will be recursively called with increased index
		 */
		else if((int)list.get(index) < element) {
			index++;
			insert(element, list);
		}
		/* If element less than or equal to current element then 
		 * it will be added to the list
		 */
		else {
			list.add(index, element);
			index = 0;
		}
		return true;
	}
	
	/** Method to display the elements of the list 
	 * 
	 * @param list : linked list whose elements are to be displayed
	 */
	public void display(List<Integer> list) {
		
		/* Iterator object to iterate through the list */
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			
			/* Displaying elements of list one by one */
			System.out.println(iterator.next());
		}
	}
}
