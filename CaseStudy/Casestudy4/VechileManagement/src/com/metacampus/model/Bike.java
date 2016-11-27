package com.metacampus.model;

public class Bike extends Vehicle {

	private boolean selfStart;
	private int helmetPrice;
	/**
	 * @return the selfStart
	 */
	public boolean isSelfStart() {
		return selfStart;
	}
	/**
	 * @param selfStart the selfStart to set
	 */
	public void setSelfStart(boolean selfStart) {
		this.selfStart = selfStart;
	}
	/**
	 * @return the helmetPrice
	 */
	public int getHelmetPrice() {
		return helmetPrice;
	}
	/**
	 * @param helmetPrice the helmetPrice to set
	 */
	public void setHelmetPrice(int helmetPrice) {
		this.helmetPrice = helmetPrice;
	}
	
	@Override
	public float calculateOnRoadPrice() {
		return super.calculateOnRoadPrice() + getHelmetPrice();
	}
	
	@Override
	public String toString() {
		return super.toString() +" SelfStart : "+ isSelfStart()+ " HelmetPrice : "+ getHelmetPrice()+"\n";
	}
}
