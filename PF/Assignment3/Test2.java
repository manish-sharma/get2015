import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test2 {
	Program2 object = new Program2();
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
		
		assertEquals("GCD calculated",1,object.gcd(2, 1));
	}
	@Test   //Successful test case 2
	public void test1() {
		
		assertEquals("GCD calculated",6,object.gcd(12, 18));
	}
	@Test   //Successful test case 3
	public void test2() {
		
		assertEquals("GCD calculated",1,object.gcd(100, 3));
	}
	
	@Test   //Successful test for negative numbers
    public void test3() {
		
		assertEquals("Numbers entered are negative",-1,object.gcd(-4, 3));
	}

}
