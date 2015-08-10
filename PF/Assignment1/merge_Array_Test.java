import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class merge_Array_Test {

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
	public void test_merge_array() {
		merge_Array object=new merge_Array();
		int[] input_array1={1,2,3,4,5};
		int[] input_array2={0,6,7,8,9};
		int[] expected_merged_array={0,1,2,3,4,5,6,7,8,9};
		int[] actual_merged_array=object.merging_array(input_array1,5,input_array2,5);
		assertArrayEquals("True",expected_merged_array,actual_merged_array);
	}

}
