public class GCD {

	public static int gcd(int x, int y) {

		if (x > 0 && y > 0) {
			if (x % y == 0) {
				return y;
			}

			return gcd(y, x % y);
		} else {
			return -1;
		}
	}
}
