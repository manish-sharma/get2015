import static org.junit.Assert.*;

import org.junit.Test;

public class GCDTest {

	@Test
	public void testGcd() {

		assertEquals(2, GCD.gcd(2, 4));
		assertEquals(6, GCD.gcd(12, 18));
		assertEquals(1, GCD.gcd(100, 3));
		assertEquals(2, GCD.gcd(2, 2));
		assertEquals(-1, GCD.gcd(0, 4));
		assertEquals(-1, GCD.gcd(4, 0));

	}

}
