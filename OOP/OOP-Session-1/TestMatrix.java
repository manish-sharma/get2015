import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/*
 *  Junit Test class for TestMatix
 */

public class TestMatrix {

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
	/** test case for testing addElement() and getElement() methods */
	public void test1() {
		
		Matrix matrix1 = new Matrix(2,3);
		
		matrix1.addElement(0, 0, 10);
		
		assertEquals(10,matrix1.getElement(0, 0));
		
	}
	
	@Test
	/**  test case for transpose() method for getting transpose of a matrix*/
	public void test2() {
		
		Matrix matrix1 = new Matrix(2,2);
		
		/** inserting of element in array one by one*/
		matrix1.addElement(0,0,6);
		matrix1.addElement(0,1,9);
		matrix1.addElement(1,0,4);
		matrix1.addElement(1,1,2);
		
		assertArrayEquals(new int[][]{{6,4},{9,2}},matrix1.transpose());
	}
	
	@Test
	
	/**  test case for showMatrix() method for getting transpose of a matrix*/
	public void test3() {
		
		Matrix matrix1 = new Matrix(3,2);
		
		/** inserting of element in array one by one*/
		matrix1.addElement(0,0,6);
		matrix1.addElement(0,1,9);
		matrix1.addElement(1,0,3);
		matrix1.addElement(1,1,4);
		matrix1.addElement(2,0,2);
		matrix1.addElement(2,1,7);
		
		assertArrayEquals(new int[][]{{6,9},{3,4},{2,7}},matrix1.showMatrix());
		
		
	}

}
