/**Car class extends vehicle class
 * 
 * @author Gaurav Saini
 * Date : 13/09/2015
 */

public class Car extends Vehicle {
	private boolean AC;
	private boolean powerSteering;
	private boolean accessoryKit;

	/**
	 * @return the aC
	 */
	public boolean isAC() {
		return AC;
	}

	/**
	 * @param aC
	 *            to set whether car has AC or not
	 */
	public void setAC(boolean aC) {
		AC = aC;
	}

	/**
	 * @return the powerSteering
	 */
	public boolean isPowerSteering() {
		return powerSteering;
	}

	/**
	 * @param powerSteering
	 *            to set whether car has power steering or not
	 */
	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	/**
	 * @return the accessoryKit
	 */
	public boolean isAccessoryKit() {
		return accessoryKit;
	}

	/**
	 * @param accessoryKit
	 *            to set accessories of car
	 */
	public void setAccessoryKit(boolean accessoryKit) {
		this.accessoryKit = accessoryKit;
	}

	public Car(String make, String model) { // Constructor of base class
		super(make, model);

	}

	public double calculateOnRoadPrice() {// Over written function from base
											// class
		return getPrice() * getRoadTax() * 100;

	}

}