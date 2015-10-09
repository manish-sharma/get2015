package triangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class triangleTest {

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
		Triangle objectForNumber = new Triangle();
		String resultNumber = objectForNumber.number(5, 1);
		assertEquals("12345",resultNumber);
	}
	@Test
	public void test1(){
		Triangle objectForSpace = new Triangle();
		String resultSpace = objectForSpace.space(5, 1);
		assertEquals("",resultSpace);
	}
	
	@Test
	public void test2(){
		Triangle objectForWhole = new Triangle();
		String resultPattern = objectForWhole.returnString(5);
		assertEquals("12345\n 1234\n  123\n   12\n    1\n",resultPattern);	
	}
	
}
