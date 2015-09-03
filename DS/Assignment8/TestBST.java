/**
 * @author Girdhari
 * Test class for BinarySearchTree
 */
package question1;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBST {

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

	// Test case will test whether BST returns a sortedArray or not
	@Test
	public void testBinarySearchTree() {
		BinarySearchTree bstObject = new BinarySearchTree();
		Node nodeObject = null;
		Node current = null;
		int value;
		String choice = "n";
		BufferedReader bufferReaderObject = new BufferedReader( new InputStreamReader(System.in));
		do { 
			try {
				nodeObject = new Node();
				System.out.print("Enter a element: ");
				value = Integer.parseInt(bufferReaderObject.readLine());
				nodeObject.setDataNode(value);
				current = bstObject.insertElement(current, nodeObject);
				System.out.println("Do you want to add more element:(Y/N) ");
				choice = bufferReaderObject.readLine();
			} catch(NumberFormatException exception ) {
				System.out.println("Please Enter a valid number!!");
			} catch(IOException exception) {
				System.out.println("Some Input / Output error Occured!!");
			}
		} while(choice.equalsIgnoreCase("y"));
		List<Integer> list = new ArrayList<Integer>();
		list = bstObject.inorderTraversal(current);
		List<Integer> expectedList = new ArrayList<Integer>();
		expectedList.add(1);
		expectedList.add(3);
		expectedList.add(4);
		expectedList.add(5);
		expectedList.add(7);
		expectedList.add(9);
		assertEquals(expectedList, list);
		
	}

}
