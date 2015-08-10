import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JoinTwoSortedArrayTest {

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
		int a[]={1,3,4,7,9,11},as=6;
		int b[]={2,4,6,8},bs=4;
		int c[]=new int[bs+as];
		JoinTwoSortedArray j=new JoinTwoSortedArray();
		c=j.join(a, as, b, bs, c);
		
		int d[]={1,2,3,4,4,6,7,8,9,11};
		
		assertArrayEquals("not match",d,c);
		
		
		
	}

}
