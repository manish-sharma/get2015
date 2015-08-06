import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RemoveDuplicateTest {

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
		RemoveDuplicate testObj = new RemoveDuplicate();
		int[] a = new int[]{3,5,3,6,6,9,9,5};
		assertArrayEquals(new int[]{3,5,6,9},testObj.removeDuplicate(a));
	}

}
