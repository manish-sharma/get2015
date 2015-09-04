/**
 * Class to implement radix sort
 * @author Sanjay
 */

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;


public class RadixSortTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		int[] array = {1,2,3,0,1,2,6,4,9,6,7,3,5};
		int[] expectedArray = {0,1,1,2,2,3,3,4,5,6,6,7,9,};
		RadixSort radixSortObject = new RadixSort();
		int[] actualArray = radixSortObject.radixSort(array);
		 assertArrayEquals(expectedArray,actualArray);
	}

}
