package com.vehiclemanagement.model;

/**
 * @author Akshat
 *
 */
public class Car extends Vehicle{
	private boolean AC;
	private boolean powerStearing;
	private boolean accessoryKit;

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
	 * @return true/false for accsessory kit
	 */
	public boolean isAccessoryKit() {
		return accessoryKit;
	}

	/**
	 * @param accessoryKit
	 */
	public void setAccessoryKit(boolean accessoryKit) {
		this.accessoryKit = accessoryKit;
	}
	
	/* (non-Javadoc)
	 * @see com.vehiclemanagement.model.Vehicle#calculateOnRoadPrice()
	 */
	public double calculateOnRoadPrice(){
		//override the method to calculate the on road price
		return getPrice() + getRoadTax()*3;
	}

}
