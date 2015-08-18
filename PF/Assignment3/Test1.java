import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test1 {

	Program1 object = new Program1();
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

	@Test   //Successful test case 1
	public void test() {          
		
		assertEquals("Divide complete",1,object.rem(2, 1));
	}
	@Test   //Successful test case 2
	public void test1() {
		
		assertEquals("Divide complete",1,object.rem(100, 3));
	}
	@Test   //Successful test case 3
	public void test2() {
		
		assertEquals("Cannot be divided",-1,object.rem(2, 0));
	}

}
