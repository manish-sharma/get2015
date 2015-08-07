import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PyramidTest {

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
	public void testPrintPyramid() {
		Pyramid testObj1 = new Pyramid();
		String[] expected = {"12345"," 1234","  123","   12","    1"};
		assertEquals(expected, testObj1.printPyramid(5));
	}

	@Test
	public void testSpaces() {
		Pyramid testObj2 = new Pyramid();
		assertEquals(" ", testObj2.spaces(2, 5));
	}

	@Test
	public void testDigits() {
		Pyramid testObj3 = new Pyramid();
		assertEquals("1234", testObj3.digits(2, 5));
	}

}
