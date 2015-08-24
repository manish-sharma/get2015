/**
 * @author Sumitra this is car class extends property from vehicle class
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
	 *            the aC to set
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
	 *            the powerSteering to set
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
	 *            the accessoryKit to set
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
