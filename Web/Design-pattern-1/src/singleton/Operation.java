/**
 * 
 */
package singleton;

import java.io.FileWriter;

/**
 * @author Suman
 *
 */
public class Operation {

	public void division(int dividend, int divisor) {
		try {
			int quotient = dividend / divisor;
			System.out.print("dividend/divisor = " + quotient);
		} catch (Exception ex) {
			Logger logger = Logger.getInstance();
			logger.insertIntoLogger(ex.getMessage());
			System.out.println(ex.getMessage());
			
		}
	}
}
