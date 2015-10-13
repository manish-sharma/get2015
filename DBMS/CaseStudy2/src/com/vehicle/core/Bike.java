package com.vehicle.core;

/**
 * This class is bike model class which extends vehicle class and sets the
 * attributes specific to typwe bike and method to calculate the bike on road
 * price
 * 
 * @author Shishir Pareek Date 22 September 2015
 **/
public class Bike extends Vehicle {
	private boolean selfStart;// variable to check if bike has self-start or not
	private double helmetPrice;// variable for helmet price which is given along
								// with bike

	/* method to check if self start is present or not */
	public boolean isSelfStart() {
		return selfStart;
	}

	/* setter method for self start */
	public void setSelfStart(boolean selfStart) {
		this.selfStart = selfStart;
	}

	/* getter method for helmet price */
	public double getHelmetPrice() {
		return helmetPrice;
	}

	/* setter method for helmet price */
	public void setHelmetPrice(double d) {
		this.helmetPrice = d;
	}

	@Override
	/* function to calculate the on road price of the bike */
	public double calculateOnRoadPrice() {
		return super.calculateOnRoadPrice() + 500;
	}

	@Override
	/* Overridden to string function to display bike details */
	public String toString() {
		return super.toString() + "Bike [selfStart=" + selfStart
				+ ", helmetPrice=" + helmetPrice + "]";
	}
}
