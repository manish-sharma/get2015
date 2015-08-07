
import org.junit.Test;

import static org.junit.Assert.*;
public class TestJUnit {
	
	int op[],asize=0,bsize=0,i=0;
	int c[];
	int a[]=new int[]{1,5,8};
	int b[]=new int[]{2,3,4};{
	asize=a.length;
	bsize=b.length;
	int len=asize+bsize;
	c=new int[len];
	
	JoinTwoArray rm=new JoinTwoArray();
	c=rm.joinTwoArray(a, asize, b, bsize,c);
	}int expected[]=new int[]{1,2,3,4,5,8};
	//int a=b1.convertBinaryToOctal(110101);
	//System.out.println("Output is "+a);

   @Test
   public void testPrintMessage() {
      
	   assertArrayEquals(expected,c);
   }
}