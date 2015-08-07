
import org.junit.Test;

import static org.junit.Assert.*;
public class TestJUnit {
	
	
	int op[],i=0;
	int arr1[]=new int[]{1, 5, 9, 25};
	int arr2[]=new int[]{12,7,2,5};
	FCFS rm=new FCFS();{
	op=rm.fCFS(arr1, arr2);
    
	}int expected[]=new int[]{0,8,11,0};
	

   @Test
   public void testPrintMessage() {
      
	   assertArrayEquals(expected,op);
   }
}