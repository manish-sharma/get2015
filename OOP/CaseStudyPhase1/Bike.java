/**	Bike class extends vehicle class
 * 
 * 	@author Gaurav Saini
 * 	Date : 13/09/2015
 */

public class Bike extends Vehicle {
	
	private Boolean selfStart;
	private double helmetPrice;

	/**
	 * @return the selfStart
	 */
	public Boolean getSelfStart() {
		return selfStart;
	}

	/**
	 * @param selfStart
	 * 				to set whether bike has self start or not
	 */
	public void setSelfStart(Boolean selfStart) {
		this.selfStart = selfStart;
	}

	/**
	 * @return the helmetPrice
	 */
	public double getHelmetPrice() {
		return helmetPrice;
	}

	public Bike(String make, String model) {			// calling constructor of base class
		super(make, model);
	}

	/**
	 * @param helmetPrice
	 *            set the price of helmet
	 */
	public void setHelmetPrice(double helmetPrice) {
		this.helmetPrice = helmetPrice;
	}

	public double calculateOnRoadPrice() { 				// method to return on road price
		return getPrice() * getRoadTax() * 100;

	}

}