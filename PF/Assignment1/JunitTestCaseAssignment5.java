import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTestCaseAssignment5 {

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
		System.out.println("Test1");
		int input[]={0,1,2,3,0,4,5};
		Assignment5 assign5=new Assignment5();
		int ReturnOutput=assign5.sorted(input);
		assertEquals("match",0,ReturnOutput);
	}

}
