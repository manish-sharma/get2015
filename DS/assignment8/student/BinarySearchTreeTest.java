package student;

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
//positive test case
	@Test
	public void testBinarySearchTree() {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		int array[] = {7,9,6,0,5,3,2};
		for(int index = 0; index < array.length ; index++ ) {
			binarySearchTree.insert(array[index]);
		}
		binarySearchTree.inOrder(binarySearchTree.getRoot());
		Object[] actual = binarySearchTree.getList().toArray();
		Object[] expected = {0,2,3,5,6,7,9};
		assertArrayEquals(expected, actual);
	}

	//negative test case
	@Test
	public void testNegativeBinarySearchTree() {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		int array[] = {7,9,6,0,5,3,2};
		for(int index = 0; index < array.length ; index++ ) {
			binarySearchTree.insert(array[index]);
		}
		binarySearchTree.inOrder(binarySearchTree.getRoot());
		Object[] actual = binarySearchTree.getList().toArray();
		Object[] expected = {3,2,0,5,6,7,9};
		assertArrayEquals(expected, actual);
	}
}
