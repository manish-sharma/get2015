package assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class arrayTest {

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
	public void test1() {
		array ob=new array();
		int input[]={1,2,3,4,5};
		assertEquals("pass",1,ob.checkOrder(input));
	}
	@Test
	public void test2() {
		array ob=new array();
		int input[]={9,6,3,2,1};
		assertEquals("pass",2,ob.checkOrder(input));
	}
	@Test
	public void test3() {
		array ob=new array();
		int input[]={1,2,8,4,7};
		assertEquals("pass",0,ob.checkOrder(input));
	}

}
