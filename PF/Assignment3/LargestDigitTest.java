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
	public void test() {
		LargestDigit L =new LargestDigit();
		int output=L.largestDigit(2);
		assertEquals(2, output);
	}

	@Test
	public void test2() {
		LargestDigit L =new LargestDigit();
		int output=L.largestDigit(444);
		assertEquals(4, output);
	}
	
	@Test
	public void test3() {
		LargestDigit L =new LargestDigit();
		int output=L.largestDigit(1257369);
		assertEquals(9, output);
	}
	
	//negative test case
	
	@Test
	public void test4() {
		LargestDigit L =new LargestDigit();
		int output=L.largestDigit(-1);
		assertEquals(6, output);
	}

}
