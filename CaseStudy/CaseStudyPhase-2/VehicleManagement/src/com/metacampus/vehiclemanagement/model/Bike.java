package com.metacampus.vehiclemanagement.model;


/**
 * @author Neha
 *
 */
public class Bike extends Vehicle {

	private boolean selfStart;
	private int helmetPrice;

	/**
	 * @return true/false for self start availability
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
	
	/* (non-Javadoc)
	 * @see com.vehiclemanagement.model.Vehicle#calculateOnRoadPrice()
	 */
	public double calculateOnRoadPrice(){
		//override the method to calculate on road price
		return getPrice() + getRoadTax()*2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bike [selfStart=" + selfStart + ", helmetPrice=" + helmetPrice
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
