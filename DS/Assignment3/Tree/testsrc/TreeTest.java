import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TreeTest {

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
	public void testPreorderPositive() {
		BinaryTree binaryTreeObj = new BinaryTree();
		binaryTreeObj.insert(12);
		binaryTreeObj.insert(13);
		binaryTreeObj.insert(45);
		binaryTreeObj.insert(43);
		binaryTreeObj.insert(34);
		binaryTreeObj.insert(76);
		boolean result = binaryTreeObj.preOrder(binaryTreeObj.getRoot());
		assertEquals(true, result);
	}
	
	@Test
	public void testPreorderNegative() {
		BinaryTree binaryTreeObj = new BinaryTree();
		binaryTreeObj.insert(12);
		binaryTreeObj.insert(13);
		binaryTreeObj.insert(45);
		binaryTreeObj.insert(43);
		binaryTreeObj.insert(34);
		binaryTreeObj.insert(76);
		boolean result = binaryTreeObj.preOrder(binaryTreeObj.getRoot());
		assertNotEquals(false, result);
	}

	@Test
	public void testPreorderNullPositive() {
		BinaryTree binaryTreeObj = new BinaryTree();
		assertEquals(false, binaryTreeObj.preOrder(binaryTreeObj.getRoot()));
	}
	
	@Test
	public void testPreorderNullNegative() {
		BinaryTree binaryTreeObj = new BinaryTree();
		assertNotEquals(true, binaryTreeObj.preOrder(binaryTreeObj.getRoot()));
	}
	
	@Test
	public void testPostOrderPositive() {
		BinaryTree binaryTreeObj = new BinaryTree();
		binaryTreeObj.insert(12);
		binaryTreeObj.insert(13);
		binaryTreeObj.insert(45);
		binaryTreeObj.insert(43);
		binaryTreeObj.insert(34);
		binaryTreeObj.insert(76);
		boolean result = binaryTreeObj.preOrder(binaryTreeObj.getRoot());
		assertEquals(true, result);
	}
	
	@Test
	public void testPostOrderNegative() {
		BinaryTree binaryTreeObj = new BinaryTree();
		binaryTreeObj.insert(12);
		binaryTreeObj.insert(13);
		binaryTreeObj.insert(45);
		binaryTreeObj.insert(43);
		binaryTreeObj.insert(34);
		binaryTreeObj.insert(76);
		boolean result = binaryTreeObj.preOrder(binaryTreeObj.getRoot());
		assertNotEquals(false, result);
	}

	@Test
	public void testPostOrderNullPositive() {
		BinaryTree binaryTreeObj = new BinaryTree();
		assertEquals(false, binaryTreeObj.preOrder(binaryTreeObj.getRoot()));
	}
	
	@Test
	public void testPostOrderNullNegative() {
		BinaryTree binaryTreeObj = new BinaryTree();
		assertNotEquals(true, binaryTreeObj.preOrder(binaryTreeObj.getRoot()));
	}
	
	@Test
	public void testInsertPositive() {
		BinaryTree binaryTreeObj = new BinaryTree();
		boolean result = binaryTreeObj.insert(12);
		assertEquals(true, result);
	}
	
	@Test
	public void testInsertInMirrorImageNegative() {
		BinaryTree binaryTreeObj = new BinaryTree();
		boolean result = binaryTreeObj.insert(12);
		assertNotEquals(false, result);
	}
	
	@Test
	public void testInsertInMirrorImagePositive() {
		BinaryTree binaryTreeObj = new BinaryTree();
		boolean result = binaryTreeObj.insert(12);
		assertEquals(true, result);
	}
	
	@Test
	public void testInsertNegative() {
		BinaryTree binaryTreeObj = new BinaryTree();
		boolean result = binaryTreeObj.insert(12);
		assertNotEquals(false, result);
	}
}
