
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
public class TestJUnit {
	
	RemoveDuplicate rm=new RemoveDuplicate();
	int arr[]=new int[]{3,2,2,6,7,7,6,1,2,3};
	//System.out.println("output is"+arr.length);
	int op[]=rm.removeDuplicat(arr);
	int expected[]=new int[]{3,2,6,7,1};
	//int a=b1.convertBinaryToOctal(110101);
	//System.out.println("Output is "+a);

   @Test
   public void testPrintMessage() {
      
	   assertArrayEquals(expected,op);
   }
}