/**
 * @author Pooja Khandelwal
 * @createdDate 15/09/2015
 * @name  Vehicle
 * @description this class have getter setter methods for attributes initialization and to provide the attributes values when required 
 */
package com.vehicle;

import javax.jws.Oneway;

public class Vehicle {
	private String make;
	private String model;
	private int engineInCC;
	private int fuelCapacity;
	private int milage;
	private long price;
	private int roadTax;
	protected long onRoadPrice;

	/**
	 * @name getMake()
	 * @description this method return the value of make
	 * @param
	 * @return make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @name setMake()
	 * @description this method set the value of getMake()
	 * @param getMake
	 *            ()
	 * @return
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @name getModel()
	 * @description this method return the value of model
	 * @param
	 * @return model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @name setModel()
	 * @description this method set the value of model
	 * @param model
	 * @return
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @name getEngineInCC()
	 * @description this method return the value of engineInCC
	 * @param
	 * @return engineInCC
	 */
	public int getEngineInCC() {
		return engineInCC;
	}

	/**
	 * @name setEngineInCC()
	 * @description this method set the value of engineInCC
	 * @param engineInCC
	 * @return
	 */
	public void setEngineInCC(int engineInCC) {
		this.engineInCC = engineInCC;
	}

	/**
	 * @name getFuelCapacity()
	 * @description this method return the value of fuelCapacity
	 * @param
	 * @return fuelCapacity
	 */
	public int getFuelCapacity() {
		return fuelCapacity;
	}

	/**
	 * @name setFuelCapacity()
	 * @description this method set the value of fuelCapacity
	 * @param fuelCapacity
	 * @return
	 */
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	/**
	 * @name getMilage()
	 * @description this method return the value of milage
	 * @param
	 * @return milage
	 */
	public int getMilage() {
		return milage;
	}

	/**
	 * @name setMilage()
	 * @description this method set the value of milage
	 * @param milage
	 * @return
	 */
	public void setMilage(int milage) {
		this.milage = milage;
	}

	/**
	 * @name getPrice()
	 * @description this method return the value of price
	 * @param
	 * @return price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @name setPrice()
	 * @description this method set the value of price
	 * @param price
	 * @return
	 */
	public void setPrice(long price) {
		this.price = price;
	}

	/**
	 * @name getRoadTax()
	 * @description this method return the value of roadTax
	 * @param
	 * @return roadTax
	 */
	public int getRoadTax() {
		return roadTax;
	}

	/**
	 * @name setRoadTax()
	 * @description this method set the value of roadTax
	 * @param roadTax
	 * @return
	 */
	public void setRoadTax(int roadTax) {
		this.roadTax = roadTax;
	}

	/**
	 * @name calculateOnRoadPrice()
	 * @description this method will be overrirded by its derived class Car and
	 *              Bike which will calculate their on on road price.
	 * @param
	 * @return onRoadPrice
	 */
	protected long calculateOnRoadPrice() {
		return onRoadPrice;
	}

	/**
	 * @name getOnRoadPrice()
	 * @description this method return the value of onRoadPrice
	 * @param
	 * @return onRoadPrice
	 */
	public long getOnRoadPrice() {
		return onRoadPrice;
	}
}
