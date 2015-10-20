/**
 * 
 */
package singleton;

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
			SinglentonLog.getInstance(ex.getMessage());
		}
	}
}
