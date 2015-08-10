import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class arraySortOrderTest {

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
	public void test_array_Ascending_Order()
	{
		arraySortOrder object=new arraySortOrder();
		int input_array[]={1,2,3,4,5};
		int actual_sort_order;
	    int expected_sort_order=1;
		actual_sort_order=object.find_order_array(input_array);
		assertEquals("pass",expected_sort_order,actual_sort_order);
	}
	@Test
	public void test_array_Descending_order()
	{
		arraySortOrder object=new arraySortOrder();
		int input_array[]={5,4,3,2,1};
		int actual_sort_order;
	    int expected_sort_order=2;
		actual_sort_order=object.find_order_array(input_array);
		assertEquals("pass",expected_sort_order,actual_sort_order);
	}
	@Test
	public void test_Array_no_order()
	{
		arraySortOrder object=new arraySortOrder();
		int input_array[]={6,1,4,8,5};
		int actual_sort_order;
	    int expected_sort_order=0;
		actual_sort_order=object.find_order_array(input_array);
		assertEquals("pass",expected_sort_order,actual_sort_order);
	}
	
}
