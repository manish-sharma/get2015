package com.Vehicle;

/**
 * this class Car is used to set the attribute of car type vehicle
 * @author Sumitra
 * this class extends vehicle class to hold the common attribute of vehicle class
 * this hold the special attribute of car type vehicle
 */
public class Car  extends Vehicle{
	
private boolean Ac;
private boolean powerSteering;
private String accessoryKit;

/**
 * AC attribute if it hold AC facility by a car then true other wise false
 * @return true or false
 */
public boolean isAc() {
	return Ac;
}

/**
 * this set the value of variable AC
 * @param AC it hold boolean value  either true of false
 */
public void setAc(boolean AC) {
	this.Ac = AC;
}

/**
 * isPowerSteering attribute if it hold PowerSteering facility by a car then true other wise false
 * @return true or false
 */
public boolean isPowerSteering() {
	return powerSteering;
}

/**
 * this set the value of variable PowerSteering
 * @param PowerSteering it hold boolean value  either true of false
 */
public void setPowerSteering(boolean powerSteering) {
	this.powerSteering = powerSteering;
}

/**
 * accessoryKit attribute  it hold all the accessory in the kit provided to  car 
 * @return string of all item in accessory kit
 * 
 */
public String getAccessoryKit() {
	return accessoryKit;
}

/**
 * this set the value of variable accessoryKit
 * @param accessoryKit it hold  value  in string format of all item in accessory kit
 */
public void setAccessoryKit(String accessoryKit) {
	this.accessoryKit = accessoryKit;
}
/**
 * this method calculate total price of car 
 * it add the price of A.C. if it hold with the car price
 * as well as it also add the price of accessory kit
 */
long calculateOnRoadPrice( long price){
	
	if(isAc())
	price =price + 40000;
	//accessory kit
	price=price +30000;
		return (price);	
	}
@Override
/**
 * @ return String  of bike attribute with common attribute as a string 
 * 
 */
public String toString() {
	return "Car:-\n" + super.toString() + " Ac:" + Ac + "\n powerSteering:" + powerSteering
			+ "\n accessoryKit:" + accessoryKit + "\n On Road Price:"+calculateOnRoadPrice(super.price)+"\n";
}
}
