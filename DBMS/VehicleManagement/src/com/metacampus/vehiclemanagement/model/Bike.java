package com.metacampus.vehiclemanagement.model;

public class Bike extends Vehicle {
	
	/* Data Members */
	private String selfStart;
	private int helmetPrice;
	
	/** Method to get if bike has self start or not
	 * 
	 * @return : true or false
	 */
	public String getSelfStart() {
		return selfStart;
	}

	/** Method to set availability of self start in a bike
	 * 
	 * @param selfStart : true or false
	 */
	public void setSelfStart(String selfStart) {
		this.selfStart = selfStart;
	}

	/** Method to get helmet price of a bike
	 * 
	 * @return helmet price
	 */
	public int getHelmetPrice() {
		return helmetPrice;
	}

	/** Method to set helmet price of a bike
	 * 
	 * @param helmetPrice
	 */
	public void setHelmetPrice(int helmetPrice) {
		this.helmetPrice = helmetPrice;
	}

	/** Method to get string representation of details of a bike 
	 * Internally this method calls toString() of Vehicle class to print basic details 
	 * related to vehicle
	 */
	public String toString() {
		return super.toString() + ", Helmet Price: " +
		getHelmetPrice() + ", Self Start: " + getSelfStart();
	}

	/** Method to calculate on road price of a bike */
	@Override
	public int calculateOnRoadPrice() {
		return super.calculateOnRoadPrice();
	}	
}