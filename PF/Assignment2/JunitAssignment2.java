import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitAssignment2 {

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
		Assignment2 obj=new Assignment2();
		
		String[] sp=obj.wholeTriangle(5);
		assertArrayEquals(new String[]{"12345"," 1234","  123","   12","    1"}, sp);
		
		
		
	}

}
