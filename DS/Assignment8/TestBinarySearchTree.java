import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestBinarySearchTree {

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
		
		BinarySearchTree<Integer> binarySearch =new BinarySearchTree<Integer>();
		Node<Integer> root=null;
		root=binarySearch.insertData(root, 45);
		root=binarySearch.insertData(root, 22);
		root=binarySearch.insertData(root, 19);
		root=binarySearch.insertData(root, 35);
		root=binarySearch.insertData(root, 90);
		root=binarySearch.insertData(root, 91);
		binarySearch.inOrderTraversal(root);
		String actual=binarySearch.getInOrderString();
		String expected="192235459091";
		assertEquals(expected, actual);
	}
	
	@Test
	public void test1() {
		
		BinarySearchTree<Integer> binarySearch =new BinarySearchTree<Integer>();
		Node<Integer> root=null;
		root=binarySearch.insertData(root, -1);
		binarySearch.inOrderTraversal(root);
		String actual=binarySearch.getInOrderString();
		String expected="-1";
		assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		
		BinarySearchTree<Integer> binarySearch =new BinarySearchTree<Integer>();
		Node<Integer> root=null;
		binarySearch.inOrderTraversal(root);
		String actual=binarySearch.getInOrderString();
		String expected="";
		assertEquals(expected, actual);
	}
}
