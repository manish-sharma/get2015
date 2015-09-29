import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class linearSearchThruRecursionTest {

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
		linearSearchThrurRecursion testObj1 = new linearSearchThrurRecursion();
		assertEquals(-1, testObj1.linearSearch(new int[]{2, 5, 8, 9, 10, 55, 77}, 7, 88));
	}
	
	@Test
	public void test2() {
		linearSearchThrurRecursion testObj2 = new linearSearchThrurRecursion();
		assertEquals(6, testObj2.linearSearch(new int[]{2, 5, 8, 9, 10, 55, 77}, 7, 77));
	}
}
