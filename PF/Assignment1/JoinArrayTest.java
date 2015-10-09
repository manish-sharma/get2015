import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JoinArrayTest {

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
	public void joinArrayTest() {
		JoinArray ja = new JoinArray();
		int array1[] = {1,3,4,5,8,9,25,30};
		int array2[] = {2,6,13,21,35};
		int asize = array1.length;
		int bsize = array2.length;
		int expected[] = {1,2,3,4,5,6,8,9,13,21,25,30,35};
		int result[] = ja.join(array1, asize, array2, bsize);
		assertArrayEquals(expected,result);
	}

}
