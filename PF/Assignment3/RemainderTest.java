import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RemainderTest {

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

	//negative test case
	
	@Test
	public void test1() { 
		Remainder R = new Remainder();
		int output = R.rem(2, 0); 			
		assertEquals(0, output);
		
	}
	//positive test case
	@Test
	public void test2() {
		Remainder R = new Remainder();
		int output = R.rem(100, 3);
		assertEquals(1, output);
		
	}
}
