import static org.junit.Assert.*;

import org.junit.Test;
/**
 * to test the binary search
 * @author Ankur
 *
 */

public class BinarySearchTest {
	BinarySearch binarySearchObj=new BinarySearch();
	@Test
	public void testLeftmost1() {

		int result = binarySearchObj.binarySearch(3,new int[]{1, 2, 2, 3, 3} , 0, 4);
		assertEquals("", 3, result);
	}

	@Test
	public void testLeftmost2() {

		int result = binarySearchObj.binarySearch(0,new int[]{-2, -1, 0, 0, 0, 3, 3}, 0, 6);
		assertEquals("", 2, result);
	}

	@Test
	public void testLeftMost3() {
	
		int result = binarySearchObj.binarySearch(5,new int[]{1,2,2,4,7},0, 4);
		assertEquals("", -1, result);
	}

	@Test
	public void testLeftmost4() {
		
		int result = binarySearchObj.binarySearch(3,new int[]{1, 2, 2, 3, 3},0, 4);
		assertEquals("", 3, result);
	}


}
