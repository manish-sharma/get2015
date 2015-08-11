import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LargestDigitTest {

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
	public void test1() {
		LargestDigit testObj1 = new LargestDigit();
		assertEquals(2, testObj1.largestDigit(2));
	}
	
	@Test
	public void test2() {
		LargestDigit testObj2 = new LargestDigit();
		assertEquals(9, testObj2.largestDigit(1257369));
	}
	
	@Test
	public void test3() {
		LargestDigit testObj3 = new LargestDigit();
		assertEquals(4, testObj3.largestDigit(444));
	}

}
