/**
 * @author Sumitra this is the parent class vehicle.
 */
public class Vehicle {
	private String make;
	private String model;
	private int engineInCC;
	private double fuelCapacity;
	private double milage;
	private double price;
	private double roadTax;

	public String getMake() {
		return make;
	}

	/**
	 * @param make
	 *            the make to set
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
	 * @param model
	 *            the model to set
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
	 * @param engineInCC
	 *            the engineInCC to set
	 */
	public void setEngineInCC(int engineInCC) {
		this.engineInCC = engineInCC;
	}

	/**
	 * @return the fuelCapacity
	 */
	public double getFuelCapacity() {
		return fuelCapacity;
	}

	/**
	 * @param fuelCapacity
	 *            the fuelCapacity to set
	 */
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	/**
	 * @return the milage
	 */
	public double getMilage() {
		return milage;
	}

	/**
	 * @param milage
	 *            the milage to set
	 */
	public void setMilage(double milage) {
		this.milage = milage;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
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
	 * @param roadTax
	 *            the roadTax to set
	 */
	/**
	 * @param roadTax
	 */
	public void setRoadTax(double roadTax) {
		this.roadTax = roadTax;
	}

	public Vehicle(String make, String model) { // Constructor

		this.make = make;
		this.model = model;
	}

	public String toString() { // function returning the parameters of object
		return "make:" + getMake() + "," + "model:" + getModel();

	}

	public double calculateOnRoadPrice() {// function to be over written in
											// derived class
		return price + roadTax * 100;

	}

}
