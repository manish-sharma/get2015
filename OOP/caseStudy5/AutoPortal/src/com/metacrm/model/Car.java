/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metacrm.model;

/**
 *
 * @author Kajal
 */
public class Car extends Vehicle {

	private boolean AC;
	private boolean powerSteering;
	private boolean accessoryKit;

	public boolean isAC() {
		return AC;
	}

	public void setAC(boolean aC) {
		AC = aC;
	}

	public boolean isPowerSteering() {
		return powerSteering;
	}

	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	public boolean isAccessoryKit() {
		return accessoryKit;
	}

	public void setAccessoryKit(boolean accessoryKit) {
		this.accessoryKit = accessoryKit;
	}

	// override toString() method for printing
	public String toString() {
		return super.toString() + "\tAC : " + isAC() + "\tAccessory Kit : "
				+ isAccessoryKit() + "\tPower Steering : "
				+ isPowerSteering();
	}
}
