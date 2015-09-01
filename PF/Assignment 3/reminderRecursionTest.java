import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class reminderRecursionTest {

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

	public void test() {
		remainderRecursion object=new remainderRecursion();
		int divisor=2;
		int divident=1;
		int remainder=object.rem(divisor, divident);
		assertEquals("Pass",0,remainder);
	}
	//Positive Test Case
	@Test
	public void test1() {
		remainderRecursion object=new remainderRecursion();
		int divisor=100;
		int divident=3;
		int remainder=object.rem(divisor, divident);
		assertEquals("Pass",1,remainder);
	}
	//Error Test Case
	@Test
	public void test2() {
		remainderRecursion object=new remainderRecursion();
		int divisor=2;
		int divident=0;
		int remainder=object.rem(divisor, divident);
		assertEquals("Pass",1,remainder);
	}
	//Negative Test Case
	@Test
	public void test4() {
		remainderRecursion object=new remainderRecursion();
		int divisor=10;
		int divident=5;
		int remainder=object.rem(divisor, divident);
		assertNotEquals("Pass",1,remainder);
	}
	//Negative Test Case
	@Test
	public void test5() {
		remainderRecursion object=new remainderRecursion();
		int divisor=27;
		int divident=5;
		int remainder=object.rem(divisor, divident);
		assertNotEquals("Pass",1,remainder);
	}
}
