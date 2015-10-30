package com.metacube.carDekho.model;

/**
 * to store the information of Car and to calculate on road price
 * @author Ravika
 * @since  9/15/2015
 */
public class Car extends Vehicle {
	
	private boolean AC;
	 private boolean powerSteering;
	 private String accessoryKit;
	public boolean isAC() {
		return AC;
	}
	public void setAC(Boolean AC) {
		this.AC = AC;
	}
	public boolean isPowerSteering() {
		return powerSteering;
	}
	public void setPowerSteering(Boolean powerSteering) {
		this.powerSteering = powerSteering;
	}
	public String getAccessoryKit() {
		return accessoryKit;
	}
	public void setAccessoryKit(String accessoryKit) {
		this.accessoryKit = accessoryKit;
	}
	
	long calculateOnRoadPrice( long price){
		
		if(isAC())
		price =price + 40000;
		price=price +30000;
			return (price);	
		}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	 @Override
	public String toString() {
		return "Car " + super.toString() + ", AC : " + AC + ", powerSteering : " + powerSteering
				+ ", accessoryKit : " + accessoryKit ;
	}
}
