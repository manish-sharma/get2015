/**
 * Class to implement test case for bubble sort
 * @author Sanjay
 */


import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;


public class BubbleSortTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		BubbleSort object = new BubbleSort();
		int[] array = {-1,2,3,0,1,2,6,4,9,6,7,3,5};
		int[] actualArray =  object.bubbleSort(array);
		int[] expectedArray = {-1,0,1,2,2,3,3,4,5,6,6,7,9,};
		 assertArrayEquals(expectedArray,actualArray);

	}

}
