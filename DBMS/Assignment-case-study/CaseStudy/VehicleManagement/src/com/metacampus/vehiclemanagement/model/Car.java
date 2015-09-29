package com.metacampus.vehiclemanagement.model;

public class Car extends Vehicle {

	//car has ac or not
	private boolean AC;
	
	//car has power steering or not
	private boolean powerSteering;
	
	//car has accessoryKit or not
	private boolean accessoryKit;

	//getter of ac
	public boolean isAC() {
		return AC;
	}

	//setter of ac
	public void setAC(boolean aC) {
		AC = aC;
	}

	//getter of power steering
	public boolean isPowerSteering() {
		return powerSteering;
	}

	//setter of power steering
	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	//getter of Accessory kit
	public boolean isAccessoryKit() {
		return accessoryKit;
	}

	//setter of Accessory kit
	public void setAccessoryKit(boolean accessoryKit) {
		this.accessoryKit = accessoryKit;
	}
	
	//calculation of on road price
	public float calculateOnRoadPrice() {
		return super.calculateOnRoadPrice();
	}
	
	//returning the specification of car in form of string
	public String toString() {
		String vehicleSpecification = super.toString()+"AC:"+isAC()+", powerSteering:"+isPowerSteering()+
				", accessoryKit:"+isAccessoryKit();
		return vehicleSpecification;
	}
}