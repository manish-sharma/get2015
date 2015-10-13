package com.metacampus.vehiclemanagement;


public class Vehicle {

	private String make;

	private String model;

	private String engineInCC;

	private int fuelCapacity;

	private int milage;

	private double price;

	private double roadTax;

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

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
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

	//function calculates on road price of an vehicle and returns it.
	public double calculateOnRoadPrice(double price, double roadTax) {
		return (roadTax + price);

	}

}

