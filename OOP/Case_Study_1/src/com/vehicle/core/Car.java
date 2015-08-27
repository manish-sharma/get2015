package com.vehicle.core;
/*This class initializes Car class with the specific variables for bike as well as extending the vehicle for general 
 * purpose attributes of vehicle and implements its getter and setter method
 * @author Shishir Pareek
 * Date 23rd August 2015
 */
public class Car extends Vehicle{

	private Boolean isAcAvailable;//variable to check if car has AC or not
	private Boolean powerSteering;//variable to check if car has power steering or not 
	private Boolean accessoryKit;//variable to check if car has acessoryKit avilabel or not

	/*function to check if AC is avilabel or not*/
	public Boolean getIsAcAvailable() {
		return isAcAvailable;
	}
    /*setter method for AC*/
	public void setIsAcAvailable(Boolean isAcAvailable) {
		this.isAcAvailable = isAcAvailable;
	}
    
	/*getter method for power steering*/
	public Boolean getPowerSteering() {
		return powerSteering;
	}
    /*setter method for power steering*/
	public void setPowerSteering(Boolean powerSteerin) {
		this.powerSteering = powerSteerin;
	}
   /*getter method for accessory kit*/
	public Boolean getAccessoryKit() {
		return accessoryKit;
	}
    /*setter method for accessoryKit*/
	public void setAccessoryKits(Boolean accessoryKit) {
		this.accessoryKit = accessoryKit;
	}

	/*method to calculate on road price for car*/
	@Override
	public double calculateOnRoadPrice() {
		return super.calculateOnRoadPrice() + 1000;
	}
    
	/*Overridden to string method to display car attributes in string*/
	@Override
	public String toString() {
		return super.toString() + "Car [isAcAvailable=" + isAcAvailable
				+ ", powerSteering=" + powerSteering + ", accessoryKit="
				+ accessoryKit + "]";
	}
}
