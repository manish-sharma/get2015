import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestForRemainderWithRecursion {

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
	public void TestForWhenDividedByZero() {
		RemainderWithRecursion remainder=new RemainderWithRecursion();
		assertEquals("Correct Result",0,remainder.rem(2, 0));
		
	}
	@Test
	public void TestForWhenDividedByOne() {
		RemainderWithRecursion remainder=new RemainderWithRecursion();
		assertEquals("Correct Result",0,remainder.rem(2, 1));
		
	}
	@Test
	public void TestForWhenDividedByRandom() {
		RemainderWithRecursion remainder=new RemainderWithRecursion();
		assertEquals("Correct Result",1,remainder.rem(100, 3));
		
	}
	@Test
	public void TestForWhenDividedByNegative() {
		RemainderWithRecursion remainder=new RemainderWithRecursion();
		assertEquals("Correct Result",0,remainder.rem(2, -1));
		
	}
	@Test
	public void TestForWhenDividedBySame() {
		RemainderWithRecursion remainder=new RemainderWithRecursion();
		assertEquals("Correct Result",0,remainder.rem(2, 2));
		
	}

}
