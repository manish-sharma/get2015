
import org.junit.Test;


import static org.junit.Assert.*;
public class TestJUnit {
	
	
	ChkSorted chk=new ChkSorted();
	
	int arr[]=new int[]{3,2,1};
	int op=0;{
	op=chk.chkSorted(arr);
	}int expected=2;
	//int a=b1.convertBinaryToOctal(110101);
	//System.out.println("Output is "+a);

   @Test
   public void testPrintMessage() {
      
	   assertEquals(expected,op);
   }
}