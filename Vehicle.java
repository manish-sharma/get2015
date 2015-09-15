package com.Vehicle;
/**
 * this is the parent class that hold the common attributes of a vehicle either it is a bike or a car
 * @author Sumitra
 * this super class hold all simple attribute of vehicle which further used by chid class
 */
public class Vehicle{
	private  String make;
	private  String model;
	private long engineInCC;
	private  int fuelCapacity;
	private  int milage;
	protected  long price;
	private  int roadTax;


/**
* this method calculate on road price of vehicle either car or bike
*  which further override by respective class
* @param price this is the price of vehicle without any other expenses
* @return return the price of vehicle
*/

long calculateOnRoadPrice(long price){
	return price;
			
	}
/**
 * this getter method on make attribute which specify the company or brand of vehicle
 * @return return string of brand name of vehicle
 */ 
	public String getMake() {
		return make;
	}
/**
 * setter method of make brand name 
 * @param make make is the brand name pass by user to select that vehicle
 */
	public void setMake(String make) {
		this.make = make;
	}


/**
* this getter method on model attribute which specify the model  of vehicle
* @return return string of model name of vehicle
*/ 
	public String getModel() {
		return model;
	}

/**
* this setter method of make brand name 
* @param model model is the model name pass by user to select that vehicle
* 
*/
	
	public void setModel(String model) {
		this.model = model;
	}

/**
* this getter method on engine In CC attribute which specify the model  of vehicle
* @return return long value of Engine IN CC of vehicle 
*/ 	
	public long getEngineInCC() {
		return engineInCC;
	}

/**
* this setter method of Engine In CC Attribute 
* @param engine IN CC is the attribute of vehicle  pass by user to select that vehicle
* 
*/
	public void setEnginenInCC(long engineInCC) {
		this.engineInCC = engineInCC;
	}
/**
* this getter method on Fuel Capacity  attribute which specify the fuel capacity   of vehicle
* @return return long value of Engine IN CC of vehicle 
*/ 
	
	public int getFuelCapacity() {
		return fuelCapacity;
	}
/**
* this setter method of fuel capacity Attribute 
* @param fuelCapacity  is the attribute of vehicle  
* 
*/
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
/**
* this getter method on Milage  attribute which specify the milage   of vehicle
* @return return int value of Milage of vehicle 
*/ 
	public int getMilage() {
		return milage;
	}
/**
* this setter method of milage Attribute 
* @param milage  is the attribute of vehicle  
* 
*/
	public void setMilage(int milage) {
		this.milage = milage;
	}

/**
* this getter method on price  attribute which specify the price   of vehicle
* @return return long value of price of vehicle 
*/ 	
	public long getPrice() {
		return price;
	}
/**
* this setter method of price Attribute 
* @param price  is the attribute of vehicle  that hold the price of vehicle 
* 
*/
	public void setPrice(long price) {
		this.price = price;
	}
/**
* this getter method on road tax  attribute which specify the tax  of vehicle
* @return return integer value of tax of vehicle 
*/ 
	public int getRoadTax() {
		return roadTax;
	}
/**
* this setter method of road tax Attribute 
* @param road tax is the attribute of vehicle  that hold the tax of vehicle 
* 
	*/
	public void setRoadTax(int roadTax) {
		this.roadTax = roadTax;
	}

	@Override
/**
* this to sting method override to create attribute as a string value 
* to print all information of a vehicle
*/
	public String toString() {
		return " make:" + make + "\n model:" + model + "\n engineInCC:"
				+ engineInCC + "\n fuelCapacity:" + fuelCapacity + "\n milage:"
				+ milage + "\n price:" + price + "\n roadTax:" + roadTax + "\n";
	}
	
}
