package com.metacampus.vehiclemanagement.model;


/**
 * @author Nidhi
 *
 */
public class Car extends Vehicle {

	private boolean AC;
	private boolean powerStearing;
	private String accessoryKit;

	/**
	 * @return true/false for AC availabilty
	 */
	public boolean isAC() {
		return AC;
	}

	/**
	 * @param AC
	 */
	public void setAC(boolean aC) {
		AC = aC;
	}

	/**
	 * @return true/false for power stearing
	 */
	public boolean isPowerStearing() {
		return powerStearing;
	}

	/**
	 * @param powerStearing
	 */
	public void setPowerStearing(boolean powerStearing) {
		this.powerStearing = powerStearing;
	}

	
	
	/**
	 * @return the accessoryKit
	 */
	public String getAccessoryKit() {
		return accessoryKit;
	}

	/**
	 * @param accessoryKit the accessoryKit to set
	 */
	public void setAccessoryKit(String accessoryKit) {
		this.accessoryKit = accessoryKit;
	}

	/* (non-Javadoc)
	 * @see com.vehiclemanagement.model.Vehicle#calculateOnRoadPrice()
	 */
	public double calculateOnRoadPrice(){
		//override the method to calculate the on road price
		return getPrice() + getRoadTax()*3;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [AC=" + AC + ", powerStearing=" + powerStearing
				+ ", accessoryKit=" + accessoryKit + ", toString()="
				+ super.toString() + "]";
	}
	

}
