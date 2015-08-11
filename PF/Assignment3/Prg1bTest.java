package assignment3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Prg1bTest {

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
		 Prg1b obj=new Prg1b();
			assertEquals("GCD calculated",1,obj.gcd(2, 1));  // test for(2,1)
			assertEquals("GCD calculated",6,obj.gcd(12, 18));  // test for(12,18)
			assertEquals("GCD calculated",1,obj.gcd(100, 3));  // test for(100,3)
	}

}
