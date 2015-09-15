/*
 * Tower of Hanoi problem
 */
import java.util.*;
public class TowerOfHanoi {
	
	/*
	 *    result is a list variable which holds output
	 */
	List<String> result = new ArrayList<String>();       
	
	
	/*
	 * It is a recursive method which takes 4 arguments
	 * and finally gives output of disk movement
	 */
   public List<String> towerOfHanoi(String start, String middle, String end, int n) {
	   
       if (n == 1) {
    	   result.add("Move Disk From "+start + " to " + end);
         
       } else {
    	   towerOfHanoi(start, end, middle, n-1);
    	   result.add("Move Disk From "+start + " to " + end);;
          
           towerOfHanoi(middle, start, end,n-1);
       }
       return result;
   }

   public static void main(String[] args) {
	     Scanner sc = new Scanner ( System.in );
		int noOfDisk;
		System.out.print("\n Enter no of Disks : ");
		noOfDisk = sc.nextInt();					// take number of disks as input
		
		TowerOfHanoi toh = new TowerOfHanoi();
		List<String> result = toh.towerOfHanoi( "A", "B", "C", noOfDisk );
		
		Iterator<String> itr=result.iterator();//getting Iterator from arraylist to traverse elements  
		while(itr.hasNext())
		{  
			System.out.println( itr.next() );  
		}
   }
}
