/**
 * Write a Template class for different formats of Cricket.(Template Method)
 */
package Assignment3;

/**
 * @author Ravika
 * OneDayCricket class extending Cricket class.
 * @since 23/10/2015
 */
public class OneDay extends Cricket {

	/** 
	 * @see Assignment3.Cricket#initialization()
	 * initialization of One Day Cricket.
	 */
	@Override
	protected void initialization() {
		System.out.println("toss in One Day Cricket");
	}

	/** 
	 * @see Assignment3.Cricket#startCricket()
	 * One Day Cricket Match Start
	 */
	@Override
	protected void startCricket() {
		System.out.println("One Day Cricket Match Start");

	}

	/** 
	 * @see Assignment3.Cricket#teaBreak()
	 * Tea break in One Day Cricket
	 */
	@Override
	protected void teaBreak() {
		System.out.println("Tea break in One Day Cricket");

	}

	/** 
	 * @see Assignment3.Cricket#endCricket()
	 * One Day Cricket Match ends 
	 */
	@Override
	protected void endCricket() {
		System.out.println("One Day Cricket Match ends");

	}

}
