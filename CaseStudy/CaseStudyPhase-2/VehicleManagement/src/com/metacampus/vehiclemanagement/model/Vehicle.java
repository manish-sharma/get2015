package com.metacampus.vehiclemanagement.model;

import java.sql.Time;

/**
 * @author Neha
 *
 */
public class Vehicle {
	private String make;
	private String model;
	private String engineInCC;
	private double fuelCapacity;
	private double milage;
	private double price;
	private double roadTax;
	private int vehicleId;
	private String createdBy;
	
	
	

	

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
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", engineInCC="
				+ engineInCC + ", fuelCapacity=" + fuelCapacity + ", milage="
				+ milage + ", price=" + price + ", roadTax=" + roadTax
				+ ", vehicleId=" + vehicleId + ", createdBy=" + createdBy
				+  "]";
	}
	

}
