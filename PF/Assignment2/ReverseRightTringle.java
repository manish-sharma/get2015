public class ReverseRightTringle {
	public static String spaces(int row, int n) {
		String outputSpaces = "";

		for (int count = 0; count < row - 1; count++) {

			outputSpaces = outputSpaces + " ";
		}

		return outputSpaces;
	}

	public static String numbers(int rows, int n) {
		String outputNumber = "";

		for (int count = 1; count <= (n - rows + 1); count++) {

			outputNumber = outputNumber + count;

		}
		return outputNumber;
	}

	public static String[] reversrRightTringle(int n) {

		String outputTringle[] = new String[n];

		for (int count = 0; count < n; count++) {
			
			outputTringle[count] = ReverseRightTringle.spaces(count + 1, n)
					+ ReverseRightTringle.numbers(count + 1, n);
		}

		return outputTringle;
	}

}
