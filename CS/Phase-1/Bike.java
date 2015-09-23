/**
 * @author Girdhari
 * Bike class have all the Bike related properties and methods which are specific to a bike
 * This class extends Vehicle class
 */
package com.vehicaldekho.vehical.model;

/* Starting of Bike class */
public class Bike extends Vehicle {
	private boolean isSelfStart;
	private int helmetPrice;
	/* Starting of getter & setter function */
	public boolean getIsSelfStart() {
		return isSelfStart;
	}
	public void setIsSelfStart(boolean isSelfStart) {
		this.isSelfStart = isSelfStart;
	}
	public int getHelmetPrice() {
		return helmetPrice;
	}
	public void setHelmetPrice(int helmetPrice) {
		this.helmetPrice = helmetPrice;
	}
	/* Ending of getter & setter function */
	/* Start of toString function */
	@Override
	public String toString() {
		return super.toString() + "Bike [isSelfStart=" + isSelfStart + ", helmetPrice="
				+ helmetPrice + "]";
	}
	/* End of toString function */
}
/* Ending of Bike class */
