import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ArraySortTest {

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
		ArraySort testObj = new ArraySort();
		int[] a = new int[]{2,3,5,8};
		int[] b = new int[]{1,4,6,7};
		int[] c = new int[]{1,2,3,4,5,6,7,8};
		int asize=4,bsize=4;
		assertArrayEquals(new int[]{1,2,3,4,5,6,7,8},testObj.join(a, asize, b, bsize, c));
	}

}
