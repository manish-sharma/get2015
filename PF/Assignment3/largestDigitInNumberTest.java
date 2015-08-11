import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class largestDigitInNumberTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void largestDigittest1() {
		largestDigitInNumber objectOflargestDigitNumber=new largestDigitInNumber();
		int expectedLargestDigit=2;
		int actualLargestDigit=objectOflargestDigitNumber.largestdigit(2);
		assertEquals("Match",expectedLargestDigit,actualLargestDigit);
		
	}
	
	@Test
	public void largestDigittest2() {
		largestDigitInNumber objectOflargestDigitNumber=new largestDigitInNumber();
		int expectedLargestDigit=9;
		int actualLargestDigit=objectOflargestDigitNumber.largestdigit(1257369);
		assertEquals("Match",expectedLargestDigit,actualLargestDigit);
		
	}
	
	@Test
	public void largestDigittest3() {
		largestDigitInNumber objectOflargestDigitNumber=new largestDigitInNumber();
		int expectedLargestDigit=4;
		int actualLargestDigit=objectOflargestDigitNumber.largestdigit(444);
		assertEquals("Match",expectedLargestDigit,actualLargestDigit);
		
	}

}
