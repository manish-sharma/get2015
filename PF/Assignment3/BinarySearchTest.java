import static org.junit.Assert.*;

import org.junit.Test;


public class BinarySearchTest {

	@Test
	public void testBinarySearch() {
		int a[]={2,5,8,9,10, 55, 77};
		assertEquals(-1, BinarySearch.binarySearch(a, 0, a.length,88));
		
		int a1[]={2,5,8,9,10, 55, 77};
		assertEquals(7, BinarySearch.binarySearch(a1, 0, a1.length,77));
		
		int a2[]={2,2,2,2,2};
		assertEquals(3, BinarySearch.binarySearch(a2, 0, a2.length,2));
		
		int a3[]={2,5,8,9,10, 55, 77};
		assertEquals(5, BinarySearch.binarySearch(a3, 0, a3.length,10));
	
		int a4[]={2,2,2,2,2,2};
		assertEquals(-1, BinarySearch.binarySearch(a4, 0, a4.length,10));
	}

}
