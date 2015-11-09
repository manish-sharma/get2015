package CaseStudy1;

/**
 * @author Neha Bansal
 *
 */
public class Bike extends Vehicle {

	private boolean selfStart;
	private int helmetPrice;

	/**
	 * @return true/false for self start availablity
	 */
	public boolean isSelfStart() {
		return selfStart;
	}

	/**
	 * @param selfStart
	 */
	public void setSelfStart(boolean selfStart) {
		this.selfStart = selfStart;
	}

	/**
	 * @return helmet price
	 */
	public int getHelmetPrice() {
		return helmetPrice;
	}

	/**
	 * @param helmetPrice
	 */
	public void setHelmetPrice(int helmetPrice) {
		this.helmetPrice = helmetPrice;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vehiclemanagement.model.Vehicle#calculateOnRoadPrice()
	 */
	public double calculateOnRoadPrice() {
		// override the method to calculate on road price
		return getPrice() + getRoadTax() * 2;
	}

}
