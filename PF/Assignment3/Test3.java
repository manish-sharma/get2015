import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test3 {
	Program3 object = new Program3();
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
		
		assertEquals("Largest digit found",2,object.largestDigit(2));
	}
	@Test   //Successful test case 2
	public void test1() {
		
		assertEquals("Largest digit found",9,object.largestDigit(1257369));
	}
	@Test   //Successful test case 3
	public void test2() {
		
		assertEquals("Largest digit found",4,object.largestDigit(444));
	}

}
