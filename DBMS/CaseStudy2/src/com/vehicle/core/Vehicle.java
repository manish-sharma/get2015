package com.vehicle.core;

/**
 * This class is model class for vehicle which have attributes general to any
 * vehicle and contains getter setter function for the attributes
 * 
 * @author Shishir Pareek Date 22 September 2015
 **/
public class Vehicle {

	private int vehicleID;
	private String make;// varible for storing type
	private String model;// variable for storing model year
	private int engineInCC;// variable for storing engine cc
	private int fuelCapacity;// variable for storing fuelCapacity
	private double mileage;// variable for storing mileage
	private double price;// variable for storing price
	private double roadTax;// variable for storing road tax

	/* getter method for type of car */
	public String getMake() {
		return make;
	}

	/* setter method for type */
	public void setMake(String make) {
		this.make = make;
	}

	/* getter method for model */
	public String getModel() {
		return model;
	}

	/* setter for model */
	public void setModel(String model) {
		this.model = model;
	}

	/* getter fot engine CC */
	public int getEngineInCC() {
		return engineInCC;
	}

	/* setter for engine cc */
	public void setEngineInCC(int engineInCC) {
		this.engineInCC = engineInCC;
	}

	/* getter for fuel capacity */
	public int getFuelCapacity() {
		return fuelCapacity;
	}

	/* setter for fuel capacity */
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	/* getter for getting mileage */
	public double getMileage() {
		return mileage;
	}

	/* setter for getting mileage */
	public void setMileage(double milage) {
		this.mileage = milage;
	}

	/* getter for getting price */
	public double getPrice() {
		return price;
	}

	/* setter for setting mileage */
	public void setPrice(double price) {
		this.price = price;
	}

	/* getter for road tax */
	public double getRoadTax() {
		return roadTax;
	}

	/* setter for road tax */
	public void setRoadTax(double roadTax) {
		this.roadTax = roadTax;
	}

	/* function to calculate on road price */
	public double calculateOnRoadPrice() {
		return price + roadTax;
	}

	/* Overridden method to show vehicle attributes in string */
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", engineInCC="
				+ engineInCC + ", fuelCapacity=" + fuelCapacity + ", mileage="
				+ mileage + ", price=" + price + ", roadTax=" + roadTax + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
}
