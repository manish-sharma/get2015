/**
 * Write a Template class for different formats of Cricket.(Template Method)
 */
package Assignment3;

/**
 * @author Anjita
 * OneDayCricket class extending Cricket class.
 */
public class OneDayCricket extends Cricket {

	/** (non-Javadoc)
	 * @see Assignment3.Cricket#initialization()
	 * initialization of One Day Cricket.
	 */
	@Override
	protected void initialization() {
		System.out.println("toss in One Day Cricket");
	}

	/** (non-Javadoc)
	 * @see Assignment3.Cricket#startCricket()
	 * One Day Cricket Match Start
	 */
	@Override
	protected void startCricket() {
		System.out.println("One Day Cricket Match Start");

	}

	/** (non-Javadoc)
	 * @see Assignment3.Cricket#teaBreak()
	 * Tea break in One Day Cricket
	 */
	@Override
	protected void teaBreak() {
		System.out.println("Tea break in One Day Cricket");

	}

	/** (non-Javadoc)
	 * @see Assignment3.Cricket#endCricket()
	 * One Day Cricket Match ends 
	 */
	@Override
	protected void endCricket() {
		System.out.println("One Day Cricket Match ends");

	}

}
