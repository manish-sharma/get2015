import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestJUnit {
	
   String message = "Hello World";	
   Binary2octal b1=new Binary2octal();
	
   @Test
   public void testPrintMessage() {
      
      assertEquals(65,b1.convertBinaryToOctal(110101));
   }
}