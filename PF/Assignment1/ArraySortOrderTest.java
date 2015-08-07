import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArraySortOrderTest {


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
	public void test1() {
		//fail("Not yet implemented");
		ArraySortOrder as=new ArraySortOrder();
		int ip[]={1,5,7};
		assertEquals("Series is : ",1,as.getVal(ip));
	}
	
	public void test2() {
		//fail("Not yet implemented");
		ArraySortOrder as=new ArraySortOrder();
		int ip[]={11,9,7};
		assertEquals("Series is : ",2,as.getVal(ip));
	}
	
	public void test() {
		//fail("Not yet implemented");
		ArraySortOrder as=new ArraySortOrder();
		int ip[]={5,2,9};
		assertEquals("Series is : ",0,as.getVal(ip));
	}

}
