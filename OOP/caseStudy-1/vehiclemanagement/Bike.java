package com.metacampus.vehiclemanagement;

public class Bike extends Vehicle {

	private boolean selfStart;

	private int helmetPrice;

	public boolean isSelfStart() {
		return selfStart;
	}

	public void setSelfStart(boolean selfStart) {
		this.selfStart = selfStart;
	}

	public int getHelmetPrice() {
		return helmetPrice;
	}

	public void setHelmetPrice(int helmetPrice) {
		this.helmetPrice = helmetPrice;
	}
	//function calculates on road price of an bike and returns it.
	public double calculateOnRoadPrice(double price, double roadTax) {
		return (roadTax + price);

	}

}
