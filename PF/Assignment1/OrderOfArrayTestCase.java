import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class OrderOfArrayTestCase {

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
	public void unSortedTest() {
		OrderOfArray assign=new OrderOfArray();
		int a[]={4,5,3,2,8};
		assertEquals("result is correct",0,assign.checkOrder(a));
	}
	@Test
	public void AccendingTest()
	{
		OrderOfArray assign=new OrderOfArray();
		int a[]={1,2,3,4,5,7};
		assertEquals("result is correct",1,assign.checkOrder(a));
	}
	@Test
	public void DecendingTest3()
	{
		OrderOfArray assign=new OrderOfArray();
		int a[]={6,4,3,1};
		assertEquals("result is correct",2,assign.checkOrder(a));
	}
}
