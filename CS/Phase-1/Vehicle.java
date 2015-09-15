/**
 * @author Girdhari
 * Vehicle class have all the vehicle related properties and methods
 */
package com.vehicaldekho.vehical.model;

/* Starting of Vehicle Class */
public class Vehicle {

	private String make;
	
	private String model;
	
	private int engineInCC;
	
	private double fuelCapacity;
	
	private double milage;
	
	private double price;
	
	private double roadTax;
	
	/* Starting of getters and setters */
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getEngineInCC() {
		return engineInCC;
	}
	public void setEngineInCC(int engineInCC) {
		this.engineInCC = engineInCC;
	}
	public double getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRoadTax() {
		return roadTax;
	}
	public void setRoadTax(double roadTax) {
		this.roadTax = roadTax;
	}
	public double calculateOnRoadPrive() {
		return (getPrice() * getRoadTax()) + getPrice(); 
	}
	/* Ending of getter & setter */
	
	/* Starting of toString function */
	@Override
	public String toString() {
		return "Vehical [make=" + make + ", model=" + model + ", engineInCC="
				+ engineInCC + ", fuelCapacity=" + fuelCapacity + ", milage="
				+ milage + ", price=" + price + ", roadTax=" + roadTax + "]";
	}
	/* Ending of toString function */
	
}
/* End of Vehicle Class */

/*Vehicle - make, model, engineInCC, fuelCapacity, milage, price, roadTax
Create calculateOnRoadPrice method to be overwritten by children*/
