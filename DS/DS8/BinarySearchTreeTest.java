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
	public void treeSortTest1() {
		BinarySearchTree binarySearchTreeObject=new BinarySearchTree();
		Node nodeObject=new Node();
		BinarySearchTree binaryTreeObject=new BinarySearchTree();
		int [] list={3,4,2,1,4,2,0,9,4};
		for(int i=0;i<list.length;i++)
		nodeObject.rootNode=binaryTreeObject.insertNode(nodeObject.rootNode,list[i]);
		String result=binarySearchTreeObject.inorder(nodeObject.rootNode);
		assertEquals("0 1 2 2 3 4 4 4 9 ", result);
	}
	@Test
	public void treeSortTest2() {
		BinarySearchTree binarySearchTreeObject=new BinarySearchTree();
		Node nodeObject=new Node();
		BinarySearchTree binaryTreeObject=new BinarySearchTree();
		int [] list={};
		for(int i=0;i<list.length;i++)
		nodeObject.rootNode=binaryTreeObject.insertNode(nodeObject.rootNode,list[i]);
		String result=binarySearchTreeObject.inorder(nodeObject.rootNode);
		assertEquals("", result);
	}
	@Test
	public void treeSortTest3() {
		BinarySearchTree binarySearchTreeObject=new BinarySearchTree();
		Node nodeObject=new Node();
		BinarySearchTree binaryTreeObject=new BinarySearchTree();
		int [] list={9,8,7,6,5,4,3,2,1,0};
		for(int i=0;i<list.length;i++)
		nodeObject.rootNode=binaryTreeObject.insertNode(nodeObject.rootNode,list[i]);
		String result=binarySearchTreeObject.inorder(nodeObject.rootNode);
		assertEquals("0 1 2 3 4 5 6 7 8 9 ", result);
	}

}
