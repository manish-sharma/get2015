/**
 * Write a Template class for different formats of Cricket.(Template Method)
 */
package Assignment3;

/**
 * @author Anjita
 * TestCricket class extending Cricket class
 */
public class TestCricket extends Cricket {

	/** (non-Javadoc)
	 * @see Assignment3.Cricket#initialization()
	 * initialization of Test Cricket
	 */
	@Override
	protected void initialization() {
		System.out.println("toss in Test Cricket ");
	}

	/** (non-Javadoc)
	 * @see Assignment3.Cricket#startCricket()
	 * Test Cricket Match Start
	 */
	@Override
	protected void startCricket() {
		System.out.println("Test Cricket Match Start");

	}

	/** (non-Javadoc)
	 * @see Assignment3.Cricket#teaBreak()
	 * Tea break in Test Cricket
	 */
	@Override
	protected void teaBreak() {
		System.out.println("Tea break in Test Cricket");

	}

	/** (non-Javadoc)
	 * @see Assignment3.Cricket#endCricket()
	 * Test Cricket Match ends
	 */
	@Override
	protected void endCricket() {
		System.out.println("Test Cricket Match ends");

	}

}
