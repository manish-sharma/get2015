import static org.junit.Assert.*;

import org.junit.Test;

public class LargestDigitTest {

	@Test
	public void testLargestdigit() {
		assertEquals(5, LargestDigit.largestdigit(1015));
		assertEquals(-1, LargestDigit.largestdigit(-1257369));
		assertEquals(0, LargestDigit.largestdigit(000));
		assertEquals(2, LargestDigit.largestdigit(2));
		assertEquals(9, LargestDigit.largestdigit(1257369));

	}

}
