package com.vehicle.core;

/**
 * This class is car model class which extends vehicle class and sets the
 * attributes specific to type car and method to calculate the bike on road
 * price
 * 
 * @author Shishir Pareek Date 22 September 2015
 **/
public class Car extends Vehicle {

	private boolean ac;
	private boolean powerSteering;
	private String accessoryKit;

	/**
	 * @return the aC
	 */
	public boolean isAC() {
		return ac;
	}

	/**
	 * @param aC
	 *            the aC to set
	 */
	public void setAC(boolean aC) {
		ac = aC;
	}

	/**
	 * @return the powerSteering
	 */
	public boolean isPowerSteering() {
		return powerSteering;
	}

	/**
	 * @param powerSteering
	 *            the powerSteering to set
	 */
	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	/**
	 * @return the accessoryKit
	 */
	public String getAccessoryKit() {
		return accessoryKit;
	}

	/**
	 * @param accessoryKit
	 *            the accessoryKit to set
	 */
	public void setAccessoryKit(String accessoryKit) {
		this.accessoryKit = accessoryKit;
	}

	@Override
	public double calculateOnRoadPrice() {
		return super.calculateOnRoadPrice();
	}

	@Override
	public String toString() {
		return super.toString() + " AC : " + isAC() + " powerSteering : "
				+ isPowerSteering() + " AccessoryKit : " + getAccessoryKit();
	}
}
