import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JoinSortedArrayTest {

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
		JoinSortedArray array= new JoinSortedArray();
		int a[]={1,2,3};
		int b[]={4,5,6};
	    int c[]=new int[]{1,2,3,4,5,6};
	    for(int loopCount=0;loopCount<c.length;loopCount++)
	assertEquals(c[loopCount], array.merge(a, 3, b, 3)[loopCount]);
	}

}
