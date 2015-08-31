import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Assignment1Test {

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
	public void testSpaces() {
		String expected = "    ";
		assertEquals(expected, new Assignment1().spaces(1, 5)); //the 1st argument of numbers should be row number and second should be height  of half pyramid
	}

	@Test
	public void testNumbers() {
		String expected = "1234321";
		assertEquals(expected, new Assignment1().numbers(4, 5)); //the 1st argument of numbers should be row number and second should be height of half pyramid
	}

	@Test
	public void testPyramid() {
		String expected = " 1234321";
		String str[]=new Assignment1().pyramid(5);
		assertEquals(expected, str[3]); //enter the index of the str = row which you want to check -1
	}

}
