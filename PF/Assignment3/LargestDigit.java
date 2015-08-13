public class LargestDigit {

	public static int largestdigit(int x) {
		int xCopy = x;
		if (xCopy >= 0) {
			if (xCopy == 0) {

				return 0;

			}
			int max = xCopy % 10;

			return max > largestdigit(xCopy / 10) ? max
					: largestdigit(xCopy / 10);

		} else
			return -1;

	}

}
