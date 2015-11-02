package com.cardekho.model;

public class Vehicle extends BaseModel
{
	
	private String make;
	
	private String model;
	
	private int engineInCC;
	
	private int fuelCapacity;
	
	private int milage;
	
	private double price;
	
	private double roadTax;
	
	private double onRoadPrice;
	
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
	 * @return the milage
	 */
	public int getMilage() {
		return milage;
	}
	/**
	 * @param milage the milage to set
	 */
	public void setMilage(int milage) {
		this.milage = milage;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the roadTax
	 */
	public double getRoadTax() {
		return roadTax;
	}
	/**
	 * @param roadTax the roadTax to set
	 */
	public void setRoadTax(double roadTax) {
		this.roadTax = roadTax;
	}
	/**
	 * @return the onRoadPrice
	 */
	public double getOnRoadPrice() {
		return onRoadPrice;
	}
	/**
	 * @param onRoadPrice the onRoadPrice to set
	 */
	public void setOnRoadPrice(double onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", engineInCC="
				+ engineInCC + ", fuelCapacity=" + fuelCapacity + ", milage="
				+ milage + ", price=" + price + ", roadTax=" + roadTax
				+ ", onRoadPrice=" + onRoadPrice + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
