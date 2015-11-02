package com.metacampus.vehiclemanagement.model;

public class Bike extends Vehicle {

	//bike has self start or not
	private boolean selfStart;
	
	//helmet price of bike
	private float helmetPrice;

	//getter of self start
	public boolean isSelfStart() {
		return selfStart;
	}

	//setter of self start
	public void setSelfStart(boolean selfStart) {
		this.selfStart = selfStart;
	}

	//getter of helmet price
	public float getHelmetPrice() {
		return helmetPrice;
	}

	//setter of helmet price
	public void setHelmetPrice(float helmetPrice) {
		this.helmetPrice = helmetPrice;
	}
	
	//calculation of on road price of bike
	public float calculateOnRoadPrice() {
		return super.calculateOnRoadPrice();
	}
	
	//returning the specification of bike in form of string.
	public String toString() {
		String vehicleSpecification = super.toString()+"selfStart:"+isSelfStart()+", helmetPrice:"+getHelmetPrice();
		return vehicleSpecification;
	}
}
