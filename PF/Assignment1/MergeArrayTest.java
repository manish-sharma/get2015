import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MergeArrayTest {

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
	public void test() 
	{
		//fail("Not yet implemented");
		MergeArray ma=new MergeArray();
		int ip1[]={5,9,15};
		int ip2[]={2,6,8,20};
		int op[]=ma.getVal(ip1,ip1.length,ip2,ip2.length);
		int arr[]={2,5,6,8,9,15,20};
		assertArrayEquals("True : ",arr,op);
	}

}
