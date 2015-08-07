import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class DiamondTest {

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
	public void testPrintDiamond() {
		Diamond testObj1 = new Diamond();
		String[] expected = {"  1"," 121","12321"," 121","  1"};
		assertEquals(expected, testObj1.printDiamond(3));
	}

	@Test
	public void testSpaces() {
		Diamond testObj2 = new Diamond();
		assertEquals("   ", testObj2.spaces(2, 5));
	}

	@Test
	public void testDigits() {
		Diamond testObj3 = new Diamond();
		assertEquals("12321", testObj3.digits(3, 5));
	}

}
