import java.util.Arrays;
import java.util.Scanner;

/*
 * DS-Session-7 Assignment
 * @author Banwari Kevat
 */
public class BinarySearch {
	
	public int binarySearch(int[] inputArr, int key) {
        int indexFound = -1;
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (key == inputArr[mid]) {
                indexFound = mid;
            }
           
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
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
