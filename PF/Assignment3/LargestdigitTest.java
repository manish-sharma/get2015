package largestdigit;

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
	public void largestDigitTest1() {
		Largestdigit ldObject = new Largestdigit();
		int result = ldObject.largestdigit(2);
		assertEquals(2,result);
	}
	
	@Test
	public void largestDigitTest2() {
		Largestdigit ldObject = new Largestdigit();
		int result = ldObject.largestdigit(1257369);
		assertEquals(9,result);
	}
	
	@Test
	public void largestDigitTest3() {
		Largestdigit ldObject = new Largestdigit();
		int result = ldObject.largestdigit(444);
		assertEquals(4,result);
	}
}
