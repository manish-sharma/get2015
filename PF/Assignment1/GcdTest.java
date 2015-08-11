import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GcdTest {

	Gcd testObj = new Gcd();
	
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
		assertEquals(1, testObj.findGCD(100,  3));
	}
	
	@Test
	public void test2() {
		assertEquals(6, testObj.findGCD(12, 18));
	}
	
	@Test
	public void test3() {
		assertEquals(1, testObj.findGCD(2, 1));
	}

}
