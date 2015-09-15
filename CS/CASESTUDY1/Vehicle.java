
public class Vehicle {

	private String make;				// company name
	private String model;				// name of product
	private int enginInCC;				// capicity of engine
	private int fuelCapacity;			// capicity of fuel tank
	private int milage;					// milage of vehicle
	private double price;				// price of vehicle
	private double roadTax;				// road Tax on vehicle

	/*
	 * getter setter methods for data members of class
	 */
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getEnginInCC() {
		return enginInCC;
	}

	public void setEnginInCC(int enginInCC) {
		this.enginInCC = enginInCC;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRoadTax() {
		return roadTax;
	}

	public void setRoadTax(double roadTax) {
		this.roadTax = roadTax;
	}

	public double calculateOnRoadPrice() {
		return price + roadTax;
	}

	// over ride toString method to display the details of vehicle
	@Override
	public String toString() {
		return "make=" + make + ", model=" + model + ", enginInCC=" + enginInCC
				+ ", fuelCapacity=" + fuelCapacity + ", milage=" + milage
				+ ", price=" + price + ", roadTax=" + roadTax;
	}
}
