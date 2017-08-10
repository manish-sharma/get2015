import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestForLargestDigitNumber {

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
	public void testForSingleDigit() {
		LargestDigitNumber digit=new LargestDigitNumber();
		assertEquals("correct result",2,digit.largestDigit(2));
	}

	@Test
	public void testForRandomDigit() {
		LargestDigitNumber digit=new LargestDigitNumber();
		assertEquals("correct result",9,digit.largestDigit(126985422));
	}
	@Test
	public void testForSameDigit() {
		LargestDigitNumber digit=new LargestDigitNumber();
		assertEquals("correct result",4,digit.largestDigit(444));
	}
}
