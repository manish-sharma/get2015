/****************************************************************************************
Name            : Remainder
Revision Log    : 2015-08-11: Babalu patidar : created.
                : 
                : 
Use             : This class is used to test find remainder of two number.
                :
****************************************************************************************/
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
	public void test() {
		Remainder object=new Remainder();
		assertEquals(-1,object.findremainder(2, 0));
	}
	
	@Test
	public void test1() {
		Remainder object=new Remainder();
		assertEquals(0,object.findremainder(2, 1));	
	}
	
	@Test
	public void test2() {
		Remainder object=new Remainder();
		assertEquals(0,object.findremainder(100, 2));
		
	}



}
