
package Assignment3;

/**
 * @author Ravika
 * TestCricket class extending Cricket class
 * @since 23/10/2015
 */
public class Test extends Cricket {

	/** 
	 * @see Assignment3.Cricket#initialization()
	 * initialization of Test Cricket
	 */
	@Override
	protected void initialization() {
		System.out.println("toss in Test Cricket ");
	}

	/** 
	 * @see Assignment3.Cricket#startCricket()
	 * Test Cricket Match Start
	 */
	@Override
	protected void startCricket() {
		System.out.println("Test Cricket Match Start");

	}

	/** 
	 * @see Assignment3.Cricket#teaBreak()
	 * Tea break in Test Cricket
	 */
	@Override
	protected void teaBreak() {
		System.out.println("Tea break in Test Cricket");

	}

	/** 
	 * @see Assignment3.Cricket#endCricket()
	 * Test Cricket Match ends
	 */
	@Override
	protected void endCricket() {
		System.out.println("Test Cricket Match ends");

	}

}
