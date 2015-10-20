/**
 * 
 */
package singleton;

import java.util.Scanner;

/**
 * @author Suman
 *
 */
public class MainLog {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("value of dividend and divisor : ");
		int dividend = scanner.nextInt();
		int divisor = scanner.nextInt();
		Operation op = new Operation();
		op.division(dividend, divisor);
	}
}
