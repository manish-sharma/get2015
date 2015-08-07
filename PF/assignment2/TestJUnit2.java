
import org.junit.Test;

import static org.junit.Assert.*;
public class TestJUnit2 {
	
	PF_assignment2_Q2 pf=new PF_assignment2_Q2();
	
	String spaceString=pf.spaces(1,3);
	String numberString=pf.numbers(1,5);
	String str=pf.pyramid(3);
	
	
	String expected1="";
	String expected2="12345";
	String expected="123\n 12\n  1\n";
   @Test
   public void testPrintMessage() {
      
	   assertEquals(spaceString,expected1);
	   assertEquals(numberString,expected2);
	   assertEquals(expected,str);
   }
}