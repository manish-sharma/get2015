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
	public void test1() {                          //test1 method for testing rem method
		Assignment1 obj =new Assignment1();
		
		assertEquals(0,obj.rem(2, 1));
		assertEquals(-1,obj.rem(2, 0));
		assertEquals(1,obj.rem(100, 3));
	}
	
	@Test
	public void test2() {                         //test2 method for testing gcd method
		Assignment1 obj =new Assignment1();
		
		assertEquals(1,obj.gcd(2, 1));
		assertEquals(6,obj.gcd(12, 18));
		assertEquals(1,obj.gcd(100, 3));
	}
	
	
	
	@Test
	public void test3() {                             //test2 method for testing lagestdigit method
		Assignment1 obj =new Assignment1();
		
		assertEquals(2,obj.largestdigit(2));
		assertEquals(9,obj.largestdigit(1257369));
		assertEquals(4,obj.largestdigit(444));
	}


}
