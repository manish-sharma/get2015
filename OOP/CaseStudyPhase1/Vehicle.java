/**Vehicle is base class extended by other class
 * 
 * @author Gaurav Saini
 * Date : 13/09/2015
 */

public class Vehicle {
	private String make;
	private String model;
	private int engineInCC;
	private double fuelCapacity;
	private double mileage;
	private double price;
	private double roadTax;

	/**
	 * @return the make
	 */
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
	 * @return the mileage
	 */
	public double getMileage() {
		return mileage;
	}

	/**
	 * @param mileage
	 *            the mileage to set
	 */
	public void setMileage(double mileage) {
		this.mileage = mileage;
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
	public void setRoadTax(double roadTax) {
		this.roadTax = roadTax;
	}

	public Vehicle(String make, String model) { 					// Constructor
		this.make = make;
		this.model = model;
	}

	public String toString() { 										// method returning the parameters of object
		return "make: " + getMake() + ", " + "model: " + getModel();
	}

	public double calculateOnRoadPrice() {							// method to overwrite in
		return price + roadTax * 100;								// derived class
	}
}