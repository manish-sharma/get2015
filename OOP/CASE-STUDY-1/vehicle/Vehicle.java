package vehicle;

public abstract class Vehicle {

	private String make;
	private String model;
	private int engineInCC;
	private int fuelCapacity;
	private int milage;
	private int price;
	private int roadtax;

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

	public int getEngineInCC() {
		return engineInCC;
	}

	public void setEngineInCC(int engineInCC) {
		this.engineInCC = engineInCC;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRoadtax() {
		return roadtax;
	}

	public void setRoadtax(int roadtax) {
		this.roadtax = roadtax;
	}

	public abstract int calculateOnRoadPrice(Vehicle vehicle);
}
