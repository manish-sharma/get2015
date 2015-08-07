package Pyramid;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPyramid {

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
	public void testPyramid() {
		Pyramid obj=new Pyramid();
		String wholePyramid[]=obj.createPattern(5);
		String expected[]={"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		assertArrayEquals(expected,wholePyramid);
	}

	@Test
	public void testgetSpace() {
		Pyramid obj=new Pyramid();
		String actual=obj.getSpace(5, 5);
		String expected=" ";
		assertEquals(expected,actual);
	}

	@Test
	public void testgetNo() {
		Pyramid obj=new Pyramid();
		String actual=obj.getNo(6,5);
		String expected="12321";
		assertEquals(expected,actual);
	}



}
