/**
 * Write a Template class for different formats of Cricket.(Template Method)
 */
package Assignment3;

/**
 * @author Manish
 * T20Cricket class extending Cricket class
 * @since 23/10/2015
 */
public class T20 extends Cricket {

	/** 
	 * @see Assignment3.Cricket#initialization()
	 * initialization of T20 Cricket.
	 */
	@Override
	protected void initialization() {
		System.out.println("toss in T20 Cricket ");
	}

	/**
	 * @see Assignment3.Cricket#startCricket()
	 * T20 Cricket Match Start
	 */
	@Override
	protected void startCricket() {
		System.out.println("T20 Cricket Match Start");

	}

	/** 
	 * @see Assignment3.Cricket#teaBreak()
	 * Tea break in T20 Cricket
	 */
	@Override
	protected void teaBreak() {
		System.out.println("Tea break in T20 Cricket");

	}

	/** 
	 * @see Assignment3.Cricket#endCricket()
	 * T20 Cricket Match ends
	 */
	@Override
	protected void endCricket() {
		System.out.println("T20 Cricket Match ends");

	}

}
