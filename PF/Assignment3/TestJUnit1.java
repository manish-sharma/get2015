import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJUnit1 {

	assignment_session3_01 ob = new assignment_session3_01();

	@Test
	public void testForPositiveValues() {

		int remainder1 = ob.computeRemainder(2, 1);
		int remainder3 = ob.computeRemainder(100, 3);
		assertEquals(0, remainder1);
		assertEquals(1, remainder3);

		int gcd1 = ob.computeGCD(2, 1);
		int gcd2 = ob.computeGCD(12, 18);
		int gcd3 = ob.computeGCD(100, 3);
		assertEquals(1, gcd1);
		assertEquals(6, gcd2);
		assertEquals(1, gcd3);

		int digit1 = ob.largestDigit(2);
		int digit2 = ob.largestDigit(1257369);
		int digit3 = ob.largestDigit(444);
		assertEquals(2, digit1);
		assertEquals(9, digit2);
		assertEquals(4, digit3);
	}

	@Test
	public void testForZeroValue() {
		int remainder = ob.computeRemainder(2, 0);
		assertEquals(-1, remainder);

		int gcd = ob.computeGCD(2, 0);
		assertEquals(-1, gcd);

		int digit = ob.largestDigit(0);
		assertEquals(0, digit);

	}

	@Test
	public void testForNegativeValue() {
		int remainder = ob.computeRemainder(2, -1);
		assertEquals(-1, remainder);

		int gcd = ob.computeGCD(-7, 0);
		assertEquals(-1, gcd);

		int digit = ob.largestDigit(-400);
		assertEquals(-1, digit);

	}

}
