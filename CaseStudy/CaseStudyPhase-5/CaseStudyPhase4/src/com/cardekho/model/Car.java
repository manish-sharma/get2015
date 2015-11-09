package com.cardekho.model;

public class Car extends Vehicle {
	
	private String ac;
	
	private String accessoryKit;
	
	private String powerSteering;
	
	/**
	 * @return the ac
	 */
	public String getAc() {
		return ac;
	}
	/**
	 * @param ac the ac to set
	 */
	public void setAc(String ac) {
		this.ac = ac;
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
	/**
	 * @return the powerSteering
	 */
	public String getPowerSteering() {
		return powerSteering;
	}
	/**
	 * @param powerSteering the powerSteering to set
	 */
	public void setPowerSteering(String powerSteering) {
		this.powerSteering = powerSteering;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [ac=" + ac + ", accessoryKit=" + accessoryKit
				+ ", powerSteering=" + powerSteering + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
