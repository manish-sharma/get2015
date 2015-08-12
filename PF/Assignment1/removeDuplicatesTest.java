import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class removeDuplicatesTest {

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
	public void test_duplicates() {
		removeduplicates object=new removeduplicates();
		int expected_output_array[]={2,5,4,6,3,8,9,0};
		int input_array[]={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		int[] actual_output_array=object.removeDuplicateElement(input_array);
		assertArrayEquals("pass",expected_output_array,actual_output_array);
	
	}

}
