/**
 * @author Sumitra this is bike class extends property of vehicle
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
	 *            the selfStart to set
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

	public Bike(String make, String model) { // calling constructor of base
												// class
		super(make, model);

	}

	/**
	 * @param helmetPrice
	 *            the helmetPrice to set
	 */
	public void setHelmetPrice(double helmetPrice) {
		this.helmetPrice = helmetPrice;
	}

	public double calculateOnRoadPrice() { // function to return "on road price"
		return getPrice() * getRoadTax() * 100;

	}

}
