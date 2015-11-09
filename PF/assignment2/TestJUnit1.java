
import org.junit.Test;

import static org.junit.Assert.*;
public class TestJUnit1 {
	
	PF_assignment2_Q1 pf=new PF_assignment2_Q1();
	String spaceString=pf.spaces(1,3);
	String numberString=pf.numbers(3,3);
	String str=pf.pyramid(3);
	
	
	String expected1="  ";
	String expected2="12321";
	String expected3="  1\n 121\n12321\n 121\n  1";

	
   @Test
   public void testPrintMessage() {
      
	   assertEquals(spaceString,expected1);
	   assertEquals(numberString,expected2);
	   assertEquals(str,expected3);
   }
}