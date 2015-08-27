// 1 st assignment of PF session 3
public class assignment_session3_01 {
	// below code is to find remainder when first number is divided by second
	// number
	public int computeRemainder(int dividend, int divisor) {
		int remainder = 0;
		if (dividend < 0 || divisor <= 0)
			return -1;
		if (dividend >= divisor)
			remainder = computeRemainder(dividend - divisor, divisor);
		else
			return dividend;
		return remainder;

	}

	public int computeGCD(int firstNumber, int secondNumber) {
		// below code is to find Greatest Common Divisor of x and y
		int gcd = 0, largerOne = 0, smallerOne = 0;
		if (firstNumber <= 0 || secondNumber <= 0)
			return -1;
		if (firstNumber > secondNumber) {
			largerOne = firstNumber;
			smallerOne = secondNumber;
		} else {
			largerOne = secondNumber;
			smallerOne = firstNumber;

		}
		if (largerOne % smallerOne == 0)
			return smallerOne;
		else
			gcd = computeGCD(largerOne % smallerOne, smallerOne);
		return gcd;

	}

	public int largestDigit(int num) {
		// below code is to find Largest digit of the given number x
		int digit;
		if (num < 0)
			return -1;
		if (num == 0)
			return 0;
		digit = largestDigit(num / 10);
		if (num % 10 > digit)
			return num % 10;
		return digit;

	}

	public static void main(String args[]) {
		assignment_session3_01 ob = new assignment_session3_01();
		int x = 100;
		int y = 3;
		int remainder = ob.computeRemainder(x, y);

		int gcd = ob.computeGCD(100, 3);

		int digit = ob.largestDigit(2);
		System.out.println("Remainder is " + remainder);
		System.out.println("GCD is " + gcd);
		System.out.println("Digit is " + digit);

	}

}
