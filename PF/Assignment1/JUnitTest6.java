import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JUnitTest6 {

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
		Assignment6 obj1=new Assignment6();
		int[] a={2,5,7,9,11};
		int[] b={3,4,6,8};
		int[] c=new int[a.length+b.length];
		int[] arrayE={2,3,4,5,6,7,8,9,11};
		Assignment6 obj=new Assignment6();
		c=obj.join(a,5,b,4,c);
		assertArrayEquals("Not Deleted Properly",arrayE,c );
		//fail("Not yet implemented");
	}

}
