/**
 * Class to implement test case for binary search tree inOrder traversal
 * @author Sanjay
 */

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Test;


public class BinaryTreeTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		BinarySearchTree bst1 = new BinarySearchTree();
		bst1.insert(23);
		bst1.insert(2);
		bst1.insert(45);
		bst1.insert(1);
		bst1.insert(74);
		bst1.insert(56);
		bst1.insert(0);
		bst1.insert(14);
		BinarySearchTree object = new BinarySearchTree();
		object.inOrder(bst1.getRoot());
		Object[] actualList = object.getListInAscendingOrder().toArray();
		Object[] expectedList = {0,1,2,14,23,45,56,74};
		assertArrayEquals(expectedList,actualList);
		
	}

}
