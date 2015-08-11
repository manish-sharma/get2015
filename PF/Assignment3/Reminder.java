public class Reminder {

	public static int rem(int x, int y) {
		if (x >= 0 && y > 0) {

			if (x >= y) {
				return rem(x - y, y);
			} else
				return x;
		} else {
			System.out.print("Divide by zero not possible");

			return -1;

		}

	}

}