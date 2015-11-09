package com.model;

import lombok.Data;

@Data
public abstract class Vehicle extends BaseModel {
	
	protected String make;
	protected String model;
	protected double engineInCC;
	protected double fuelCapacity;
	protected double milage;
	protected double price;
	protected double roadTax;

	
	public double calculateOnRoadPrice() {
		return price + roadTax;
	}
	

}
