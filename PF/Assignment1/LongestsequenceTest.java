import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SubsequenceTest {

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
	public void longestSequenceTest() {
		LongestSequence ss = new LongestSequence();
		int inputArray[] = {1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int expectedArray[] = {1,2,4,5,6,7,8,9};
		int resultArray[] = ss.longestSequence(inputArray);
		assertArrayEquals(expectedArray,resultArray);
	}

}
