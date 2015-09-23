package linearsearch;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinearsearchTest {

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
	public void searchTest1() {
		Linearsearch lsObject = new Linearsearch();
		int inputArray[] = {2,5,8,9,10, 77, 55};
		int result = lsObject.search(inputArray, 0, 88);
		assertEquals(-1,result);
	}
	
	@Test
	public void searchTest2() {
		Linearsearch lsObject = new Linearsearch();
		int inputArray[] =  {2,5,8,9,10, 77, 55, 11};
		int result = lsObject.search(inputArray, 0, 77);
		assertEquals(5,result);
	}

}
