
import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitAssinment1  extends TestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 System.out.println("Executing a JUNIT test file");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		 System.out.println("Execution of JUNIT test file done");
	}

	@Before
	public void setUp() throws Exception {
		 System.out.println("Executing a new test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Execution done");
	}

	@Test
	public void test() {
		Assignment1 bin = new Assignment1();
		 assertEquals("test case: ",65,bin.convertBiToOct());
	}

}
