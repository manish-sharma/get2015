/**
 * Class to implement test ase for counting sort
 * @author Sanjay
 */

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;


public class CountingSortTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		 int[] array = {1,2,3,0,1,2,6,4,9,6,7,3,5};
		 CountingSort object = new CountingSort();
		 int[] actualArray = object.countingSort(array, object.findMax(array));
		 int[] expectedArray = {0,1,1,2,2,3,3,4,5,6,6,7,9,};
		 assertArrayEquals(expectedArray,actualArray);
	}

}
