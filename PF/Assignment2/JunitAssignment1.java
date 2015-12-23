import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitAssignment1 {

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
        Assignment1 obj=new Assignment1();
		
		String[] sp=obj.wholePyramid(5);
		assertArrayEquals(new String[]{"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"}, sp);
		
	}

}
