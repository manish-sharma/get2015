package firstProgram;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTreeTest {

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
	public void ascendingOrderTest() {
		BinarySearchTree object=new BinarySearchTree();
		int arr[]={4,1,2,6,5};
		object.insert(arr);
		String actual=object.printInAscending();
		String expected=" 1  2  4  5  6 ";
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void ascendingOrderTes1t() {
		BinarySearchTree object=new BinarySearchTree();
		int arr[]={4,1,2,6,5,7,8,12,32,11};
		object.insert(arr);
		String actual=object.printInAscending();
		String expected=" 1  2  4  5  6  7  8  11  11  32 ";
		assertNotEquals(expected, actual);
		
	}


}
