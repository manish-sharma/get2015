package com.vehiclemanagement.model;


public class Vehicle {
	private String make;
	private String model;
	private String engineInCC;
	private double fuelCapacity;
	private double milage;
	private double price;
	private double roadTax;

	/**
	 * @return year of manufacturing
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param year of manufacturing
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return model name
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model name
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return engineCC
	 */
	public String getEngineInCC() {
		return engineInCC;
	}

	/**
	 * @param engineInCC
	 */
	public void setEngineInCC(String engineInCC) {
		this.engineInCC = engineInCC;
	}

	/**
	 * @return fuel capacity
	 */
	public double getFuelCapacity() {
		return fuelCapacity;
	}

	/**
	 * @param fuelCapacity
	 */
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	/**
	 * @return milage
	 */
	public double getMilage() {
		return milage;
	}

	/**
	 * @param milage
	 */
	public void setMilage(double milage) {
		this.milage = milage;
	}

	/**
	 * @return price of vehicle
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return road tax
	 */
	public double getRoadTax() {
		return roadTax;
	}

	/**
	 * @param roadTax
	 */
	public void setRoadTax(double roadTax) {
		this.roadTax = roadTax;
	}

	/**
	 * @return price
	 */
	public double calculateOnRoadPrice() {  
		//calculate the on road price by returning price
		return getPrice();
	}

}
