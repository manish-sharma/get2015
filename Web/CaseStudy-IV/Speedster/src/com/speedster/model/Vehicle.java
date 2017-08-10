package com.speedster.model;

import lombok.Data;

@Data
public class Vehicle extends BaseModel{
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
