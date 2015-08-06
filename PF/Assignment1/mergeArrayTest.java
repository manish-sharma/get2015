import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class mergeArrayTest {

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
		mergeArray arr=new mergeArray();
		int[] ip1={1,2,3,4,5};
		int[] ip2={0,6,7,8,9};
		int[] op={0,1,2,3,4,5,6,7,8,9};
		int[] output=arr.getVal(ip1,5,ip2,5);
		assertArrayEquals("True",op,output);
	}

}
