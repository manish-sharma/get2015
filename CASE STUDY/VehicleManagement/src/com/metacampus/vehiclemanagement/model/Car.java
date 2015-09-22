/**
 * Class to implement functionality of car
 * @author Sanjay
 */

package com.metacampus.vehiclemanagement.model;

public class Car extends Vehicle {

	/* Data Members */
	private String AC;
	private String powerSteering;
	private String accessoryKit;
	
	/** Method to find whether AC is available in car or not
	 * 
	 * @return AC: true if AC exist, false otherwise
	 */
	public String getAC() {
		return AC;
	}

	/** MEthod to set AC availability of a car
	 * 
	 * @param aC : true if AC available, false otherwise
	 */
	public void setAC(String aC) {
		AC = aC;
	}

	/** Method to find whether powerSteering is available in car or not
	 * 
	 * @return powerSteering: true if powerSteering exist, false otherwise
	 */
	public String getPowerSteering() {
		return powerSteering;
	}

	/** MEthod to set powerSteering availability of a car
	 * 
	 * @param powerSteering : true if powerSteering available, false otherwise
	 */
	public void setPowerSteering(String powerSteering) {
		this.powerSteering = powerSteering;
	}

	/** Method to find whether accessoryKit is available in car or not
	 * 
	 * @return powerSteering: true if accessoryKit exist, false otherwise
	 */
	public String getAccessoryKit() {
		return accessoryKit;
	}

	/** MEthod to set accessoryKit availability of a car
	 * 
	 * @param accessoryKit : true if accessoryKit available, false otherwise
	 */
	public void setAccessoryKit(String accessoryKit) {
		this.accessoryKit = accessoryKit;
	}
	
	/** Method to get string representation of details of a car 
	 * Internally this method calls toString() of Vehicle class to print basic details 
	 * related to vehicle
	 */
	@Override
	public String toString() {
	
		return super.toString()+",AC: "+
		this.AC+",Power Steering: "+this.powerSteering+",Accessory Kit: "+this.accessoryKit;
		
	}

	/** Method to calculate on road price of a car */
	@Override
	public int calculateOnRoadPrice() {
		return super.calculateOnRoadPrice();
	}
	
}
