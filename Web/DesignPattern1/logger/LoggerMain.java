package logger;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 * his class is Main class for MyLogger class
 * @author Khemanshu
 */

public class LoggerMain {

	/** Main Function */
	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			/* This code will generate ArithmeticException */
			int c = 10 / 0;
		} catch (ArithmeticException e) {
			MyLogger myLogger = MyLogger.getInstance();

			Writer sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			myLogger.doLogging(sw.toString());
		}

		int[] array = new int[3];
		try {
			/* This code will generate ArrayIndexOutOfBoundsException */
			array[7] = 8;
		} catch (ArrayIndexOutOfBoundsException e) {
			MyLogger myLogger = MyLogger.getInstance();
			Writer sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			myLogger.doLogging(sw.toString());
		}
	}
}
