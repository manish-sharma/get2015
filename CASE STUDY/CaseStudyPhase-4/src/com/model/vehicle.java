package com.model;

public class vehicle {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String make;
	private String model;
	private int engine_cc;
	private int fuel_capacity;
	private int mileage;
	private int price;
	private int road_tax;
	private int emi;
	public vehicle(String make, String model, int engine_cc, int fuel_capacity,
			int mileage, int price, int road_tax, int emi) {
		super();
		this.make = make;
		this.model = model;
		this.engine_cc = engine_cc;
		this.fuel_capacity = fuel_capacity;
		this.mileage = mileage;
		this.price = price;
		this.road_tax = road_tax;
		this.emi = emi;
	}
	public vehicle(int id, String make, String model, int engine_cc,
			int fuel_capacity, int mileage, int price, int road_tax, int emi) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.engine_cc = engine_cc;
		this.fuel_capacity = fuel_capacity;
		this.mileage = mileage;
		this.price = price;
		this.road_tax = road_tax;
		this.emi = emi;
	}
	public vehicle() {
		super();
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
	public int getEngine_cc() {
		return engine_cc;
	}
	public void setEngine_cc(int engine_cc) {
		this.engine_cc = engine_cc;
	}
	public int getFuel_capacity() {
		return fuel_capacity;
	}
	public void setFuel_capacity(int fuel_capacity) {
		this.fuel_capacity = fuel_capacity;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRoad_tax() {
		return road_tax;
	}
	public void setRoad_tax(int road_tax) {
		this.road_tax = road_tax;
	}
	public int getEmi() {
		return emi;
	}
	public void setEmi(int emi) {
		this.emi = emi;
	}
	
	
}
