import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJUnit2 {

	assignment_session3_02 ob = new assignment_session3_02();
	int arr1[] = new int[] { 2, 5, 8, 9, 10, 77, 55 };

	@Test
	public void testWhenValuePresentInArray() {

		int index1 = ob.linearSearch(arr1, 0, 88);
		assertEquals(-1, index1);

		int index2 = ob.binarySearch(arr1, 0, arr1.length - 1, 77);
		assertEquals(5, index2);
	}

	public void testWhenValueAbsentInArray() {

		int index1 = ob.linearSearch(arr1, 0, 77);
		assertEquals(5, index1);

		int index2 = ob.binarySearch(arr1, 0, arr1.length - 1, 88);
		assertEquals(-1, index2);

	}

	public void testForBlankArray() {
		int arr1[] = new int[] {};
		int index1 = ob.linearSearch(arr1, 0, 88);
		assertEquals(-1, index1);

		int index2 = ob.binarySearch(arr1, 0, arr1.length - 1, 77);
		assertEquals(-1, index2);

	}
}