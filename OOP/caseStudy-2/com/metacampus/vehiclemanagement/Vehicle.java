package com.metacampus.vehiclemanagement;

public abstract class Vehicle extends MetaClass{

	private int vehilceId;
	
	private String make;

	private String model;

	private String engineInCC;

	private int fuelCapacity;

	private int milage;

	private double price;

	private double roadTax;
	
	public Vehicle()
	{
		
	}
	
	public int getVehilceId() {
		return vehilceId;
	}

	public void setVehilceId(int vehilceId) {
		this.vehilceId = vehilceId;
	}

	
	public Vehicle(String make,String model){
		this.make=make;
		this.model=model;
	}

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
	public double calculateOnRoadPrice() {
		return (roadTax + price);

	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
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
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicle [vehilceId=" + vehilceId + ", make=" + make
				+ ", model=" + model + ", engineInCC=" + engineInCC
				+ ", fuelCapacity=" + fuelCapacity + ", milage=" + milage
				+ ", price=" + price + ", roadTax=" + roadTax + "]";
	}
	
	

}

