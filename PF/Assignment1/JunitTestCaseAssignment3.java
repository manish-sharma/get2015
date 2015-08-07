import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTestCaseAssignment3 {

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
		int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int output[]={1,2,4,5,6,7,8,9};
		Assignment3 assignment3=new Assignment3();
		int expetedOutput[]=assignment3.longestSequence(input);
		assertArrayEquals("match",output,expetedOutput);
	}
	@Test
	public void test2() {
		int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9,1,2,3,4};
		int output[]={1,2,4,5,6,7,8,9};
		Assignment3 assignment3=new Assignment3();
		int expetedOutput[]=assignment3.longestSequence(input);
		assertArrayEquals("match",output,expetedOutput);
	}

}
