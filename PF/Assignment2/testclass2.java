package Assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testclass2 {

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
		Assignment2 aa1=new Assignment2();
		String s1="  ";
		assertEquals("",s1,aa1.patternSpace(2,5));
	}
	@Test
	public void test2() {
		Assignment2 aa1=new Assignment2();
		String s1="123";
		assertEquals("",s1,aa1.patternNumber(2,5));
	}
	@Test
	public void test3() {
		Assignment2 aa1=new Assignment2();
		String f[]={"12345"," 1234","  123","   12","    1"};
		assertArrayEquals(f,aa1.printWholePattern(5));
	}

}
