package recursion;

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

	@Test
	public void remainderTest1() {
		Remainder remainderObj = new Remainder();
		int result = remainderObj.rem(2, 1);
		assertEquals(0,result);
	}
	@Test
	public void remainderTest2() {
		Remainder remainderObj = new Remainder();
		int result = remainderObj.rem(2, 0);
		assertEquals(-1,result);
			
	}
	
	@Test
	public void remainderTest3() {
		Remainder remainderObj = new Remainder();
		int result = remainderObj.rem(100, 3);
		assertEquals(1,result);
			
	}

}
