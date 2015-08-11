/****************************************************************************************
Name            : LargestDigit
Revision Log    : 2015-08-11: Babalu patidar : created.
                : 
                : 
Use             : This class is used to test find largest digit in a number.
                :
****************************************************************************************/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LargestDigitTest {

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
		LargestDigit object= new LargestDigit();
		assertEquals(2,object.largestdigit(2));
	}
	

	@Test
	public void test1() {
		LargestDigit object= new LargestDigit();
		assertEquals(9,object.largestdigit(1257369));
	}
	

	@Test
	public void test2() {
		LargestDigit object= new LargestDigit();
		assertEquals(4,object.largestdigit(444));
	}
	


}
