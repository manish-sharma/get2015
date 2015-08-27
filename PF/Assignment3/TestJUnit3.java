import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestJUnit3 {

	assignment_session3_03 ob = new assignment_session3_03();
	int arr1[] = new int[] { 2, 86, 8, 97, 10, 59, 77 };
	int arr2[] = new int[] {};
	int expected1[] = new int[] { 2, 8, 10, 59, 77, 86, 97 };
	int expected2[] = new int[] {};
	{

		if (arr1.length > 0)
			arr1 = ob.quicksort(arr1, 0, arr1.length - 1);
		if (arr2.length > 0)
			arr2 = ob.quicksort(arr2, 0, arr2.length - 1);
	}

	@Test
	public void testPrintMessage() {
		assertArrayEquals(expected1, arr1);
		assertArrayEquals(expected2, arr2);

	}
}