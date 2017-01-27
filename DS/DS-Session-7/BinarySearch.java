import java.util.Arrays;
import java.util.Scanner;

/*
 * DS-Session-7 Assignment
 * @author Banwari Kevat
 */
public class BinarySearch {
	/*
	 *This method for binary search in sorted arraylist
	 *@param inputArr is the list in which search will be performed
	 *@param key is the item which will be searched
	 *return index of leftmost key if not found then return -1
	 */
	public int binarySearch(int[] inputArr, int key)
	{
        //indexFound for storing the index of key
        int indexFound = -1;
        //starting index
        int start = 0;
        //lst index of current list
        int end = inputArr.length - 1;
        
        while (start <= end) 
        {
            int mid = (start + end) / 2;
            // element found 
            if (key == inputArr[mid]) 
            {
                indexFound = mid;
            }
            //element resides in left side of middle element
            if (key < inputArr[mid])
            {
                end = mid - 1;
            }
            //element resides in right side of middle element
            else
            {
                start = mid + 1;
            }
        }
        //now perform linear search for leftmost index
        while( indexFound > 0 && inputArr[indexFound-1] == key  )
        {     
        	indexFound--;
        }
        return indexFound;
    }

	public static void main(String [] arg) {
		  try 
		  {     Scanner sc = new Scanner(System.in);
		  
		        BinarySearch obj = new BinarySearch();
		        System.out.print("Enter the size of integer list: ");
		        int size = sc.nextInt();
		        int [] list = new int[size];
		        System.out.println("Enter "+size+" elements into the list in increasing order: "
		        		+ "\n   (if list is not sorted then list will be automatically sorted then index may be changed)");
		        for(int i = 0; i<size ; i++)
		        	list[i] = sc.nextInt();
		        System.out.println("Enter the element whose index to be searched: ");
		        int search = sc.nextInt();
		        Arrays.sort(list);
	            System.out.println("Position of "+search+"is : "+obj.binarySearch(list, search));	
		  }
		  catch (Exception e){
			  System.out.println(e.getMessage());
		  }
	}
}
