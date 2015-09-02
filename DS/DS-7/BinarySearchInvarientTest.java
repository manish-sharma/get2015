/**
 * Test class for Loop Invarient program
 */
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
public class BinarySearchInvarientTest {
	
	/**
	 * Method to test the occurence of element 
	 */
	@Test
	public void test() {
		ArrayList<Integer> arlst=new ArrayList<Integer>();
		BinarySearchInvarient object = new BinarySearchInvarient();
		arlst.add(1);
		arlst.add(1);
		arlst.add(1);
		arlst.add(4);
		arlst.add(6);
		arlst.add(8);
		arlst.add(10);
		arlst.add(17);
		arlst.add(21);
		arlst.add(23);
		arlst.add(24);
		int index = Collections.binarySearch(arlst, 1);
		int leftActual = object.findLeftMost(index, arlst);
		int rightActual = object.findRightMost(index, arlst);
		assertEquals(0,leftActual);
		assertEquals(2,rightActual);
	}
	
	/**
	 * Method to test occurrence of element
	 */
	@Test
	public void test2(){
		ArrayList<Integer> arlst=new ArrayList<Integer>();
		BinarySearchInvarient object = new BinarySearchInvarient();
		arlst.add(1);
		arlst.add(1);
		arlst.add(1);
		arlst.add(4);
		arlst.add(6);
		arlst.add(8);
		arlst.add(10);
		arlst.add(17);
		arlst.add(21);
		arlst.add(23);
		arlst.add(24);
		int index = Collections.binarySearch(arlst, 24);
		int leftActual = object.findLeftMost(index, arlst);
		int rightActual = object.findRightMost(index, arlst);
		assertEquals(10,leftActual);
		assertEquals(10,rightActual);

	
	}

}
