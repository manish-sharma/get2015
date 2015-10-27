package com.model;

public class Car extends Vehicle {
	private int carId;
	private boolean AC;
	private boolean powerSteering;
	private String accessoryKit;

	/**
	 * @name getCarId()
	 * @description this method return the value of car id
	 * @param
	 * @return carId
	 */
	public int getCarId() {
		return carId;
	}

	/**
	 * @name setCarId()
	 * @description this method set the value of car id
	 * @param carId
	 * @return
	 */
	public void setCarId(int carId) {
		this.carId = carId;
	}

	/**
	 * @name isAC()
	 * @description this method return the value of AC
	 * @param
	 * @return AC
	 */
	public boolean isAC() {
		return AC;
	}

	/**
	 * @name setAC()
	 * @description this method set the value of AC
	 * @param AC
	 * @return
	 */
	public void setAC(Boolean AC) {
		this.AC = AC;
	}

	/**
	 * @name isPowerSteering()
	 * @description this method return the value of powerSteering
	 * @param
	 * @return powerSteering()
	 */
	public boolean isPowerSteering() {
		return powerSteering;
	}

	/**
	 * @name setPowerSteering()
	 * @description this method set the value of powerSteering
	 * @param powerSteering
	 * @return
	 */
	public void setPowerSteering(Boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	/**
	 * @name getAccessoryKit()
	 * @description this method return the value of accessoryKit
	 * @param
	 * @return accessoryKit
	 */
	public String getAccessoryKit() {
		return accessoryKit;
	}

	/**
	 * @name setAccessoryKit()
	 * @description this method set the value of accessoryKit
	 * @param accessoryKit
	 * @return
	 */
	public void setAccessoryKit(String accessoryKit) {
		this.accessoryKit = accessoryKit;
	}

	/**
	 * @name calculateOnRoadPrice()
	 * @description this is an override method.it will calculate the
	 *              onRoadPrice for car
	 * @param
	 * @return onRoadPrice
	 */
	@Override
	public long calculateOnRoadPrice() {
		super.onRoadPrice = super.getPrice() + 10000;
		return super.onRoadPrice;
	}

	public void setOnRoadPrice(long onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}

	/**
	 * @name toString()
	 * @description this method create the string format for all attributes'
	 *              values of a car
	 * @param
	 * @return carAttributes(string format of all attributes' values of a car )
	 */
	public String toString() {
		String carAttributes = "   " + super.getVehicleId() + "               "
				+ super.getMake() + "          " + super.getCreateDTime()
				+ "    " + super.getModel() + "        " + ""
				+ super.getEngineInCC() + "                 "
				+ super.getFuelCapacity() + "          	    "
				+ super.getMilage() + "            " + super.getPrice()
				+ "           " + super.getRoadTax() + "             " + "  "
				+ super.getOnRoadPrice() + "                 " + carId
				+ "           " + AC + "            " + powerSteering
				+ "              " + accessoryKit;
		return carAttributes;

	}
}
