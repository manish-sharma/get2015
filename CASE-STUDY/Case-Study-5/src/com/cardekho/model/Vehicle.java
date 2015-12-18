package com.cardekho.model;

import lombok.Data;

@Data
public abstract class Vehicle extends BaseModel {
	private String make;
	
	private String model;
	
	private int engineInCC;
	
	private int fuelCapacity;
	
	private int milage;
	
	private double price;
	
	private double roadTax;
	
	private double onRoadPrice;
	
	private String imageUrl;
}
