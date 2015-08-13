import static org.junit.Assert.*;

import org.junit.Test;

public class LeanearSearchTest {

	@Test
	public void test() {
		int a[] = { 2, 5, 8, -9, 10, -55, 77 };
		assertEquals(7, LeanearSearch.leanearSearch(a, 0, a.length, 77));

		int a2[] = { 2, 5, 8, 9, 10, 55, 77 };
		assertEquals(-1, LeanearSearch.leanearSearch(a2, 0, a.length, 88));

		int a3[] = { 2, 2, 2, 2, 2, 2 };
		assertEquals(1, LeanearSearch.leanearSearch(a3, 0, a3.length, 2));

		int a4[] = { 2, 5, 8, 9, 10, 55, 77 };
		assertEquals(1, LeanearSearch.leanearSearch(a4, 0, a4.length, 2));

	}

}
