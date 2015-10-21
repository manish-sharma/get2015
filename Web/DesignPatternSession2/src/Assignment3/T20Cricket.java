/**
 * Write a Template class for different formats of Cricket.(Template Method)
 */
package Assignment3;

/**
 * @author Anjita
 * T20Cricket class extending Cricket class
 */
public class T20Cricket extends Cricket {

	/** (non-Javadoc)
	 * @see Assignment3.Cricket#initialization()
	 * initialization of T20 Cricket.
	 */
	@Override
	protected void initialization() {
		System.out.println("toss in T20 Cricket ");
	}

	/** (non-Javadoc)
	 * @see Assignment3.Cricket#startCricket()
	 * T20 Cricket Match Start
	 */
	@Override
	protected void startCricket() {
		System.out.println("T20 Cricket Match Start");

	}

	/** (non-Javadoc)
	 * @see Assignment3.Cricket#teaBreak()
	 * Tea break in T20 Cricket
	 */
	@Override
	protected void teaBreak() {
		System.out.println("Tea break in T20 Cricket");

	}

	/** (non-Javadoc)
	 * @see Assignment3.Cricket#endCricket()
	 * T20 Cricket Match ends
	 */
	@Override
	protected void endCricket() {
		System.out.println("T20 Cricket Match ends");

	}

}
