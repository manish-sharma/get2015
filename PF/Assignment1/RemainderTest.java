import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RemainderTest {
	Remainder testObj = new Remainder();
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
		assertEquals(1, testObj.rem(100, 3));
	}
	
	@Test
	public void test2() {
		assertEquals(0, testObj.rem(2, 1));
	}
	
	@Test
	public void test3() {
		assertEquals(-1, testObj.rem(2, 0));
	}

}
