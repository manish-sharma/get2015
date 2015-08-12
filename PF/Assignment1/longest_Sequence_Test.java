import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class longest_Sequence_Test {

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
	public void test_long_sequence() {
	longest_Sequence object=new longest_Sequence();
	int input_array[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
	int expected_longest_seq[]={1,2,4,5,6,7,8,9};
	int actual_longest_seq[]=object.longIncrSeq(input_array);
	assertArrayEquals("Pass",expected_longest_seq,actual_longest_seq);

	}
}
