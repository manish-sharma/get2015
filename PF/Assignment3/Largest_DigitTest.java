import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Largest_DigitTest {

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
// positive test case as per given in assignment
	@Test
	public void test() {
		Largest_Digit L =new Largest_Digit();
		int output=L.largest_digit(2);
		assertEquals(2, output);
	}
	// positive test case as per given in assignment
	@Test
	public void test2() {
		Largest_Digit L =new Largest_Digit();
		int output=L.largest_digit(444);
		assertEquals(4, output);
	}
	// positive test case as per given in assignment
	@Test
	public void test3() {
		Largest_Digit L =new Largest_Digit();
		int output=L.largest_digit(1257369);
		assertEquals(9, output);
	}
	// negative test case 
	@Test
	public void test4() {
		Largest_Digit L =new Largest_Digit();
		int output=L.largest_digit(-1);
		assertEquals(6, output);
	}
}
