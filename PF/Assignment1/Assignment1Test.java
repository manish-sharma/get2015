import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Assignment1Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 String num ;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assignment1 tester=new Assignment1();
		 assertEquals("not match", 65, tester.BinaryToOctal("110101"));
	}

}
