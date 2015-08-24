package com.metacampus.vehicledekho.model;

public class Vehicle {
	//make is the company of vehicle
	private String make;
	
	//model is the model of vehicle
	private String model;
	
	//cubic capacity of engine
	private String engineInCC;
	
	//fuel capacity of fuel tank
	private int fuelCapacity;
	
	//milage of vehicle
	private String milage;
	
	//price of vehicle
	private float price;
	
	//road tax of vehicle
	private float roadTax;
	
	//getter of make
	public String getMake() {
		return make;
	}
	
	//setter of make
	public void setMake(String make) {
		this.make = make;
	}

	//getter of model
	public String getModel() {
		return model;
	}

	//setter of make
	public void setModel(String model) {
		this.model = model;
	}

	//getter of cubic capacity
	public String getEngineiInCC() {
		return engineInCC;
	}

	//setter of cubic capacity
	public void setEngineInCC(String engineInCC) {
		this.engineInCC = engineInCC;
	}

	//getter of fuel capacity
	public int getFuelCapacity() {
		return fuelCapacity;
	}

	//setter of fuel capacity
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	//getter of milage
	public String getMilage() {
		return milage;
	}

	//setter of milage
	public void setMilage(String milage) {
		this.milage = milage;
	}

	//getter of price
	public float getPrice() {
		return price;
	}

	//setter of price
	public void setPrice(float price) {
		this.price = price;
	}

	//getter of road tax
	public float getRoadTax() {
		return roadTax;
	}

	//setter of road tax
	public void setRoadTax(float roadTax) {
		this.roadTax = roadTax;
	}
	
	//calculation of on road price of vehicle
	public float calculateOnRoadPrice() {
		return getPrice()+getPrice()*getRoadTax()/100;
	}
	
	//returning specification of vehicle in form of string
	public String toString() {
		String vehicleSpecification = "Make:"+getMake()+", Model:"+getModel()+" ,engineInCC:"+getEngineiInCC()+
				", fuelCapacity:"+getFuelCapacity()+", milage:"+getMilage()+", Price:"+getPrice()+", roadTax:"+getRoadTax()+", ";
		return vehicleSpecification;			
	}
}