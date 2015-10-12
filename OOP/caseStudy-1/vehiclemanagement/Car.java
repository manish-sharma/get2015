package com.metacampus.vehiclemanagement;


public class Car extends Vehicle {

	private boolean AC;

	private boolean powerStering;

	private boolean accessoryKit;

	public boolean isAC() {
		return AC;
	}

	public void setAC(boolean aC) {
		AC = aC;
	}

	public boolean isPowerStering() {
		return powerStering;
	}

	public void setPowerStering(boolean powerStering) {
		this.powerStering = powerStering;
	}

	public boolean isAccessoryKit() {
		return accessoryKit;
	}

	public void setAccessoryKit(boolean accessoryKit) {
		this.accessoryKit = accessoryKit;
	}

	//function calculates on road price of an car and returns it.
	public double calculateOnRoadPrice(double price, double roadTax) {
		return (roadTax + price);

	}

}

