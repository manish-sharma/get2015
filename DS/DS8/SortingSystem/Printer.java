
package SortingSystem;
import java.util.List;
/**
* This class is used to print the sorted list.
* This class is also take case the which type of sorting is perform on list.
* @author Nikhil
*/

public class Printer {
	/**
	* This method is take care that wich type of sorting is perform on list and print list according to sorting.s
	*/
 static void displayOfArrayElement(int checkElement,List<Integer> list)
 {
	 switch(checkElement)
	 {
	 case 1: System.out.println("List Element are : \n"+list);
	         break;
	 case 2: System.out.println("List Elements are sorted according to Linear sort with the use of counting sort :\n"+list);	 
             break;
	 case 3: System.out.println("List Elements are sorted according to Linear sort with the use of radix sort  :\n"+list);	 
             break;
	 case 4: System.out.println("List Elements are sorted according to Linear sort with the use of bubble sort :\n"+list);	 
             break;
	 case 5: System.out.println("List Elements are sorted according to Linear sort with the use of quick sort :\n"+list);	 
             break;
	 
	 }
}
}