import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Assignment2Test {

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
			
			Assignment2 assignment2=new Assignment2();
			int input[]={1,2,3,8,9,3,5,1,0};
			int expected[]={1,2,3,8,9,5,0};
			assertArrayEquals(expected,assignment2.removeDuplicates(input));
		}

}
