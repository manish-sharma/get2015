import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTestCaseAssignment2 {

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
		int input[]={2,2,3,3,4,4,0,5,6,7};
		int output[]={2,3,4,0,5,6,7,};
		System.out.println("Test1");
		Assign2 assign2=new Assign2();
		int ReturnOutput[] = assign2.removeDuplicates(input);
		assertArrayEquals("match",output,ReturnOutput);
			
	}

}
