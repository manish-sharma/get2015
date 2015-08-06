import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LongestIncreasingSeqTest {

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
		LongestIncreasingSeq testObj = new LongestIncreasingSeq();
		int[] a = new int[]{1,2,5,6,4,2,6,4,6,2,3,5,6,7,8,9,5,4,1,6,3,4,5,6,8};
		assertArrayEquals(new int[]{2,3,5,6,7,8,9},testObj.findSequence(a));
	}

}
