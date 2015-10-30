package com.metacampus.model;

import Exception.VehicleException;



public abstract class Vehicle {

	private int vehicleId;
	private String make;
	private String model;
	private int engineInCC;
	private int fuelCapacity;
	private int mileage;
	private float price;
	private float roadTax;
	private String createdBy;
	
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the vehicleId
	 */
	public int getVehicleId() {
		return vehicleId;
	}
	
	/**
	 * @param vehicleId the vehicleId to set
	 */
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}
	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the engineInCC
	 */
	public int getEngineInCC() {
		return engineInCC;
	}
	/**
	 * @param engineInCC the engineInCC to set
	 */
	public void setEngineInCC(int engineInCC) {
		this.engineInCC = engineInCC;
	}
	/**
	 * @return the fuelCapacity
	 */
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	/**
	 * @param fuelCapacity the fuelCapacity to set
	 */
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the roadTax
	 */
	public float getRoadTax() {
		return roadTax;
	}
	/**
	 * @param roadTax the roadTax to set
	 */
	public void setRoadTax(float roadTax) {
		this.roadTax = roadTax;
	}
	
	/** 
	 * @return the on road price
	 */
	public float calculateOnRoadPrice() {
		return getPrice() + getRoadTax();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			try {
				throw new VehicleException ("Null pointer exception in equals method");
			} catch (VehicleException e) {
				e.printStackTrace();
			}
		}
	
		if(getVehicleId() ==  ((Vehicle) obj).getVehicleId() ) {
			return true;
		}
		else {	
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		return  (int) (result*prime +  this.getVehicleId());
	}
	
	@Override
	public String toString() {
		
		return "Vehicle Id : " + getVehicleId() + ", Company name : " + getMake() + ", Model : " + getModel() +
			   ", EngineInCC : " + getEngineInCC() +" Mileage : "+ getMileage() +" FuelCapacity : "+ getFuelCapacity()
			   +" Price : "+ getPrice() +" RoadTax : "+ getRoadTax()+" CreatedBy : "+ getCreatedBy(); 
	}
	
}
