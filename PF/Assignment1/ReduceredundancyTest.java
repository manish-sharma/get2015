import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ReduceredundancyTest {

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
	public void testRedundancy() {
		Reduceredundancy objectReduceRedundancy = new Reduceredundancy();
		int inputArray[] = {2,5,4,6,3,8,5,9,6,3,9,0};
		int resultArray[] = objectReduceRedundancy.removeDuplicate(inputArray);
		int expectedArray[] = {2,5,4,6,3,8,9,0};
		assertArrayEquals(expectedArray,resultArray);
	}
}
