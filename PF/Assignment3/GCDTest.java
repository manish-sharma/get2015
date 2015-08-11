import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GCDTest {

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
		GCD g =new GCD();
		int output=g.gcd(2, 1);
		assertEquals(1, output);		
	}
	
	@Test
	public void test1() {
		GCD g =new GCD();
		int output=g.gcd(12, 18);
		assertEquals(6, output);		
	}
	
	@Test
	public void test2() {
		GCD g =new GCD();
		int output=g.gcd(100, 3);
		assertEquals(1, output);	
	}
	
	//negative test case
	
	@Test 
	public void test3() {
		GCD g =new GCD();
		int output=g.gcd(100, 0);
		assertEquals(0, output);
		
	
	}

}
