package Assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testclass1 {

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
		Assignment1 patt=new Assignment1();
		String exp=" ";
		assertEquals("",exp,patt.spaces(6,5));
	}
	
	@Test
	public void test2() {
		Assignment1 patt=new Assignment1();
		String exp="1234321";
		assertEquals("",exp,patt.numbers(6,5));
	}
	
	@Test
	public void test3() {
		Assignment1 patt=new Assignment1();
		String fin[]={"  1"," 121","12321"," 121","  1"};
		assertArrayEquals("",fin,patt.pyramid(3));
	}
}
