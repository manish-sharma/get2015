import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitTest3 {

	@Test
	public void testQuickSort() {
		Assignment3 assignment3= new Assignment3();
		int[] array={2,5,8,9,10, 77, 55, 11};
		int[] arrayExpected={2,5,8,9,10,11,55,77};
		int[] arrayActual=assignment3.quickSort(array, 0, array.length-1);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	@Test
	public void testQuickSort2() {
		Assignment3 assignment3= new Assignment3();
		int[] array={};
		int[] arrayExpected={};
		int[] arrayActual=assignment3.quickSort(array, 0, array.length-1);
		assertArrayEquals(arrayExpected, arrayActual);
	}

}
