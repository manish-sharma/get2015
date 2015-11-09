package assignmentDS_7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestJUnit {
	
  // String message = "Hello World";	
   BinarySearchForLeftMostIndex binarySearchForLeftMostIndex;
	
   @Test
   public void testPrintMessage() 
   {
	   
	   binarySearchForLeftMostIndex=new BinarySearchForLeftMostIndex();
	   int arr[]=new int[]{1,3,4,4,4,5,6,7,8,8,8};
       assertEquals(8,binarySearchForLeftMostIndex.binarySearch(arr, 8, 0, arr.length));
       assertEquals(-1,binarySearchForLeftMostIndex.binarySearch(arr, 0, 0, arr.length));
   }
}
