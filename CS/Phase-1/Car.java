/**
 * @author Girdhari
 * Car class have all the car related properties and methods which are specific to a car
 * This class extends Vehicle class
 */
package com.vehicaldekho.vehical.model;

/* Start of Car class */
public class Car extends Vehicle {

	private boolean hasAC;
	
	private boolean hasPowerSteering;
	
	private boolean hasAccesoriesKit;
	
	/* Start of getters & setters */
	public boolean isHaveAC() {
		return hasAC;
	}
	public void setHasAC(boolean haveAC) {
		this.hasAC = haveAC;
	}
	public boolean isHasPowerSteering() {
		return hasPowerSteering;
	}
	public void setHasPowerSteering(boolean havePowerSteering) {
		this.hasPowerSteering = havePowerSteering;
	}
	public boolean getHasAccesoriesKit() {
		return hasAccesoriesKit;
	}
	public void setHasAccesoriesKit(boolean haveAccesoriesKit) {
		this.hasAccesoriesKit = haveAccesoriesKit;
	}
	/* End of getters & setters */
	
	/* Start of toString function */
	@Override
	public String toString() {
		return super.toString() + "Car [hasAC=" + hasAC + ", hasPowerSteering=" + hasPowerSteering
				+ ", hasAccesoriesKit=" + hasAccesoriesKit + "]";
	}
	/* End of toString function */
	
}
/* End of Car class */
