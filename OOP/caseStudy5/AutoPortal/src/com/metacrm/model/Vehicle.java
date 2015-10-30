/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metacrm.model;


/**
 *
 * @author admin
 */
public class Vehicle extends BaseModel {

	private String make;
	private String model;
	private String engineInCC;
	private double fuelCapacity;
	private double milage;
	private double price;
	private double roadTax;
	private String imagePath;

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

	public String getEngineInCC() {
		return engineInCC;
	}

	public void setEngineInCC(String engineInCC) {
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
	

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	// calculates road price
	double calculateOnRoadPrice() {
		return (price + roadTax);
	}


	// override toString() method for printing
	public String toString() {
		return "Engine In CC : " + getEngineInCC() + "\tFuel Capacity : "
				+ getFuelCapacity() + "\tMake : " + getMake() + "\tMilage : "
				+ getMilage() + "\tModel : " + getModel() + "\tPrice : "
				+ getPrice() + "\tRoad Tax : " + getRoadTax();
	}
}
