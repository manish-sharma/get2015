
import org.junit.Test;

import static org.junit.Assert.*;
public class TestJUnit {
	
	LongestSequence rm=new LongestSequence();
	int arr[]=new int[]{3,2,2,1,2,3,4,3,4,5,6,7,8};
	//System.out.println("output is"+arr.length);
	int op[]=rm.longestSequence(arr);
	int expected[]=new int[]{3,4,5,6,7,8};
	//int a=b1.convertBinaryToOctal(110101);
	//System.out.println("Output is "+a);

   @Test
   public void testPrintMessage() {
      
	   assertArrayEquals(expected,op);
   }
}