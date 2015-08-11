import static org.junit.Assert.*;
import org.junit.Test;


public class JUnitTest1 {


	@Test
	public void testRemainder1() {
		Assignment1 check= new Assignment1();
		int valueExpected=0;
		int valueActual=check.rem(2, 1);
		assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testRemainder2() {
		Assignment1 check= new Assignment1();
		int valueExpected=0;
		int valueActual=check.rem(0, 2);
		assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testRemainder3() {
		Assignment1 check= new Assignment1();
		int valueExpected=1;
		int valueActual=check.rem(100, 3);
		assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testGCD1() {
		Assignment1 check= new Assignment1();
		int valueExpected=1;
		int valueActual=check.gcd(2, 1);
		assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testGCD2() {
		Assignment1 check= new Assignment1();
		int valueExpected=6;
		int valueActual=check.gcd(12, 18);
		assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testGCD3() {
		Assignment1 check= new Assignment1();
		int valueExpected=1;
		int valueActual=check.gcd(100, 3);
		assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testLargestDigit1() {
		Assignment1 check= new Assignment1();
		int valueExpected=2;
		int valueActual=check.largestDigit(2);
		assertEquals(valueActual,valueExpected);
	}
	
	
	@Test
	public void testLargestDigit2() {
		Assignment1 check= new Assignment1();
		int valueExpected=9;
		int valueActual=check.largestDigit(1257369);
		assertEquals(valueActual,valueExpected);
	}
	
	
	@Test
	public void testLargestDigit3() {
		Assignment1 check= new Assignment1();
		int valueExpected=4;
		int valueActual=check.largestDigit(444);
		assertEquals(valueActual,valueExpected);
	}



}
