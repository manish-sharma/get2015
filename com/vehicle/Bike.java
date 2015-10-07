/**
 * @author Pooja Khandelwal
 * @createdDate 15/09/2015
 * @name Bike
 * @description this class inherits the attributes of Vehicle class and also have its own attributes .This class have getter setter methods for attributes initialization and to provide the attributes values when required 
 */
package com.vehicle;

public class Bike extends Vehicle {
	private boolean selfStart;
	private long helmetPrice;

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
}
