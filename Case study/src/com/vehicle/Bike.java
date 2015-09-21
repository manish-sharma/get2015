/**
 * @author Pooja Khandelwal
 * @createdDate 20/09/2015
 * @name Bike
 * @description this class inherits the attributes of Vehicle class and also have its own attributes .This class have getter setter methods for attributes initialization and to provide the attributes values when required 
 */
package com.vehicle;

public class Bike extends Vehicle {
	private int bikeId;
	private boolean selfStart;
	private long helmetPrice;

	/**
	 * @name getBikeId()
	 * @description this method return the value of bike id
	 * @param
	 * @return bikeId
	 */
	public int getBikeId() {
		return bikeId;
	}

	/**
	 * @name setBikeId()
	 * @description this method set the value of bike id
	 * @param bikeId
	 * @return
	 */
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	/**
	 * @name iSSelfStart()
	 * @description this method return the value of selfStart
	 * @param
	 * @return selfStart
	 */
	public boolean iSSelfStart() {
		return selfStart;
	}

	/**
	 * @name setSelfStart()
	 * @description this method set the value of selfStart
	 * @param selfStart
	 * @return
	 */
	public void setSelfStart(Boolean selfStart) {
		this.selfStart = selfStart;
	}

	/**
	 * @name getHelmetPrice()
	 * @description this method return the value of helmetPrice
	 * @param
	 * @return helmetPrice
	 */
	public long getHelmetPrice() {
		return helmetPrice;
	}

	/**
	 * @name setHelmetPrice()
	 * @description this method set the value of helmetPrice
	 * @param helmetPrice
	 * @return
	 */
	public void setHelmetPrice(long helmetPrice) {
		this.helmetPrice = helmetPrice;
	}

	/**
	 * @name calculateOnRoadPrice()
	 * @description this is an overirded method.it will calculate the
	 *              onRoadPrice for bike
	 * @param
	 * @return onRoadPrice
	 */
	@Override
	public long calculateOnRoadPrice() {
		super.onRoadPrice = super.getPrice() + helmetPrice + 5000;
		return super.onRoadPrice;
	}

	/**
	 * @name setOnRoadPrice()
	 * @description this method set the value of onRoadPrice for a bike
	 * @param helmetPrice
	 * @return
	 */
	public void setOnRoadPrice(long onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}

	/**
	 * @name toString()
	 * @description this method create the string format for all attributes'
	 *              values of a bike
	 * @param
	 * @return bikeAttributes(string format of all attributes' values of a bike
	 *         )
	 */
	public String toString() {
		String bikeAttributes = "   " + super.getVehicleId() + "         "
				+ super.getMake() + "        " + super.getCreateDTime()
				+ "    " + super.getModel() + "          "
				+ super.getEngineInCC() + "                  "
				+ super.getFuelCapacity() + "                  "
				+ super.getMilage() + "            " + super.getPrice()
				+ "         " + super.getRoadTax() + "              "
				+ super.getOnRoadPrice() + "                " + bikeId
				+ "                 " + selfStart + "               "
				+ helmetPrice;
		return bikeAttributes;

	}
}
